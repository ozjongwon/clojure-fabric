(ns clojure-fabric.endorser-client
  (:import org.hyperledger.fabric.sdk.EndorserClient))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.EndorserClient
;;;

;;;  sendProposalAsync
(defn
 send-proposal-async
 [^org.hyperledger.fabric.sdk.EndorserClient
  endorser-client
  ^org.hyperledger.fabric.protos.peer.FabricProposal$SignedProposal
  fabric-proposal$-signed-proposal0]
 (.
  endorser-client
  sendProposalAsync
  fabric-proposal$-signed-proposal0))

;;;  finalize
(defn
 finalize
 [^org.hyperledger.fabric.sdk.EndorserClient endorser-client]
 (. endorser-client finalize))

;;;  sendProposal
(defn
 send-proposal
 [^org.hyperledger.fabric.sdk.EndorserClient
  endorser-client
  ^org.hyperledger.fabric.protos.peer.FabricProposal$SignedProposal
  fabric-proposal$-signed-proposal0]
 (. endorser-client sendProposal fabric-proposal$-signed-proposal0))
