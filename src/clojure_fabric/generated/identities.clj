(ns clojure-fabric.identities
  (:import org.hyperledger.fabric.protos.msp.Identities))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.Identities
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.msp.Identities/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.msp.Identities/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.msp.Identities/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.Identities/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getSerializedSize))

;;;  ID_BYTES_FIELD_NUMBER
(defn
 id_-bytes_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/ID_BYTES_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity toBuilder))

;;;  getIdBytes
(defn
 get-id-bytes
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getIdBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. identities$-serialized-identity writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity
  ^java.lang.Object
  object0]
 (. identities$-serialized-identity equals object0))

;;;  MSPID_FIELD_NUMBER
(defn
 mspid_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/MSPID_FIELD_NUMBER))

;;;  getMspid
(defn
 get-mspid
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getMspid))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getMspidBytes
(defn
 get-mspid-bytes
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getMspidBytes))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
   identities$-serialized-identity0]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/newBuilder
   identities$-serialized-identity0))
 ([]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity toBuilder))

;;;  ROLE_FIELD_NUMBER
(defn
 role_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/ROLE_FIELD_NUMBER))

;;;  getNymX
(defn
 get-nym-x
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getNymX))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  identities$-serialized-idemix-identity
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/getDescriptor))

;;;  getRole
(defn
 get-role
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getRole))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getNymY
(defn
 get-nym-y
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getNymY))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity
  ^java.lang.Object
  object0]
 (. identities$-serialized-idemix-identity equals object0))

;;;  getOU
(defn
 get-ou
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getOU))

;;;  OU_FIELD_NUMBER
(defn
 ou_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/OU_FIELD_NUMBER))

;;;  NYMY_FIELD_NUMBER
(defn
 nymy_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/NYMY_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  NYMX_FIELD_NUMBER
(defn
 nymx_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/NYMX_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
   identities$-serialized-idemix-identity0]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/newBuilder
   identities$-serialized-idemix-identity0))
 ([]
  (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getDefaultInstanceForType))
