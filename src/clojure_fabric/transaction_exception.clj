(ns clojure-fabric.transaction-exception
  (:import org.hyperledger.fabric.sdk.exception.TransactionException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.TransactionException
;;;

;;;  org.hyperledger.fabric.sdk.exception.TransactionException
(defn
 transaction-exception
 ([^org.hyperledger.fabric.sdk.exception.TransactionException
   transaction-exception
   ^java.lang.String
   string0
   ^java.lang.Throwable
   throwable1]
  (.
   transaction-exception
   org.hyperledger.fabric.sdk.exception.TransactionException
   string0
   throwable1))
 ([^org.hyperledger.fabric.sdk.exception.TransactionException
   transaction-exception
   generic-arg1]
  (cond
   (instance? java.lang.String generic-arg1)
   (.
    transaction-exception
    org.hyperledger.fabric.sdk.exception.TransactionException
    ^java.lang.String
    generic-arg1)
   (instance? java.lang.Throwable generic-arg1)
   (.
    transaction-exception
    org.hyperledger.fabric.sdk.exception.TransactionException
    ^java.lang.Throwable
    generic-arg1)
   :else
   (.
    transaction-exception
    org.hyperledger.fabric.sdk.exception.TransactionException
    generic-arg1))))
