(ns clojure-fabric.envelope-deserializer
  (:import org.hyperledger.fabric.sdk.EnvelopeDeserializer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EnvelopeDeserializer
;;;

;;;  isValid
(defn
 is-valid
 [^org.hyperledger.fabric.sdk.EnvelopeDeserializer
  envelope-deserializer]
 (. envelope-deserializer isValid))

;;;  validationCode
(defn
 validation-code
 [^org.hyperledger.fabric.sdk.EnvelopeDeserializer
  envelope-deserializer]
 (. envelope-deserializer validationCode))
