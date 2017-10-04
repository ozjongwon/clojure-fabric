(ns clojure-fabric.query-installed-chaincodes-builder
  (:import org.hyperledger.fabric.sdk.transaction.QueryInstalledChaincodesBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.QueryInstalledChaincodesBuilder
;;;

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.QueryInstalledChaincodesBuilder/newBuilder))

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.QueryInstalledChaincodesBuilder
  query-installed-chaincodes-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. query-installed-chaincodes-builder context transaction-context0))
