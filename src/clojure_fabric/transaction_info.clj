(ns clojure-fabric.transaction-info
  (:import org.hyperledger.fabric.sdk.TransactionInfo))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionInfo
;;;

;;;  getValidationCode
(defn
 get-validation-code
 [^org.hyperledger.fabric.sdk.TransactionInfo transaction-info]
 (. transaction-info getValidationCode))

;;;  getTransactionID
(defn
 get-transaction-id
 [^org.hyperledger.fabric.sdk.TransactionInfo transaction-info]
 (. transaction-info getTransactionID))

;;;  getEnvelope
(defn
 get-envelope
 [^org.hyperledger.fabric.sdk.TransactionInfo transaction-info]
 (. transaction-info getEnvelope))

;;;  getProcessedTransaction
(defn
 get-processed-transaction
 [^org.hyperledger.fabric.sdk.TransactionInfo transaction-info]
 (. transaction-info getProcessedTransaction))
