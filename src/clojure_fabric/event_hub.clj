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

(ns clojure-fabric.event-hub
  (:require [clojure-fabric.proto :as proto]
            [clojure-fabric.crypto-suite :as crypto]
            [clojure-fabric.utils :as utils]
            [clojure.core.async :as async]
            [clojure-fabric.core :as core])
  (:import io.grpc.stub.StreamObserver
           [clojure_fabric.proto Block ChaincodeEvent]
           [com.google.protobuf ByteString]
           io.grpc.ManagedChannel
           org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
           [org.hyperledger.fabric.protos.common Common$Block Common$BlockMetadataIndex
            Common$Envelope]
           [org.hyperledger.fabric.protos.peer EventsGrpc EventsPackage$Event
            EventsPackage$Interest EventsPackage$Register EventsPackage$Event$EventCase
            EventsPackage$SignedEvent TransactionPackage$TxValidationCode]))


;; From NodeJs SDK
;; 
;; EventHub
;; Transaction processing in fabric v1.0 is a long operation spanning multiple components
;; (application, endorsing peer, orderer, committing peer) and takes a relatively lengthy
;; period of time (think seconds instead of milliseconds) to complete. As a result the applications
;; must design their handling of the transaction lifecyle in an asynchrous fashion.
;; After the transaction proposal has been successfully endorsed, and before the transaction message
;; has been successfully broadcast to the orderer, the application should register a listener
;; to be notified of the event when the transaction achieves finality, which is when the block
;; containing the transaction gets added to the peer's ledger/blockchain. 
;;
;; Fabric committing peers provides an event stream to publish events to registered listeners.
;; As of v1.0, the only events that get published are Block events. A Block event gets published
;; whenever the committing peer adds a validated block to the ledger. There are three ways
;; to register a listener to get notified:
;; - register a "block listener" to get called for every block event on all channels. The listener
;;      will be passed a fully decoded Block object. See registerBlockEvent
;; - register a "transaction listener" to get called when the specific transaction by id is
;;      committed (discovered inside a block event). The listener will be passed the transaction id
;;      and the validation code. See registerTxEvent
;; - register a "chaincode event listener" to get called when a specific chaincode event has arrived.
;;      The listener will be passed the ChaincodeEvent. See registerChaincodeEvent 
;;
;; The events are ephemeral, such that if a registered listener crashed when the event is published,
;; the listener will miss the event. There are several techniques to compensate for missed events
;; due to client crashes:
;; - register block event listeners and record the block numbers received, such that when the next
;;      block arrives and its number is not the next in sequence, then the application knows exactly
;;      which block events have been missed. It can then use queryBlock to get those missed blocks
;;      from the target peer.
;; - use a message queue to catch all the block events. With many robust message queue
;;      implementations available today, you will be guaranteed to not miss an event. A fabric event
;;      listener can be written in any programming language. The following implementations can be
;;      used as reference to write the necessary glue code between the fabric event stream and
;;      a message queue:
;;      - Node.js: this class. Source code can be found here
;;      - Java: part of the Java SDK for Hyperledger Fabric. Source code can be found here
;;      - Golang: an example event listener client can be found here
;;

(defonce block-metadata-index-map
  (zipmap [:signatures :last-config :transactions-filter :orderer]
          [Common$BlockMetadataIndex/SIGNATURES_VALUE Common$BlockMetadataIndex/LAST_CONFIG_VALUE
           Common$BlockMetadataIndex/TRANSACTIONS_FILTER_VALUE Common$BlockMetadataIndex/ORDERER_VALUE]))

