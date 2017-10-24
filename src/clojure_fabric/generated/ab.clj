(ns clojure-fabric.generated.ab
  (:import org.hyperledger.fabric.protos.orderer.Ab))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
;;;

;;;  STATUS_FIELD_NUMBER
(defn
 status_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/STATUS_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getSerializedSize))

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getStatus))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response toBuilder))

;;;  getStatusValue
(defn
 get-status-value
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getStatusValue))

;;;  getInfo
(defn
 get-info
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getInfo))

;;;  INFO_FIELD_NUMBER
(defn
 info_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/INFO_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-broadcast-response writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response
  ^java.lang.Object
  object0]
 (. ab$-broadcast-response equals object0))

;;;  getInfoBytes
(defn
 get-info-bytes
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getInfoBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
   ab$-broadcast-response0]
  (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/newBuilder
   ab$-broadcast-response0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$BroadcastResponse
  ab$-broadcast-response]
 (. ab$-broadcast-response getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$SeekNewest
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest
  ab$-seek-newest
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-seek-newest writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest
  ab$-seek-newest
  ^java.lang.Object
  object0]
 (. ab$-seek-newest equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest
   ab$-seek-newest0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/newBuilder
   ab$-seek-newest0))
 ([] (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekNewest/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekNewest ab$-seek-newest]
 (. ab$-seek-newest getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$SeekOldest
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest
  ab$-seek-oldest
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-seek-oldest writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest
  ab$-seek-oldest
  ^java.lang.Object
  object0]
 (. ab$-seek-oldest equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest
   ab$-seek-oldest0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/newBuilder
   ab$-seek-oldest0))
 ([] (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekOldest/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekOldest ab$-seek-oldest]
 (. ab$-seek-oldest getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-seek-specified writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified
  ^java.lang.Object
  object0]
 (. ab$-seek-specified equals object0))

;;;  getNumber
(defn
 get-number
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified getNumber))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
   ab$-seek-specified0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/newBuilder
   ab$-seek-specified0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified
  ab$-seek-specified]
 (. ab$-seek-specified getDefaultInstanceForType))

;;;  NUMBER_FIELD_NUMBER
(defn
 number_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekSpecified/NUMBER_FIELD_NUMBER))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position toBuilder))

;;;  hasSpecified
(defn
 has-specified
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position hasSpecified))

;;;  getTypeCase
(defn
 get-type-case
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getTypeCase))

;;;  getSpecifiedOrBuilder
(defn
 get-specified-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getSpecifiedOrBuilder))

;;;  getOldest
(defn
 get-oldest
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getOldest))

;;;  SPECIFIED_FIELD_NUMBER
(defn
 specified_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/SPECIFIED_FIELD_NUMBER))

;;;  hasOldest
(defn
 has-oldest
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position hasOldest))

;;;  getNewestOrBuilder
(defn
 get-newest-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getNewestOrBuilder))

;;;  hasNewest
(defn
 has-newest
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position hasNewest))

;;;  NEWEST_FIELD_NUMBER
(defn
 newest_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/NEWEST_FIELD_NUMBER))

;;;  OLDEST_FIELD_NUMBER
(defn
 oldest_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/OLDEST_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-seek-position writeTo coded-output-stream0))

;;;  getSpecified
(defn
 get-specified
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getSpecified))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position isInitialized))

;;;  getNewest
(defn
 get-newest
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getNewest))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position
  ^java.lang.Object
  object0]
 (. ab$-seek-position equals object0))

;;;  getOldestOrBuilder
(defn
 get-oldest-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getOldestOrBuilder))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
   ab$-seek-position0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/newBuilder
   ab$-seek-position0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekPosition/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekPosition
  ab$-seek-position]
 (. ab$-seek-position getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$SeekInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info toBuilder))

;;;  hasStop
(defn
 has-stop
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info hasStop))

;;;  getStop
(defn
 get-stop
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getStop))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo
  ab$-seek-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-seek-info writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo
  ab$-seek-info
  ^java.lang.Object
  object0]
 (. ab$-seek-info equals object0))

;;;  getBehaviorValue
(defn
 get-behavior-value
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getBehaviorValue))

;;;  getStart
(defn
 get-start
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getStart))

;;;  getBehavior
(defn
 get-behavior
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getBehavior))

;;;  hasStart
(defn
 has-start
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info hasStart))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parser))

;;;  BEHAVIOR_FIELD_NUMBER
(defn
 behavior_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/BEHAVIOR_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/parseDelimitedFrom
   input-stream0)))

;;;  START_FIELD_NUMBER
(defn
 start_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/START_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([] (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info0]
  (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/newBuilder
   ab$-seek-info0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getDefaultInstanceForType))

;;;  getStartOrBuilder
(defn
 get-start-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getStartOrBuilder))

;;;  getStopOrBuilder
(defn
 get-stop-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$SeekInfo ab$-seek-info]
 (. ab$-seek-info getStopOrBuilder))

;;;  STOP_FIELD_NUMBER
(defn
 stop_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$SeekInfo/STOP_FIELD_NUMBER))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
;;;

;;;  STATUS_FIELD_NUMBER
(defn
 status_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/STATUS_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getSerializedSize))

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getStatus))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response toBuilder))

;;;  getTypeCase
(defn
 get-type-case
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getTypeCase))

;;;  BLOCK_FIELD_NUMBER
(defn
 block_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/BLOCK_FIELD_NUMBER))

;;;  getStatusValue
(defn
 get-status-value
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getStatusValue))

;;;  hasBlock
(defn
 has-block
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response hasBlock))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ab$-deliver-response writeTo coded-output-stream0))

;;;  getBlock
(defn
 get-block
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getBlock))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response
  ^java.lang.Object
  object0]
 (. ab$-deliver-response equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
   ab$-deliver-response0]
  (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/newBuilder
   ab$-deliver-response0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/newBuilder)))

;;;  getBlockOrBuilder
(defn
 get-block-or-builder
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getBlockOrBuilder))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Ab$DeliverResponse
  ab$-deliver-response]
 (. ab$-deliver-response getDefaultInstanceForType))
