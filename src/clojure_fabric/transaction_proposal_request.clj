(ns clojure-fabric.transaction-proposal-request
  (:import org.hyperledger.fabric.sdk.TransactionProposalRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionProposalRequest
;;;

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.TransactionProposalRequest
  transaction-proposal-request
  ^java.util.Map
  map0]
 (. transaction-proposal-request setTransientMap map0))

;;;  newInstance
(defn
 new-instance
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.TransactionProposalRequest/newInstance
  user0))
