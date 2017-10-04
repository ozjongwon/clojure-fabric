(ns clojure-fabric.transaction-builder
  (:import org.hyperledger.fabric.sdk.transaction.TransactionBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.TransactionBuilder
;;;

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.TransactionBuilder
  transaction-builder]
 (. transaction-builder build))

;;;  chaincodeProposal
(defn
 chaincode-proposal
 [^org.hyperledger.fabric.sdk.transaction.TransactionBuilder
  transaction-builder
  ^org.hyperledger.fabric.protos.peer.FabricProposal$Proposal
  fabric-proposal$-proposal0]
 (. transaction-builder chaincodeProposal fabric-proposal$-proposal0))

;;;  org.hyperledger.fabric.sdk.transaction.TransactionBuilder
(defn
 transaction-builder
 [^org.hyperledger.fabric.sdk.transaction.TransactionBuilder
  transaction-builder]
 (.
  transaction-builder
  org.hyperledger.fabric.sdk.transaction.TransactionBuilder))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.TransactionBuilder/newBuilder))

;;;  endorsements
(defn
 endorsements
 [^org.hyperledger.fabric.sdk.transaction.TransactionBuilder
  transaction-builder
  ^java.util.Collection
  collection0]
 (. transaction-builder endorsements collection0))

;;;  proposalResponsePayload
(defn
 proposal-response-payload
 [^org.hyperledger.fabric.sdk.transaction.TransactionBuilder
  transaction-builder
  ^com.google.protobuf.ByteString
  byte-string0]
 (. transaction-builder proposalResponsePayload byte-string0))
