(ns clojure-fabric.peer
  (:import org.hyperledger.fabric.sdk.Peer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.Peer
;;;

;;;  getUrl
(defn get-url [^org.hyperledger.fabric.sdk.Peer peer] (. peer getUrl))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.sdk.Peer peer ^java.lang.Object object0]
 (. peer equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.sdk.Peer peer]
 (. peer hashCode))

;;;  getName
(defn get-name [^org.hyperledger.fabric.sdk.Peer peer] (. peer getName))

;;;  getProperties
(defn
 get-properties
 [^org.hyperledger.fabric.sdk.Peer peer]
 (. peer getProperties))
