(ns clojure-fabric.configuration
  (:import org.hyperledger.fabric.protos.common.Configuration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.common.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.common.Configuration/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.common.Configuration/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm toBuilder))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getName))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-hashing-algorithm writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm
  ^java.lang.Object
  object0]
 (. configuration$-hashing-algorithm equals object0))

;;;  NAME_FIELD_NUMBER
(defn
 name_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/NAME_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
   configuration$-hashing-algorithm0]
  (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/newBuilder
   configuration$-hashing-algorithm0))
 ([]
  (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.common.Configuration$HashingAlgorithm
  configuration$-hashing-algorithm]
 (. configuration$-hashing-algorithm getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
;;;

;;;  WIDTH_FIELD_NUMBER
(defn
 width_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/WIDTH_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  configuration$-block-data-hashing-structure
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure isInitialized))

;;;  getWidth
(defn
 get-width
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure getWidth))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure
  ^java.lang.Object
  object0]
 (. configuration$-block-data-hashing-structure equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (. configuration$-block-data-hashing-structure hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
   configuration$-block-data-hashing-structure0]
  (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/newBuilder
   configuration$-block-data-hashing-structure0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$BlockDataHashingStructure
  configuration$-block-data-hashing-structure]
 (.
  configuration$-block-data-hashing-structure
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses toBuilder))

;;;  getAddressesBytes
(defn
 get-addresses-bytes
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses
  
  int0]
 (. configuration$-orderer-addresses getAddressesBytes int0))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-orderer-addresses writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseFrom
    
    generic-arg1))))

;;;  getAddressesList
(defn
 get-addresses-list
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getAddressesList))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses
  ^java.lang.Object
  object0]
 (. configuration$-orderer-addresses equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parser))

;;;  getAddresses
(defn
 get-addresses
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses
  
  int0]
 (. configuration$-orderer-addresses getAddresses int0))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getAddressesCount
(defn
 get-addresses-count
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getAddressesCount))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
   configuration$-orderer-addresses0]
  (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/newBuilder
   configuration$-orderer-addresses0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/getDefaultInstance))

;;;  ADDRESSES_FIELD_NUMBER
(defn
 addresses_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses/ADDRESSES_FIELD_NUMBER))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$OrdererAddresses
  configuration$-orderer-addresses]
 (. configuration$-orderer-addresses getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration$Consortium
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium toBuilder))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getName))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-consortium writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration$Consortium/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium
  ^java.lang.Object
  object0]
 (. configuration$-consortium equals object0))

;;;  NAME_FIELD_NUMBER
(defn
 name_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configuration$Consortium/NAME_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configuration$Consortium/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configuration$Consortium/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configuration$Consortium
   configuration$-consortium0]
  (org.hyperledger.fabric.protos.common.Configuration$Consortium/newBuilder
   configuration$-consortium0))
 ([]
  (org.hyperledger.fabric.protos.common.Configuration$Consortium/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configuration$Consortium/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.common.Configuration$Consortium
  configuration$-consortium]
 (. configuration$-consortium getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configuration$Capabilities
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getSerializedSize))

;;;  getCapabilitiesOrThrow
(defn
 get-capabilities-or-throw
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities
  ^java.lang.String
  string0]
 (. configuration$-capabilities getCapabilitiesOrThrow string0))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities toBuilder))

;;;  CAPABILITIES_FIELD_NUMBER
(defn
 capabilities_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configuration$Capabilities/CAPABILITIES_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configuration$-capabilities writeTo coded-output-stream0))

;;;  getCapabilities
(defn
 get-capabilities
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getCapabilities))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Configuration$Capabilities/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities
  ^java.lang.Object
  object0]
 (. configuration$-capabilities equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities hashCode))

;;;  containsCapabilities
(defn
 contains-capabilities
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities
  ^java.lang.String
  string0]
 (. configuration$-capabilities containsCapabilities string0))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configuration$Capabilities/parseDelimitedFrom
   input-stream0)))

;;;  getCapabilitiesCount
(defn
 get-capabilities-count
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getCapabilitiesCount))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configuration$Capabilities/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configuration$Capabilities
   configuration$-capabilities0]
  (org.hyperledger.fabric.protos.common.Configuration$Capabilities/newBuilder
   configuration$-capabilities0)))

;;;  getCapabilitiesOrDefault
(defn
 get-capabilities-or-default
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configuration$Capability
  configuration$-capability1]
 (.
  configuration$-capabilities
  getCapabilitiesOrDefault
  string0
  configuration$-capability1))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configuration$Capabilities/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getDefaultInstanceForType))

;;;  getCapabilitiesMap
(defn
 get-capabilities-map
 [^org.hyperledger.fabric.protos.common.Configuration$Capabilities
  configuration$-capabilities]
 (. configuration$-capabilities getCapabilitiesMap))
