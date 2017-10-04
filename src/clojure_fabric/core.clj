(ns clojure-fabric.core
  "Clojure wrapper for Hyperledger Java SDK functions"
  (:require [clojure.algo.generic.functor :as algo]
            [clojure.string :as str]
            [clojure.core.cache :as cache]
            [buddy.core.certificates :as certs]
            [buddy.core.keys :as keys]
            [promissum.core :as promis]

            [clojure-fabric.hf-client :as hf-client]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.chaincode-id :as chaincode-id]
            [clojure-fabric.transaction-request :as transaction-request]
            [clojure-fabric.query-by-chaincode-request :as query-by-chaincode-request]
            ;; [clojure-fabric.base-exception :as base-exception]
            ;; [clojure-fabric.instantiate-proposal-request :as instantiate-proposal-request]
            ;; [clojure-fabric.blockchain-info :as blockchain-info]
            ;; [clojure-fabric.invalid-argument-exception :as invalid-argument-exception]
            ;; [clojure-fabric.block :as block]
            ;; [clojure-fabric.invalid-protocol-buffer-runtime-exception :as invalid-protocol-buffer-runtime-exception]
            ;; [clojure-fabric.block-deserializer :as block-deserializer]
            ;; [clojure-fabric.invalid-transaction-exception :as invalid-transaction-exception]
            ;; [clojure-fabric.block-event :as block-event]
            ;; [clojure-fabric.invoke-exception :as invoke-exception]
            ;; [clojure-fabric.block-info :as block-info]
            ;; [clojure-fabric.join-peer-proposal-builder :as join-peer-proposal-builder]
            ;; [clojure-fabric.block-listener :as block-listener]
            ;; [clojure-fabric.lscc-proposal-builder :as lscc-proposal-builder]
            ;; [clojure-fabric.chaincode-action-deserializer :as chaincode-action-deserializer]
            ;; [clojure-fabric.no-available-t-cert-exception :as no-available-t-cert-exception]
            ;; [clojure-fabric.chaincode-action-payload-deserializer :as chaincode-action-payload-deserializer]
            ;; [clojure-fabric.no-valid-peer-exception :as no-valid-peer-exception]
            ;; [clojure-fabric.chaincode :as chaincode]
            ;; [clojure-fabric.orderer-client :as orderer-client]
            ;; [clojure-fabric.chaincode-endorsed-action-deserializer :as chaincode-endorsed-action-deserializer]
            ;; [clojure-fabric.orderer :as orderer]
            ;; [clojure-fabric.chaincode-endorsement-policy :as chaincode-endorsement-policy]
            ;; [clojure-fabric.payload-deserializer :as payload-deserializer]
            ;; [clojure-fabric.chaincode-endorsement-policy-parse-exception :as chaincode-endorsement-policy-parse-exception]
            ;; [clojure-fabric.peer :as peer]
            ;; [clojure-fabric.chaincode-exception :as chaincode-exception]
            ;; [clojure-fabric.peer-exception :as peer-exception]            
            ;; [clojure-fabric.proposal-builder :as proposal-builder]
            ;; [clojure-fabric.chaincode-input-deserializer :as chaincode-input-deserializer]
            ;; [clojure-fabric.proposal-exception :as proposal-exception]
            ;; [clojure-fabric.chaincode-invocation-spec-deserializer :as chaincode-invocation-spec-deserializer]
            ;; [clojure-fabric.proposal-response :as proposal-response]
            ;; [clojure-fabric.chaincode-language :as chaincode-language]
            ;; [clojure-fabric.proposal-response-payload-deserializer :as proposal-response-payload-deserializer]
            ;; [clojure-fabric.chaincode-proposal-payload-deserializer :as chaincode-proposal-payload-deserializer]
            ;; [clojure-fabric.proto-utils :as proto-utils]
            ;; [clojure-fabric.chaincode-response :as chaincode-response]
            ;; [clojure-fabric.query-exception :as query-exception]
            ;; [clojure-fabric.channel-configuration :as channel-configuration]
            ;; [clojure-fabric.query-installed-chaincodes-builder :as query-installed-chaincodes-builder]
            ;; [clojure-fabric.channel-header-deserializer :as channel-header-deserializer]
            ;; [clojure-fabric.query-instantiated-chaincodes-builder :as query-instantiated-chaincodes-builder]
            ;; [clojure-fabric.client :as client]
            ;; [clojure-fabric.query-peer-channels-builder :as query-peer-channels-builder]
            ;; [clojure-fabric.config :as config]
            ;; [clojure-fabric.query-scc-request :as query-scc-request]
            ;; [clojure-fabric.core :as core]
            ;; [clojure-fabric.request :as request]
            ;; [clojure-fabric.crypto-exception :as crypto-exception]
            ;; [clojure-fabric.response :as response]
            ;; [clojure-fabric.crypto-primitives :as crypto-primitives]
            ;; [clojure-fabric.sdk-utils :as sdk-utils]
            ;; [clojure-fabric.transaction-action-deserializer :as transaction-action-deserializer]
            ;; [clojure-fabric.cscc-proposal-builder :as cscc-proposal-builder]
            ;; [clojure-fabric.transaction-builder :as transaction-builder]
            ;; [clojure-fabric.diagnostic-file-dumper :as diagnostic-file-dumper]
            ;; [clojure-fabric.transaction-context :as transaction-context]
            ;; [clojure-fabric.endorser-client :as endorser-client]
            ;; [clojure-fabric.transaction-deserializer :as transaction-deserializer]
            ;; [clojure-fabric.endorser-transaction-env-deserializer :as endorser-transaction-env-deserializer]
            ;; [clojure-fabric.transaction-event-exception :as transaction-event-exception]
            ;; [clojure-fabric.endpoint :as endpoint]
            ;; [clojure-fabric.transaction-exception :as transaction-exception]
            ;; [clojure-fabric.enrollment :as enrollment]
            ;; [clojure-fabric.transaction-info :as transaction-info]
            ;; [clojure-fabric.envelope-deserializer :as envelope-deserializer]
            ;; [clojure-fabric.transaction-payload-deserializer :as transaction-payload-deserializer]
            ;; [clojure-fabric.event-hub :as event-hub]
            ;; [clojure-fabric.transaction-proposal-request :as transaction-proposal-request]
            ;; [clojure-fabric.event-hub-exception :as event-hub-exception]
            ;; [clojure-fabric.execute-exception :as execute-exception]
            ;; [clojure-fabric.tx-read-write-set-info :as tx-read-write-set-info]
            ;; [clojure-fabric.get-t-cert-batch-exception :as get-t-cert-batch-exception]
            ;; [clojure-fabric.update-channel-configuration :as update-channel-configuration]
            ;; [clojure-fabric.header-deserializer :as header-deserializer]
            ;; [clojure-fabric.upgrade-proposal-builder :as upgrade-proposal-builder]
            ;; [clojure-fabric.upgrade-proposal-request :as upgrade-proposal-request]
            ;; [clojure-fabric.install-proposal-builder :as install-proposal-builder]
            ;; [clojure-fabric.user :as user]
            ;; [clojure-fabric.install-proposal-request :as install-proposal-request]
            ;; [clojure-fabric.utils :as utils]
            ;; [clojure-fabric.instantiate-proposal-builder :as instantiate-proposal-builder]
            ;; [clojure-fabric.block :as block]
            )
  
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
  (let [new-client (hf-client/create-new-instance)]
    (hf-client/set-crypto-suite new-client (crypto-suite/get-crypto-suite))
    (hf-client/set-user-context new-client 
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
  (let [enrollment (.getEnrollment ^User (hf-client/get-user-context client))
        cache-key (priv-key+cert->hash (.getKey ^Enrollment enrollment)
                                      (.getCert ^Enrollment enrollment))]
    (swap! client-lru-cache cache/evict cache-key)))

;;;
;;; Channel
;;;
(defrecord ClientOpts [roles account affiliation])

(defn get-or-make-channel [client channel-id]
  (or (hf-client/get-channel client channel-id) (hf-client/new-channel client channel-id)))

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
    (hf-client/new-orderer client name grpc-url properties))
  (get-channel-ends [this channel]
    (channel/get-orderers channel)))

