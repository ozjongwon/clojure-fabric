(ns clojure-fabric.core-test
  (:require [expectations :refer :all]
            [clojure.java.io :as io]
            [clojure-fabric.user :refer :all]
            [clojure-fabric.core :refer :all]
            [clojure-fabric.channel :refer :all]
            [clojure-fabric.crypto-suite :as crypto-suite]
            ;;[expectations.clojure.test :refer [defexpect]] ;; available on 2.2.0
            [clojure-fabric.grpc-core :as grpc])
  (:import [org.bouncycastle.util.encoders Hex]))


;;;
;;; See:
;;;     fabric-sdk-java/src/test/java/org/hyperledger/fabric/sdk/testutils/TestConfig.java
;;;

;;;
;;; Utility functions
;;;
(defn domain-name->cert-map
  [domain-name]
  (let [cert-pem (-> "fixture/balance-transfer/artifacts/channel/crypto-config/peerOrganizations/%s/ca/ca.%s-cert.pem"
                     (format domain-name domain-name)
                     (io/resource)
                     (io/as-file))]
    (if cert-pem
      {:pem-file                cert-pem
       :allow-all-host-names    true}
      {})))

(defonce default-defs
  {:invoke-wait-time    100000
   :deploy-wait-time    120000
   :proposal-wait-time  120000})

(defonce chaincode-id-defs
  {:v1  {:name "example_cc_go" :path "github.com/example_cc" :version "1"}
   :v11 {:name "example_cc_go" :path "github.com/example_cc" :version "11"}})

(defonce channel-defs
  {:mychannel {:name "mychannel"}})

#_
(defonce org-defs
  (into {}
        (map #(vector (:msp-id %)
                      (merge % (domain-name->cert-map (:domain-name %))))
             [{:msp-id                  "OrdererMSP"
               :domain-name             "example.com"
               :ca-location             "???http://localhost:7054"
               :ca-name                 "???ca0"
               :peer-locations          ["???peer0.org1.example.com@grpc://localhost:7051"
                                         "???peer1.org1.example.com@grpc://localhost:7056"]
               :orderer-locations       ["???orderer.example.com@grpc://localhost:7050"]
               :eventhub-locations      ["???peer0.org1.example.com@grpc://localhost:7053"
                                         "???peer1.org1.example.com@grpc://localhost:7058"]
               :pem-file                nil
               :allow-all-host-names    false
               :ca-client               nil
               :users [{:name "admin" :type :admin :key "f1a9a940f57419a18a83a852884790d59b378281347dd3d4a88c2b820a0f70c9"}
                       {:name "orderer" :type :orderer :key "30652478a0678558e8573fa33246175b33997226b63fa40503290187e0f99144"}]}
              {:msp-id                  "Org1MSP"
               :domain-name             "org1.example.com"
               :ca-location             "http://localhost:7054"
               :ca-name                 "ca0"
               :peer-locations          ["peer0.org1.example.com@grpc://localhost:7051"
                                         "peer1.org1.example.com@grpc://localhost:7056"]
               :orderer-locations       ["orderer.example.com@grpc://localhost:7050"]
               :eventhub-locations      ["peer0.org1.example.com@grpc://localhost:7053"
                                         "peer1.org1.example.com@grpc://localhost:7058"]
               :pem-file                nil
               :allow-all-host-names    false
               :ca-client               nil
               :users [{:name "admin" :type :admin :key "6b32e59640c594cf633ad8c64b5958ef7e5ba2a205cfeefd44a9e982ce624d93"}
                       {:name "user1" :type :user :key "f3c01db816069a226654d66a023c2260695f71e19b322a6564dad3e32ccf063b"}]}
              {:msp-id                  "Org2MSP"
               :domain-name             "org2.example.com"
               :ca-location             "http://localhost:8054"
               :ca-name                 "ca0"
               :peer-locations          ["peer0.org2.example.com@grpc://localhost:8051"
                                         "peer1.org2.example.com@grpc://localhost:8056"]
               :orderer-locations       ["orderer.example.com@grpc://localhost:7050"]
               :eventhub-locations      ["peer0.org2.example.com@grpc://localhost:8053"
                                         "peer1.org2.example.com@grpc://localhost:8058"]
               :pem-file                nil
               :allow-all-host-names    false
               :ca-client               nil
               :users [{:name "admin" :type :admin :key "b2e2536de633960859d965f02b296083d1e8aa1e868016417c4e4fb760270b96"}
                       {:name "user1" :type :user :key "9f97934915db15db4c803b6eff5b6f4966bdef05d13f99e4d60c7128a6f22733"}]}])))


