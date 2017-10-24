(ns clojure-fabric.resources
  (:import org.hyperledger.fabric.protos.peer.Resources))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Resources$Resource
;;;

;;;  getPolicyRef
(defn
 get-policy-ref
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource getPolicyRef))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Resources$Resource/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource
  ^java.lang.Object
  object0]
 (. resources$-resource equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Resources$Resource/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Resources$Resource/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Resources$Resource/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Resources$Resource
   resources$-resource0]
  (org.hyperledger.fabric.protos.peer.Resources$Resource/newBuilder
   resources$-resource0))
 ([]
  (org.hyperledger.fabric.protos.peer.Resources$Resource/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Resources$Resource/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource getDefaultInstanceForType))

;;;  getPolicyRefBytes
(defn
 get-policy-ref-bytes
 [^org.hyperledger.fabric.protos.peer.Resources$Resource
  resources$-resource]
 (. resources$-resource getPolicyRefBytes))