(defonce tx-validation-code-map
  (zipmap [TransactionPackage$TxValidationCode/VALID_VALUE
           TransactionPackage$TxValidationCode/NIL_ENVELOPE_VALUE
           TransactionPackage$TxValidationCode/BAD_PAYLOAD_VALUE
           TransactionPackage$TxValidationCode/BAD_COMMON_HEADER_VALUE
           TransactionPackage$TxValidationCode/BAD_CREATOR_SIGNATURE_VALUE
           TransactionPackage$TxValidationCode/INVALID_ENDORSER_TRANSACTION_VALUE
           TransactionPackage$TxValidationCode/INVALID_CONFIG_TRANSACTION_VALUE
           TransactionPackage$TxValidationCode/UNSUPPORTED_TX_PAYLOAD_VALUE
           TransactionPackage$TxValidationCode/BAD_PROPOSAL_TXID_VALUE
           TransactionPackage$TxValidationCode/DUPLICATE_TXID_VALUE
           TransactionPackage$TxValidationCode/ENDORSEMENT_POLICY_FAILURE_VALUE
           TransactionPackage$TxValidationCode/MVCC_READ_CONFLICT_VALUE
           TransactionPackage$TxValidationCode/PHANTOM_READ_CONFLICT_VALUE
           TransactionPackage$TxValidationCode/UNKNOWN_TX_TYPE_VALUE
           TransactionPackage$TxValidationCode/TARGET_CHAIN_NOT_FOUND_VALUE
           TransactionPackage$TxValidationCode/MARSHAL_TX_ERROR_VALUE
           TransactionPackage$TxValidationCode/NIL_TXACTION_VALUE
           TransactionPackage$TxValidationCode/EXPIRED_CHAINCODE_VALUE
           TransactionPackage$TxValidationCode/CHAINCODE_VERSION_CONFLICT_VALUE
           TransactionPackage$TxValidationCode/BAD_HEADER_EXTENSION_VALUE
           TransactionPackage$TxValidationCode/BAD_CHANNEL_HEADER_VALUE
           TransactionPackage$TxValidationCode/BAD_RESPONSE_PAYLOAD_VALUE
           TransactionPackage$TxValidationCode/BAD_RWSET_VALUE
           TransactionPackage$TxValidationCode/ILLEGAL_WRITESET_VALUE
           TransactionPackage$TxValidationCode/INVALID_OTHER_REASON_VALUE]
          [:valid
           :nil-envelope
           :bad-payload
           :bad-common-header
           :bad-creator-signature
           :invalid-endorser-transaction
           :invalid-config-transaction
           :unsupported-tx-payload
           :bad-proposal-txid
           :duplicate-txid
           :endorsement-policy-failure
           :mvcc-read-conflict
           :phantom-read-conflict
           :unknown-tx-type
           :target-chain-not-found
           :marshal-tx-error
           :nil-txaction
           :expired-chaincode
           :chaincode-version-conflict
           :bad-header-extension
           :bad-channel-header
           :bad-response-payload
           :bad-rwset
           :illegal-writeset
           :invalid-other-reason]))

;; (defonce event-type {:register
;;                      :block
;;                      :chaincode
;;                      :rejection
;;                      :filtered-block})

(defonce default-sliding-buffer-size 32)
(defonce command-ch (async/chan))
;; Block event - any block events
(defonce block-event-chan (async/sliding-buffer default-sliding-buffer-size))
(defonce block-event-handlers (atom {}))
;; Transaction event - matching tx-id
(defonce tx-id->chan-fn-map (atom {}))
;; Chaincode event - matching chaincode-id
(defonce chaincode-id->chan-fn-map (atom {}))

(defrecord ChanFun [ch fn])
(defn make-chan-fun
  [fn]
  (->ChanFun (async/chan) fn))

(defn register-block-event
  [fn-name fn]
  (swap! block-event-handlers assoc fn-name fn)
  (async/put! command-ch :refresh))

(defn unregister-block-event
  [fn-name]
  (swap! block-event-handlers dissoc fn-name)
  (async/put! command-ch :refresh))

(defn- %unregister-event
  [id ref]
  (when-let [existing (get (deref ref) id)]
    (async/close! (:ch existing))
    (swap! ref dissoc id))
  (async/put! command-ch :refresh))

(defn- %register-event
  [id fn ref]
  (when-let [existing (get (deref ref) id)]
    (async/close! (:ch existing)))
  (swap! ref assoc id (make-chan-fun fn))
  (async/put! command-ch :refresh))

(defn register-tx-event
  [tx-id fn]
  (%register-event tx-id fn tx-id->chan-fn-map))

(defn unregister-tx-event
  [tx-id]
  (%unregister-event tx-id tx-id->chan-fn-map))

(defn register-chaincode-event
  [chaincode-id fn]
  (%register-event chaincode-id fn chaincode-id->chan-fn-map))

(defn unregister-chaincode-event
  [chaincode-id]
  (%unregister-event chaincode-id chaincode-id->chan-fn-map))

