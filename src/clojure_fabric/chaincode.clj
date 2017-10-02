(ns clojure-fabric.chaincode
  (:import [org.hyperledger.fabric.sdk ChaincodeID ChaincodeResponse
            ChaincodeEndorsementPolicy]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeID
;;;

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.ChaincodeID/newBuilder))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.sdk.ChaincodeID chaincode-id]
 (. chaincode-id getVersion))

;;;  getFabricChaincodeID
(defn
 get-fabric-chaincode-id
 [^org.hyperledger.fabric.sdk.ChaincodeID chaincode-id]
 (. chaincode-id getFabricChaincodeID))

;;;  getPath
(defn
 get-path
 [^org.hyperledger.fabric.sdk.ChaincodeID chaincode-id]
 (. chaincode-id getPath))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.sdk.ChaincodeID chaincode-id]
 (. chaincode-id getName))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeID$Builder
;;;

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.ChaincodeID$Builder
  chaincode-id$-builder]
 (. chaincode-id$-builder build))

;;;  setPath
(defn
 set-path
 [^org.hyperledger.fabric.sdk.ChaincodeID$Builder
  chaincode-id$-builder
  ^java.lang.String
  string0]
 (. chaincode-id$-builder setPath string0))

;;;  setVersion
(defn
 set-version
 [^org.hyperledger.fabric.sdk.ChaincodeID$Builder
  chaincode-id$-builder
  ^java.lang.String
  string0]
 (. chaincode-id$-builder setVersion string0))

;;;  setName
(defn
 set-name
 [^org.hyperledger.fabric.sdk.ChaincodeID$Builder
  chaincode-id$-builder
  ^java.lang.String
  string0]
 (. chaincode-id$-builder setName string0))

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
  (instance? Object generic-arg1)
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
;;;org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
;;;

;;;  getChaincodeEndorsementPolicyAsBytes
(defn
 get-chaincode-endorsement-policy-as-bytes
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy]
 (. chaincode-endorsement-policy getChaincodeEndorsementPolicyAsBytes))

;;;  fromBytes
(defn
 from-bytes
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  
  bytes0]
 (. chaincode-endorsement-policy fromBytes bytes0))

;;;  fromStream
(defn
 from-stream
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.InputStream
  input-stream0]
 (. chaincode-endorsement-policy fromStream input-stream0))

;;;  org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
(defn
 chaincode-endorsement-policy
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy]
 (.
  chaincode-endorsement-policy
  org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy))

;;;  fromFile
(defn
 from-file
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.File
  file0]
 (. chaincode-endorsement-policy fromFile file0))

;;;  fromYamlFile
(defn
 from-yaml-file
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.File
  file0]
 (. chaincode-endorsement-policy fromYamlFile file0))
