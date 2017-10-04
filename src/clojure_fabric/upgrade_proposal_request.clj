(ns clojure-fabric.upgrade-proposal-request
  (:import org.hyperledger.fabric.sdk.UpgradeProposalRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.UpgradeProposalRequest
;;;

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.UpgradeProposalRequest
  upgrade-proposal-request
  ^java.util.Map
  map0]
 (. upgrade-proposal-request setTransientMap map0))
