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
  (:require [clojure-fabric.peer :as peer]
            [clojure-fabric.orderer :as orderer]
            [clojure-fabric.utils :as utils]
            [medley.core :as medley]))

(defonce ^:dynamic *channel* nil)

(defrecord Channel [name client peers orderers event-hubs listener-peer])
(defn make-channel [name client {:keys [peers orderers event-hubs listener-peer]}]
  (assert (and name client) "Channel requires name and client to create.")
  (map->Channel {:name name :client client
                 :peers (atom `[~@peers]) :orderers (atom `[~@orderers])
                 :listener-peer (atom ~listener-peer)}))

;;;
;;; Functions
;;;

(defn- add-channel-end
  [channel {:keys [name url] :as channel-end} channel-ends-key]
  (when-not (medley/find-first #(and (= (:name %) name) (= (:url %) url)) @(channel-ends-key channel))
    (swap! (channel-ends-key channel) conj channel-end)))

(defn- remove-channel-end
  [channel {:keys [name url] :as channel-end} channel-ends-key]
  (let [channel-ends @(channel-ends-key channel)]
    (when-let [idx (first (utils/indices #(and (= (:name %) name) (= (:url %) url)) channel-ends))]
      (reset! (channel-ends-key channel) (utils/removev-index channel-ends idx)))))

;;; add_peer
(defn add-peer
  "Add peer endpoint to a chain object, this is a local-only operation
  Params:
        peer (Peer): an instance of the Peer class that has been initialized with URL,
        TLC certificate, and enrollment certificate"
  ([peer]
   (add-peer *channel* peer))
  ([channel peer]
   (add-channel-end channel peer :peers)))

;;; remove_peer
(defn remove-peer
  "Remove peer endpoint from a chain object, this is a local-only operation
  Params
        peer (Peer): an instance of the Peer class"
  ([peer]
   (remove-peer *channel* peer))
  ([channel peer]
   (remove-channel-end channel peer :peers)))

;;; get_peers

(defn get-peers
  "Get peers of a chain from local information.
  Params
        None
  Returns
        (Peer list): The peer list on the chain"
  ([]
   (get-peers *channel*))
  ([channel]
   @(:peers channel)))

;;;
;;;

;;; add_orderer
(defn add-orderer
  "Add orderer endpoint to a chain object, this is a local-only operation. A chain instance may
  choose to use a single orderer node, which will broadcast requests to the rest of the orderer
  network. Or if the application does not trust the orderer nodes, it can choose to use more than
  one by adding them to the chain instance. And all APIs concerning the orderer will broadcast
  to all orderers simultaneously.

  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (add-orderer *channel* orderer))
  ([channel orderer]
   (add-channel-end channel orderer :orderers)))

;;; remove_orderer
(defn remove-orderer
  "Remove orderer endpoint from a chain object, this is a local-only operation. 
  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (remove-orderer *channel* orderer))
  ([channel orderer]
   (remove-channel-end channel orderer :orderers)))

;;; get_orderers
(defn get-orderers
  "Get orderers of a chain. This is a local-only operation.
  Params
        None
  Returns
        (Orderer list): The orderer list on the chain"
  ([]
   (get-orderers *channel*))
  ([channel]
   @(:orderers channel)))

;;; initialize_chain
(defn initialize-channel
  "Calls the orderer(s) to start building the new chain, which is a combination of opening
  new message stream and connecting the list of participating peers. This is a long-running process.
  Only one of the application instances needs to call this method. Once the chain is successfully
  created, other application instances only need to call get_chain() to obtain the information
  about this chain.
  Params
        None
  Returns
        (bool): whether the chain initialization process was successful"
  ([]
   (initialize-channel *channel*))
  ([channel]
   ;; TBD
   ))

;;; update_chain
(defn update-channel
  "Calls the orderer(s) to update an existing chain. This allows the addition and deletion of Peer
  nodes to an existing chain, as well as the update of Peer certificate information upon
  certificate renewals.
  Params
        None
  Returns
        (bool): whether the chain update process was successful"
  ([]
   (update-channel *channel*))
  ([channel]
   ;;TBD
   ))

;;;is_readonly
(defn is-readonly
  "Get chain status to see if the underlying channel has been terminated, making it a read-only
  chain, where information (transactions and states) can be queried but no new transactions
  can be submitted.
  Params
        None
  Returns
        (bool): is ready-only (true) or not "
  ([]
   (is-readonly *channel*))
  ([channel]
   ;; TBD
   ))

;;;query_info
(defn query-info
  "Queries for various useful information on the state of the Chain (height, known peers)
  Params
        none
  Returns 
        (ChainInfo) with height, currently the only useful info"
  ([]
   (query-info *channel*))
  ([channel]
   ;; TBD
   ))

;;;query_block
(defn query-block
  "Queries the ledger for Block by block number
  Params
        blockNumber (number)
  Returns 
        Object containing the block"
  ([block-number]
   (query-block *channel* block-number))
  ([channel block-number]
   ;; TBD
   ))

;;; query_transaction
(defn query-transaction
 "Queries the ledger for Transaction by number
  Params
        transactionID
  Returns 
        TransactionInfo containing the transaction"
  ([transaction-id]
   (query-transaction *channel* transaction-id))
  ([channel transaction-id]
   ;; TBD
   ))

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
   (create-deploy-proposal *channel* chaincod-path chaincode-name fcn args sign))
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
   (create-transaction-proposal *channel* chaincode-name fcn args sign))
  ([channel chaincode-name fcn args sign]
   (with-client-of-channel [client channel]
     
     (let [{:keys [user-context cryptosuite]} client]
       (get-transaction-context channel user-context cryptosuite)))
   ))


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
   (send-transaction-proposal *channel* transaction-proposal retry))
  ([channel transaction-proposal retry]
   ;; 1. ensure the channel is initialized
   ;; 2. set chaincode id and options
   ;; 3. query-by-chaincode
   
   ))


;;; create_transaction
(defn create-transaction
  "Create a transaction with proposal response, following the endorsement policy.
  Params
        proposal_responses ([Transaction_Proposal_Response]): The array of proposal responses received in the proposal call.
  Returns
        (Transaction instance): The created transaction object instance."
  ([proposal-responses]
   (create-transaction *channel* proposal-responses))
  ([channel proposal-responses]
   ;;; TBD
   ))

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
   (send-transaction *channel* transaction))
  ([channel transaction]
   ;;; TBD
   ))
;;; 

;;;;;;;;;

