(ns clojure-fabric.proposal-package
  (:import org.hyperledger.fabric.protos.peer.ProposalPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.ProposalPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.ProposalPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.ProposalPackage/registerAllExtensions
   generic-arg1)))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
;;;

;;;  getProposalBytes
(defn
 get-proposal-bytes
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getProposalBytes))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getUnknownFields))

;;;  PROPOSAL_BYTES_FIELD_NUMBER
(defn
 proposal_-bytes_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/PROPOSAL_BYTES_FIELD_NUMBER))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. proposal-package$-signed-proposal writeTo coded-output-stream0))

;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal
  ^java.lang.Object
  object0]
 (. proposal-package$-signed-proposal equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
   proposal-package$-signed-proposal0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/newBuilder
   proposal-package$-signed-proposal0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$SignedProposal
  proposal-package$-signed-proposal]
 (. proposal-package$-signed-proposal getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
;;;

;;;  getExtension
(defn
 get-extension
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getExtension))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal toBuilder))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. proposal-package$-proposal writeTo coded-output-stream0))

;;;  HEADER_FIELD_NUMBER
(defn
 header_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/HEADER_FIELD_NUMBER))

;;;  EXTENSION_FIELD_NUMBER
(defn
 extension_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/EXTENSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal
  ^java.lang.Object
  object0]
 (. proposal-package$-proposal equals object0))

;;;  getHeader
(defn
 get-header
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getHeader))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
   proposal-package$-proposal0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/newBuilder
   proposal-package$-proposal0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$Proposal
  proposal-package$-proposal]
 (. proposal-package$-proposal getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension getSerializedSize))

;;;  CHAINCODE_ID_FIELD_NUMBER
(defn
 chaincode_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/CHAINCODE_ID_FIELD_NUMBER))

;;;  PAYLOAD_VISIBILITY_FIELD_NUMBER
(defn
 payload_-visibility_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/PAYLOAD_VISIBILITY_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension toBuilder))

;;;  getChaincodeIdOrBuilder
(defn
 get-chaincode-id-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (.
  proposal-package$-chaincode-header-extension
  getChaincodeIdOrBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  proposal-package$-chaincode-header-extension
  writeTo
  coded-output-stream0))

;;;  getPayloadVisibility
(defn
 get-payload-visibility
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension getPayloadVisibility))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension
  ^java.lang.Object
  object0]
 (. proposal-package$-chaincode-header-extension equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  hasChaincodeId
(defn
 has-chaincode-id
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension hasChaincodeId))

;;;  getChaincodeId
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (. proposal-package$-chaincode-header-extension getChaincodeId))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
   proposal-package$-chaincode-header-extension0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/newBuilder
   proposal-package$-chaincode-header-extension0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeHeaderExtension
  proposal-package$-chaincode-header-extension]
 (.
  proposal-package$-chaincode-header-extension
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getSerializedSize))

;;;  getTransientMap
(defn
 get-transient-map
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getTransientMap))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload toBuilder))

;;;  INPUT_FIELD_NUMBER
(defn
 input_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/INPUT_FIELD_NUMBER))

;;;  containsTransientMap
(defn
 contains-transient-map
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload
  ^java.lang.String
  string0]
 (.
  proposal-package$-chaincode-proposal-payload
  containsTransientMap
  string0))

;;;  getTransientMapCount
(defn
 get-transient-map-count
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getTransientMapCount))

;;;  getTransientMapOrDefault
(defn
 get-transient-map-or-default
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload
  ^java.lang.String
  string0
  ^com.google.protobuf.ByteString
  byte-string1]
 (.
  proposal-package$-chaincode-proposal-payload
  getTransientMapOrDefault
  string0
  byte-string1))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  proposal-package$-chaincode-proposal-payload
  writeTo
  coded-output-stream0))

;;;  TRANSIENTMAP_FIELD_NUMBER
(defn
 transientmap_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/TRANSIENTMAP_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getTransientMapOrThrow
(defn
 get-transient-map-or-throw
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload
  ^java.lang.String
  string0]
 (.
  proposal-package$-chaincode-proposal-payload
  getTransientMapOrThrow
  string0))

;;;  getTransientMapMap
(defn
 get-transient-map-map
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getTransientMapMap))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload
  ^java.lang.Object
  object0]
 (. proposal-package$-chaincode-proposal-payload equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getInput
(defn
 get-input
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (. proposal-package$-chaincode-proposal-payload getInput))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
   proposal-package$-chaincode-proposal-payload0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/newBuilder
   proposal-package$-chaincode-proposal-payload0))
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeProposalPayload
  proposal-package$-chaincode-proposal-payload]
 (.
  proposal-package$-chaincode-proposal-payload
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
;;;

;;;  getResponseOrBuilder
(defn
 get-response-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getResponseOrBuilder))

;;;  getResults
(defn
 get-results
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getResults))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getSerializedSize))

;;;  CHAINCODE_ID_FIELD_NUMBER
(defn
 chaincode_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/CHAINCODE_ID_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action toBuilder))

;;;  getResponse
(defn
 get-response
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getResponse))

;;;  getChaincodeIdOrBuilder
(defn
 get-chaincode-id-or-builder
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getChaincodeIdOrBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. proposal-package$-chaincode-action writeTo coded-output-stream0))

;;;  getEvents
(defn
 get-events
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getEvents))

;;;  EVENTS_FIELD_NUMBER
(defn
 events_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/EVENTS_FIELD_NUMBER))

;;;  hasResponse
(defn
 has-response
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action hasResponse))

;;;  RESULTS_FIELD_NUMBER
(defn
 results_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/RESULTS_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action
  ^java.lang.Object
  object0]
 (. proposal-package$-chaincode-action equals object0))

;;;  RESPONSE_FIELD_NUMBER
(defn
 response_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/RESPONSE_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/parseDelimitedFrom
   input-stream0)))

;;;  hasChaincodeId
(defn
 has-chaincode-id
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action hasChaincodeId))

;;;  getChaincodeId
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getChaincodeId))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
   proposal-package$-chaincode-action0]
  (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/newBuilder
   proposal-package$-chaincode-action0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ProposalPackage$ChaincodeAction
  proposal-package$-chaincode-action]
 (. proposal-package$-chaincode-action getDefaultInstanceForType))
