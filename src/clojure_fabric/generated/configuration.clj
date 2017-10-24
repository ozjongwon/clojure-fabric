(ns clojure-fabric.configuration
  (:import org.hyperledger.fabric.protos.peer.Configuration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Configuration
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.Configuration/registerAllExtensions
   generic-arg1)))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getSerializedSize))

;;;  getAnchorPeersOrBuilderList
(defn
 get-anchor-peers-or-builder-list
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getAnchorPeersOrBuilderList))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers toBuilder))

;;;  ANCHOR_PEERS_FIELD_NUMBER
(defn
 anchor_-peers_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/ANCHOR_PEERS_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
  (. configuration$-anchor-peers writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseFrom
    
    generic-arg1))))

;;;  getAnchorPeersOrBuilder
(defn
 get-anchor-peers-or-builder
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers
  
  int0]
 (. configuration$-anchor-peers getAnchorPeersOrBuilder int0))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers
  ^java.lang.Object
  object0]
 (. configuration$-anchor-peers equals object0))

;;;  getAnchorPeersList
(defn
 get-anchor-peers-list
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getAnchorPeersList))

;;;  getAnchorPeersCount
(defn
 get-anchor-peers-count
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getAnchorPeersCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
   configuration$-anchor-peers0]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/newBuilder
   configuration$-anchor-peers0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers/getDefaultInstance))

;;;  getAnchorPeers
(defn
 get-anchor-peers
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers
  
  int0]
 (. configuration$-anchor-peers getAnchorPeers int0))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeers
  configuration$-anchor-peers]
 (. configuration$-anchor-peers getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
;;;

;;;  PORT_FIELD_NUMBER
(defn
 port_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/PORT_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer toBuilder))

;;;  getHostBytes
(defn
 get-host-bytes
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getHostBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-anchor-peer writeTo coded-output-stream0))

;;;  HOST_FIELD_NUMBER
(defn
 host_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/HOST_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer
  ^java.lang.Object
  object0]
 (. configuration$-anchor-peer equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getPort
(defn
 get-port
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getPort))

;;;  getHost
(defn
 get-host
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getHost))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
   configuration$-anchor-peer0]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/newBuilder
   configuration$-anchor-peer0))
 ([]
  (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Configuration$AnchorPeer
  configuration$-anchor-peer]
 (. configuration$-anchor-peer getDefaultInstanceForType))
