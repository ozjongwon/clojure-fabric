(ns clojure-fabric.kafka
  (:import org.hyperledger.fabric.protos.orderer.Kafka))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.orderer.Kafka/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.orderer.Kafka/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.orderer.Kafka/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getSerializedSize))

;;;  getConnect
(defn
 get-connect
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getConnect))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message toBuilder))

;;;  getTypeCase
(defn
 get-type-case
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getTypeCase))

;;;  CONNECT_FIELD_NUMBER
(defn
 connect_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/CONNECT_FIELD_NUMBER))

;;;  TIME_TO_CUT_FIELD_NUMBER
(defn
 time_-to_-cut_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/TIME_TO_CUT_FIELD_NUMBER))

;;;  getTimeToCutOrBuilder
(defn
 get-time-to-cut-or-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getTimeToCutOrBuilder))

;;;  getConnectOrBuilder
(defn
 get-connect-or-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getConnectOrBuilder))

;;;  getRegular
(defn
 get-regular
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getRegular))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. kafka$-kafka-message writeTo coded-output-stream0))

;;;  REGULAR_FIELD_NUMBER
(defn
 regular_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/REGULAR_FIELD_NUMBER))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/getDescriptor))

;;;  getRegularOrBuilder
(defn
 get-regular-or-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getRegularOrBuilder))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseFrom
    
    generic-arg1))))

;;;  getTimeToCut
(defn
 get-time-to-cut
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getTimeToCut))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message
  ^java.lang.Object
  object0]
 (. kafka$-kafka-message equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message hashCode))

;;;  hasRegular
(defn
 has-regular
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message hasRegular))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  hasConnect
(defn
 has-connect
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message hasConnect))

;;;  hasTimeToCut
(defn
 has-time-to-cut
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message hasTimeToCut))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
   kafka$-kafka-message0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/newBuilder
   kafka$-kafka-message0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessage
  kafka$-kafka-message]
 (. kafka$-kafka-message getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular toBuilder))

;;;  getConfigSeq
(defn
 get-config-seq
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getConfigSeq))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. kafka$-kafka-message-regular writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/getDescriptor))

;;;  CLASS_FIELD_NUMBER
(defn
 class_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/CLASS_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseFrom
    
    generic-arg1))))

;;;  getClass_
(defn
 get-class_
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getClass_))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular
  ^java.lang.Object
  object0]
 (. kafka$-kafka-message-regular equals object0))

;;;  CONFIG_SEQ_FIELD_NUMBER
(defn
 config_-seq_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/CONFIG_SEQ_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getClass_Value
(defn
 get-class_-value
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getClass_Value))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
   kafka$-kafka-message-regular0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/newBuilder
   kafka$-kafka-message-regular0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageRegular
  kafka$-kafka-message-regular]
 (. kafka$-kafka-message-regular getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut toBuilder))

;;;  getBlockNumber
(defn
 get-block-number
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut getBlockNumber))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. kafka$-kafka-message-time-to-cut writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut
  ^java.lang.Object
  object0]
 (. kafka$-kafka-message-time-to-cut equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
   kafka$-kafka-message-time-to-cut0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/newBuilder
   kafka$-kafka-message-time-to-cut0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/getDefaultInstance))

;;;  BLOCK_NUMBER_FIELD_NUMBER
(defn
 block_-number_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut/BLOCK_NUMBER_FIELD_NUMBER))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageTimeToCut
  kafka$-kafka-message-time-to-cut]
 (. kafka$-kafka-message-time-to-cut getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect toBuilder))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. kafka$-kafka-message-connect writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect
  ^java.lang.Object
  object0]
 (. kafka$-kafka-message-connect equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
   kafka$-kafka-message-connect0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/newBuilder
   kafka$-kafka-message-connect0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMessageConnect
  kafka$-kafka-message-connect]
 (. kafka$-kafka-message-connect getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. kafka$-kafka-metadata writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata
  ^java.lang.Object
  object0]
 (. kafka$-kafka-metadata equals object0))

;;;  LAST_OFFSET_PERSISTED_FIELD_NUMBER
(defn
 last_-offset_-persisted_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/LAST_OFFSET_PERSISTED_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getLastOffsetPersisted
(defn
 get-last-offset-persisted
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata getLastOffsetPersisted))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
   kafka$-kafka-metadata0]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/newBuilder
   kafka$-kafka-metadata0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Kafka$KafkaMetadata
  kafka$-kafka-metadata]
 (. kafka$-kafka-metadata getDefaultInstanceForType))
