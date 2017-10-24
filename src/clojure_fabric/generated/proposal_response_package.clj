(ns clojure-fabric.proposal-response-package
  (:import org.hyperledger.fabric.protos.peer.ProposalResponsePackage))


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
;;;  getTimestamp
(defn
 get-timestamp
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getTimestamp))

;;;  getResponse
(defn
 get-response
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponse
  proposal-response-package$-proposal-response]
 (. proposal-response-package$-proposal-response getResponse))

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

;;;  getStatus
(defn
 get-status
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getStatus))

;;;  getMessageBytes
(defn
 get-message-bytes
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Response
  proposal-response-package$-response]
 (. proposal-response-package$-response getMessageBytes))

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

;;;  getProposalHash
(defn
 get-proposal-hash
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$ProposalResponsePayload
  proposal-response-package$-proposal-response-payload]
 (.
  proposal-response-package$-proposal-response-payload
  getProposalHash))

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

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getSignature))

;;;  getEndorser
(defn
 get-endorser
 [^org.hyperledger.fabric.protos.peer.ProposalResponsePackage$Endorsement
  proposal-response-package$-endorsement]
 (. proposal-response-package$-endorsement getEndorser))

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
