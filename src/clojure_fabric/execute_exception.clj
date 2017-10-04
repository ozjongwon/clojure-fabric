(ns clojure-fabric.execute-exception
  (:import org.hyperledger.fabric.sdk.exception.ExecuteException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.ExecuteException
;;;

;;;  org.hyperledger.fabric.sdk.exception.ExecuteException
(defn
 execute-exception
 ([^org.hyperledger.fabric.sdk.exception.ExecuteException
   execute-exception
   ^java.lang.String
   string0]
  (.
   execute-exception
   org.hyperledger.fabric.sdk.exception.ExecuteException
   string0))
 ([^org.hyperledger.fabric.sdk.exception.ExecuteException
   execute-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   execute-exception
   org.hyperledger.fabric.sdk.exception.ExecuteException
   string0
   exception1)))
