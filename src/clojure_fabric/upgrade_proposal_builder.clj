(ns clojure-fabric.upgrade-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.UpgradeProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.UpgradeProposalBuilder
;;;

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.UpgradeProposalBuilder/newBuilder))
