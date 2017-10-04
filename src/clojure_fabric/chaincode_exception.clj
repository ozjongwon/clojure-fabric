(ns clojure-fabric.chaincode-exception
  (:import org.hyperledger.fabric.sdk.exception.ChaincodeException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.ChaincodeException
;;;

;;;  org.hyperledger.fabric.sdk.exception.ChaincodeException
(defn
 chaincode-exception
 [^org.hyperledger.fabric.sdk.exception.ChaincodeException
  chaincode-exception
  ^java.lang.String
  string0
  ^java.lang.Exception
  exception1]
 (.
  chaincode-exception
  org.hyperledger.fabric.sdk.exception.ChaincodeException
  string0
  exception1))
