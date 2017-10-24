(ns clojure-fabric.configuration
  (:import org.hyperledger.fabric.protos.orderer.Configuration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
;;;

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.orderer.Configuration$ConsensusType
  configuration$-consensus-type]
 (. configuration$-consensus-type getType))

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

;;;  getMaxMessageCount
(defn
 get-max-message-count
 [^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
  configuration$-batch-size]
 (. configuration$-batch-size getMaxMessageCount))

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


;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.orderer.Configuration$BatchSize
   configuration$-batch-size0]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/newBuilder
   configuration$-batch-size0))
 ([]
  (org.hyperledger.fabric.protos.orderer.Configuration$BatchSize/newBuilder)))


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

;;;  getBrokersList
(defn
 get-brokers-list
 [^org.hyperledger.fabric.protos.orderer.Configuration$KafkaBrokers
  configuration$-kafka-brokers]
 (. configuration$-kafka-brokers getBrokersList))

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
