(ns clojure-fabric.proposal-response-package
  (:import org.hyperledger.fabric.protos.peer.ProposalResponsePackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalResponsePackage
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
;;;

;;;  getEndorsementOrBuilder
(defn
 get-endorsement-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (.
  proposal-response-package$-proposal-response
  getEndorsementOrBuilder))

;;;  getResponseOrBuilder
(defn
 get-response-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getResponseOrBuilder))

;;;  getTimestampOrBuilder
(defn
 get-timestamp-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getTimestampOrBuilder))

;;;  hasTimestamp
(defn
 has-timestamp
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response hasTimestamp))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response toBuilder))

;;;  getTimestamp
(defn
 get-timestamp
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getTimestamp))

;;;  TIMESTAMP_FIELD_NUMBER
(defn
 timestamp_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/TIMESTAMP_FIELD_NUMBER))

;;;  getResponse
(defn
 get-response
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getResponse))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/PAYLOAD_FIELD_NUMBER))

;;;  hasEndorsement
(defn
 has-endorsement
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response hasEndorsement))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getVersion))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  proposal-response-package$-proposal-response
  writeTo
  coded-output-stream0))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/VERSION_FIELD_NUMBER))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/getDescriptor))

;;;  hasResponse
(defn
 has-response
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response hasResponse))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response
  ^java.lang.Object
  object0]
 (. proposal-response-package$-proposal-response equals object0))

;;;  getEndorsement
(defn
 get-endorsement
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getEndorsement))

;;;  ENDORSEMENT_FIELD_NUMBER
(defn
 endorsement_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/ENDORSEMENT_FIELD_NUMBER))

;;;  RESPONSE_FIELD_NUMBER
(defn
 response_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/RESPONSE_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
   proposal-response-package$-proposal-response0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/newBuilder
   proposal-response-package$-proposal-response0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (.
  proposal-response-package$-proposal-response
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
;;;

;;;  STATUS_FIELD_NUMBER
(defn
 status_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/STATUS_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getSerializedSize))

;;;  MESSAGE_FIELD_NUMBER
(defn
 message_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/MESSAGE_FIELD_NUMBER))

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getStatus))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response toBuilder))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/PAYLOAD_FIELD_NUMBER))

;;;  getMessageBytes
(defn
 get-message-bytes
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getMessageBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. proposal-response-package$-response writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/getDescriptor))

;;;  getMessage
(defn
 get-message
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getMessage))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response
  ^java.lang.Object
  object0]
 (. proposal-response-package$-response equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
   proposal-response-package$-response0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/newBuilder
   proposal-response-package$-response0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
;;;

;;;  getExtension
(defn
 get-extension
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (. proposal-response-package$-proposal-response-payload getExtension))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (. proposal-response-package$-proposal-response-payload toBuilder))

;;;  getProposalHash
(defn
 get-proposal-hash
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getProposalHash))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  proposal-response-package$-proposal-response-payload
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/getDescriptor))

;;;  EXTENSION_FIELD_NUMBER
(defn
 extension_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/EXTENSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  PROPOSAL_HASH_FIELD_NUMBER
(defn
 proposal_-hash_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/PROPOSAL_HASH_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (. proposal-response-package$-proposal-response-payload isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload
  ^java.lang.Object
  object0]
 (.
  proposal-response-package$-proposal-response-payload
  equals
  object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (. proposal-response-package$-proposal-response-payload hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
   proposal-response-package$-proposal-response-payload0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/newBuilder
   proposal-response-package$-proposal-response-payload0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement toBuilder))

;;;  getEndorser
(defn
 get-endorser
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getEndorser))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  proposal-response-package$-endorsement
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/getDescriptor))

;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement
  ^java.lang.Object
  object0]
 (. proposal-response-package$-endorsement equals object0))

;;;  ENDORSER_FIELD_NUMBER
(defn
 endorser_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/ENDORSER_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
   proposal-response-package$-endorsement0]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/newBuilder
   proposal-response-package$-endorsement0))
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getDefaultInstanceForType))
