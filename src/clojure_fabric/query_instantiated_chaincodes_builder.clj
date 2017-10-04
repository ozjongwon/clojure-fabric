(ns clojure-fabric.query-instantiated-chaincodes-builder
  (:import org.hyperledger.fabric.sdk.transaction.QueryInstantiatedChaincodesBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.QueryInstantiatedChaincodesBuilder
;;;

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.QueryInstantiatedChaincodesBuilder
  query-instantiated-chaincodes-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. query-instantiated-chaincodes-builder context transaction-context0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.QueryInstantiatedChaincodesBuilder/newBuilder))
