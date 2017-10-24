(ns clojure-fabric.configuration
  (:import org.hyperledger.fabric.protos.orderer.Configuration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.orderer.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.orderer.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.orderer.Configuration/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getSerializedSize))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-consensus-type writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/getDescriptor))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/TYPE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type
  ^java.lang.Object
  object0]
 (. configuration$-consensus-type equals object0))

;;;  getTypeBytes
(defn
 get-type-bytes
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getTypeBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
   configuration$-consensus-type0]
  (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/newBuilder
   configuration$-consensus-type0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size toBuilder))

;;;  getPreferredMaxBytes
(defn
 get-preferred-max-bytes
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getPreferredMaxBytes))

;;;  getAbsoluteMaxBytes
(defn
 get-absolute-max-bytes
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getAbsoluteMaxBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-batch-size writeTo coded-output-stream0))

;;;  getMaxMessageCount
(defn
 get-max-message-count
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getMaxMessageCount))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size
  ^java.lang.Object
  object0]
 (. configuration$-batch-size equals object0))

;;;  ABSOLUTE_MAX_BYTES_FIELD_NUMBER
(defn
 absolute_-max_-bytes_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/ABSOLUTE_MAX_BYTES_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/parseDelimitedFrom
   input-stream0)))

;;;  MAX_MESSAGE_COUNT_FIELD_NUMBER
(defn
 max_-message_-count_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/MAX_MESSAGE_COUNT_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
   configuration$-batch-size0]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/newBuilder
   configuration$-batch-size0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/newBuilder)))

;;;  PREFERRED_MAX_BYTES_FIELD_NUMBER
(defn
 preferred_-max_-bytes_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/PREFERRED_MAX_BYTES_FIELD_NUMBER))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-batch-timeout writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  TIMEOUT_FIELD_NUMBER
(defn
 timeout_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/TIMEOUT_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout
  ^java.lang.Object
  object0]
 (. configuration$-batch-timeout equals object0))

;;;  getTimeoutBytes
(defn
 get-timeout-bytes
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getTimeoutBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getTimeout
(defn
 get-timeout
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getTimeout))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
   configuration$-batch-timeout0]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/newBuilder
   configuration$-batch-timeout0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchTimeout
  configuration$-batch-timeout]
 (. configuration$-batch-timeout getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers toBuilder))

;;;  BROKERS_FIELD_NUMBER
(defn
 brokers_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/BROKERS_FIELD_NUMBER))

;;;  getBrokersBytes
(defn
 get-brokers-bytes
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers
  
  int0]
 (. configuration$-kafka-brokers getBrokersBytes int0))

;;;  getBrokers
(defn
 get-brokers
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers
  
  int0]
 (. configuration$-kafka-brokers getBrokers int0))

;;;  getBrokersCount
(defn
 get-brokers-count
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getBrokersCount))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-kafka-brokers writeTo coded-output-stream0))

;;;  getBrokersList
(defn
 get-brokers-list
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getBrokersList))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers
  ^java.lang.Object
  object0]
 (. configuration$-kafka-brokers equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
   configuration$-kafka-brokers0]
  (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/newBuilder
   configuration$-kafka-brokers0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions toBuilder))

;;;  MAX_COUNT_FIELD_NUMBER
(defn
 max_-count_-field_-number
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/MAX_COUNT_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-channel-restrictions writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions
  ^java.lang.Object
  object0]
 (. configuration$-channel-restrictions equals object0))

;;;  getMaxCount
(defn
 get-max-count
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions getMaxCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/newBuilder))
 ([^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
   configuration$-channel-restrictions0]
  (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/newBuilder
   configuration$-channel-restrictions0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ChannelRestrictions
  configuration$-channel-restrictions]
 (. configuration$-channel-restrictions getDefaultInstanceForType))