(defrecord PeerOpts [name grpc-url properties]
  IChannelEndOpts
  (new-channel-end [{:keys [name grpc-url properties]} client]
    (hf-client/new-peer client name grpc-url properties))
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
  (-> (chaincode-id/new-builder)
      (chaincode-id/set-name name)
      (chaincode-id/set-version version)
      (chaincode-id/set-path path)
      (chaincode-id/build)))

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
         req (hf-client/new-transaction-proposal-request client)]
     (when-not (channel/is-initialized channel)
       (channel/initialize channel))
     (transaction-request/set-chaincode-id req (get-or-make-chaincode chaincode-opts))
     ;; Transaction options
     ;; FIXME: what about chaincode-language, chaincode-endorsement-policy ?
     (when fcn
       (transaction-request/set-fcn req fcn))
     (when args
       (transaction-request/set-args req args))
     (when proposal-wait-time
       (transaction-request/set-proposal-wait-time req proposal-wait-time))
     ;; Send Tx proposal to peers
     (apply channel/send-transaction-proposal channel req peers))))

(defn order-transaction
  ([client channel-id proposal-responses]
   (order-transaction client channel-id proposal-responses nil))
  ([client channel-id proposal-responses orderers]
   ;; Send Tx to orderers
   (apply channel/send-transaction (get-or-make-channel client channel-id) proposal-responses orderers)))

