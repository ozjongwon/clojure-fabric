(ns clojure-fabric.chaincode-response
  (:import org.hyperledger.fabric.sdk.ChaincodeResponse))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeResponse
;;;

;;;  getTransactionID
(defn
 get-transaction-id
 [^org.hyperledger.fabric.sdk.ChaincodeResponse chaincode-response]
 (. chaincode-response getTransactionID))

;;;  getMessage
(defn
 get-message
 [^org.hyperledger.fabric.sdk.ChaincodeResponse chaincode-response]
 (. chaincode-response getMessage))

;;;  org.hyperledger.fabric.sdk.ChaincodeResponse
(defn
 chaincode-response
 [^org.hyperledger.fabric.sdk.ChaincodeResponse
  chaincode-response
  ^java.lang.String
  string0
  ^java.lang.String
  string1
  generic-arg1
  ^java.lang.String
  string3]
 (cond
  (instance?
   org.hyperledger.fabric.sdk.ChaincodeResponse$Status
   generic-arg1)
  (.
   chaincode-response
   org.hyperledger.fabric.sdk.ChaincodeResponse
   string0
   string1
   ^org.hyperledger.fabric.sdk.ChaincodeResponse$Status
   generic-arg1
   string3)
  :else
  (.
   chaincode-response
   org.hyperledger.fabric.sdk.ChaincodeResponse
   string0
   string1
   
   generic-arg1
   string3)))

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.sdk.ChaincodeResponse chaincode-response]
 (. chaincode-response getStatus))

;;;  isInvalid
(defn
 is-invalid
 [^org.hyperledger.fabric.sdk.ChaincodeResponse chaincode-response]
 (. chaincode-response isInvalid))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeResponse$Status
;;;

;;;  SUCCESS
(defn
 success
 []
 (org.hyperledger.fabric.sdk.ChaincodeResponse$Status/SUCCESS))

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.sdk.ChaincodeResponse$Status
  chaincode-response$-status]
 (. chaincode-response$-status getStatus))

;;;  valueOf
(defn
 value-of
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.ChaincodeResponse$Status/valueOf string0))

;;;  UNDEFINED
(defn
 undefined
 []
 (org.hyperledger.fabric.sdk.ChaincodeResponse$Status/UNDEFINED))

;;;  FAILURE
(defn
 failure
 []
 (org.hyperledger.fabric.sdk.ChaincodeResponse$Status/FAILURE))

;;;  values
(defn
 values
 []
 (org.hyperledger.fabric.sdk.ChaincodeResponse$Status/values))
