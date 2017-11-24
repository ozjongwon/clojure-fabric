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
;; Chain implementation of "Fabric SDK Design Spec"
;;
;; The “Chain” object captures settings for a channel, which is created by the orderers to isolate
;; transactions delivery to peers participating on channel. A chain must be initialized after
;; it has been configured with the list of peers and orderers. The initialization sends
;; a CONFIGURATION transaction to the orderers to create the specified channel and asks the peers
;; to join that channel. 

;;;
;;; Note: chain == channel
;;;

(ns clojure-fabric.channel
  (:require [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.core :as core]
            [clojure-fabric.proto :as proto]
            [clojure-fabric.user :as user]
            [clojure-fabric.orderer :as orderer]
            [clojure-fabric.utils :as utils])
  (:import com.google.protobuf.ByteString
           org.bouncycastle.util.encoders.Hex
           org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
           org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse))

;;;
;;; Functions
;;;
(defn- new-channel-end!
  [channel {:keys [url] :as channel-end} channel-ends-key]
  (swap! core/users assoc-in [(:user-key channel) :channels channel-ends-key url]
         channel-end))

(defn- remove-channel-end!
  [channel {:keys [name url] :as channel-end} channel-ends-key]
  (swap! core/users update-in [(:user-key channel) :channels channel-ends-key] dissoc url))

