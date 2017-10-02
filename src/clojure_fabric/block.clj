(ns clojure-fabric.block
  (:import [org.hyperledger.fabric.sdk BlockInfo BlockEvent BlockChainInfo]))

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
;;;org.hyperledger.fabric.sdk.BlockEvent
;;;

;;;  getEvent
(defn
 get-event
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getEvent))

;;;  getTransactionEvents
(defn
 get-transaction-events
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getTransactionEvents))

;;;  getEventHub
(defn
 get-event-hub
 [^org.hyperledger.fabric.sdk.BlockEvent block-event]
 (. block-event getEventHub))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockchainInfo
;;;

;;;  getPreviousBlockHash
(defn
 get-previous-block-hash
 [^org.hyperledger.fabric.sdk.BlockchainInfo blockchain-info]
 (. blockchain-info getPreviousBlockHash))

;;;  getBlockchainInfo
(defn
 get-blockchain-info
 [^org.hyperledger.fabric.sdk.BlockchainInfo blockchain-info]
 (. blockchain-info getBlockchainInfo))

;;;  getCurrentBlockHash
(defn
 get-current-block-hash
 [^org.hyperledger.fabric.sdk.BlockchainInfo blockchain-info]
 (. blockchain-info getCurrentBlockHash))

;;;  getHeight
(defn
 get-height
 [^org.hyperledger.fabric.sdk.BlockchainInfo blockchain-info]
 (. blockchain-info getHeight))

