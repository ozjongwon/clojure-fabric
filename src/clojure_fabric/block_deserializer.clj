(ns clojure-fabric.block-deserializer
  (:import org.hyperledger.fabric.sdk.BlockDeserializer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockDeserializer
;;;

;;;  getBlock
(defn
 get-block
 [^org.hyperledger.fabric.sdk.BlockDeserializer block-deserializer]
 (. block-deserializer getBlock))

;;;  getNumber
(defn
 get-number
 [^org.hyperledger.fabric.sdk.BlockDeserializer block-deserializer]
 (. block-deserializer getNumber))
