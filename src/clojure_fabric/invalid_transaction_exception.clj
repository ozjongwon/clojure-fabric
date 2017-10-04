(ns clojure-fabric.invalid-transaction-exception
  (:import org.hyperledger.fabric.sdk.exception.InvalidTransactionException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.InvalidTransactionException
;;;

;;;  org.hyperledger.fabric.sdk.exception.InvalidTransactionException
(defn
 invalid-transaction-exception
 ([^org.hyperledger.fabric.sdk.exception.InvalidTransactionException
   invalid-transaction-exception
   ^java.lang.String
   string0]
  (.
   invalid-transaction-exception
   org.hyperledger.fabric.sdk.exception.InvalidTransactionException
   string0))
 ([^org.hyperledger.fabric.sdk.exception.InvalidTransactionException
   invalid-transaction-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   invalid-transaction-exception
   org.hyperledger.fabric.sdk.exception.InvalidTransactionException
   string0
   exception1)))
