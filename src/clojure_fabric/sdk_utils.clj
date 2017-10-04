(ns clojure-fabric.sdk-utils
  (:import org.hyperledger.fabric.sdk.SDKUtils))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.SDKUtils
;;;

;;;  getProposalConsistencySets
(defn
 get-proposal-consistency-sets
 ([^java.util.Collection collection0 ^java.util.Set set1]
  (org.hyperledger.fabric.sdk.SDKUtils/getProposalConsistencySets
   collection0
   set1))
 ([^java.util.Collection collection0]
  (org.hyperledger.fabric.sdk.SDKUtils/getProposalConsistencySets
   collection0)))

;;;  calculateBlockHash
(defn
 calculate-block-hash
 [^long long0  bytes1  bytes2]
 (org.hyperledger.fabric.sdk.SDKUtils/calculateBlockHash
  long0
  bytes1
  bytes2))

;;;  suite
(defn suite [] (org.hyperledger.fabric.sdk.SDKUtils/suite))
