(ns clojure-fabric.orderer-client
  (:import org.hyperledger.fabric.sdk.OrdererClient))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.OrdererClient
;;;

;;;  finalize
(defn
 finalize
 [^org.hyperledger.fabric.sdk.OrdererClient orderer-client]
 (. orderer-client finalize))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.OrdererClient$1
;;;

;;;  onError
(defn
 on-error
 [^org.hyperledger.fabric.sdk.OrdererClient$1
  orderer-client$1
  ^java.lang.Throwable
  throwable0]
 (. orderer-client$1 onError throwable0))

;;;  onCompleted
(defn
 on-completed
 [^org.hyperledger.fabric.sdk.OrdererClient$1 orderer-client$1]
 (. orderer-client$1 onCompleted))

;;;  onNext
(defn
 on-next
 [^org.hyperledger.fabric.sdk.OrdererClient$1
  orderer-client$1
  ^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response0]
 (. orderer-client$1 onNext ab$-broadcast-response0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.OrdererClient$2
;;;

;;;  onNext
(defn
 on-next
 [^org.hyperledger.fabric.sdk.OrdererClient$2
  orderer-client$2
  ^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response0]
 (. orderer-client$2 onNext ab$-deliver-response0))

;;;  onError
(defn
 on-error
 [^org.hyperledger.fabric.sdk.OrdererClient$2
  orderer-client$2
  ^java.lang.Throwable
  throwable0]
 (. orderer-client$2 onError throwable0))

;;;  onCompleted
(defn
 on-completed
 [^org.hyperledger.fabric.sdk.OrdererClient$2 orderer-client$2]
 (. orderer-client$2 onCompleted))