;;; add_peer
(defn add-peer!
  "Add peer endpoint to a chain object, this is a local-only operation
  Params:
        peer (Peer): an instance of the Peer class that has been initialized with URL,
        TLC certificate, and enrollment certificate"
  ([peer-opts]
   (add-peer! core/*channel* peer-opts))
  ([channel peer-opts]
   (new-channel-end! channel peer-opts :peers)))

;;; remove_peer
(defn remove-peer!
  "Remove peer endpoint from a chain object, this is a local-only operation
  Params
        peer (Peer): an instance of the Peer class"
  ([peer]
   (remove-peer! core/*channel* peer))
  ([channel peer]
   (remove-channel-end! channel peer :peers)))

;;; get_peers
;; Use (get-nodes ... type), where type is one of :peers :orderers

;;;
;;;

;;; add_orderer
(defn add-orderer!
  "Add orderer endpoint to a chain object, this is a local-only operation. A chain instance may
  choose to use a single orderer node, which will broadcast requests to the rest of the orderer
  network. Or if the application does not trust the orderer nodes, it can choose to use more than
  one by adding them to the chain instance. And all APIs concerning the orderer will broadcast
  to all orderers simultaneously.

  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (add-orderer! core/*channel* orderer))
  ([channel orderer]
   (new-channel-end! channel orderer :orderers)))

;;; remove_orderer
(defn remove-orderer!
  "Remove orderer endpoint from a chain object, this is a local-only operation. 
  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (remove-orderer! core/*channel* orderer))
  ([channel orderer]
   (remove-channel-end! channel orderer :orderers)))

;;; get_orderers
(defn get-orderers
  "Get orderers of a chain. This is a local-only operation.
  Params
        None
  Returns
        (Orderer list): The orderer list on the chain"
  ([]
   (get-orderers core/*channel*))
  ([channel]
   (:orderers channel)))

;; ;;; initialize_chain
;; (defn initialize-channel
;;   "Calls the orderer(s) to start building the new chain, which is a combination of opening
;;   new message stream and connecting the list of participating peers. This is a long-running process.
;;   Only one of the application instances needs to call this method. Once the chain is successfully
;;   created, other application instances only need to call get_chain() to obtain the information
;;   about this chain.
;;   Params
;;         None
;;   Returns
;;         (bool): whether the chain initialization process was successful"
;;   ([]
;;    (initialize-channel core/*channel*))
;;   ([channel]
;;    ;; TBD
;;    ))

;; ;;; update_chain
;; (defn update-channel
;;   "Calls the orderer(s) to update an existing chain. This allows the addition and deletion of Peer
;;   nodes to an existing chain, as well as the update of Peer certificate information upon
;;   certificate renewals.
;;   Params
;;         None
;;   Returns
;;         (bool): whether the chain update process was successful"
;;   ([]
;;    (update-channel core/*channel*))
;;   ([channel]
;;    ;;TBD
;;    ))

;; ;;;is_readonly
;; (defn is-readonly
;;   "Get chain status to see if the underlying channel has been terminated, making it a read-only
;;   chain, where information (transactions and states) can be queried but no new transactions
;;   can be submitted.
;;   Params
;;         None
;;   Returns
;;         (bool): is ready-only (true) or not "
;;   ([]
;;    (is-readonly core/*channel*))
;;   ([channel]
;;    ;; TBD
;;    ))

;;; send_transaction_proposal
(defn send-transaction-proposal
  "Send  the created proposal to peer for endorsement.
  Params
        transaction_proposal (Transaction_Proposal): The transaction proposal data
        chain: The target chain whose peers the proposal will be sent to
        retry (Number): Times to retry when failure, by default to 0 (no retry)
  Returns
        (Transaction_Proposal_Response response): The response to send proposal request."
  ([transaction-proposal retry]
   (send-transaction-proposal core/*channel* transaction-proposal retry))
  ([{:keys [user-key name] :as channel} transaction-proposal retry]
   (proto/send-proposal transaction-proposal
                        channel ;; = chain
                        (apply core/get-user user-key)
                        #(ProposalResponsePackage$ProposalResponse/parseFrom ^ByteString %)
                        {})))

;;;query_info
(defn query-blockchain-info
  "Queries for various useful information on the state of the Chain (height, known peers)
  Params
        none
  Returns 
        (ChainInfo) with height, currently the only useful info"
  ([]
   (query-blockchain-info core/*channel*))
  ([{:keys [user-key name] :as channel}]
   (chaincode/send-system-chaincode-request :query-blockchain-info
                                            name
                                            channel
                                            (apply core/get-user user-key)
                                            {:args [name]})))

;;;query_block
(defn query-block-by-number
  "Queries the ledger for Block by block number
  Params
        blockNumber (number)
  Returns 
        Object containing the block"
  ([block-number]
   (query-block-by-number core/*channel* block-number))
  ([{:keys [user-key name] :as channel} block-number]
   (chaincode/send-system-chaincode-request :query-block-by-number
                                            name
                                            channel
                                            (apply core/get-user user-key)
                                            {:args [name block-number]})))

(defn query-block-by-hash
  "Queries the ledger for Block by block hash
  Params
        blockHash (hash)
  Returns 
        Object containing the block"
  ([block-hash]
   (query-block-by-hash core/*channel* block-hash))
  ([{:keys [user-key name] :as channel} block-hash]
   (chaincode/send-system-chaincode-request :query-block-by-hash
                                            name
                                            channel
                                            (apply core/get-user user-key)
                                            {:args [name (if (utils/bytes? block-hash)
                                                           block-hash
                                                           (Hex/decode ^String block-hash))]})))

(defn query-block-by-tx-id
  "Queries the ledger for Transaction by number
  Params
        transactionID
  Returns 
        TransactionInfo containing the transaction"
  ([transaction-id]
   (query-block-by-tx-id core/*channel* transaction-id))
  ([{:keys [user-key name] :as channel} transaction-id]
   (chaincode/send-system-chaincode-request :query-block-by-tx-id
                                            name
                                            channel
                                            (apply core/get-user user-key)
                                            {:args [name transaction-id]})))

(defn query-by-chaincode
  ([channel chaincode-id user fcn args transient-map opts]
   (query-by-chaincode channel chaincode-id (core/get-nodes channel :peers) user fcn args
                       transient-map opts))
  ([{:keys [user-key name] :as channel} chaincode-id targets user fcn args transient-map opts]
   (user/with-validating-peers [channel targets]
     (let [header-extension (proto/make-chaincode-header-extension :chaincode-id chaincode-id)
           proposal-payload (proto/make-chaincode-proposal-payload-message chaincode-id
                                                                           fcn
                                                                           args
                                                                           transient-map)]
       (proto/send-proposal (proto/make-chaincode-signed-proposal-message name
                                                                          user
                                                                          header-extension
                                                                          proposal-payload
                                                                          opts)
                            targets ;; peers
                            user
                            #(ProposalResponsePackage$ProposalResponse/parseFrom ^ByteString %)
                            opts)))))

(defn query-instantiated-chaincodes
  ([channel]
   (query-instantiated-chaincodes channel (proto/get-random-node channel :peers)))
  ([{:keys [user-key name] :as channel} target]
   (let [targetv [target]]
    (user/with-validating-peers [channel targetv]
      (first (chaincode/send-system-chaincode-request :query-instantiated-chaincodes
                                                      name
                                                      targetv
                                                      (apply core/get-user user-key)
                                                      {}))))))

;;; query_transaction
(defn query-transaction
  "Queries the ledger for Transaction by number
  Params
        transactionID
  Returns 
        TransactionInfo containing the transaction"
  ([transaction-id]
   (query-transaction core/*channel* transaction-id))
  ([{:keys [user-key name] :as channel} transaction-id]
   (chaincode/send-system-chaincode-request :query-tx-by-id
                                            name
                                            channel
                                            (apply core/get-user user-key)
                                            {:args [name transaction-id]})))

(defn- send-chaincode-proposal
  ([{:keys [user-key name] :as channel}
    target-peers
    endorsement                         ; FIXME: Not being used
    ;; FIXME: transient map
    command-key                         ; :instantiate or :upgrade
    ;;;
    & {:as chaincode-deployment-spec-args}
    ]
   (user/with-validating-peers [channel target-peers]
     (let [{:keys [name version type fcn args] :or {fcn "init"}} chaincode-deployment-spec-args
           chaincode-id (proto/make-chaincode-id :name name :version version)
           chaincode-input (proto/make-chaincode-input :args  `[~fcn ~@args])
           deployment-spec (proto/make-chaincode-spec :type type :chaincode-id chaincode-id :chaincode-input chaincode-input)]
       (chaincode/send-system-chaincode-request command-key
                                                name
                                                target-peers
                                                (apply core/get-user user-key)
                                                {:args [name deployment-spec endorsement]})))))


;;;create_deploy_proposal
(defn create-deploy-proposal
  "Create  a proposal for transaction. This involves assembling the proposal with the data
  (chaincodeID, chaincode invocation spec, etc.) and signing it using the private key corresponding
  to the ECert to sign.
  Params
        chaincode_path (string): path to the chaincode to deploy
        chaincode_name (string): a custom name to identify the chaincode on the chain
        fcn (string): name of the chaincode function to call after deploy to initiate the state
        args (string[]): arguments for calling the init function designated by “fcn”
        sign (Bool): Whether to sign the transaction, default to True
  Returns
        (Proposal): The created Proposal instance or None."
  ([chaincod-path chaincode-name fcn args sign]
   (create-deploy-proposal core/*channel* chaincod-path chaincode-name fcn args sign))
  ([channel chaincod-path chaincode-name fcn args sign]
   ;;; TBD
   ))

;;;create_transaction_proposal
(defn create-transaction-proposal
  "Create  a proposal for transaction. This involves assembling the proposal with the data
  (chaincode name, function to call, arguments, etc.) and signing it using the private key
  corresponding to the ECert to sign.

  Params
        chaincode_name (string): The name given to the target chaincode to invoke
        args (string[]): arguments for calling the “invoke” method on the chaincode
        Sign (Bool): Whether to sign the transaction, default to True
  Returns
        (Transaction_Proposal instance): The created Transaction_Proposal instance or None."
  ([chaincode-name fcn args sign]
   (create-transaction-proposal core/*channel* chaincode-name fcn args sign))
  ([channel chaincode-name fcn args sign]
   (let [{:keys [user-key name]} channel]
     #_
     (get-transaction-context channel user-context crypto-suite))
   ))

(defn send-instantiate-proposal
  ([channel chaincode-id user fcn args transient-map opts]
   (send-instantiate-proposal channel chaincode-id (core/get-nodes channel :peers) user fcn args
                              transient-map opts))
  ([channel chaincode-id targets user fcn args transient-map opts]
   (send-chaincode-proposal channel
                            targets
                            :ENDORSEMENT
                            :deploy
                            opts)))

(defn send-upgrade-proposal
  ([channel chaincode-id user fcn args transient-map opts]
   (send-upgrade-proposal channel chaincode-id (core/get-nodes channel :peers) user fcn args
                          transient-map opts))
  ([channel chaincode-id targets user fcn args transient-map opts]
   (send-chaincode-proposal channel
                            targets
                            :ENDORSEMENT
                            :upgrade
                            opts)))

;;;send_transaction
(defn send-transaction
  "Send a transaction to the chain’s orderer service (one or more orderer endpoints) for consensus
  and committing to the ledger.
  This call is asynchronous and the successful transaction commit is notified via a BLOCK or
  CHAINCODE event. This method must provide a mechanism for applications to attach event listeners
  to handle “transaction submitted”, “transaction complete” and “error” events.
  
  Note that under the cover there are two different kinds of communications with the fabric backend
  that trigger different events to be emitted back to the application’s handlers:
  - the grpc client with the orderer service uses a “regular” stateless HTTP connection
        in a request/response fashion with the “broadcast” call. The method implementation should
        emit “transaction submitted” when a successful acknowledgement is received in the response,
        or “error” when an error is received
  - The method implementation should also maintain a persistent connection with the Chain’s event
        source Peer as part of the internal event hub mechanism in order to support the fabric events
        “BLOCK”, “CHAINCODE” and “TRANSACTION”. These events should cause the method to emit “complete”
        or “error” events to the application.
  Params
        transaction (Transaction): The transaction object constructed above
  Returns
        result (EventEmitter): an handle to allow the application to attach event handlers on “submitted”, “complete”, and “error”."
  ([transaction]
   (send-transaction core/*channel* transaction))
  ([channel transaction]
   ;;; TBD
   ))


;;; create_transaction
(defn create-transaction
  "Create a transaction with proposal response, following the endorsement policy.
  Params
        proposal_responses ([Transaction_Proposal_Response]): The array of proposal responses received in the proposal call.
  Returns
        (Transaction instance): The created transaction object instance."
  ([proposal-responses]
   (create-transaction core/*channel* proposal-responses))
  ([channel proposal-responses]
   ;;; TBD
   ))

;;; 


(defn get-genesis-block
  ([]
   (get-genesis-block core/*channel* (proto/get-random-node core/*channel* :orderers)))
  ([channel]
   (get-genesis-block channel (proto/get-random-node channel :orderers)))
  ([{:keys [user-key name] :as channel} orderer]
   (let [seek-start-stop (proto/make-seek-position :specified (proto/make-seek-specified :number 0)) ]
     (let [result (->> (proto/make-seek-info :start seek-start-stop :stop seek-start-stop :behavior :block-until-ready)
                       (proto/make-envelope-message name (apply core/get-user user-key) :deliver-seek-info)
                       (orderer/send-deliver orderer))]
       ;; This returns two elements; the second is status response.
       (.getBlock ^Ab$DeliverResponse (first result))))))

;; (def u1 (core/get-user "Org1MSP" "user1"))
;; (def u2 (assoc-in u1 [:channels "testchan14"] (get-in u1 [:channels "mychannel"])))
;; (def u3 (update-in u2 [:channels "testchan14" :name] (fn [_] "testchan14")))
;; (binding [core/*channel* (get-in u3 [:channels "testchan14"] )]
;;   (get-genesis-block))

(defn join-channel
  ([peers genesis-block]
   (join-channel core/*channel* peers genesis-block))
  ([{:keys [user-key name] :as channel} peers genesis-block]
   (user/with-validating-peers [channel peers]
    (chaincode/send-system-chaincode-request :join-channel
                                             user/system-channel-name
                                             peers
                                             (apply core/get-user user-key)
                                             {:args [genesis-block]}))))

;;;;;;;;;

