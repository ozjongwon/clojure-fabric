(ns clojure-fabric.lscc-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder
;;;

;;;  org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder
(defn
 lscc-proposal-builder
 [^org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder
  lscc-proposal-builder]
 (.
  lscc-proposal-builder
  org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder))

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder
  lscc-proposal-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. lscc-proposal-builder context transaction-context0))

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.LSCCProposalBuilder
  lscc-proposal-builder]
 (. lscc-proposal-builder build))
