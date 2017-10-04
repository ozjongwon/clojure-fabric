(ns clojure-fabric.proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.ProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.ProposalBuilder
;;;

;;;  request
(defn
 request
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder
  ^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request0]
 (. proposal-builder request transaction-request0))

;;;  ccType
(defn
 cc-type
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder
  ^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec$Type
  chaincode$-chaincode-spec$-type0]
 (. proposal-builder ccType chaincode$-chaincode-spec$-type0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.ProposalBuilder/newBuilder))

;;;  chaincodeID
(defn
 chaincode-id
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder
  ^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id0]
 (. proposal-builder chaincodeID chaincode$-chaincode-id0))

;;;  args
(defn
 args
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder
  ^java.util.List
  list0]
 (. proposal-builder args list0))

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder]
 (. proposal-builder build))

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.ProposalBuilder
  proposal-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. proposal-builder context transaction-context0))
