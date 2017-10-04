(ns clojure-fabric.transaction-deserializer
  (:import org.hyperledger.fabric.sdk.TransactionDeserializer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionDeserializer
;;;


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionDeserializer$TransactionActionIterable
;;;

;;;  iterator
(defn
 iterator
 [^org.hyperledger.fabric.sdk.TransactionDeserializer$TransactionActionIterable
  transaction-deserializer$-transaction-action-iterable]
 (. transaction-deserializer$-transaction-action-iterable iterator))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionDeserializer$TransactionActionIterator
;;;

;;;  hasNext
(defn
 has-next
 [^org.hyperledger.fabric.sdk.TransactionDeserializer$TransactionActionIterator
  transaction-deserializer$-transaction-action-iterator]
 (. transaction-deserializer$-transaction-action-iterator hasNext))

;;;  next
(defn
 next
 [^org.hyperledger.fabric.sdk.TransactionDeserializer$TransactionActionIterator
  transaction-deserializer$-transaction-action-iterator]
 (. transaction-deserializer$-transaction-action-iterator next))
