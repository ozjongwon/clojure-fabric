(ns clojure-fabric.hf-client
  (:import [org.hyperledger.fabric.sdk HFClient]))

;;;
;;; HFClient
;;;
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


(defn
 query-channels
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. hf-client queryChannels peer0))


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


(defn
 set-user-context
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.User
  user0]
 (. hf-client setUserContext user0))


(defn
 new-transaction-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newTransactionProposalRequest))


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


(defn
 new-install-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newInstallProposalRequest))


(defn
 get-user-context
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client getUserContext))


(defn
 create-new-instance
 []
 (org.hyperledger.fabric.sdk.HFClient/createNewInstance))


(defn
 new-upgrade-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newUpgradeProposalRequest))


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


(defn
 new-instantiation-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newInstantiationProposalRequest))


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


(defn
 get-crypto-suite
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client getCryptoSuite))


(defn
 set-crypto-suite
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite0]
 (. hf-client setCryptoSuite crypto-suite0))


(defn
 new-query-proposal-request
 [^org.hyperledger.fabric.sdk.HFClient hf-client]
 (. hf-client newQueryProposalRequest))


(defn
 get-channel
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^java.lang.String
  string0]
 (. hf-client getChannel string0))


(defn
 query-installed-chaincodes
 [^org.hyperledger.fabric.sdk.HFClient
  hf-client
  ^org.hyperledger.fabric.sdk.Peer
  peer0]
 (. hf-client queryInstalledChaincodes peer0))

;;;;;;;;;;; Ex
(defonce hf-client (create-new-instance))

