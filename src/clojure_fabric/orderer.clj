(ns clojure-fabric.orderer
  (:import org.hyperledger.fabric.sdk.Orderer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.Orderer
;;;

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.sdk.Orderer orderer]
 (. orderer getName))

;;;  getUrl
(defn
 get-url
 [^org.hyperledger.fabric.sdk.Orderer orderer]
 (. orderer getUrl))

;;;  getProperties
(defn
 get-properties
 [^org.hyperledger.fabric.sdk.Orderer orderer]
 (. orderer getProperties))
