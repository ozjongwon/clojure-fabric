(ns clojure-fabric.invalid-argument-exception
  (:import org.hyperledger.fabric.sdk.exception.InvalidArgumentException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.InvalidArgumentException
;;;

;;;  org.hyperledger.fabric.sdk.exception.InvalidArgumentException
(defn
 invalid-argument-exception
 ([^org.hyperledger.fabric.sdk.exception.InvalidArgumentException
   invalid-argument-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   invalid-argument-exception
   org.hyperledger.fabric.sdk.exception.InvalidArgumentException
   string0
   exception1))
 ([^org.hyperledger.fabric.sdk.exception.InvalidArgumentException
   invalid-argument-exception
   generic-arg1]
  (cond
   (instance? java.lang.String generic-arg1)
   (.
    invalid-argument-exception
    org.hyperledger.fabric.sdk.exception.InvalidArgumentException
    ^java.lang.String
    generic-arg1)
   (instance? java.lang.Throwable generic-arg1)
   (.
    invalid-argument-exception
    org.hyperledger.fabric.sdk.exception.InvalidArgumentException
    ^java.lang.Throwable
    generic-arg1)
   :else
   (.
    invalid-argument-exception
    org.hyperledger.fabric.sdk.exception.InvalidArgumentException
    generic-arg1))))
