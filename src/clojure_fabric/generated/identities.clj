(ns clojure-fabric.identities
  (:import org.hyperledger.fabric.protos.msp.Identities))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
;;;

;;;  getIdBytes
(defn
 get-id-bytes
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
  identities$-serialized-identity]
 (. identities$-serialized-identity getIdBytes))

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

;;;  getNymX
(defn
 get-nym-x
 [^org.hyperledger.fabric.protos.msp.Identities$SerializedIdemixIdentity
  identities$-serialized-idemix-identity]
 (. identities$-serialized-idemix-identity getNymX))

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
