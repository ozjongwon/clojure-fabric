(ns clojure-fabric.query-exception
  (:import org.hyperledger.fabric.sdk.exception.QueryException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.QueryException
;;;

;;;  org.hyperledger.fabric.sdk.exception.QueryException
(defn
 query-exception
 [^org.hyperledger.fabric.sdk.exception.QueryException
  query-exception
  ^java.lang.String
  string0
  ^java.lang.Exception
  exception1]
 (.
  query-exception
  org.hyperledger.fabric.sdk.exception.QueryException
  string0
  exception1))
