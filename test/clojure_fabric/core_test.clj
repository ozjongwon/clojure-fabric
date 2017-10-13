(ns clojure-fabric.core-test
  (:require [expectations :refer :all]
            [clojure.test :refer :all]
            [clojure.java.io :as io]
            [clojure-fabric.core :refer :all]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.grpc-core :as grpc]))

;;;
;;; Utility functions
;;;
(defn domain-name->cert-map
  [domain-name]
  (let [cert-pem (-> "fixture/e2e-2Orgs/channel/crypto-config/peerOrganizations/%s/ca/ca.%s-cert.pem"
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
  {:foo {:name "foo"}
   :bar {:name "bar"}})

(defonce org-defs
  (into {}
        (map #(vector (:msp-id %)
                      (merge % (domain-name->cert-map (:domain-name %))))
             [{:msp-id                  "Org1MSP"
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
               :ca-client               nil}
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
               :ca-client               nil}])))

(defonce chaincode-id-v1 (grpc/make-chaincode-id (get-in chaincode-id-defs [:v1 :name])
                                                 (get chaincode-id-defs :v1)))

(defonce chaincode-id-v11 (grpc/make-chaincode-id (get-in chaincode-id-defs [:v11 :name])
                                                  (get chaincode-id-defs :v11)))


(defonce user-defs
  ;; Per org users
  [{:admin "admin" :user "user1" :peer-admin ""}
   {:name "user1"}])

(defonce peer-admin
  {:name "PeerAdmin" :mspid "Org1MSP" :roles nil :affiliation "" :enrollmentSecret ""
   :enrollment {:signingIdentity "cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec"
                :identity {:certificate "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"}}})

;;;
;;; 1. create clients for org1 and org2
;;; 2. Add a channel
;;; 3. Add orderers and peers
;;; 4. Add event-hubs
;;; 5. Check getters for client, channel, peers, orderers, status checks, etc
;;; 6. query-channels for each peers and orderers and see if the current channel is in
;;; 7. ... Add more (Line 530 of End2endAndBackAgainIT.java)

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
(-> "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"
    crypto-suite/cert-string->bytes
    (crypto-suite/hash
     {:algorithm :sha3-384}))
