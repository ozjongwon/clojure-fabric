(ns clojure-fabric.event-hub-exception
  (:import org.hyperledger.fabric.sdk.exception.EventHubException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.EventHubException
;;;

;;;  org.hyperledger.fabric.sdk.exception.EventHubException
(defn
 event-hub-exception
 ([^org.hyperledger.fabric.sdk.exception.EventHubException
   event-hub-exception
   generic-arg1]
  (cond
   (instance? java.lang.Throwable generic-arg1)
   (.
    event-hub-exception
    org.hyperledger.fabric.sdk.exception.EventHubException
    ^java.lang.Throwable
    generic-arg1)
   (instance? java.lang.String generic-arg1)
   (.
    event-hub-exception
    org.hyperledger.fabric.sdk.exception.EventHubException
    ^java.lang.String
    generic-arg1)
   :else
   (.
    event-hub-exception
    org.hyperledger.fabric.sdk.exception.EventHubException
    generic-arg1)))
 ([^org.hyperledger.fabric.sdk.exception.EventHubException
   event-hub-exception
   ^java.lang.String
   string0
   ^java.lang.Throwable
   throwable1]
  (.
   event-hub-exception
   org.hyperledger.fabric.sdk.exception.EventHubException
   string0
   throwable1)))
