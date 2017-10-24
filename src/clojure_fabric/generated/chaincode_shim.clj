(ns clojure-fabric.chaincode-shim
  (:import org.hyperledger.fabric.protos.peer.ChaincodeShim))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.ChaincodeShim/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.ChaincodeShim/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.ChaincodeShim/registerAllExtensions
   generic-arg1)))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
;;;

;;;  getTimestampOrBuilder
(defn
 get-timestamp-or-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getTimestampOrBuilder))

;;;  PROPOSAL_FIELD_NUMBER
(defn
 proposal_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/PROPOSAL_FIELD_NUMBER))

;;;  hasTimestamp
(defn
 has-timestamp
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message hasTimestamp))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getSerializedSize))

;;;  getChaincodeEventOrBuilder
(defn
 get-chaincode-event-or-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getChaincodeEventOrBuilder))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message toBuilder))

;;;  TXID_FIELD_NUMBER
(defn
 txid_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/TXID_FIELD_NUMBER))

;;;  getTxidBytes
(defn
 get-txid-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getTxidBytes))

;;;  getTimestamp
(defn
 get-timestamp
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getTimestamp))

;;;  TIMESTAMP_FIELD_NUMBER
(defn
 timestamp_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/TIMESTAMP_FIELD_NUMBER))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/PAYLOAD_FIELD_NUMBER))

;;;  getTxid
(defn
 get-txid
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getTxid))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-chaincode-message writeTo coded-output-stream0))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/TYPE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  hasChaincodeEvent
(defn
 has-chaincode-event
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message hasChaincodeEvent))

;;;  hasProposal
(defn
 has-proposal
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message hasProposal))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message
  ^java.lang.Object
  object0]
 (. chaincode-shim$-chaincode-message equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parser))

;;;  CHAINCODE_EVENT_FIELD_NUMBER
(defn
 chaincode_-event_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/CHAINCODE_EVENT_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getProposal
(defn
 get-proposal
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getProposal))

;;;  getProposalOrBuilder
(defn
 get-proposal-or-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getProposalOrBuilder))

;;;  getChaincodeEvent
(defn
 get-chaincode-event
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getChaincodeEvent))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
   chaincode-shim$-chaincode-message0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/newBuilder
   chaincode-shim$-chaincode-message0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getDefaultInstanceForType))

;;;  getTypeValue
(defn
 get-type-value
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$ChaincodeMessage
  chaincode-shim$-chaincode-message]
 (. chaincode-shim$-chaincode-message getTypeValue))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info toBuilder))

;;;  getKeyBytes
(defn
 get-key-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getKeyBytes))

;;;  getKey
(defn
 get-key
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getKey))

;;;  getValue
(defn
 get-value
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getValue))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-put-state-info writeTo coded-output-stream0))

;;;  KEY_FIELD_NUMBER
(defn
 key_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/KEY_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info
  ^java.lang.Object
  object0]
 (. chaincode-shim$-put-state-info equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parser))

;;;  VALUE_FIELD_NUMBER
(defn
 value_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/VALUE_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
   chaincode-shim$-put-state-info0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/newBuilder
   chaincode-shim$-put-state-info0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$PutStateInfo
  chaincode-shim$-put-state-info]
 (. chaincode-shim$-put-state-info getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range toBuilder))

;;;  ENDKEY_FIELD_NUMBER
(defn
 endkey_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/ENDKEY_FIELD_NUMBER))

;;;  getEndKeyBytes
(defn
 get-end-key-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getEndKeyBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-get-state-by-range writeTo coded-output-stream0))

;;;  getStartKeyBytes
(defn
 get-start-key-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getStartKeyBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getStartKey
(defn
 get-start-key
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getStartKey))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range
  ^java.lang.Object
  object0]
 (. chaincode-shim$-get-state-by-range equals object0))

;;;  STARTKEY_FIELD_NUMBER
(defn
 startkey_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/STARTKEY_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parser))

;;;  getEndKey
(defn
 get-end-key
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getEndKey))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
   chaincode-shim$-get-state-by-range0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/newBuilder
   chaincode-shim$-get-state-by-range0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetStateByRange
  chaincode-shim$-get-state-by-range]
 (. chaincode-shim$-get-state-by-range getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result toBuilder))

;;;  getQueryBytes
(defn
 get-query-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getQueryBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-get-query-result writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result
  ^java.lang.Object
  object0]
 (. chaincode-shim$-get-query-result equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result hashCode))

