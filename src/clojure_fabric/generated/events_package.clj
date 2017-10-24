(ns clojure-fabric.events-package
  (:import org.hyperledger.fabric.protos.peer.EventsPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
;;;

;;;  getEventName
(defn
 get-event-name
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getEventName))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg
  ^java.lang.Object
  object0]
 (. events-package$-chaincode-reg equals object0))

;;;  getEventNameBytes
(defn
 get-event-name-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getEventNameBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg hashCode))

;;;  getChaincodeIdBytes
(defn
 get-chaincode-id-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getChaincodeIdBytes))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/parseDelimitedFrom
   input-stream0)))

;;;  getChaincodeId
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getChaincodeId))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
   events-package$-chaincode-reg0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/newBuilder
   events-package$-chaincode-reg0))
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$ChaincodeReg
  events-package$-chaincode-reg]
 (. events-package$-chaincode-reg getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$Interest
;;;

;;;  getEventType
(defn
 get-event-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getEventType))

;;;  getRegInfoCase
(defn
 get-reg-info-case
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getRegInfoCase))

;;;  hasChaincodeRegInfo
(defn
 has-chaincode-reg-info
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest hasChaincodeRegInfo))

;;;  getChainID
(defn
 get-chain-id
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getChainID))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseFrom
    
    generic-arg1))))

;;;  getChaincodeRegInfo
(defn
 get-chaincode-reg-info
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getChaincodeRegInfo))

;;;  getChaincodeRegInfoOrBuilder
(defn
 get-chaincode-reg-info-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getChaincodeRegInfoOrBuilder))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest
  ^java.lang.Object
  object0]
 (. events-package$-interest equals object0))

;;;  getChainIDBytes
(defn
 get-chain-id-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getChainIDBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
   events-package$-interest0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/newBuilder
   events-package$-interest0))
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Interest/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Interest
  events-package$-interest]
 (. events-package$-interest getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$Register
;;;

;;;  getEvents
(defn
 get-events
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register
  
  int0]
 (. events-package$-register getEvents int0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register
  ^java.lang.Object
  object0]
 (. events-package$-register equals object0))

;;;  getEventsCount
(defn
 get-events-count
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register getEventsCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parser))

;;;  getEventsOrBuilder
(defn
 get-events-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register
  
  int0]
 (. events-package$-register getEventsOrBuilder int0))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Register/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Register/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$Register
   events-package$-register0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Register/newBuilder
   events-package$-register0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Register/getDefaultInstance))

;;;  getEventsOrBuilderList
(defn
 get-events-or-builder-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register getEventsOrBuilderList))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register getDefaultInstanceForType))

;;;  getEventsList
(defn
 get-events-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Register
  events-package$-register]
 (. events-package$-register getEventsList))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
;;;

;;;  getErrorMsg
(defn
 get-error-msg
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getErrorMsg))

;;;  getTxOrBuilder
(defn
 get-tx-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getTxOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection
  ^java.lang.Object
  object0]
 (. events-package$-rejection equals object0))

;;;  hasTx
(defn
 has-tx
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection hasTx))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getErrorMsgBytes
(defn
 get-error-msg-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getErrorMsgBytes))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
   events-package$-rejection0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/newBuilder
   events-package$-rejection0))
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Rejection/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getDefaultInstanceForType))

;;;  getTx
(defn
 get-tx
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Rejection
  events-package$-rejection]
 (. events-package$-rejection getTx))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
;;;

;;;  getEvents
(defn
 get-events
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister
  
  int0]
 (. events-package$-unregister getEvents int0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister
  ^java.lang.Object
  object0]
 (. events-package$-unregister equals object0))

;;;  getEventsCount
(defn
 get-events-count
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister getEventsCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parser))

;;;  getEventsOrBuilder
(defn
 get-events-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister
  
  int0]
 (. events-package$-unregister getEventsOrBuilder int0))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
   events-package$-unregister0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/newBuilder
   events-package$-unregister0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Unregister/getDefaultInstance))

;;;  getEventsOrBuilderList
(defn
 get-events-or-builder-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister getEventsOrBuilderList))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister getDefaultInstanceForType))

;;;  getEventsList
(defn
 get-events-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Unregister
  events-package$-unregister]
 (. events-package$-unregister getEventsList))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
;;;

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getChannelId))

;;;  getFilteredTxList
(defn
 get-filtered-tx-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getFilteredTxList))

;;;  getFilteredTxCount
(defn
 get-filtered-tx-count
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getFilteredTxCount))

