(ns clojure-fabric.peer-exception
  (:import org.hyperledger.fabric.sdk.exception.PeerException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.PeerException
;;;

;;;  org.hyperledger.fabric.sdk.exception.PeerException
(defn
 peer-exception
 ([^org.hyperledger.fabric.sdk.exception.PeerException
   peer-exception
   ^java.lang.String
   string0]
  (.
   peer-exception
   org.hyperledger.fabric.sdk.exception.PeerException
   string0))
 ([^org.hyperledger.fabric.sdk.exception.PeerException
   peer-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   peer-exception
   org.hyperledger.fabric.sdk.exception.PeerException
   string0
   exception1)))