(defn get-all-event-chans
  []
  (letfn [(%get-all-chans [ref]
            (map :ch (vals (deref ref))))]
    `[~command-ch
      ~block-event-chan
      ~@(%get-all-chans tx-id->chan-fn-map)
      ~@(%get-all-chans chaincode-id->chan-fn-map)]))

;; Block event is proto/Block
;; Chaincode event is proto/ChaincodeEvent
(defrecord TxEvent [tx-id status])
(defn make-TxEvent
  [tx-id code]
  (->TxEvent tx-id code))

(defonce event-go-loop
  (async/go-loop []
    (let [[v ch] (async/alts! (get-all-event-chans))]
      (cond (and (= ch command-ch) (= v :refresh))
            :renew-get-all-event-chans

            (instance? Block v)
            (doseq [f @block-event-handlers]
              (utils/ignore-errors
               (f v)))

            (instance? TxEvent v)
            (utils/ignore-errors
             ((:fn (get @tx-id->chan-fn-map (:tx-id v))) v))

            (instance? ChaincodeEvent v)
            (utils/ignore-errors
             ((:fn (get @chaincode-id->chan-fn-map (:chaincode-id v))) v)))
      (recur))))

(defn- %id->ch
  [id ref]
  (-> (deref ref) (get id) (:ch)))

(defn tx-id->chan
  [tx-id]
  (%id->ch tx-id tx-id->chan-fn-map))

(defn chaincode-id->chan
  [chaincode-id]
  (%id->ch chaincode-id chaincode-id->chan-fn-map))

(defn deliver-block-events-to-channels
  [^Common$Block proto-block]
  (let [clj-block (proto/proto->clj proto-block (proto/parse-trees :block-configuration))]
    ;; 1. Block Event on all channels
    (async/put! block-event-chan clj-block)
    (doseq [[data code] (map list
                             (:data clj-block)
                             (-> (:metadata clj-block)
                                 (:metadata)
                                 (nth (block-metadata-index-map :transactions-filter))
                                 (.toByteArray)))]
      (let [payload (:payload data)
            channel-header (get-in payload [:header :channel-header])
            tx-id (:tx-id channel-header)]
        ;; 2. Transaction Event with tx-id
        (when-let [ch (tx-id->chan tx-id)]
          (async/put! ch (make-TxEvent tx-id code)))
        ;; 3. Chaincode event
        (when (= (:type channel-header) (proto/header-types :endorser-transaction))
          (let [chaincode-event (get-in payload [:data :actions 0 :payload :action
                                                 :proposal-response-payload :extension :events])]
            (when-let [ch (chaincode-id->chan (:chaincode-id chaincode-event))]
              (async/put! ch chaincode-event))))))))

(defn transaction-observer
  [ch]
  (reify StreamObserver
    (onNext [this event]
      (case (.getEventCase ^EventsPackage$Event event)
        EventsPackage$Event$EventCase/BLOCK (deliver-block-events-to-channels (.getBlock event))
        EventsPackage$Event$EventCase/REGISTER nil ;; init
        ;; EventsPackage$Event$EventCase/CHAINCODE_EVENT ;; FIXME: not used??
        EventsPackage$Event$EventCase/UNREGISTER nil;; shutdown
        ))
    (onError [this err]
      ;; FIXME call shutdownNow when Status$Code/INTERNAL or Status$Code/UNAVAILABLE
      (async/put! ch err))
    (onCompleted [this]
      (async/put! ch :done))))

(defn make-event-hub
  [user peer]
  (let [ch (async/chan (async/sliding-buffer default-sliding-buffer-size))
        ^StreamObserver observer (transaction-observer ch)
        ^ManagedChannel channel (proto/node->channel peer)]
    (.chat (EventsGrpc/newStub channel)
           observer)
    (let [interest (-> (EventsPackage$Interest/newBuilder)
                       (.setEventType EventsPackage$Event$EventCase/BLOCK)
                       (.build))
          register (-> (EventsPackage$Register/newBuilder)
                       (.addEvents interest)
                       (.build))
          block-event (-> (EventsPackage$Event/newBuilder)
                          (.setRegister register)
                          (.setCreator (.toByteString ^Identities$SerializedIdentity
                                                      (proto/clj->proto (proto/user->serialized-identity user))))
                          (.build))]
      (.onNext observer
               (-> (EventsPackage$SignedEvent/newBuilder)
                   (.setEventBytes (.toByteString block-event))
                   (.setSignature (ByteString/copyFrom ^bytes (crypto/sign (.toByteArray block-event) (:private-key user) {:algorithm (:key-algorithm (:crypto-suite user))})))
                   (.build)))
      (try
        (async/go-loop []
          (let [block (async/<! ch)]
            (case (.getEventCase ^EventsPackage$Event event)
              EventsPackage$Event$EventCase/BLOCK (async/put! ch event) ;; ch is like eventQueue
              EventsPackage$Event$EventCase/REGISTER :FIXME ;; connected, connectedTime
              )
            (cond= (type v)
                   
                   (instance? Exception v) (when-not (.isShutdown channel)
                                             (.shutdownNow channel))
                   ;; FIXME: do something here!!
                   :else (recur))))
        (finally (.onCompleted observer))))))


(defrecord EventHub [peer-address peer-tls-certificate peer-tls-certificate-override
                     tx-registrants
                     connected
                     mtx chaincode-registrants block-registrants  
                     grpc-client
                     interested-events
                     event-client-factory client])

(defn make-event-hub [m]
  (map->EventHub m))

(def ^:dynamic *event-hub* nil)

(defn connect
  ([]
   (connect event-hub))
  ([event-hub]
   (when-not (:connected event-hub)
     (if-not (:peer-address event-hub)
       (throw (Exception. "Peer address is missing!"))
       ))))


;; connect
;; disconnect
;; get-peer-address
;; connected?
;; set-peer-address
;; unregister-block-event
;; unregister-chaincode-event
;; unregister-tx-event

;; set-interests
;; add-chaincode-interest
;; remove-chaincode-interest
;; get-interested-events
;; receive (i/f - block or chaincode)

