(ns clojure-fabric.transaction-package
  (:import org.hyperledger.fabric.protos.peer.TransactionPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
;;;

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$SignedTransaction
  transaction-package$-signed-transaction]
 (. transaction-package$-signed-transaction getSignature))

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

;;;  getTransactionEnvelopeOrBuilder
(defn
 get-transaction-envelope-or-builder
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ProcessedTransaction
  transaction-package$-processed-transaction]
 (.
  transaction-package$-processed-transaction
  getTransactionEnvelopeOrBuilder))

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

;;;  getActions
(defn
 get-actions
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$Transaction
  transaction-package$-transaction
  
  int0]
 (. transaction-package$-transaction getActions int0))

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

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
;;;

;;;  getProposalResponsePayload
(defn
 get-proposal-response-payload
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getProposalResponsePayload))

;;;  getEndorsementsCount
(defn
 get-endorsements-count
 [^org.hyperledger.fabric.protos.peer.TransactionPackage$ChaincodeEndorsedAction
  transaction-package$-chaincode-endorsed-action]
 (.
  transaction-package$-chaincode-endorsed-action
  getEndorsementsCount))

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