(defn file->bytes [file]
  (with-open [xin (io/input-stream file)
              xout (java.io.ByteArrayOutputStream.)]
    (io/copy xin xout)
    (.toByteArray xout)))

(defn get-user-crypto-files
  [{:keys [org-type domain-name]} {user-name :name}]
  (let [org-type-name (name org-type)
        user-name+domain-name (format "%s@%s" (clojure.string/capitalize user-name) domain-name)
        dir (format "fixture/balance-transfer/artifacts/channel/crypto-config/%sOrganizations/%s/users/%s/msp/"
                    org-type-name domain-name user-name+domain-name)]
    {:private-key (-> (str dir "keystore/")
                      (io/resource)
                      (io/as-file)
                      (file-seq)
                      (second)
                      ;; FIXME:  do same as get-node-end-crypto-files ??
                      (crypto-suite/import-key))
     :certificate (-> (format "%ssigncerts/%s-cert.pem" dir user-name+domain-name)
                      (io/resource)
                      ;; see make-serialized-identity in grpc_core
                      ;; - (ByteString/copyFromUtf8 (:certificate user))
                      (slurp))}))

(defn get-node-end-crypto-files
  [{:keys [org-type domain-name]} {node-end-name :name}]
  (let [org-type-name (name org-type)
        node-end-name+domain-name (format "%s.%s" (name node-end-name) domain-name)
        end-node-dir (format "%s/%s"
                             (case org-type
                               :peer "peers"
                               :orderer "orderers")
                             node-end-name+domain-name)
        dir (format "fixture/balance-transfer/artifacts/channel/crypto-config/%sOrganizations/%s/%s/msp/"
                    org-type-name domain-name end-node-dir)]
    {:pem (-> (format "%ssigncerts/%s-cert.pem" dir node-end-name+domain-name)
              (io/resource)
              (file->bytes)
              #_
              (crypto-suite/import-key)
              #_
              (.getEncoded)
              #_
              (Hex/toHexString))}))

