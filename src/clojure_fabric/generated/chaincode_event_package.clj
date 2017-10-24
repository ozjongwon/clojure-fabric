(ns clojure-fabric.chaincode-event-package
  (:import org.hyperledger.fabric.protos.peer.ChaincodeEventPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getSerializedSize))

;;;  EVENT_NAME_FIELD_NUMBER
(defn
 event_-name_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/EVENT_NAME_FIELD_NUMBER))

;;;  CHAINCODE_ID_FIELD_NUMBER
(defn
 chaincode_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/CHAINCODE_ID_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event toBuilder))

;;;  getEventName
(defn
 get-event-name
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getEventName))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  chaincode-event-package$-chaincode-event
  writeTo
  coded-output-stream0))

;;;  getTxId
(defn
 get-tx-id
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getTxId))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseFrom
    
    generic-arg1))))

;;;  TX_ID_FIELD_NUMBER
(defn
 tx_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/TX_ID_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event
  ^java.lang.Object
  object0]
 (. chaincode-event-package$-chaincode-event equals object0))

;;;  getEventNameBytes
(defn
 get-event-name-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getEventNameBytes))

;;;  getTxIdBytes
(defn
 get-tx-id-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getTxIdBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event hashCode))

;;;  getChaincodeIdBytes
(defn
 get-chaincode-id-bytes
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getChaincodeIdBytes))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getChaincodeId
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getChaincodeId))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
   chaincode-event-package$-chaincode-event0]
  (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/newBuilder
   chaincode-event-package$-chaincode-event0))
 ([]
  (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.ChaincodeEventPackage$ChaincodeEvent
  chaincode-event-package$-chaincode-event]
 (. chaincode-event-package$-chaincode-event getDefaultInstanceForType))
