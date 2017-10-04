(ns clojure-fabric.cscc-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder
;;;

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder
  cscc-proposal-builder]
 (. cscc-proposal-builder build))

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder
  cscc-proposal-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. cscc-proposal-builder context transaction-context0))

;;;  org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder
(defn
 cscc-proposal-builder
 [^org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder
  cscc-proposal-builder]
 (.
  cscc-proposal-builder
  org.hyperledger.fabric.sdk.transaction.CSCCProposalBuilder))