;;;  getQuery
(defn
 get-query
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getQuery))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
   chaincode-shim$-get-query-result0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/newBuilder
   chaincode-shim$-get-query-result0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult
  chaincode-shim$-get-query-result]
 (. chaincode-shim$-get-query-result getDefaultInstanceForType))

;;;  QUERY_FIELD_NUMBER
(defn
 query_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetQueryResult/QUERY_FIELD_NUMBER))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key toBuilder))

;;;  getKeyBytes
(defn
 get-key-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getKeyBytes))

;;;  getKey
(defn
 get-key
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getKey))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-get-history-for-key writeTo coded-output-stream0))

;;;  KEY_FIELD_NUMBER
(defn
 key_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/KEY_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key
  ^java.lang.Object
  object0]
 (. chaincode-shim$-get-history-for-key equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
   chaincode-shim$-get-history-for-key0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/newBuilder
   chaincode-shim$-get-history-for-key0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$GetHistoryForKey
  chaincode-shim$-get-history-for-key]
 (. chaincode-shim$-get-history-for-key getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next toBuilder))

;;;  getIdBytes
(defn
 get-id-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getIdBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-query-state-next writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next
  ^java.lang.Object
  object0]
 (. chaincode-shim$-query-state-next equals object0))

;;;  getId
(defn
 get-id
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getId))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parser))

;;;  ID_FIELD_NUMBER
(defn
 id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/ID_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
   chaincode-shim$-query-state-next0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/newBuilder
   chaincode-shim$-query-state-next0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateNext
  chaincode-shim$-query-state-next]
 (. chaincode-shim$-query-state-next getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close toBuilder))

;;;  getIdBytes
(defn
 get-id-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getIdBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-query-state-close writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close
  ^java.lang.Object
  object0]
 (. chaincode-shim$-query-state-close equals object0))

;;;  getId
(defn
 get-id
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getId))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parser))

;;;  ID_FIELD_NUMBER
(defn
 id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/ID_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
   chaincode-shim$-query-state-close0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/newBuilder
   chaincode-shim$-query-state-close0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryStateClose
  chaincode-shim$-query-state-close]
 (. chaincode-shim$-query-state-close getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-query-result-bytes writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  RESULTBYTES_FIELD_NUMBER
(defn
 resultbytes_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/RESULTBYTES_FIELD_NUMBER))

;;;  getResultBytes
(defn
 get-result-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes getResultBytes))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes
  ^java.lang.Object
  object0]
 (. chaincode-shim$-query-result-bytes equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
   chaincode-shim$-query-result-bytes0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/newBuilder
   chaincode-shim$-query-result-bytes0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResultBytes
  chaincode-shim$-query-result-bytes]
 (. chaincode-shim$-query-result-bytes getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
;;;

;;;  getResults
(defn
 get-results
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response
  
  int0]
 (. chaincode-shim$-query-response getResults int0))

;;;  getResultsOrBuilderList
(defn
 get-results-or-builder-list
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getResultsOrBuilderList))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getSerializedSize))

;;;  getResultsList
(defn
 get-results-list
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getResultsList))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response toBuilder))

;;;  getIdBytes
(defn
 get-id-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getIdBytes))

;;;  HAS_MORE_FIELD_NUMBER
(defn
 has_-more_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/HAS_MORE_FIELD_NUMBER))

;;;  getHasMore
(defn
 get-has-more
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getHasMore))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. chaincode-shim$-query-response writeTo coded-output-stream0))

;;;  RESULTS_FIELD_NUMBER
(defn
 results_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/RESULTS_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response
  ^java.lang.Object
  object0]
 (. chaincode-shim$-query-response equals object0))

;;;  getId
(defn
 get-id
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getId))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parser))

;;;  ID_FIELD_NUMBER
(defn
 id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/ID_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
   chaincode-shim$-query-response0]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/newBuilder
   chaincode-shim$-query-response0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getDefaultInstanceForType))

;;;  getResultsCount
(defn
 get-results-count
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response]
 (. chaincode-shim$-query-response getResultsCount))

;;;  getResultsOrBuilder
(defn
 get-results-or-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeShim$QueryResponse
  chaincode-shim$-query-response
  
  int0]
 (. chaincode-shim$-query-response getResultsOrBuilder int0))
