(ns clojure-fabric.core
  "Clojure wrapper for Hyperledger Java SDK functions"
  (:require [clojure.algo.generic.functor :as algo]
            [clojure.string :as str]
            [buddy.core.certificates :as certs]
            [buddy.core.keys :as keys]
            [promissum.core :as promis]
            [clojure-fabric.block :as block]
            [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.crypto-suite :as crypto]
            [clojure-fabric.client :as client]
            [clojure-fabric.request :as request]
            [clojure-fabric.response :as response]
            [clojure.core.cache :as cache])
  (:import [org.hyperledger.fabric.sdk User Enrollment Peer Orderer]
           [org.bouncycastle.jcajce.provider.asymmetric.ec BCECPrivateKey]))


;; (defprotocol Marshall
;;   (marshall [obj]))

;; ;;; FIXME: call marshal from generated code when return type matches
;; (extend-protocol Marshall
;;   java.util.Collection
;;   (marshall [obj]
;;     (if (instance? clojure.lang.IPersistentSet obj)
;;       obj
;;       (seq obj))))

(defn- general-lru-cache-read [k lru-cache miss-hit-fn & fn-args]
    (let [cache-hit (swap! lru-cache cache/hit k)]
      (if-let [found (cache/lookup cache-hit k)]
        found
        (let [new-entry (apply miss-hit-fn fn-args)]
        (swap! lru-cache cache/miss k new-entry)
        new-entry))))

;;;
;;; Client internals
;;;
(defonce client-lru-cache
  ;; FIXME: magic number
  (atom (cache/lru-cache-factory {} :threshold 64)))

