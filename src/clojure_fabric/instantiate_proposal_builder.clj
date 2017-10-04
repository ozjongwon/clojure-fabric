(ns clojure-fabric.instantiate-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
;;;

;;;  chaincodePath
(defn
 chaincode-path
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^java.lang.String
  string0]
 (. instantiate-proposal-builder chaincodePath string0))

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder]
 (. instantiate-proposal-builder build))

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^java.util.Map
  map0]
 (. instantiate-proposal-builder setTransientMap map0))

;;;  chaincodEndorsementPolicy
(defn
 chaincod-endorsement-policy
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy0]
 (.
  instantiate-proposal-builder
  chaincodEndorsementPolicy
  chaincode-endorsement-policy0))

;;;  argss
(defn
 argss
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^java.util.List
  list0]
 (. instantiate-proposal-builder argss list0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder/newBuilder))

;;;  chaincodeName
(defn
 chaincode-name
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^java.lang.String
  string0]
 (. instantiate-proposal-builder chaincodeName string0))

;;;  chaincodeVersion
(defn
 chaincode-version
 [^org.hyperledger.fabric.sdk.transaction.InstantiateProposalBuilder
  instantiate-proposal-builder
  ^java.lang.String
  string0]
 (. instantiate-proposal-builder chaincodeVersion string0))
