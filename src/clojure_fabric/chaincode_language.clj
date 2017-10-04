(ns clojure-fabric.chaincode-language
  (:import org.hyperledger.fabric.sdk.ChaincodeLanguage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeLanguage
;;;

;;;  valueOf
(defn
 value-of
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.ChaincodeLanguage/valueOf string0))

;;;  values
(defn values [] (org.hyperledger.fabric.sdk.ChaincodeLanguage/values))

;;;  JAVA
(defn java [] (org.hyperledger.fabric.sdk.ChaincodeLanguage/JAVA))

;;;  GO_LANG
(defn
 go_-lang
 []
 (org.hyperledger.fabric.sdk.ChaincodeLanguage/GO_LANG))
