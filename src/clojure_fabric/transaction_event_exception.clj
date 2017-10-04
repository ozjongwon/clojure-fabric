(ns clojure-fabric.transaction-event-exception
  (:import org.hyperledger.fabric.sdk.exception.TransactionEventException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.TransactionEventException
;;;

;;;  org.hyperledger.fabric.sdk.exception.TransactionEventException
(defn
 transaction-event-exception
 ([^org.hyperledger.fabric.sdk.exception.TransactionEventException
   transaction-event-exception
   ^java.lang.String
   string0
   ^org.hyperledger.fabric.sdk.BlockEvent$TransactionEvent
   block-event$-transaction-event1
   ^java.lang.Throwable
   throwable2]
  (.
   transaction-event-exception
   org.hyperledger.fabric.sdk.exception.TransactionEventException
   string0
   block-event$-transaction-event1
   throwable2))
 ([^org.hyperledger.fabric.sdk.exception.TransactionEventException
   transaction-event-exception
   ^java.lang.String
   string0
   ^org.hyperledger.fabric.sdk.BlockEvent$TransactionEvent
   block-event$-transaction-event1]
  (.
   transaction-event-exception
   org.hyperledger.fabric.sdk.exception.TransactionEventException
   string0
   block-event$-transaction-event1)))

;;;  getTransactionEvent
(defn
 get-transaction-event
 [^org.hyperledger.fabric.sdk.exception.TransactionEventException
  transaction-event-exception]
 (. transaction-event-exception getTransactionEvent))
