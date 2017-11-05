(ns clojure-fabric.core-test
  (:require [expectations :refer :all]
            [clojure.java.io :as io]
            [clojure-fabric.user :refer :all]
            [clojure-fabric.core :refer :all]
            [clojure-fabric.channel :refer :all]
            [clojure-fabric.chaincode :refer :all]
            [clojure-fabric.crypto-suite :as crypto-suite]
            ;;[expectations.clojure.test :refer [defexpect]] ;; available on 2.2.0
            [clojure-fabric.proto :as proto]
            [clojure-fabric.core :as core])
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

#_
(defonce orderer {:org-type     :orderer
                  :domain-name  "example.com"
                  :name         "admin"
                  :url          "grpcs://localhost:7050"})

(defonce org-defs
  {"Orderer" {:msp-id           "Orderer"
              :org-type         :orderer
              :domain-name      "example.com"
              :users            [{:name "admin" :url "grpcs://localhost:7050" :domain-name "example.com"}]}  

   "Org1MSP" {:msp-id           "Org1MSP"
              :org-type         :peer
              :domain-name      "org1.example.com"
              :users            [{:name "user1" :roles #{:client}}
                                 {:name "admin" :roles #{:client}}]
              :peers            [{:name "peer0" :url "grpcs://localhost:7051"}
                                 {:name "peer1" :url "grpcs://localhost:7056"}]
              :orderers         [{:name "orderer" :url "grpcs://localhost:7050" :domain-name "example.com"}]}
   "Org2MSP" {:msp-id           "Org2MSP"
              :org-type         :peer
              :domain-name      "org2.example.com"
              :users            [{:name "user1" :roles #{:client}}
                                 {:name "admin" :roles #{:client}}]
              :peers            [{:name "peer0" :url "grpcs://localhost:8051"}
                                 {:name "peer1" :url "grpcs://localhost:8056"}]
              :orderers         [{:name "orderer" :url "grpcs://localhost:7050" :domain-name "example.com"}]}})

(defonce chaincode-id-v1 (proto/make-chaincode-id :name (get-in chaincode-id-defs [:v1 :name])
                                                  :version (get chaincode-id-defs :v1)))

(defonce chaincode-id-v11 (proto/make-chaincode-id :name (get-in chaincode-id-defs [:v11 :name])
                                                   :version (get chaincode-id-defs :v11)))


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
          (core/get-nodes mychannel :peers)))

;; This must be available with Admin user
(expect io.grpc.StatusRuntimeException
        (let [user (get-user "Org1MSP" "user1") ;; user == error!
              mychannel (get-channel user "mychannel")]
          (query-installed-chaincodes user (get-random-peer mychannel))))

(expect true
        (let [user (get-user "Org1MSP" "admin")
              mychannel (get-channel user "mychannel")
              chaincodes1 (query-installed-chaincodes user (get-random-peer mychannel))]
          (install-chaincode user (str "test" (System/currentTimeMillis)) "github.com/example_cc" "v1"
                             "/home/jc/Work/clojure-fabric/resources/gocc/src/github.com"
                             :golang (core/get-nodes mychannel  :peers))
          (= (inc (count chaincodes1))
             (count (query-installed-chaincodes user (get-random-peer mychannel))))))

(expect io.grpc.StatusRuntimeException
        (let [user (get-user "Org2MSP" "user1") ;; user == error!
              mychannel (get-channel user "mychannel")]
          (query-installed-chaincodes user (get-random-peer mychannel))))

(expect true
        (let [user (get-user "Org2MSP" "admin")
              mychannel (get-channel user "mychannel")
              chaincodes1 (query-installed-chaincodes user (get-random-peer mychannel))]
          (install-chaincode user (str "test" (System/currentTimeMillis)) "github.com/example_cc" "v1"
                             "/home/jc/Work/clojure-fabric/resources/gocc/src/github.com"
                             :golang (core/get-nodes mychannel :peers))
          (= (inc (count chaincodes1))
             (count (query-installed-chaincodes user (get-random-peer mychannel))))))

;; (expect (let [user (get-user "Org2MSP" "admin")
;;               mychannel (get-channel user "mychannel")]
;;           (query-channels user "mychannel" (core/get-nodes mychannel :peers))))

;; (expect (let [user (get-user "Org1MSP" "user1")
;;               mychannel (get-channel user "mychannel")]
;;           (query-channels user "mychannel" (core/get-nodes mychannel :peers))))

;; (expect (let [user (get-user "Org1MSP" "admin")
;;               mychannel (get-channel user "mychannel")]
;;           (query-channels user "mychannel" (core/get-nodes mychannel :peers))))

#_
(expect (let [mychannel (-> (get-user "Org1MSP" "user1")
                           (get-channel "mychannel"))]
          (query-info mychannel)))
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
     {:orderers [{:name "orderer" :grpc-url "grpcs://localhost:7050"}]
      :peers [{:name "peer" :grpc-url "grpcs://localhost:7051"}]}})

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

;;; Some ideas

;; Scenario 2: If I use the following sequence I receive an error:

;; Server1 - peer channel create
;; Server1 - peer channel join
;; Server1 - peer channel update (AnchorPeer.tx Server1 MSP)
;; Server2 - peer channel fetch 0 (the channel's .block)
;; Server2 - peer channel join
;; ==>

;; Scenatio 3: If I do not use AnchorPeers the following sequence works:
;;
;; Server1 - peer channel create
;; Server1 - peer channel join
;; Server2 - peer channel fetch (the channel's .block)
;; Server2 - peer channel join
;;

;;(create-or-update-channel-from-nodes (first (core/get-nodes (core/get-user "Org1MSP" "user1") :orderers))
;; [(get @core/users  ["Org1MSP" "admin"]) (get @core/users  ["Org2MSP" "admin"])]
;; cu)
