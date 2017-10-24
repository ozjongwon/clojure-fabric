(ns clojure-fabric.common
  (:import org.hyperledger.fabric.protos.common.Common))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$LastConfig
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-last-config writeTo coded-output-stream0))

;;;  INDEX_FIELD_NUMBER
(defn
 index_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$LastConfig/INDEX_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$LastConfig/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config
  ^java.lang.Object
  object0]
 (. common$-last-config equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$LastConfig/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$LastConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$LastConfig/parseDelimitedFrom
   input-stream0)))

;;;  getIndex
(defn
 get-index
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config getIndex))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Common$LastConfig
   common$-last-config0]
  (org.hyperledger.fabric.protos.common.Common$LastConfig/newBuilder
   common$-last-config0))
 ([]
  (org.hyperledger.fabric.protos.common.Common$LastConfig/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$LastConfig/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$LastConfig
  common$-last-config]
 (. common$-last-config getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$Metadata
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata toBuilder))

;;;  SIGNATURES_FIELD_NUMBER
(defn
 signatures_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Metadata/SIGNATURES_FIELD_NUMBER))

;;;  getSignaturesCount
(defn
 get-signatures-count
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getSignaturesCount))

;;;  getSignatures
(defn
 get-signatures
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata
  
  int0]
 (. common$-metadata getSignatures int0))

;;;  getValue
(defn
 get-value
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getValue))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-metadata writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Metadata/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata
  ^java.lang.Object
  object0]
 (. common$-metadata equals object0))

;;;  getSignaturesOrBuilder
(defn
 get-signatures-or-builder
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata
  
  int0]
 (. common$-metadata getSignaturesOrBuilder int0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$Metadata/parser))

;;;  VALUE_FIELD_NUMBER
(defn
 value_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Metadata/VALUE_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$Metadata/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$Metadata/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getSignaturesList
(defn
 get-signatures-list
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getSignaturesList))

;;;  newBuilder
(defn
 new-builder
 ([] (org.hyperledger.fabric.protos.common.Common$Metadata/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$Metadata
   common$-metadata0]
  (org.hyperledger.fabric.protos.common.Common$Metadata/newBuilder
   common$-metadata0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$Metadata/getDefaultInstance))

;;;  getSignaturesOrBuilderList
(defn
 get-signatures-or-builder-list
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getSignaturesOrBuilderList))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$Metadata
  common$-metadata]
 (. common$-metadata getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$MetadataSignature
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature toBuilder))

;;;  getSignatureHeader
(defn
 get-signature-header
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getSignatureHeader))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-metadata-signature writeTo coded-output-stream0))

;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$MetadataSignature/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  SIGNATURE_HEADER_FIELD_NUMBER
(defn
 signature_-header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$MetadataSignature/SIGNATURE_HEADER_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature
  ^java.lang.Object
  object0]
 (. common$-metadata-signature equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$MetadataSignature/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Common$MetadataSignature/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$MetadataSignature
   common$-metadata-signature0]
  (org.hyperledger.fabric.protos.common.Common$MetadataSignature/newBuilder
   common$-metadata-signature0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$MetadataSignature/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$MetadataSignature
  common$-metadata-signature]
 (. common$-metadata-signature getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$Header
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header toBuilder))

;;;  getSignatureHeader
(defn
 get-signature-header
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getSignatureHeader))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$Header
  common$-header
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-header writeTo coded-output-stream0))

;;;  CHANNEL_HEADER_FIELD_NUMBER
(defn
 channel_-header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Header/CHANNEL_HEADER_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Header/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  SIGNATURE_HEADER_FIELD_NUMBER
(defn
 signature_-header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Header/SIGNATURE_HEADER_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$Header
  common$-header
  ^java.lang.Object
  object0]
 (. common$-header equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$Header/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$Header/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$Header/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([] (org.hyperledger.fabric.protos.common.Common$Header/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$Header common$-header0]
  (org.hyperledger.fabric.protos.common.Common$Header/newBuilder
   common$-header0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$Header/getDefaultInstance))

;;;  getChannelHeader
(defn
 get-channel-header
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getChannelHeader))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$Header common$-header]
 (. common$-header getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$ChannelHeader
;;;

;;;  getExtension
(defn
 get-extension
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getExtension))

;;;  getTimestampOrBuilder
(defn
 get-timestamp-or-builder
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getTimestampOrBuilder))

;;;  hasTimestamp
(defn
 has-timestamp
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header hasTimestamp))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getSerializedSize))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header toBuilder))

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getChannelId))

