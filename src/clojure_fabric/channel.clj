(ns clojure-fabric.channel
  (:import [org.hyperledger.fabric.sdk Channel]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.Channel
;;;

;;;  queryBlockByNumber
(defn
 query-block-by-number
 ([^org.hyperledger.fabric.sdk.Channel channel ^long long0]
  (. channel queryBlockByNumber long0))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.Peer
   peer0
   ^long
   long1]
  (. channel queryBlockByNumber peer0 long1)))

;;;  addOrderer
(defn
 add-orderer
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.Orderer
  orderer0]
 (. channel addOrderer orderer0))

;;;  queryBlockByTransactionID
(defn
 query-block-by-transaction-id
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^java.lang.String
   string0]
  (. channel queryBlockByTransactionID string0))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.Peer
   peer0
   ^java.lang.String
   string1]
  (. channel queryBlockByTransactionID peer0 string1)))

;;;  getPeers
(defn
 get-peers
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getPeers))

;;;  shutdown
(defn
 shutdown
 [^org.hyperledger.fabric.sdk.Channel channel  boolean0]
 (. channel shutdown boolean0))

;;;  sendInstantiationProposal
(defn
 send-instantiation-proposal
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.InstantiateProposalRequest
   instantiate-proposal-request0]
  (. channel sendInstantiationProposal instantiate-proposal-request0))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.InstantiateProposalRequest
   instantiate-proposal-request0
   ^java.util.Collection
   collection1]
  (.
   channel
   sendInstantiationProposal
   instantiate-proposal-request0
   collection1)))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getName))

;;;  getEventHubs
(defn
 get-event-hubs
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getEventHubs))

;;;  updateChannelConfiguration
(defn
 update-channel-configuration
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
   update-channel-configuration0
   ^org.hyperledger.fabric.sdk.Orderer
   orderer1
   
   bytes2]
  (.
   channel
   updateChannelConfiguration
   update-channel-configuration0
   orderer1
   bytes2))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
   update-channel-configuration0
   
   bytes1]
  (.
   channel
   updateChannelConfiguration
   update-channel-configuration0
   bytes1)))

;;;  setTransactionWaitTime
(defn
 set-transaction-wait-time
 [^org.hyperledger.fabric.sdk.Channel channel  int0]
 (. channel setTransactionWaitTime int0))

;;;  getTransactionWaitTime
(defn
 get-transaction-wait-time
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getTransactionWaitTime))

;;;  addEventHub
(defn
 add-event-hub
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.EventHub
  event-hub0]
 (. channel addEventHub event-hub0))

;;;  getUpdateChannelConfigurationSignature
(defn
 get-update-channel-configuration-signature
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
  update-channel-configuration0
  ^org.hyperledger.fabric.sdk.User
  user1]
 (.
  channel
  getUpdateChannelConfigurationSignature
  update-channel-configuration0
  user1))

;;;  queryByChaincode
(defn
 query-by-chaincode
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.QueryByChaincodeRequest
   query-by-chaincode-request0
   ^java.util.Collection
   collection1]
  (. channel queryByChaincode query-by-chaincode-request0 collection1))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.QueryByChaincodeRequest
   query-by-chaincode-request0]
  (. channel queryByChaincode query-by-chaincode-request0)))

;;;  sendTransaction
(defn
 send-transaction
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^java.util.Collection
   collection0
   ^java.util.Collection
   collection1
   ^org.hyperledger.fabric.sdk.User
   user2]
  (. channel sendTransaction collection0 collection1 user2))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^java.util.Collection
   collection0
   generic-arg1]
  (cond
   (instance? java.util.Collection generic-arg1)
   (.
    channel
    sendTransaction
    collection0
    ^java.util.Collection
    generic-arg1)
   (instance? org.hyperledger.fabric.sdk.User generic-arg1)
   (.
    channel
    sendTransaction
    collection0
    ^org.hyperledger.fabric.sdk.User
    generic-arg1)))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^java.util.Collection
   collection0]
  (. channel sendTransaction collection0)))

;;;  queryBlockByHash
(defn
 query-block-by-hash
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.Peer
   peer0
   
   bytes1]
  (. channel queryBlockByHash peer0 bytes1))
 ([^org.hyperledger.fabric.sdk.Channel channel  bytes0]
  (. channel queryBlockByHash bytes0)))

;;;  addPeer
(defn
 add-peer
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. channel addPeer peer0))

;;;  getDeployWaitTime
(defn
 get-deploy-wait-time
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getDeployWaitTime))

;;;  isShutdown
(defn
 is-shutdown
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel isShutdown))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel isInitialized))

;;;  setDeployWaitTime
(defn
 set-deploy-wait-time
 [^org.hyperledger.fabric.sdk.Channel channel  int0]
 (. channel setDeployWaitTime int0))

;;;  initialize
(defn
 initialize
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel initialize))

;;;  sendTransactionProposal
(defn
 send-transaction-proposal
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.TransactionProposalRequest
   transaction-proposal-request0]
  (. channel sendTransactionProposal transaction-proposal-request0))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.TransactionProposalRequest
   transaction-proposal-request0
   ^java.util.Collection
   collection1]
  (.
   channel
   sendTransactionProposal
   transaction-proposal-request0
   collection1)))

;;;  getOrderers
(defn
 get-orderers
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getOrderers))

;;;  getChannelConfigurationBytes
(defn
 get-channel-configuration-bytes
 [^org.hyperledger.fabric.sdk.Channel channel]
 (. channel getChannelConfigurationBytes))

;;;  sendUpgradeProposal
(defn
 send-upgrade-proposal
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.UpgradeProposalRequest
   upgrade-proposal-request0]
  (. channel sendUpgradeProposal upgrade-proposal-request0))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.UpgradeProposalRequest
   upgrade-proposal-request0
   ^java.util.Collection
   collection1]
  (.
   channel
   sendUpgradeProposal
   upgrade-proposal-request0
   collection1)))

;;;  queryTransactionByID
(defn
 query-transaction-by-id
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.Peer
   peer0
   ^java.lang.String
   string1]
  (. channel queryTransactionByID peer0 string1))
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^java.lang.String
   string0]
  (. channel queryTransactionByID string0)))

;;;  queryInstantiatedChaincodes
(defn
 query-instantiated-chaincodes
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. channel queryInstantiatedChaincodes peer0))

;;;  registerBlockListener
(defn
 register-block-listener
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.BlockListener
  block-listener0]
 (. channel registerBlockListener block-listener0))

;;;  joinPeer
(defn
 join-peer
 [^org.hyperledger.fabric.sdk.Channel
  channel
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. channel joinPeer peer0))

;;;  queryBlockchainInfo
(defn
 query-blockchain-info
 ([^org.hyperledger.fabric.sdk.Channel
   channel
   ^org.hyperledger.fabric.sdk.Peer
   peer0]
  (. channel queryBlockchainInfo peer0))
 ([^org.hyperledger.fabric.sdk.Channel channel]
  (. channel queryBlockchainInfo)))
