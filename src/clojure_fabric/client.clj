;; Copyright 2017 Jong-won Choi <oz.jongwon.choi@gmail.com>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

;;
;; Client implementation of "Fabric SDK Design Spec"
;; 
;; Main interaction handler with end user. A client instance provides a handler to interact
;; with a network of peers, orderers and optionally member services. An application using
;; the SDK may need to interact with multiple networks, each through a separate instance of
;; the Client.
;; Each client when initially created should be initialized with configuration data from
;; the consensus service, which includes a list of trusted roots, orderer certificates and
;; IP addresses, and a list of peer certificates and IP addresses that it can access.
;; This must be done out of band as part of bootstrapping the application environment.
;; It is also the responsibility of the application to maintain the configuration of a client
;; as the SDK does not persist this object.
;; Each Client instance can maintain several chains representing channels and the associated
;; sub-ledgers.

;;;
;;; Note: chain == channel
;;;

(ns clojure-fabric.client
  (:require [clojure-fabric.user :as user]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.orderer :as orderer]
            [clojure-fabric.peer :as peer]
            [clojure-fabric.chaincode :as chaincode])
  (:import clojure_fabric.channel.Channel))

(defonce ^:private clients (atom {}))

(defonce ^:dynamic *client* nil)

(defonce system-channel-name "")

(defmacro via-peer-channel [[channel peer] & body]
  ~@body)

(defmacro with-system-channel-of-peer [[channel peer] & body]
  `(let [channel# (or ~channel channel/*channel*)]
     (assert (instance? Channel channel#) (str "Channel is not valid! - " channel#))
     ;; FIXME: add peer checking
     (binding [channel/*channel* (assoc channel# :name system-channel-name)]
       ~@body)))

(defmacro with-client-binding
  [client & body]
  `(binding [*client* ~client]
     ~@body))

(defrecord Client [channels crypto-suite user-context])