;;;  getTimestamp
(defn
 get-timestamp
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getTimestamp))

;;;  CHANNEL_ID_FIELD_NUMBER
(defn
 channel_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/CHANNEL_ID_FIELD_NUMBER))

;;;  TIMESTAMP_FIELD_NUMBER
(defn
 timestamp_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/TIMESTAMP_FIELD_NUMBER))

;;;  EPOCH_FIELD_NUMBER
(defn
 epoch_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/EPOCH_FIELD_NUMBER))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getVersion))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-channel-header writeTo coded-output-stream0))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/VERSION_FIELD_NUMBER))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/TYPE_FIELD_NUMBER))

;;;  getTxId
(defn
 get-tx-id
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getTxId))

;;;  EXTENSION_FIELD_NUMBER
(defn
 extension_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/EXTENSION_FIELD_NUMBER))

;;;  getChannelIdBytes
(defn
 get-channel-id-bytes
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getChannelIdBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseFrom
    
    generic-arg1))))

;;;  TX_ID_FIELD_NUMBER
(defn
 tx_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/TX_ID_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header
  ^java.lang.Object
  object0]
 (. common$-channel-header equals object0))

;;;  getEpoch
(defn
 get-epoch
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getEpoch))

;;;  getTxIdBytes
(defn
 get-tx-id-bytes
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getTxIdBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$ChannelHeader/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Common$ChannelHeader/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$ChannelHeader
   common$-channel-header0]
  (org.hyperledger.fabric.protos.common.Common$ChannelHeader/newBuilder
   common$-channel-header0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$ChannelHeader/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$ChannelHeader
  common$-channel-header]
 (. common$-channel-header getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$SignatureHeader
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getUnknownFields))

;;;  CREATOR_FIELD_NUMBER
(defn
 creator_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$SignatureHeader/CREATOR_FIELD_NUMBER))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header toBuilder))

;;;  NONCE_FIELD_NUMBER
(defn
 nonce_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$SignatureHeader/NONCE_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-signature-header writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header
  ^java.lang.Object
  object0]
 (. common$-signature-header equals object0))

;;;  getNonce
(defn
 get-nonce
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getNonce))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parser))

;;;  getCreator
(defn
 get-creator
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getCreator))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$SignatureHeader/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Common$SignatureHeader/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$SignatureHeader
   common$-signature-header0]
  (org.hyperledger.fabric.protos.common.Common$SignatureHeader/newBuilder
   common$-signature-header0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$SignatureHeader/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$SignatureHeader
  common$-signature-header]
 (. common$-signature-header getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$Payload
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload toBuilder))

;;;  hasHeader
(defn
 has-header
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload hasHeader))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$Payload
  common$-payload
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-payload writeTo coded-output-stream0))

;;;  HEADER_FIELD_NUMBER
(defn
 header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Payload/HEADER_FIELD_NUMBER))

;;;  getHeaderOrBuilder
(defn
 get-header-or-builder
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getHeaderOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Payload/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$Payload
  common$-payload
  ^java.lang.Object
  object0]
 (. common$-payload equals object0))

;;;  getHeader
(defn
 get-header
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getHeader))

;;;  getData
(defn
 get-data
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getData))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$Payload/parser))

;;;  DATA_FIELD_NUMBER
(defn
 data_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Payload/DATA_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$Payload/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$Payload/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Common$Payload
   common$-payload0]
  (org.hyperledger.fabric.protos.common.Common$Payload/newBuilder
   common$-payload0))
 ([] (org.hyperledger.fabric.protos.common.Common$Payload/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$Payload/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$Payload common$-payload]
 (. common$-payload getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$Envelope
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope toBuilder))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Envelope/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-envelope writeTo coded-output-stream0))


;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Envelope/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Envelope/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope
  ^java.lang.Object
  object0]
 (. common$-envelope equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$Envelope/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$Envelope/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$Envelope/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([] (org.hyperledger.fabric.protos.common.Common$Envelope/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$Envelope
   common$-envelope0]
  (org.hyperledger.fabric.protos.common.Common$Envelope/newBuilder
   common$-envelope0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$Envelope/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$Envelope
  common$-envelope]
 (. common$-envelope getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$Block
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block toBuilder))

;;;  METADATA_FIELD_NUMBER
(defn
 metadata_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Block/METADATA_FIELD_NUMBER))

;;;  hasHeader
(defn
 has-header
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block hasHeader))

