(ns clojure-fabric.event-hub
  (:import org.hyperledger.fabric.sdk.EventHub))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EventHub
;;;

;;;  shutdown
(defn
 shutdown
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub shutdown))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getName))

;;;  isConnected
(defn
 is-connected
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub isConnected))

;;;  getProperties
(defn
 get-properties
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getProperties))

;;;  getDisconnectedTime
(defn
 get-disconnected-time
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getDisconnectedTime))

;;;  setEventHubDisconnectedHandler
(defn
 set-event-hub-disconnected-handler
 [^org.hyperledger.fabric.sdk.EventHub
  event-hub
  ^org.hyperledger.fabric.sdk.EventHub$EventHubDisconnected
  event-hub$-event-hub-disconnected0]
 (.
  event-hub
  setEventHubDisconnectedHandler
  event-hub$-event-hub-disconnected0))

;;;  toString
(defn
 to-string
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub toString))

;;;  getLastConnectedAttempt
(defn
 get-last-connected-attempt
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getLastConnectedAttempt))

;;;  getUrl
(defn
 get-url
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getUrl))

;;;  getConnectedTime
(defn
 get-connected-time
 [^org.hyperledger.fabric.sdk.EventHub event-hub]
 (. event-hub getConnectedTime))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EventHub$1
;;;

;;;  onNext
(defn
 on-next
 [^org.hyperledger.fabric.sdk.EventHub$1
  event-hub$1
  ^org.hyperledger.fabric.protos.peer.PeerEvents$Event
  peer-events$-event0]
 (. event-hub$1 onNext peer-events$-event0))

;;;  onError
(defn
 on-error
 [^org.hyperledger.fabric.sdk.EventHub$1
  event-hub$1
  ^java.lang.Throwable
  throwable0]
 (. event-hub$1 onError throwable0))

;;;  onCompleted
(defn
 on-completed
 [^org.hyperledger.fabric.sdk.EventHub$1 event-hub$1]
 (. event-hub$1 onCompleted))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EventHub$2
;;;

;;;  disconnected
(defn
 disconnected
 [^org.hyperledger.fabric.sdk.EventHub$2
  event-hub$2
  ^org.hyperledger.fabric.sdk.EventHub
  event-hub0]
 (. event-hub$2 disconnected event-hub0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EventHub$EventHubDisconnected
;;;

;;;  disconnected
(defn
 disconnected
 [^org.hyperledger.fabric.sdk.EventHub$EventHubDisconnected
  event-hub$-event-hub-disconnected
  ^org.hyperledger.fabric.sdk.EventHub
  event-hub0]
 (. event-hub$-event-hub-disconnected disconnected event-hub0))
