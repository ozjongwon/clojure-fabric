(ns clojure-fabric.response
  (:import [org.hyperledger.fabric.sdk ProposalResponse]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ProposalResponse
;;;

;;;  setProposalResponse
(defn
 set-proposal-response
 [^org.hyperledger.fabric.sdk.ProposalResponse
  proposal-response
  ^org.hyperledger.fabric.protos.peer.FabricProposalResponse$ProposalResponse
  fabric-proposal-response$-proposal-response0]
 (.
  proposal-response
  setProposalResponse
  fabric-proposal-response$-proposal-response0))

;;;  getChaincodeActionResponseStatus
(defn
 get-chaincode-action-response-status
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getChaincodeActionResponseStatus))

;;;  getChaincodeID
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getChaincodeID))

;;;  setProposal
(defn
 set-proposal
 [^org.hyperledger.fabric.sdk.ProposalResponse
  proposal-response
  ^org.hyperledger.fabric.protos.peer.FabricProposal$SignedProposal
  fabric-proposal$-signed-proposal0]
 (. proposal-response setProposal fabric-proposal$-signed-proposal0))

;;;  getChaincodeActionResponsePayload
(defn
 get-chaincode-action-response-payload
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getChaincodeActionResponsePayload))

;;;  getChaincodeActionResponseReadWriteSetInfo
(defn
 get-chaincode-action-response-read-write-set-info
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getChaincodeActionResponseReadWriteSetInfo))

;;;  getProposalResponse
(defn
 get-proposal-response
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getProposalResponse))

;;;  getPeer
(defn
 get-peer
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getPeer))

;;;  isVerified
(defn
 is-verified
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response isVerified))

;;;  getProposal
(defn
 get-proposal
 [^org.hyperledger.fabric.sdk.ProposalResponse proposal-response]
 (. proposal-response getProposal))

;;;  verify
(defn
 verify
 [^org.hyperledger.fabric.sdk.ProposalResponse
  proposal-response
  ^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite0]
 (. proposal-response verify crypto-suite0))
