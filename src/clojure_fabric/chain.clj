;; Chain implementation of "Fabric SDK Design Spec"
;;
;; The “Chain” object captures settings for a channel, which is created by the orderers to isolate
;; transactions delivery to peers participating on channel. A chain must be initialized after
;; it has been configured with the list of peers and orderers. The initialization sends
;; a CONFIGURATION transaction to the orderers to create the specified channel and asks the peers
;; to join that channel. 

(ns clojure-fabric.chain
  (:require ;;[clojure-fabric.node :as node]
            [clojure-fabric.utils :as utils]
            [medley.core :as medley]))

(defonce ^:dynamic *chain* nil)

(defrecord Chain [peers orderers])

(defn %make-chain [{:keys [peers orderers]}]
  (map->Chain {:peers (atom `[~@peers]) :orderers (atom `[~@orderers])}))

(defn- add-chain-end
  [chain {:keys [name url] :as chain-end} chain-ends-key]
  (when-not (medley/find-first #(and (= (:name %) name) (= (:url %) url)) @(chain-ends-key chain))
    (swap! (chain-ends-key chain) conj chain-end)))

(defn- remove-chain-end
  [chain {:keys [name url] :as chain-end} chain-ends-key]
  (let [chain-ends @(chain-ends-key chain)]
    (when-let [idx (first (utils/indices #(and (= (:name %) name) (= (:url %) url)) chain-ends))]
      (reset! (chain-ends-key chain) (utils/removev-index chain-ends idx)))))

;;; add_peer
(defn add-peer
  "Add peer endpoint to a chain object, this is a local-only operation
  Params:
        peer (Peer): an instance of the Peer class that has been initialized with URL,
        TLC certificate, and enrollment certificate"
  ([peer]
   (add-peer *chain* peer))
  ([chain peer]
   (add-chain-end chain peer :peers)))

;;; remove_peer
(defn remove-peer
  "Remove peer endpoint from a chain object, this is a local-only operation
  Params
        peer (Peer): an instance of the Peer class"
  ([peer]
   (remove-peer *chain* peer))
  ([chain peer]
   (remove-chain-end chain peer :peers)))

;;; get_peers

(defn get-peers
  "Get peers of a chain from local information.
  Params
        None
  Returns
        (Peer list): The peer list on the chain"
  ([]
   (get-peers *chain*))
  ([chain]
   @(:peers chain)))

;;;
;;;

;;; add_orderer
(defn add-orderer
  "Add orderer endpoint to a chain object, this is a local-only operation. A chain instance may choose to use a single orderer node, which will broadcast requests to the rest of the orderer network. Or if the application does not trust the orderer nodes, it can choose to use more than one by adding them to the chain instance. And all APIs concerning the orderer will broadcast to all orderers simultaneously.

  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (add-orderer *chain* orderer))
  ([chain orderer]
   (add-chain-end chain orderer :orderers)))

;;; remove_orderer
(defn remove-orderer
  "Remove orderer endpoint from a chain object, this is a local-only operation. 
  Params
        orderer (Orderer): an instance of the Orderer class"
  ([orderer]
   (remove-orderer *chain* orderer))
  ([chain orderer]
   (remove-chain-end chain orderer :orderers)))

;;; get_orderers
(defn get-orderers
  "Get orderers of a chain. This is a local-only operation.
  Params
        None
  Returns
        (Orderer list): The orderer list on the chain"
  ([]
   (get-orderers *chain*))
  ([chain]
   @(:orderers chain)))

;;; initialize_chain
(defn initialize-chain
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
   (initialize-chain *chain*))
  ([chain]
   ;; TBD
   ))

;;; update_chain
(defn update-chain
  "Calls the orderer(s) to update an existing chain. This allows the addition and deletion of Peer
  nodes to an existing chain, as well as the update of Peer certificate information upon
  certificate renewals.
  Params
        None
  Returns
        (bool): whether the chain update process was successful"
  ([]
   (update-chain *chain*))
  ([chain]
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
   (is-readonly *chain*))
  ([chain]
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
   (query-info *chain*))
  ([chain]
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
   (query-block *chain* block-number))
  ([chain block-number]
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
   (query-transaction *chain* transaction-id))
  ([chain transaction-id]
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
   (create-deploy-proposal *chain* chaincod-path chaincode-name fcn args sign))
  ([chain chaincod-path chaincode-name fcn args sign]
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
   (create-transaction-proposal *chain* chaincode-name fcn args sign))
  ([chain chaincode-name fcn args sign]
   ;;; TBD
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
   (send-transaction-proposal *chain* transaction-proposal retry))
  ([chain transaction-proposal retry]
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
   (create-transaction *chain* proposal-responses))
  ([chain proposal-responses]
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
  the grpc client with the orderer service uses a “regular” stateless HTTP connection
  in a request/response fashion with the “broadcast” call. The method implementation should emit
  “transaction submitted” when a successful acknowledgement is received in the response,
  or “error” when an error is received
  The method implementation should also maintain a persistent connection with the Chain’s event
  source Peer as part of the internal event hub mechanism in order to support the fabric events
  “BLOCK”, “CHAINCODE” and “TRANSACTION”. These events should cause the method to emit “complete”
  or “error” events to the application.

  Params
        transaction (Transaction): The transaction object constructed above
  Returns
        result (EventEmitter): an handle to allow the application to attach event handlers on “submitted”, “complete”, and “error”."
  ([transaction]
   (send-transaction *chain* transaction))
  ([chain transaction]
   ;;; TBD
   ))


;;;;;;;;;