(defn get-order-transaction-result [f then-fn catch-fn]
  (-> f
      (promis/then then-fn)
      (promis/catch catch-fn)))

;;;;;;;;;;; Ex
#_
(comment
  ;; Copy from fabcar example

  ;; 1. Make a client
  (defonce cli
    (get-or-make-client "Org1MSP"
                        "PeerAdmin"
                        (-> (slurp "resources/creds/cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec-priv")
                            (keys/str->private-key))
                        "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"
                        {}))
  ;; 2. Add (channel), orderer, and peer
  (add-channel-end cli "mychannel" (map->OrdererOpts {:name "orderer" :grpc-url "grpc://localhost:7050"}))
  (add-channel-end cli "mychannel" (map->PeerOpts {:name "peer" :grpc-url "grpc://localhost:7051"}))

  ;; FIXME: need a way to get a peer ...
  (hf-client/query-installed-chaincodes cli (first (get-channel-ends (map->PeerOpts {:name "peer" :grpc-url "grpc://localhost:7051"})
                                                                     (get-or-make-channel cli "mychannel"))))

  ;; FIXME: init for query-by-chaincode
  (channel/initialize (get-or-make-channel cli "mychannel"))

  (let [proposal-req (hf-client/new-query-proposal-request)]
    (transaction-request/set-args req (java.util.ArrayList. ["CAR10" "Chevy" "Volt" "Red" "Nick"]))
    (query-by-chaincode-request/set))
  (channel/query-by-chaincode (get-or-make-channel cli "mychannel")
                              (query-by-chaincode-request/new-instance (hf-client/get-user-context cli)))
  
  
  ;; 3. Tx
  (let [tx-future (->> (map->TransactionOpts {:fcn "createCar"
                                              ;; FIXME: marshall/unmarshall
                                              :args (java.util.ArrayList. ["CAR10" "Chevy" "Volt" "Red" "Nick"])
                                              :proposal-wait-time 10000})
                       ;; 3-1. Proposal
                       (propose-transaction cli
                                            "mychannel"
                                            (make-ChaincodeOpts {:name "fabcar" :version "1.0" :path "github.com/fabcar"}))
                       ;; 3-2 Order
                       (order-transaction cli "mychannel"))]
    ;; 4. Get Tx result 
    (get-order-transaction-result tx-future #(println "OK" %) #(println "ERROR" %)))
  
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
  (defonce cli (hf-client/create-new-instance))
  (hf-client/set-crypto-suite cli (crypto-suite/get-crypto-suite))
 
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
  
  (hf-client/set-user-context cli peer-admin)

  
  ;; 2. Channel
  (defonce chan (hf-client/new-channel cli (:channel-id options)))
  (channel/add-orderer chan (hf-client/new-orderer cli "orderer0" "grpc://localhost:7050"))
  (channel/add-peer chan (hf-client/new-peer cli "peer0" "grpc://localhost:7051"))
  (channel/initialize chan)

  ;; 3. Request
  (defonce req (hf-client/new-transaction-proposal-request cli))

  (defonce chaincode-id (-> (chaincode-id/new-builder)
                            (chaincode-id/set-name "fabcar")
                            (chaincode-id/set-version "1.0")
                            (chaincode-id/set-path "resources/")
                            (chaincode-id/build)))
  (transaction-request/set-chaincode-id req chaincode-id)
  (transaction-request/set-fcn req "createCar")
  ;; timeout
  (transaction-request/set-proposal-wait-time req 10000)
  ;; FIXME: marshall
  (transaction-request/set-args req (java.util.ArrayList. ["CAR10" "Chevy" "Volt" "Red" "Nick"]))

  (defonce resp (channel/send-transaction-proposal chan req))
  (defonce future1 (channel/send-transaction chan resp (hf-client/get-user-context cli)))
  (.get future1)
  )

