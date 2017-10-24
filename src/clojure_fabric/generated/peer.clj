(ns clojure-fabric.peer
  (:import org.hyperledger.fabric.protos.peer.Peer))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Peer$PeerID
;;;

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id getName))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID
  peer$-peer-id
  ^java.lang.Object
  object0]
 (. peer$-peer-id equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id hashCode))

;;;  parser
(defn parser [] (org.hyperledger.fabric.protos.peer.Peer$PeerID/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Peer$PeerID/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id0]
  (org.hyperledger.fabric.protos.peer.Peer$PeerID/newBuilder
   peer$-peer-id0))
 ([] (org.hyperledger.fabric.protos.peer.Peer$PeerID/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Peer$PeerID/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.peer.Peer$PeerID peer$-peer-id]
 (. peer$-peer-id getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
;;;

;;;  getAddressBytes
(defn
 get-address-bytes
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getAddressBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  hasId
(defn
 has-id
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint hasId))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint
  ^java.lang.Object
  object0]
 (. peer$-peer-endpoint equals object0))

;;;  getId
(defn
 get-id
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getId))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parser))


;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/parseDelimitedFrom
   input-stream0)))

;;;  getIdOrBuilder
(defn
 get-id-or-builder
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getIdOrBuilder))

;;;  newBuilder
(defn
 new-builder
 ([] (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
   peer$-peer-endpoint0]
  (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/newBuilder
   peer$-peer-endpoint0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getDefaultInstanceForType))

;;;  getAddress
(defn
 get-address
 [^org.hyperledger.fabric.protos.peer.Peer$PeerEndpoint
  peer$-peer-endpoint]
 (. peer$-peer-endpoint getAddress))
