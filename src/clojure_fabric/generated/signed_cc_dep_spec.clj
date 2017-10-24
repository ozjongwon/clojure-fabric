(ns clojure-fabric.signed-cc-dep-spec
  (:import org.hyperledger.fabric.protos.peer.SignedCcDepSpec))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
;;;

;;;  getOwnerEndorsementsList
(defn
 get-owner-endorsements-list
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getOwnerEndorsementsList))

;;;  getOwnerEndorsements
(defn
 get-owner-endorsements
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  
  int0]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getOwnerEndorsements
  int0))

;;;  getInstantiationPolicy
(defn
 get-instantiation-policy
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getInstantiationPolicy))

;;;  getOwnerEndorsementsOrBuilder
(defn
 get-owner-endorsements-or-builder
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  
  int0]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getOwnerEndorsementsOrBuilder
  int0))

;;;  getOwnerEndorsementsOrBuilderList
(defn
 get-owner-endorsements-or-builder-list
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getOwnerEndorsementsOrBuilderList))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (. signed-cc-dep-spec$-signed-chaincode-deployment-spec isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  ^java.lang.Object
  object0]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  equals
  object0))

;;;  getChaincodeDeploymentSpec
(defn
 get-chaincode-deployment-spec
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getChaincodeDeploymentSpec))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (. signed-cc-dep-spec$-signed-chaincode-deployment-spec hashCode))

;;;  getOwnerEndorsementsCount
(defn
 get-owner-endorsements-count
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getOwnerEndorsementsCount))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
   signed-cc-dep-spec$-signed-chaincode-deployment-spec0]
  (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/newBuilder
   signed-cc-dep-spec$-signed-chaincode-deployment-spec0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.SignedCcDepSpec$SignedChaincodeDeploymentSpec
  signed-cc-dep-spec$-signed-chaincode-deployment-spec]
 (.
  signed-cc-dep-spec$-signed-chaincode-deployment-spec
  getDefaultInstanceForType))
