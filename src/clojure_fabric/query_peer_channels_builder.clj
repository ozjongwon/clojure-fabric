(ns clojure-fabric.query-peer-channels-builder
  (:import org.hyperledger.fabric.sdk.transaction.QueryPeerChannelsBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.QueryPeerChannelsBuilder
;;;

;;;  context
(defn
 context
 [^org.hyperledger.fabric.sdk.transaction.QueryPeerChannelsBuilder
  query-peer-channels-builder
  ^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context0]
 (. query-peer-channels-builder context transaction-context0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.QueryPeerChannelsBuilder/newBuilder))
