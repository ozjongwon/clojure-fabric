(ns clojure-fabric.transaction-package
  (:import org.hyperledger.fabric.protos.peer.TransactionPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.TransactionPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.TransactionPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.TransactionPackage/registerAllExtensions
   generic-arg1)))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage/getDescriptor))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  transaction-package$-signed-transaction
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/getDescriptor))

;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction
  ^java.lang.Object
  object0]
 (. transaction-package$-signed-transaction equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/parseDelimitedFrom
   input-stream0)))

;;;  TRANSACTION_BYTES_FIELD_NUMBER
(defn
 transaction_-bytes_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/TRANSACTION_BYTES_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
   transaction-package$-signed-transaction0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/newBuilder
   transaction-package$-signed-transaction0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getDefaultInstanceForType))

;;;  getTransactionBytes
(defn
 get-transaction-bytes
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getTransactionBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction toBuilder))

;;;  getTransactionEnvelope
(defn
 get-transaction-envelope
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction getTransactionEnvelope))

;;;  getValidationCode
(defn
 get-validation-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction getValidationCode))

;;;  VALIDATIONCODE_FIELD_NUMBER
(defn
 validationcode_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/VALIDATIONCODE_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  transaction-package$-processed-transaction
  writeTo
  coded-output-stream0))

;;;  getTransactionEnvelopeOrBuilder
(defn
 get-transaction-envelope-or-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (.
  transaction-package$-processed-transaction
  getTransactionEnvelopeOrBuilder))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/getDescriptor))

;;;  hasTransactionEnvelope
(defn
 has-transaction-envelope
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction hasTransactionEnvelope))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction
  ^java.lang.Object
  object0]
 (. transaction-package$-processed-transaction equals object0))

;;;  TRANSACTIONENVELOPE_FIELD_NUMBER
(defn
 transactionenvelope_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/TRANSACTIONENVELOPE_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (. transaction-package$-processed-transaction hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
   transaction-package$-processed-transaction0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/newBuilder
   transaction-package$-processed-transaction0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (.
  transaction-package$-processed-transaction
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction toBuilder))

;;;  ACTIONS_FIELD_NUMBER
(defn
 actions_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/ACTIONS_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. transaction-package$-transaction writeTo coded-output-stream0))

;;;  getActions
(defn
 get-actions
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction
  
  int0]
 (. transaction-package$-transaction getActions int0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction
  ^java.lang.Object
  object0]
 (. transaction-package$-transaction equals object0))

;;;  getActionsCount
(defn
 get-actions-count
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getActionsCount))

;;;  getActionsOrBuilderList
(defn
 get-actions-or-builder-list
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getActionsOrBuilderList))

;;;  getActionsOrBuilder
(defn
 get-actions-or-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction
  
  int0]
 (. transaction-package$-transaction getActionsOrBuilder int0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getActionsList
(defn
 get-actions-list
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getActionsList))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
   transaction-package$-transaction0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/newBuilder
   transaction-package$-transaction0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction]
 (. transaction-package$-transaction getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action toBuilder))

;;;  PAYLOAD_FIELD_NUMBER
(defn
 payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/PAYLOAD_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  transaction-package$-transaction-action
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/getDescriptor))

;;;  HEADER_FIELD_NUMBER
(defn
 header_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/HEADER_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action
  ^java.lang.Object
  object0]
 (. transaction-package$-transaction-action equals object0))

;;;  getHeader
(defn
 get-header
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getHeader))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
   transaction-package$-transaction-action0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/newBuilder
   transaction-package$-transaction-action0))
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction/getDefaultInstance))

;;;  getPayload
(defn
 get-payload
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getPayload))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$TransactionAction
  transaction-package$-transaction-action]
 (. transaction-package$-transaction-action getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
;;;

;;;  ACTION_FIELD_NUMBER
(defn
 action_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/ACTION_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload toBuilder))

;;;  hasAction
(defn
 has-action
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload hasAction))

;;;  getAction
(defn
 get-action
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload getAction))

;;;  getActionOrBuilder
(defn
 get-action-or-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload getActionOrBuilder))

;;;  getChaincodeProposalPayload
(defn
 get-chaincode-proposal-payload
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (.
  transaction-package$-chaincode-action-payload
  getChaincodeProposalPayload))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  transaction-package$-chaincode-action-payload
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload
  ^java.lang.Object
  object0]
 (. transaction-package$-chaincode-action-payload equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (. transaction-package$-chaincode-action-payload hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
   transaction-package$-chaincode-action-payload0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/newBuilder
   transaction-package$-chaincode-action-payload0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload
  transaction-package$-chaincode-action-payload]
 (.
  transaction-package$-chaincode-action-payload
  getDefaultInstanceForType))

;;;  CHAINCODE_PROPOSAL_PAYLOAD_FIELD_NUMBER
(defn
 chaincode_-proposal_-payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeActionPayload/CHAINCODE_PROPOSAL_PAYLOAD_FIELD_NUMBER))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action getSerializedSize))

;;;  getProposalResponsePayload
(defn
 get-proposal-response-payload
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getProposalResponsePayload))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action toBuilder))

;;;  getEndorsementsCount
(defn
 get-endorsements-count
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getEndorsementsCount))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  transaction-package$-chaincode-endorsed-action
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/getDescriptor))

;;;  ENDORSEMENTS_FIELD_NUMBER
(defn
 endorsements_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/ENDORSEMENTS_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseFrom
    
    generic-arg1))))

;;;  PROPOSAL_RESPONSE_PAYLOAD_FIELD_NUMBER
(defn
 proposal_-response_-payload_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/PROPOSAL_RESPONSE_PAYLOAD_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action isInitialized))

;;;  getEndorsementsList
(defn
 get-endorsements-list
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action getEndorsementsList))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action
  ^java.lang.Object
  object0]
 (. transaction-package$-chaincode-endorsed-action equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (. transaction-package$-chaincode-endorsed-action hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getEndorsementsOrBuilder
(defn
 get-endorsements-or-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action
  
  int0]
 (.
  transaction-package$-chaincode-endorsed-action
  getEndorsementsOrBuilder
  int0))

;;;  getEndorsementsOrBuilderList
(defn
 get-endorsements-or-builder-list
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getEndorsementsOrBuilderList))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
   transaction-package$-chaincode-endorsed-action0]
  (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/newBuilder
   transaction-package$-chaincode-endorsed-action0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction/getDefaultInstance))

;;;  getEndorsements
(defn
 get-endorsements
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action
  
  int0]
 (.
  transaction-package$-chaincode-endorsed-action
  getEndorsements
  int0))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getDefaultInstanceForType))
