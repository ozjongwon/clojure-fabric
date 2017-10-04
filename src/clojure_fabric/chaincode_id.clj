(ns clojure-fabric.chaincode-id
  (:import org.hyperledger.fabric.sdk.ChaincodeID))

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
;;;org.hyperledger.fabric.sdk.ChaincodeID$1
;;;


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
