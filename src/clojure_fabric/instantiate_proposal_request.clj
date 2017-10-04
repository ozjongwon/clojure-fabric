(ns clojure-fabric.instantiate-proposal-request
  (:import org.hyperledger.fabric.sdk.InstantiateProposalRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.InstantiateProposalRequest
;;;

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.InstantiateProposalRequest
  instantiate-proposal-request
  ^java.util.Map
  map0]
 (. instantiate-proposal-request setTransientMap map0))
