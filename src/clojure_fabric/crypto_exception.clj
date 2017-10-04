(ns clojure-fabric.crypto-exception
  (:import org.hyperledger.fabric.sdk.exception.CryptoException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.CryptoException
;;;

;;;  org.hyperledger.fabric.sdk.exception.CryptoException
(defn
 crypto-exception
 ([^org.hyperledger.fabric.sdk.exception.CryptoException
   crypto-exception
   ^java.lang.String
   string0]
  (.
   crypto-exception
   org.hyperledger.fabric.sdk.exception.CryptoException
   string0))
 ([^org.hyperledger.fabric.sdk.exception.CryptoException
   crypto-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   crypto-exception
   org.hyperledger.fabric.sdk.exception.CryptoException
   string0
   exception1)))