(defonce org-defs
  {"Org1MSP" {:msp-id           "Org1MSP"
              :org-type         :peer
              :domain-name      "org1.example.com"
              :users            [{:name "user1" :roles #{:client}}
                                 {:name "admin" :roles #{:client}}]
              :peers            [{:name "peer0" :url "grpc://localhost:7051"}
                                 {:name "peer1" :url "grpc://localhost:7056"}]
              :orderers         [{:name "orderer" :url "grpc://localhost:7050" :domain-name "example.com"}]}
   "Org2MSP" {:msp-id           "Org2MSP"
              :org-type         :peer
              :domain-name      "org2.example.com"
              :users            [{:name "user1" :roles #{:client}}
                                 {:name "admin" :roles #{:client}}]
              :peers            [{:name "peer0" :url "grpc://localhost:8051"}
                                 {:name "peer1" :url "grpc://localhost:8056"}]
              :orderers         [{:name "orderer" :url "grpc://localhost:7050" :domain-name "example.com"}]}})

(defonce chaincode-id-v1 (grpc/make-chaincode-id (get-in chaincode-id-defs [:v1 :name])
                                                 (get chaincode-id-defs :v1)))

(defonce chaincode-id-v11 (grpc/make-chaincode-id (get-in chaincode-id-defs [:v11 :name])
                                                  (get chaincode-id-defs :v11)))


;;
;; 1. Make users/clients
(defn populate-clients!
  []
  (doseq [[_ {:keys [msp-id org-type domain-name users peers orderers] :as org}] org-defs]
    (doseq [user users]
      (new-user! (merge org user (get-user-crypto-files org user) {:crypto-suite (make-crypto-suite {})})))))

;;; 2. Add a channel
(defn populate-orderers
  [org-def]
  (into {} (mapv (fn [o]
                   [(:name o)
                    (->> o
                         (get-node-end-crypto-files (assoc org-def :org-type :orderer :domain-name (:domain-name o)))
                         (merge o {:hostname-override? true})
                         make-orderer)])
                 (:orderers org-def))))

(defn populate-peers
  [org-def]
  (into {} (mapv (fn [p]
                   [(:name p) (make-peer (merge p (get-node-end-crypto-files org-def p) {:hostname-override? true}))])
                 (:peers org-def))))

(defn add-channels!
  []
  (doseq [[_ v] @users]
    (let [org-def (get org-defs (:msp-id v))]
     (new-channel! v {:name "mychannel" :orderers (populate-orderers org-def) :peers (populate-peers org-def)}))))

(defn clear-users!
  []
  (reset! users {}))

(defn populate-date
  {:expectations-options :before-run}
  []
  (populate-clients!)
  (add-channels!))

(defn clear-data
  {:expectations-options :after-run}
  []
  (clear-users!))

;; Test get-user
(expect clojure_fabric.core.User (get-user "Org1MSP" "user1"))
(expect clojure_fabric.core.User (get-user "Org1MSP" "admin"))
(expect clojure_fabric.core.User (get-user "Org2MSP" "user1"))
(expect clojure_fabric.core.User (get-user "Org2MSP" "admin"))

(expect clojure_fabric.core.Channel
        (let [user (get-user "Org1MSP" "user1")]
          (get-channel user "mychannel")))
(expect clojure_fabric.core.Channel
        (let [user (get-user "Org2MSP" "user1")]
          (get-channel user "mychannel")))

(expect (let [user (get-user "Org1MSP" "user1")
              mychannel (get-channel user "mychannel")]
          (get-peers mychannel)))

(expect (let [user (get-user "Org1MSP" "user1")
              mychannel (get-channel user "mychannel")]
          (query-installed-chaincodes user (get-random-peer mychannel))))

;;; 3. Add orderers and peers

;;; 4. Add event-hubs
;;; 5. Check getters for client, channel, peers, orderers, status checks, etc
;;; 6. query-channels for each peers and orderers and see if the current channel is in
;;; 7. ... Add more (Line 530 of End2endAndBackAgainIT.java)

#_
(let [client (make-client {:msp-id "Org1MSP" :name "PeerAdmin"
                           :private-key (-> (slurp "resources/creds/cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec-priv")
                                            (keys/str->private-key))
                           :cert (-> "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"
                                     crypto-suite/cert-string->bytes
                                     (crypto-suite/hash {:algorithm :sha3-384}))}
                          {} ;; use default crypto-suite
                          channel-defs)])


;;;
;;; Example
;;; 
#_
(comment
  (require '[buddy.core.keys :as keys])
  (def channel-defs
    {"mychannel"
     {:orderers [{:name "orderer" :grpc-url "grpc://localhost:7050"}]
      :peers [{:name "peer" :grpc-url "grpc://localhost:7051"}]}})

  (def cli (make-client {:msp-id "Org1MSP" :name "PeerAdmin"
                         :private-key (-> (slurp "resources/creds/cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec-priv")
                                          (keys/str->private-key))
                         :cert (-> "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"
                                   crypto-suite/cert-string->bytes
                                   (crypto-suite/hash {:algorithm :sha3-384}))}
                        {} ;; use default crypto-suite
                        channel-defs))
  (def channel (get-in cli [:channels "mychannel"]))
  
  )
#_
(comment
 (defonce ca-files {"org1" "resources/fixture/balance-transfer/artifacts/channel/crypto-config/peerOrganizations/org1.example.com/ca/ca.org1.example.com-cert.pem"
                    "org2" "resources/fixture/balance-transfer/artifacts/channel/crypto-config/peerOrganizations/org2.example.com/ca/ca.org2.example.com-cert.pem"
                    "orderer" "resources/fixture/balance-transfer/artifacts/channel/crypto-config/ordererOrganizations/example.com/ca/ca.example.com-cert.pem"})

 (import [java.io FileInputStream FileOutputStream]
         [java.security KeyStore KeyStore$TrustedCertificateEntry]
         [java.security.cert CertificateFactory])

 (let [key-store (KeyStore/getInstance (KeyStore/getDefaultType))]
   (.load key-store nil nil)
   (doseq [[k f] ca-files]
     (let [x509 (-> (CertificateFactory/getInstance "X.509")
                    (.generateCertificate (FileInputStream. f)))]
       (.setCertificateEntry key-store k x509)
       (.store key-store (FileOutputStream. "/tmp/trust-store") (char-array 0)))))
 )