(defn channel-defs->channels
  ;; Ex:
  ;;{"mychannel"
  ;;      {:orderers [{:name "orderer" :url "grpc://localhost:7050"}]
  ;;       :peers [{:name "peer" :url "grpc://localhost:7051"}]}}
  [user-context crypto-suite defs]
  (letfn [(make-node [k m]
            (case k
              :orderer (orderer/make-orderer m)
              :peer (peer/make-peer m)))
          (make-channel [n orderers peers]
            (channel/make-channel :name n :crypto-suite crypto-suite :user-context user-context
                                  :peers peers :orderer orderers))]
    (for [[n m] defs
          :let [orderers (mapv #(make-node :orderer %) (:orderers m))
                peers (mapv #(make-node :peer %) (:peers m))]]
      (make-channel n orderers peers))))


(defn make-client
  [user-map crypto-map channel-defs]
  (let [user (user/make-user user-map)
        crypto-suite (crypto-suite/make-crypto-suite crypto-map)]
    (assoc (->Client nil crypto-suite user)
           :channels (channel-defs->channels user crypto-suite channel-defs))))

;;; new_chain
;;;
;; "Initializes a chain instance with the given name. This is really representing the \"Channel\"
;;   (as explained above), and this call returns an empty object. To initialize the channel, a list of
;;   participating endorsers and orderer peers must be configured first on the returned object.
;;   Params:
;;         name (str): The name of the chain, recommend using namespaces to avoid collision
;;   Returns:
;;         (Chain instance): The uninitialized chain instance."
;;
;;
;; Immutable

;;; get_chain
(defn get-channel
  "Get a chain instance from the state storage. This allows existing chain instances to be saved
  for retrieval later and to be shared among instances of the application. Note that it's the 
  application/SDK’s responsibility to record the chain information. If an application is not able to
  look up the chain information from storage, it may call another API that queries one or more Peers
  for that information.
  Params:
        name (str): The name of the chain
  Returns:
        (Chain instance or None): the chain instance for the name.
  Error:  The state store has not been set
        A chain does not exist under that name"
  ;; Implementation Note:
  ;;    Not a storage operation 
  ([name]
   (get-channel *client* name))
  ([client name]
   (if-let [found (get (:channels client) name)]
     found
     ;; Implementation Note
     ;;       The spec says that Returns is chain Instance or None
     ;;       How it can be None and also throw an exception?
     (throw (Exception. "A channel does not exist under that name")))))

;;; query_chain-info
(defn query-channel-info
  "This is a network call to the designated Peer(s) to discover the chain information.
  The target Peer(s) must be part of the chain in question to be able to return the requested
  information.
  Params:
        name (str): The name of the chain
        peers (array of Peer instances): target Peers to query
  Returns: 
        (Chain instance or None): the chain instance for the name.
  Error: 
        The target Peer(s) does not know anything about the chain"

  ([name peers]
   (query-channel-info *client* name peers))
  ([client name peers]
   #_
   (let [channel (get-channel name)]
     (if (= (channel/get-peers channel) peers)
       ;;(%query-channel-info channel peers)
       :FIXME
       (throw (Exception. "The target Peer(s) does not know anything about the channel"))))))

;;;
;;;
#_
(defonce ^:private client-state-store (atom {}))
;;; set_state_store
#_
(defn set-state-store!
  "The SDK should have a built-in key value store implementation (suggest a file-based
  implementation to allow easy setup during development). But production systems would want
  a store backed by database for more robust storage and clustering, so that multiple
  app instances can share app state via the database (note that this doesn't necessarily
  make the app stateful). This API makes this pluggable so that different store implementations
  can be selected by the application.

  Params:
        store (KeyValueStore): instance of an alternative KeyValueStore implementation 
        provided by the consuming app.
  Returns:
        None"
  ([store]
   (set-state-store! *client* store))
  ([client store]
   (swap! client-state-store assoc client (atom {}))))

;;; get_state_store
(defn get-state-store
  "A convenience method for obtaining the state store object in use for this client.
Params:
        None
Returns: 
        (KeyValueStore instance): The KeyValueStore implementation object set within this Client, 
        or null if it does not exist "
  ([]
   (get-state-store *client*))
  ([client]
   #_
   (get @client-state-store client)))

;;; set_crypto_suite
;;   "Sets an instance of the CryptoSuite interface implementation. A crypto suite encapsulates
;;   algorithms for digital signatures and encryption with asymmetric key pairs, message encryption
;;   with a symmetric key, and secure hashing and MAC.

;; Params:
;;   Suite (object): an instance of a crypto suite implementation"
;;   
;; Immutable

;;; get_crypto_suite 
(defn get-crypto-suite
  "A convenience method for obtaining the CryptoSuite object in use for this client.
  Params:
        None
  Returns:
        (CryptoSuite instance): The CryptoSuite implementation object set within this Client, 
        or null if it does not exist"
  ([]
   (get-crypto-suite *client*))
  ([client]
   (:crypto-suite client)))

#_
(defn %update-client! [k new-client]
  (swap! clients assoc k new-client))

;;; set_user_context
;; "Sets an instance of the User class as the security context of this client instance.
;;   This user's credentials (ECert) will be used to conduct transactions and queries with
;;   the blockchain network. Upon setting the user context, the SDK saves the object in a persistence
;;   cache if the \"state store\" has been set on the Client instance. If no state store has been set,
;;   this cache will not be established and the application is responsible for setting the user
;;   context again when the application crashed and is recovered.
;;   Params:
;;         user (User): an instance of the User class encapsulating the authenticated user’s
;;         signing materials (private key and enrollment certificate)"
;;
;; Immutable


;;; get_user_context
#_
(defn get-user-context
 "As explained above, the client instance can have an optional state store. The SDK saves enrolled
  users in the storage which can be accessed by authorized users of the application 
  (authentication is done by the application outside of the SDK). This function attempts to load
  the user by name from the local storage (via the KeyValueStore interface). 
  The loaded user object must represent an enrolled user with a valid enrollment certificate 
  signed by a trusted CA (such as the COP server). 
  Params:
        name (str): The name of the user
  Returns: 
        (User instance): The user object corresponding to the name, or null if the user does not
        exist or if the state store has not been set"
  ([name]
   (get-user-context *client* name))
  ([client name]
   ;; TBD
   ))


;;;
;;; Not in spec, but in some SDKs
;;; 
(defn query-installed-chaincodes
  ([peer]
   (query-installed-chaincodes channel/*channel* peer))
  ([channel peer]
   (with-system-channel-of-peer [channel peer]
     ;; FIXME: Check channel has this peer
     (channel/create-transaction-proposal channel)
     ;; !!!!!!!!!!!!!!!!!

     )))

;;;;;;;;;;;
#_
(comment
 (defn find-client [k]
   (get @clients k))

 (binding [*client* (find-client 10)]
   (get-channel "bar"))

 (defn make-client! [k]
   (swap! clients assoc k (map->Client {:channels (atom {})})))

 (defn update-client! [k new-client]
   (swap! clients assoc k new-client))
 )
