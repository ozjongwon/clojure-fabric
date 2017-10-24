(ns clojure-fabric.chaincode
  (:import org.hyperledger.fabric.protos.peer.Chaincode))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
;;;

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getName))

;;;  getPathBytes
(defn
 get-path-bytes
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getPathBytes))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getVersion))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id newBuilderForType))

;;;  getPath
(defn
 get-path
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getPath))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id
  ^java.lang.Object
  object0]
 (. chaincode$-chaincode-id equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
   chaincode$-chaincode-id0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/newBuilder
   chaincode$-chaincode-id0)))

;;;  getVersionBytes
(defn
 get-version-bytes
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getVersionBytes))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeID
  chaincode$-chaincode-id]
 (. chaincode$-chaincode-id getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
;;;

;;;  getDecorations
(defn
 get-decorations
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getDecorations))

;;;  getArgsList
(defn
 get-args-list
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getArgsList))

;;;  containsDecorations
(defn
 contains-decorations
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input
  ^java.lang.String
  string0]
 (. chaincode$-chaincode-input containsDecorations string0))

;;;  getArgs
(defn
 get-args
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input
  
  int0]
 (. chaincode$-chaincode-input getArgs int0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseFrom
    
    generic-arg1))))

;;;  getArgsCount
(defn
 get-args-count
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getArgsCount))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input
  ^java.lang.Object
  object0]
 (. chaincode$-chaincode-input equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parser))

;;;  getDecorationsOrDefault
(defn
 get-decorations-or-default
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input
  ^java.lang.String
  string0
  ^com.google.protobuf.ByteString
  byte-string1]
 (.
  chaincode$-chaincode-input
  getDecorationsOrDefault
  string0
  byte-string1))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
   chaincode$-chaincode-input0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/newBuilder
   chaincode$-chaincode-input0))
 ([]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getDefaultInstanceForType))

;;;  getDecorationsMap
(defn
 get-decorations-map
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getDecorationsMap))

;;;  getDecorationsCount
(defn
 get-decorations-count
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input]
 (. chaincode$-chaincode-input getDecorationsCount))

;;;  getDecorationsOrThrow
(defn
 get-decorations-or-throw
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInput
  chaincode$-chaincode-input
  ^java.lang.String
  string0]
 (. chaincode$-chaincode-input getDecorationsOrThrow string0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
;;;

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getType))

;;;  getChaincodeIdOrBuilder
(defn
 get-chaincode-id-or-builder
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getChaincodeIdOrBuilder))

;;;  getInputOrBuilder
(defn
 get-input-or-builder
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getInputOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec
  ^java.lang.Object
  object0]
 (. chaincode$-chaincode-spec equals object0))

;;;  hasInput
(defn
 has-input
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec hasInput))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getInput
(defn
 get-input
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getInput))

;;;  getTimeout
(defn
 get-timeout
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getTimeout))

;;;  hasChaincodeId
(defn
 has-chaincode-id
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec hasChaincodeId))

;;;  getChaincodeId
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getChaincodeId))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
   chaincode$-chaincode-spec0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/newBuilder
   chaincode$-chaincode-spec0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getDefaultInstanceForType))

;;;  getTypeValue
(defn
 get-type-value
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec
  chaincode$-chaincode-spec]
 (. chaincode$-chaincode-spec getTypeValue))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
;;;

;;;  hasEffectiveDate
(defn
 has-effective-date
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec hasEffectiveDate))

;;;  getExecEnv
(defn
 get-exec-env
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getExecEnv))

;;;  hasChaincodeSpec
(defn
 has-chaincode-spec
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec hasChaincodeSpec))

;;;  getChaincodeSpecOrBuilder
(defn
 get-chaincode-spec-or-builder
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getChaincodeSpecOrBuilder))

;;;  getChaincodeSpec
(defn
 get-chaincode-spec
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getChaincodeSpec))

;;;  getEffectiveDateOrBuilder
(defn
 get-effective-date-or-builder
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getEffectiveDateOrBuilder))

;;;  getCodePackage
(defn
 get-code-package
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getCodePackage))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getEffectiveDate
(defn
 get-effective-date
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getEffectiveDate))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec isInitialized))

;;;  getExecEnvValue
(defn
 get-exec-env-value
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getExecEnvValue))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec
  ^java.lang.Object
  object0]
 (. chaincode$-chaincode-deployment-spec equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
   chaincode$-chaincode-deployment-spec0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/newBuilder
   chaincode$-chaincode-deployment-spec0))
 ([]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeDeploymentSpec
  chaincode$-chaincode-deployment-spec]
 (. chaincode$-chaincode-deployment-spec getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
;;;

;;;  hasChaincodeSpec
(defn
 has-chaincode-spec
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec hasChaincodeSpec))

;;;  getChaincodeSpecOrBuilder
(defn
 get-chaincode-spec-or-builder
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getChaincodeSpecOrBuilder))

;;;  getChaincodeSpec
(defn
 get-chaincode-spec
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getChaincodeSpec))

;;;  getIdGenerationAlgBytes
(defn
 get-id-generation-alg-bytes
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getIdGenerationAlgBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseFrom
    
    generic-arg1))))

;;;  getIdGenerationAlg
(defn
 get-id-generation-alg
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getIdGenerationAlg))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec
  ^java.lang.Object
  object0]
 (. chaincode$-chaincode-invocation-spec equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
   chaincode$-chaincode-invocation-spec0]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/newBuilder
   chaincode$-chaincode-invocation-spec0))
 ([]
  (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeInvocationSpec
  chaincode$-chaincode-invocation-spec]
 (. chaincode$-chaincode-invocation-spec getDefaultInstanceForType))
