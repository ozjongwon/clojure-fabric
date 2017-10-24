(ns clojure-fabric.ledger
  (:import org.hyperledger.fabric.protos.common.Ledger))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Ledger
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.common.Ledger/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.common.Ledger/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.common.Ledger/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Ledger/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getSerializedSize))

;;;  CURRENTBLOCKHASH_FIELD_NUMBER
(defn
 currentblockhash_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/CURRENTBLOCKHASH_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info toBuilder))

;;;  HEIGHT_FIELD_NUMBER
(defn
 height_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/HEIGHT_FIELD_NUMBER))

;;;  getHeight
(defn
 get-height
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getHeight))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. ledger$-blockchain-info writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getCurrentBlockHash
(defn
 get-current-block-hash
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getCurrentBlockHash))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info
  ^java.lang.Object
  object0]
 (. ledger$-blockchain-info equals object0))

;;;  getPreviousBlockHash
(defn
 get-previous-block-hash
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getPreviousBlockHash))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/parseDelimitedFrom
   input-stream0)))

;;;  PREVIOUSBLOCKHASH_FIELD_NUMBER
(defn
 previousblockhash_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/PREVIOUSBLOCKHASH_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
   ledger$-blockchain-info0]
  (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/newBuilder
   ledger$-blockchain-info0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Ledger$BlockchainInfo
  ledger$-blockchain-info]
 (. ledger$-blockchain-info getDefaultInstanceForType))
