(ns clojure-fabric.chaincode
  (:import [org.hyperledger.fabric.sdk ChaincodeID]))

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
