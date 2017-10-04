(ns clojure-fabric.block-info
  (:import org.hyperledger.fabric.sdk.BlockInfo))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo
;;;

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getChannelId))

;;;  getEnvelopeCount
(defn
 get-envelope-count
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getEnvelopeCount))

;;;  getBlockNumber
(defn
 get-block-number
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getBlockNumber))

;;;  getEnvelopeInfos
(defn
 get-envelope-infos
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getEnvelopeInfos))

;;;  getEnvelopeInfo
(defn
 get-envelope-info
 [^org.hyperledger.fabric.sdk.BlockInfo block-info  int0]
 (. block-info getEnvelopeInfo int0))

;;;  getPreviousHash
(defn
 get-previous-hash
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getPreviousHash))

;;;  getBlock
(defn
 get-block
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getBlock))

;;;  getTransActionsMetaData
(defn
 get-trans-actions-meta-data
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getTransActionsMetaData))

;;;  getTransactionActionInfos
(defn
 get-transaction-action-infos
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getTransactionActionInfos))

;;;  getDataHash
(defn
 get-data-hash
 [^org.hyperledger.fabric.sdk.BlockInfo block-info]
 (. block-info getDataHash))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$EndorserInfo
;;;

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.sdk.BlockInfo$EndorserInfo
  block-info$-endorser-info]
 (. block-info$-endorser-info getSignature))

;;;  getEndorser
(defn
 get-endorser
 [^org.hyperledger.fabric.sdk.BlockInfo$EndorserInfo
  block-info$-endorser-info]
 (. block-info$-endorser-info getEndorser))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
;;;

;;;  getValidationCode
(defn
 get-validation-code
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getValidationCode))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getType))

;;;  isValid
(defn
 is-valid
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info isValid))

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getChannelId))

;;;  getTimestamp
(defn
 get-timestamp
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getTimestamp))

;;;  getTransactionID
(defn
 get-transaction-id
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getTransactionID))

;;;  getEpoch
(defn
 get-epoch
 [^org.hyperledger.fabric.sdk.BlockInfo$EnvelopeInfo
  block-info$-envelope-info]
 (. block-info$-envelope-info getEpoch))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$EnvelopeType
;;;

;;;  values
(defn
 values
 []
 (org.hyperledger.fabric.sdk.BlockInfo$EnvelopeType/values))

;;;  valueOf
(defn
 value-of
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.BlockInfo$EnvelopeType/valueOf string0))

;;;  ENVELOPE
(defn
 envelope
 []
 (org.hyperledger.fabric.sdk.BlockInfo$EnvelopeType/ENVELOPE))

;;;  TRANSACTION_ENVELOPE
(defn
 transaction_-envelope
 []
 (org.hyperledger.fabric.sdk.BlockInfo$EnvelopeType/TRANSACTION_ENVELOPE))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
;;;

;;;  org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
(defn
 block-info$-transaction-envelope-info
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info$-transaction-envelope-info
  ^org.hyperledger.fabric.sdk.BlockInfo
  block-info0
  ^org.hyperledger.fabric.sdk.EndorserTransactionEnvDeserializer
  endorser-transaction-env-deserializer1
  
  int2]
 (.
  block-info$-transaction-envelope-info
  org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info0
  endorser-transaction-env-deserializer1
  int2))

;;;  getTransactionActionInfo
(defn
 get-transaction-action-info
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info$-transaction-envelope-info
  
  int0]
 (.
  block-info$-transaction-envelope-info
  getTransactionActionInfo
  int0))

;;;  getTransactionActionInfoCount
(defn
 get-transaction-action-info-count
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info$-transaction-envelope-info]
 (.
  block-info$-transaction-envelope-info
  getTransactionActionInfoCount))

;;;  getTransactionActionInfos
(defn
 get-transaction-action-infos
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info$-transaction-envelope-info]
 (. block-info$-transaction-envelope-info getTransactionActionInfos))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
;;;

;;;  getEndorsementInfo
(defn
 get-endorsement-info
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info
  
  int0]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getEndorsementInfo
  int0))

;;;  getResponseMessage
(defn
 get-response-message
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getResponseMessage))

;;;  getProposalResponsePayload
(defn
 get-proposal-response-payload
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getProposalResponsePayload))

;;;  getProposalResponseStatus
(defn
 get-proposal-response-status
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getProposalResponseStatus))

;;;  getEndorsementsCount
(defn
 get-endorsements-count
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getEndorsementsCount))

;;;  getChaincodeInputArgs
(defn
 get-chaincode-input-args
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info
  
  int0]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getChaincodeInputArgs
  int0))

;;;  getResponseStatus
(defn
 get-response-status
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getResponseStatus))

;;;  getTxReadWriteSet
(defn
 get-tx-read-write-set
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getTxReadWriteSet))

;;;  getChaincodeInputArgsCount
(defn
 get-chaincode-input-args-count
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getChaincodeInputArgsCount))

;;;  getResponseMessageBytes
(defn
 get-response-message-bytes
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getResponseMessageBytes))

;;;  getProposalResponseMessageBytes
(defn
 get-proposal-response-message-bytes
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfo
  block-info$-transaction-envelope-info$-transaction-action-info]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info
  getProposalResponseMessageBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfoIterator
;;;

;;;  hasNext
(defn
 has-next
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfoIterator
  block-info$-transaction-envelope-info$-transaction-action-info-iterator]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info-iterator
  hasNext))

;;;  next
(defn
 next
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionInfoIterator
  block-info$-transaction-envelope-info$-transaction-action-info-iterator]
 (.
  block-info$-transaction-envelope-info$-transaction-action-info-iterator
  next))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionIterable
;;;

;;;  iterator
(defn
 iterator
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionIterable
  block-info$-transaction-envelope-info$-transaction-action-iterable]
 (.
  block-info$-transaction-envelope-info$-transaction-action-iterable
  iterator))

;;;  org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionIterable
(defn
 block-info$-transaction-envelope-info$-transaction-action-iterable
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionIterable
  block-info$-transaction-envelope-info$-transaction-action-iterable
  ^org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo
  block-info$-transaction-envelope-info0]
 (.
  block-info$-transaction-envelope-info$-transaction-action-iterable
  org.hyperledger.fabric.sdk.BlockInfo$TransactionEnvelopeInfo$TransactionActionIterable
  block-info$-transaction-envelope-info0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionInfoIterable
;;;

;;;  iterator
(defn
 iterator
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionInfoIterable
  block-info$-transaction-info-iterable]
 (. block-info$-transaction-info-iterable iterator))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockInfo$TransactionInfoIterator
;;;

;;;  next
(defn
 next
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionInfoIterator
  block-info$-transaction-info-iterator]
 (. block-info$-transaction-info-iterator next))

;;;  hasNext
(defn
 has-next
 [^org.hyperledger.fabric.sdk.BlockInfo$TransactionInfoIterator
  block-info$-transaction-info-iterator]
 (. block-info$-transaction-info-iterator hasNext))