;;;  getDataOrBuilder
(defn
 get-data-or-builder
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getDataOrBuilder))

;;;  getMetadata
(defn
 get-metadata
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getMetadata))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$Block
  common$-block
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-block writeTo coded-output-stream0))

;;;  hasData
(defn
 has-data
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block hasData))

;;;  HEADER_FIELD_NUMBER
(defn
 header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Block/HEADER_FIELD_NUMBER))

;;;  getHeaderOrBuilder
(defn
 get-header-or-builder
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getHeaderOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$Block/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$Block
  common$-block
  ^java.lang.Object
  object0]
 (. common$-block equals object0))

;;;  getMetadataOrBuilder
(defn
 get-metadata-or-builder
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getMetadataOrBuilder))

;;;  getHeader
(defn
 get-header
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getHeader))

;;;  getData
(defn
 get-data
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getData))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$Block/parser))

;;;  DATA_FIELD_NUMBER
(defn
 data_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$Block/DATA_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$Block/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$Block/parseDelimitedFrom
   input-stream0)))

;;;  hasMetadata
(defn
 has-metadata
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block hasMetadata))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Common$Block common$-block0]
  (org.hyperledger.fabric.protos.common.Common$Block/newBuilder
   common$-block0))
 ([] (org.hyperledger.fabric.protos.common.Common$Block/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$Block/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$Block common$-block]
 (. common$-block getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$BlockHeader
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header toBuilder))

;;;  PREVIOUS_HASH_FIELD_NUMBER
(defn
 previous_-hash_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$BlockHeader/PREVIOUS_HASH_FIELD_NUMBER))

;;;  DATA_HASH_FIELD_NUMBER
(defn
 data_-hash_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$BlockHeader/DATA_HASH_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-block-header writeTo coded-output-stream0))

;;;  getPreviousHash
(defn
 get-previous-hash
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getPreviousHash))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header
  ^java.lang.Object
  object0]
 (. common$-block-header equals object0))

;;;  getNumber
(defn
 get-number
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getNumber))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$BlockHeader/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$BlockHeader/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Common$BlockHeader/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$BlockHeader
   common$-block-header0]
  (org.hyperledger.fabric.protos.common.Common$BlockHeader/newBuilder
   common$-block-header0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$BlockHeader/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getDefaultInstanceForType))

;;;  getDataHash
(defn
 get-data-hash
 [^org.hyperledger.fabric.protos.common.Common$BlockHeader
  common$-block-header]
 (. common$-block-header getDataHash))

;;;  NUMBER_FIELD_NUMBER
(defn
 number_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$BlockHeader/NUMBER_FIELD_NUMBER))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$BlockData
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-block-data writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockData/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data
  ^java.lang.Object
  object0]
 (. common$-block-data equals object0))

;;;  getData
(defn
 get-data
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data
  
  int0]
 (. common$-block-data getData int0))

;;;  getDataCount
(defn
 get-data-count
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getDataCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$BlockData/parser))

;;;  DATA_FIELD_NUMBER
(defn
 data_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$BlockData/DATA_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$BlockData/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$BlockData/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getDataList
(defn
 get-data-list
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getDataList))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Common$BlockData/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Common$BlockData
   common$-block-data0]
  (org.hyperledger.fabric.protos.common.Common$BlockData/newBuilder
   common$-block-data0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$BlockData/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockData
  common$-block-data]
 (. common$-block-data getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Common$BlockMetadata
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata toBuilder))

;;;  METADATA_FIELD_NUMBER
(defn
 metadata_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Common$BlockMetadata/METADATA_FIELD_NUMBER))

;;;  getMetadataCount
(defn
 get-metadata-count
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getMetadataCount))

;;;  getMetadata
(defn
 get-metadata
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata
  
  int0]
 (. common$-block-metadata getMetadata int0))

;;;  getMetadataList
(defn
 get-metadata-list
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getMetadataList))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. common$-block-metadata writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata
  ^java.lang.Object
  object0]
 (. common$-block-metadata equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Common$BlockMetadata/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Common$BlockMetadata
   common$-block-metadata0]
  (org.hyperledger.fabric.protos.common.Common$BlockMetadata/newBuilder
   common$-block-metadata0))
 ([]
  (org.hyperledger.fabric.protos.common.Common$BlockMetadata/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Common$BlockMetadata/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Common$BlockMetadata
  common$-block-metadata]
 (. common$-block-metadata getDefaultInstanceForType))
