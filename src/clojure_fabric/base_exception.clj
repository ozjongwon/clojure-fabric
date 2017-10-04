(ns clojure-fabric.base-exception
  (:import org.hyperledger.fabric.sdk.exception.BaseException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.BaseException
;;;

;;;  org.hyperledger.fabric.sdk.exception.BaseException
(defn
 base-exception
 ([^org.hyperledger.fabric.sdk.exception.BaseException
   base-exception
   generic-arg1]
  (cond
   (instance? java.lang.Throwable generic-arg1)
   (.
    base-exception
    org.hyperledger.fabric.sdk.exception.BaseException
    ^java.lang.Throwable
    generic-arg1)
   (instance? java.lang.String generic-arg1)
   (.
    base-exception
    org.hyperledger.fabric.sdk.exception.BaseException
    ^java.lang.String
    generic-arg1)
   :else
   (.
    base-exception
    org.hyperledger.fabric.sdk.exception.BaseException
    generic-arg1)))
 ([^org.hyperledger.fabric.sdk.exception.BaseException
   base-exception
   ^java.lang.String
   string0
   ^java.lang.Throwable
   throwable1]
  (.
   base-exception
   org.hyperledger.fabric.sdk.exception.BaseException
   string0
   throwable1)))
