(ns clojure-fabric.invoke-exception
  (:import org.hyperledger.fabric.sdk.exception.InvokeException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.InvokeException
;;;

;;;  org.hyperledger.fabric.sdk.exception.InvokeException
(defn
 invoke-exception
 [^org.hyperledger.fabric.sdk.exception.InvokeException
  invoke-exception
  ^java.lang.String
  string0
  ^java.lang.Exception
  exception1]
 (.
  invoke-exception
  org.hyperledger.fabric.sdk.exception.InvokeException
  string0
  exception1))
