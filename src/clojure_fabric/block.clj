(ns clojure-fabric.block
  (:import [org.hyperledger.fabric.sdk BlockEvent]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockEvent
;;;

;;;  getEvent
(defn
 get-event
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getEvent))

;;;  getTransactionEvents
(defn
 get-transaction-events
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getTransactionEvents))

;;;  getEventHub
(defn
 get-event-hub
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getEventHub))
