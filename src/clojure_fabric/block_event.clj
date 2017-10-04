(ns clojure-fabric.block-event
  (:import org.hyperledger.fabric.sdk.BlockEvent))

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


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockEvent$TransactionEvent
;;;

;;;  getEventHub
(defn
 get-event-hub
 [^org.hyperledger.fabric.sdk.BlockEvent$TransactionEvent
  block-event$-transaction-event]
 (. block-event$-transaction-event getEventHub))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockEvent$TransactionEventIterable
;;;

;;;  iterator
(defn
 iterator
 [^org.hyperledger.fabric.sdk.BlockEvent$TransactionEventIterable
  block-event$-transaction-event-iterable]
 (. block-event$-transaction-event-iterable iterator))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockEvent$TransactionEventIterator
;;;

;;;  hasNext
(defn
 has-next
 [^org.hyperledger.fabric.sdk.BlockEvent$TransactionEventIterator
  block-event$-transaction-event-iterator]
 (. block-event$-transaction-event-iterator hasNext))

;;;  next
(defn
 next
 [^org.hyperledger.fabric.sdk.BlockEvent$TransactionEventIterator
  block-event$-transaction-event-iterator]
 (. block-event$-transaction-event-iterator next))
