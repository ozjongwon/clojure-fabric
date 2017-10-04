(ns clojure-fabric.join-peer-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.JoinPeerProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.JoinPeerProposalBuilder
;;;

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.JoinPeerProposalBuilder
  join-peer-proposal-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. join-peer-proposal-builder context transaction-context0))

;;;  genesisBlock
(defn
 genesis-block
 [^org.hyperledger.fabric.sdk.transaction.JoinPeerProposalBuilder
  join-peer-proposal-builder
  ^org.hyperledger.fabric.protos.common.Common$Block
  common$-block0]
 (. join-peer-proposal-builder genesisBlock common$-block0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.JoinPeerProposalBuilder/newBuilder))
