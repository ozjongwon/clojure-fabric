(ns clojure-fabric.core
  "Clojure wrapper for Hyperledger Java SDK functions"
  (:require [clojure.algo.generic.functor :as algo]
            [clojure.string :as str]
            [buddy.core.certificates :as certs]
            [buddy.core.keys :as keys]
            [clojure-fabric.block :as block]
            [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.crypto-suite :as crypto]
            [clojure-fabric.client :as client]
            [clojure-fabric.request :as request]
            [clojure-fabric.response :as response]
            [clojure-fabric.user :as user]
            [clojure.core.cache :as cache])
  (:import [org.hyperledger.fabric.sdk User Enrollment]
           [org.bouncycastle.jcajce.provider.asymmetric.ec BCECPrivateKey]))

(defonce client-lru-cache
  ;; FIXME: magic number
  (atom (cache/lru-cache-factory {} :threshold 64)))

(defn really-make-client [priv-key cert & [{:keys [name roles account affiliation msp-id]
                                            :or {name "PeerAdmin" roles #{}
                                                 account nil
                                                 affiliation "affiliation"
                                                 msp-id "Org1MSP"} }]]
  (let [new-client (client/create-new-instance)]
    (client/set-crypto-suite new-client (crypto/get-crypto-suite))
    (client/set-user-context new-client 
                             (reify User
                               (getName [this] name)
                               ;; Set<String>
                               (getRoles [this] roles)
                               (getAccount [this] account)
                               (getAffiliation [this] affiliation)
                               (getEnrollment [this]
                                 (reify Enrollment
                                   (getKey [this] priv-key)
                                   (getCert [this] cert)))
                               (getMspId [this] msp-id)))
    new-client))

(defn make-key+cert-hash [priv-key cert]
  (hash (str (.toString ^BCECPrivateKey priv-key) cert)))

(defn make-client [priv-key cert & opts]
  (let [cache-key (make-key+cert-hash priv-key cert)
        lru-cache (swap! client-lru-cache cache/hit cache-key)]
    (if-let [existing-client (cache/lookup lru-cache cache-key)]
      existing-client
      (let [new-client (really-make-client priv-key cert opts)]
        (swap! client-lru-cache cache/miss cache-key new-client)
        new-client))))

(defn evict-client-from-cache [client]
  (let [enrollment (.getEnrollment ^User (client/get-user-context))
        cache-key (make-key+cert-hash (.getKey ^Enrollment enrollment)
                                      (.getCert ^Enrollment enrollment))]
    (swap! client-lru-cache cache/evict cache-key)))


;;;;;;;;;;; Ex
#_
(make-client (-> (slurp "resources/creds/cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec-priv")
                 (keys/str->private-key))
             "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n")
#_
(comment
  ;; Copy from fabcar example
  (defonce options
    {:channel-id "mychannel" :chaincode-id "fabcar" :network-url "grpc://localhost:7051"
     :peer-admin
     {:name "PeerAdmin"
      :mspid "Org1MSP" :roles nil :affiliation "" 
      :enrollment-secret "" 
      :enrollment {:signing-identity "cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec" 
                   :identity {:certificate "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"}}}})

  ;; 1. Client setup
  (defonce cli (client/create-new-instance))
  (client/set-crypto-suite cli (crypto/get-crypto-suite))
 
  ;; 2. User context
  (defonce peer-admin-enrollment
    (reify Enrollment
      ;; FIXME: enrollment!
      ;; How to iniitiate key and cert?
      (getKey [this]
        (-> (slurp (str "resources/creds/"
                     (->  options
                          (get-in [:peer-admin :enrollment :signing-identity])
                          (str "-priv"))))
            (keys/str->private-key)))
      (getCert [this]
        (get-in options [:peer-admin :enrollment :identity :certificate]))))
  
  (defonce peer-admin
    (reify User
      (getName [this]
        (get-in options [:peer-admin :name]))
      ;; Set<String>
      (getRoles [this]
        (get-in options [:peer-admin :roles]))
      (getAccount [this]
        nil)
      (getAffiliation [this]
        (get-in options [:peer-admin :affiliation]))
      (getEnrollment [this]
        peer-admin-enrollment)
      (getMspId [this]
        (get-in options [:peer-admin :mspid]))))
  
  (client/set-user-context cli peer-admin)

  
  ;; 2. Channel
  (defonce chan (client/new-channel cli (:channel-id options)))
  (channel/add-orderer chan (client/new-orderer cli "orderer0" "grpc://localhost:7050"))
  (channel/add-peer chan (client/new-peer cli "peer0" "grpc://localhost:7051"))
  (channel/initialize chan)

  ;; 3. Request
  (defonce req (client/new-transaction-proposal-request cli))

  (defonce chaincode-id (-> (chaincode/new-builder)
                            (chaincode/set-name "fabcar")
                            (chaincode/set-version "1.0")
                            (chaincode/set-path "resources/")
                            (chaincode/build)))
  (request/set-chaincode-id req chaincode-id)
  (request/set-fcn req "some_function")
  ;; timeout
  (request/set-proposal-wait-time req 10000)
  ;; FIXME: marshall
  (request/set-args req ["some args"])

  (defonce resp (channel/send-transaction-proposal chan req))
  (defonce future1 (channel/send-transaction chan resp (client/get-user-context cli)))
  (.get future1)
  )

