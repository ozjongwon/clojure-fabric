(ns clojure-fabric.client
  (:import [org.hyperledger.fabric.sdk HFClient]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.HFClient
;;;

;;;  newOrderer
(defn
 new-orderer
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1]
  (. hf-client newOrderer string0 string1))
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1
   ^java.util.Properties
   properties2]
  (. hf-client newOrderer string0 string1 properties2)))

;;;  queryChannels
(defn
 query-channels
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. hf-client queryChannels peer0))

;;;  sendInstallProposal
(defn
 send-install-proposal
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.InstallProposalRequest
  install-proposal-request0
  ^java.util.Collection
  collection1]
 (.
  hf-client
  sendInstallProposal
  install-proposal-request0
  collection1))

;;;  setUserContext
(defn
 set-user-context
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.User
  user0]
 (. hf-client setUserContext user0))

;;;  newTransactionProposalRequest
(defn
 new-transaction-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newTransactionProposalRequest))

;;;  newPeer
(defn
 new-peer
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1]
  (. hf-client newPeer string0 string1))
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1
   ^java.util.Properties
   properties2]
  (. hf-client newPeer string0 string1 properties2)))

;;;  getUpdateChannelConfigurationSignature
(defn
 get-update-channel-configuration-signature
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
  update-channel-configuration0
  ^org.hyperledger.fabric.sdk.User
  user1]
 (.
  hf-client
  getUpdateChannelConfigurationSignature
  update-channel-configuration0
  user1))

;;;  newEventHub
(defn
 new-event-hub
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1]
  (. hf-client newEventHub string0 string1))
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1
   ^java.util.Properties
   properties2]
  (. hf-client newEventHub string0 string1 properties2)))

;;;  newInstallProposalRequest
(defn
 new-install-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newInstallProposalRequest))

;;;  getUserContext
(defn
 get-user-context
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client getUserContext))

;;;  createNewInstance
(defn
 create-new-instance
 []
 (org.hyperledger.fabric.sdk.HFClient/createNewInstance))

;;;  newUpgradeProposalRequest
(defn
 new-upgrade-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newUpgradeProposalRequest))

;;;  getChannelConfigurationSignature
(defn
 get-channel-configuration-signature
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.ChannelConfiguration
  channel-configuration0
  ^org.hyperledger.fabric.sdk.User
  user1]
 (.
  hf-client
  getChannelConfigurationSignature
  channel-configuration0
  user1))

;;;  newInstantiationProposalRequest
(defn
 new-instantiation-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newInstantiationProposalRequest))

;;;  newChannel
(defn
 new-channel
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0
   ^org.hyperledger.fabric.sdk.Orderer
   orderer1
   ^org.hyperledger.fabric.sdk.ChannelConfiguration
   channel-configuration2
   
   bytes3]
  (.
   hf-client
   newChannel
   string0
   orderer1
   channel-configuration2
   bytes3))
 ([^org.hyperledger.fabric.sdk.HFClient
   hf-client
   ^java.lang.String
   string0]
  (. hf-client newChannel string0)))

;;;  getCryptoSuite
(defn
 get-crypto-suite
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client getCryptoSuite))

;;;  setCryptoSuite
(defn
 set-crypto-suite
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite0]
 (. hf-client setCryptoSuite crypto-suite0))

;;;  newQueryProposalRequest
(defn
 new-query-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newQueryProposalRequest))

;;;  getChannel
(defn
 get-channel
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^java.lang.String
  string0]
 (. hf-client getChannel string0))

;;;  queryInstalledChaincodes
(defn
 query-installed-chaincodes
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. hf-client queryInstalledChaincodes peer0))