;;;  getFilteredTxOrBuilderList
(defn
 get-filtered-tx-or-builder-list
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getFilteredTxOrBuilderList))

;;;  getFilteredTx
(defn
 get-filtered-tx
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block
  
  int0]
 (. events-package$-filtered-block getFilteredTx int0))

;;;  getChannelIdBytes
(defn
 get-channel-id-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getChannelIdBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block
  ^java.lang.Object
  object0]
 (. events-package$-filtered-block equals object0))

;;;  getNumber
(defn
 get-number
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getNumber))

;;;  getFilteredTxOrBuilder
(defn
 get-filtered-tx-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block
  
  int0]
 (. events-package$-filtered-block getFilteredTxOrBuilder int0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
   events-package$-filtered-block0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/newBuilder
   events-package$-filtered-block0))
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredBlock
  events-package$-filtered-block]
 (. events-package$-filtered-block getDefaultInstanceForType))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
;;;

;;;  getTxidBytes
(defn
 get-txid-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getTxidBytes))

;;;  hasCcEvent
(defn
 has-cc-event
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction hasCcEvent))

;;;  getTxValidationCode
(defn
 get-tx-validation-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getTxValidationCode))

;;;  getTxid
(defn
 get-txid
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getTxid))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseFrom
    
    generic-arg1))))

;;;  getCcEventOrBuilder
(defn
 get-cc-event-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getCcEventOrBuilder))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction
  ^java.lang.Object
  object0]
 (. events-package$-filtered-transaction equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parser))

;;;  getCcEvent
(defn
 get-cc-event
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getCcEvent))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
   events-package$-filtered-transaction0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/newBuilder
   events-package$-filtered-transaction0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$FilteredTransaction
  events-package$-filtered-transaction]
 (. events-package$-filtered-transaction getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
;;;
;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event getSignature))

;;;  getEventBytes
(defn
 get-event-bytes
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event getEventBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event
  ^java.lang.Object
  object0]
 (. events-package$-signed-event equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
   events-package$-signed-event0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/newBuilder
   events-package$-signed-event0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$SignedEvent
  events-package$-signed-event]
 (. events-package$-signed-event getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.EventsPackage$Event
;;;

;;;  hasRegister
(defn
 has-register
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasRegister))

;;;  getChaincodeEventOrBuilder
(defn
 get-chaincode-event-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getChaincodeEventOrBuilder))

;;;  getRejectionOrBuilder
(defn
 get-rejection-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getRejectionOrBuilder))

;;;  getFilteredBlockOrBuilder
(defn
 get-filtered-block-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getFilteredBlockOrBuilder))

;;;  getUnregister
(defn
 get-unregister
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getUnregister))

;;;  hasBlock
(defn
 has-block
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasBlock))

;;;  hasUnregister
(defn
 has-unregister
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasUnregister))

;;;  getBlock
(defn
 get-block
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getBlock))

;;;  getUnregisterOrBuilder
(defn
 get-unregister-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getUnregisterOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseFrom
    
    generic-arg1))))

;;;  hasFilteredBlock
(defn
 has-filtered-block
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasFilteredBlock))

;;;  hasChaincodeEvent
(defn
 has-chaincode-event
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasChaincodeEvent))

;;;  getRegisterOrBuilder
(defn
 get-register-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getRegisterOrBuilder))

;;;  getRejection
(defn
 get-rejection
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getRejection))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event isInitialized))

;;;  getFilteredBlock
(defn
 get-filtered-block
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getFilteredBlock))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event
  ^java.lang.Object
  object0]
 (. events-package$-event equals object0))

;;;  getEventCase
(defn
 get-event-case
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getEventCase))

;;;  getRegister
(defn
 get-register
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getRegister))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parser))

;;;  getCreator
(defn
 get-creator
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getCreator))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Event/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  hasRejection
(defn
 has-rejection
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event hasRejection))

;;;  getChaincodeEvent
(defn
 get-chaincode-event
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getChaincodeEvent))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.EventsPackage$Event
   events-package$-event0]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Event/newBuilder
   events-package$-event0))
 ([]
  (org.hyperledger.fabric.protos.peer.EventsPackage$Event/newBuilder)))

;;;  getBlockOrBuilder
(defn
 get-block-or-builder
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getBlockOrBuilder))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.EventsPackage$Event/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.EventsPackage$Event
  events-package$-event]
 (. events-package$-event getDefaultInstanceForType))