(defn make-client [msp-id name priv-key cert {:keys [roles account affiliation]}]
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

(defn- priv-key+cert->hash [priv-key cert]
  (hash (str (.toString ^BCECPrivateKey priv-key) cert)))

(defn evict-client-from-cache [client]
  (let [enrollment (.getEnrollment ^User (client/get-user-context client))
        cache-key (priv-key+cert->hash (.getKey ^Enrollment enrollment)
                                      (.getCert ^Enrollment enrollment))]
    (swap! client-lru-cache cache/evict cache-key)))

;;;
;;; Channel
;;;
(defrecord ClientOpts [roles account affiliation])

(defn get-or-make-channel [client channel-id]
  (or (client/get-channel client channel-id) (client/new-channel client channel-id)))

(defprotocol IChannelEndOpts
  (new-channel-end [channel-end client])
  (get-channel-ends [channel-end client]))

;;;
;;; Orderer and Peer
;;;     Peers
;;;             Endorser
;;;             Commiter
;;;             (Submitter)

;;;
;; Channel ends are: Peers(Endorsers,...), Orderers
(defrecord OrdererOpts [name grpc-url properties]
  IChannelEndOpts
    (new-channel-end [{:keys [name grpc-url properties]} client]
    (client/new-orderer client name grpc-url properties))
  (get-channel-ends [this channel]
    (channel/get-orderers channel)))

(defrecord PeerOpts [name grpc-url properties]
  IChannelEndOpts
  (new-channel-end [{:keys [name grpc-url properties]} client]
    (client/new-peer client name grpc-url properties))
  (get-channel-ends [this channel]
    (channel/get-peers channel)))

(defprotocol IChannelEnd
  (add-channel-end-to-channel [channel-end channel]))
  
(extend-protocol IChannelEnd
  Orderer
  (add-channel-end-to-channel [this channel]
    (channel/add-orderer channel this)))

(extend-protocol IChannelEnd
  Peer
  (add-channel-end-to-channel [this channel]
    (channel/add-peer channel this)))

;;;
;;; Chaincode
;;;
;;; Chaincode - a set of functions
(defonce chaincode-lru-cache
  ;; FIXME: magic number
  (atom (cache/lru-cache-factory {} :threshold 64)))

(defrecord ChaincodeOpts [name version path])
(defn make-ChaincodeOpts [{:keys [name version path]}]
  (->ChaincodeOpts (when name (str/trim name))
                   (when version (str/trim version))
                   (when path (str/trim path))))

(defn- chaincode->hash [{:keys [name version path]}]
  (hash (str name " " version " " path)))

(defn make-chaincode [{:keys [name version path]}]
  (-> (chaincode/new-builder)
      (chaincode/set-name name)
      (chaincode/set-version version)
      (chaincode/set-path path)
      (chaincode/build)))

(defn get-or-make-chaincode [chaincode]
  (general-lru-cache-read (chaincode->hash chaincode)
                          chaincode-lru-cache
                          make-chaincode
                          chaincode))

(defn evict-chaincode-from-cache [])

;;;
;;; High level interface
;;;
(defn get-or-make-client [msp-id name priv-key cert opts]
  (general-lru-cache-read (priv-key+cert->hash priv-key cert)
                          client-lru-cache
                          make-client msp-id name priv-key cert opts))

(defn add-channel-end
  ([client channel-id channel-end-opts]
   ;; Add a {orderer peer} if there is no {orderer peer}
   (add-channel-end client channel-id channel-end-opts false))
  ([client channel-id channel-end-opts force?]
   ;; To add an additional {orderer peer} set 'force?' true
   (let [channel (get-or-make-channel client channel-id)]
     (when (or force?
               (empty? (get-channel-ends channel-end-opts (get-or-make-channel client channel-id))))
       (add-channel-end-to-channel (new-channel-end channel-end-opts client) channel)))))

(defrecord TransactionOpts [fcn args ;; chaincode-language chaincode-endorsement-policy
                            proposal-wait-time])

(defn propose-transaction
  ([client channel-id chaincode-opts transaction-opts]
   (propose-transaction client channel-id chaincode-opts transaction-opts nil))
  ([client channel-id chaincode-opts {:keys [fcn args proposal-wait-time]} peers]
   (let [channel (get-or-make-channel client channel-id)
         req (client/new-transaction-proposal-request client)]
     (when-not (channel/is-initialized channel)
       (channel/initialize channel))
     (request/set-chaincode-id req (get-or-make-chaincode chaincode-opts))
     ;; Transaction options
     ;; FIXME: what about chaincode-language, chaincode-endorsement-policy ?
     (when fcn
       (request/set-fcn req fcn))
     (when args
       (request/set-args req args))
     (when proposal-wait-time
       (request/set-proposal-wait-time req proposal-wait-time))
     ;; Send Tx proposal to peers
     (apply channel/send-transaction-proposal channel req peers))))

(defn order-transaction
  ([client channel-id proposal-responses]
   (order-transaction client channel-id proposal-responses nil))
  ([client channel-id proposal-responses orderers]
   ;; Send Tx to orderers
   (apply channel/send-transaction (get-or-make-channel client channel-id) proposal-responses orderers))
  ;; (defonce resp (channel/send-transaction-proposal chan req))
  ;; (defonce future1 (channel/send-transaction chan resp (client/get-user-context cli)))
  ;; (.get future1)
  )

(defn get-order-transaction-result [callback p]
  (promis/deliver p)
  (promis/future p)
  (promis/then p callback))

;;;;;;;;;;; Ex
#_
(comment
  ;; Copy from fabcar example
  (defn test-callback [v]
    (println "***" v))
  (defonce cli
    (get-or-make-client "Org1MSP"
                        "PeerAdmin"
                        (-> (slurp "resources/creds/cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec-priv")
                            (keys/str->private-key))
                        "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"
                        {}))
  
  (add-channel-end cli "mychannel" (map->OrdererOpts {:name "orderer0" :grpc-url "grpc://localhost:7050"}))
  (add-channel-end cli "mychannel" (map->PeerOpts {:name "peer0" :grpc-url "grpc://localhost:7051"}))
  (->> (map->TransactionOpts {:fcn "createCar"
                              ;; FIXME: marshall/unmarshall
                              :args (java.util.ArrayList. ["CAR10" "Chevy" "Volt" "Red" "Nick"])
                              :proposal-wait-time 10000})
       (propose-transaction cli
                            "mychannel"
                            (make-ChaincodeOpts {:name "fabcar" :version "1.0" :path "resources/"}))
       (order-transaction cli "mychannel")
       (get-order-transaction-result test-callback))
  
  )


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
  (request/set-fcn req "createCar")
  ;; timeout
  (request/set-proposal-wait-time req 10000)
  ;; FIXME: marshall
  (request/set-args req (java.util.ArrayList. ["CAR10" "Chevy" "Volt" "Red" "Nick"]))

  (defonce resp (channel/send-transaction-proposal chan req))
  (defonce future1 (channel/send-transaction chan resp (client/get-user-context cli)))
  (.get future1)
  )

