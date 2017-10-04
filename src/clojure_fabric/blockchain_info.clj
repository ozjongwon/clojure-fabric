(ns clojure-fabric.blockchain-info
  (:import org.hyperledger.fabric.sdk.BlockchainInfo))

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
