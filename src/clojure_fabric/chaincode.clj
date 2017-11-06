;; Copyright 2017 Jong-won Choi <oz.jongwon.choi@gmail.com>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

;;
;; http://hyperledgerdocs.readthedocs.io/en/latest/glossary.html
;; System Chaincode
;; System Chaincode (SCC) is a chaincode built with the peer and run in the same process as
;; the peer. SCC is responsible for broader configurations of fabric behavior, such as timing
;; and naming services.
;;
;; Lifecycle System Chaincode
;; Lifecycle System Chaincode (LSCC) is a system chaincode that handles deployment, upgrade and
;; termination transactions for user chaincodes.
;;
;; Configuration System Chaincode
;; Configuration System Chaincode (CSCC) is a “management” system chaincode that handles
;; configuration requests to alter an aspect of a channel (e.g. add a new member).  The CSCC will
;; interrogate the channel’s policies to determine if a new configuration block can be created.
;;
;; Endorsement System Chaincode
;; Endorsement System Chaincode (ESCC) is a system chaincode that andles the endorsement policy
;; for specific pieces of chaincode deployed on a network, and defines the necessary parameters
;; (percentage or combination of signatures from endorsing peers) for a transaction proposal to
;; receive a successful proposal response (i.e. endorsement).  Deployments and invocations of
;; user chaincodes both require a corresponding ESCC, which is defined at the time of the deployment
;; transaction proposal for the user chaincode.
;;
;; Validation System Chaincode
;; Validation System Chaincode (VSCC) Handles the validation policy for specific pieces of chaincode
;; deployed on a network.  Deployments and invocations of user chaincodes both require a
;; corresponding VSCC, which is defined at the time of the deployment transaction proposal for
;; the user chaincode. VSCC validates the specified level of “endorsement” (i.e. endorsement policy)
;; in order to prevent malicious or faulty behavior from the client.
;;
;; Implementation Note:
;;      Support only CSCC, QSCC, and LSCC (from Node.js)
(ns clojure-fabric.chaincode
  (:require [clojure-fabric.core :as core]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.proto :as proto]
            [clojure.core.async :as async])
  (:import [clojure_fabric.core Channel Orderer Peer]
           com.google.protobuf.ByteString
           org.bouncycastle.util.encoders.Hex
           [org.hyperledger.fabric.protos.common Common$Block Common$Payload Ledger$BlockchainInfo]
           org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
           [org.hyperledger.fabric.protos.peer ProposalPackage$SignedProposal ProposalResponsePackage$ProposalResponse ProposalResponsePackage$Response Query$ChaincodeQueryResponse Query$ChannelQueryResponse TransactionPackage$ProcessedTransaction]))

;;;
;;; System Chaincode Definitions
;;;
(defn- make-system-chaincode-pair
  [name]
  (let [chaincode-id (proto/make-chaincode-id :name name)]
    {:chaincode-id chaincode-id
     :header-extension (proto/make-chaincode-header-extension :chaincode-id chaincode-id)}))

(defonce system-chaincode-map
  {:lscc (make-system-chaincode-pair "lscc")
   :cscc (make-system-chaincode-pair "cscc")
   :qscc (make-system-chaincode-pair "qscc")})

(defrecord SystemChaincodeRequestParts [chaincode-id header-extension
                                        proposal-payload ->response])

(defn- make-system-chaincode-request-parts
  ([k proposal-payload]
   (make-system-chaincode-request-parts k proposal-payload nil))
  ([k proposal-payload ->response]
   (assoc (system-chaincode-map k) :proposal-payload proposal-payload :->response ->response)))

(defn make-chaincode-proposal-payload
  ([k fcn args]
   (make-chaincode-proposal-payload k fcn args {}))
  ([k fcn args transient-map]
   (assert (vector? args))
   (let [^Chaincode$ChaincodeInvocationSpec
         chaincode-invocation-spec
         (->> (proto/make-chaincode-input :args `[~fcn ~@args])
              (proto/make-chaincode-spec :chaincode-id (get-in system-chaincode-map [k :chaincode-id])
                                         :chaincode-input)
              (proto/make-chaincode-invocation-spec :chaincode-spec))]
     (proto/make-chaincode-proposal-payload :input chaincode-invocation-spec :transient-map transient-map))))

(defonce system-chaincode-request-parts
  {:install-chaincode
   (make-system-chaincode-request-parts :lscc
                                        (partial #'make-chaincode-proposal-payload
                                                 :lscc "install"))
   :query-installed-chaincodes
   (make-system-chaincode-request-parts :lscc
                                        (make-chaincode-proposal-payload :lscc
                                                                         "getinstalledchaincodes"
                                                                         [])
                                        #(Query$ChaincodeQueryResponse/parseFrom ^ByteString %))
   :query-channels
   (make-system-chaincode-request-parts :cscc
                                        (make-chaincode-proposal-payload :cscc
                                                                         "GetChannels"
                                                                         [])
                                        #(Query$ChannelQueryResponse/parseFrom ^ByteString %))

   :query-blockchain-info
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-chaincode-proposal-payload
                                                 :qscc "GetChainInfo")
                                        #(Ledger$BlockchainInfo/parseFrom ^ByteString %))
   
   :query-block-by-hash
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-chaincode-proposal-payload
                                                 :qscc "GetBlockByHash")
                                        #(Common$Block/parseFrom ^ByteString %))

   :query-block-by-number
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-chaincode-proposal-payload
                                                 :qscc "GetBlockByNumber")
                                        #(Common$Block/parseFrom ^ByteString %))

   :query-block-by-tx-id
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-chaincode-proposal-payload
                                                 :qscc "GetBlockByTxID")
                                        #(Common$Block/parseFrom ^ByteString %))
   
   :query-tx-by-id
   (map->SystemChaincodeRequestParts
    (make-system-chaincode-request-parts :qscc
                                         (partial #'make-chaincode-proposal-payload
                                                  :qscc "GetTransactionByID")
                                         #(TransactionPackage$ProcessedTransaction/parseFrom ^ByteString %)))})

(defn get-system-chaincode-request-parts
  [k & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload] :as parts}
        (system-chaincode-request-parts k)]
    (if (fn? proposal-payload)
      (assoc parts :proposal-payload (proposal-payload args))
      parts)))

;;;
;;; User level functions
;;;
(defn make-nonce
  ([]
   (make-nonce 24))
  ([nonce-size]
   (crypto-suite/random-bytes nonce-size)))

(defn get-epoch
  [& _]
  ;; FIXME: currently always default-epoch, 0
  0)

(defn identity-nonce->tx-id
  [#_SerializedIdentity identity ^bytes nonce {algorithm :hash-algorithm}]
  (-> (.concat (ByteString/copyFrom nonce) (.toByteString ^Identities$SerializedIdentity (proto/clj->proto identity)))
      (.toByteArray)
      (crypto-suite/hash :algorithm algorithm)
      (Hex/toHexString)))

(defn make-header
  [channel-name user {:keys [channel-header-type header-version
                             extension]
                      :or {header-version 1}}]
  (let [identity (proto/make-serialized-identity :mspid (:msp-id user) :id-bytes (:certificate user))
        nonce (make-nonce)]
   (proto/make-header :channel-header
                      (proto/make-channel-header :type channel-header-type
                                                 :version header-version
                                                 :channel-id channel-name
                                                 :tx-id (identity-nonce->tx-id identity nonce (:crypto-suite user))
                                                 :epoch (get-epoch channel-name)
                                                 :extension extension)
                      :signature-header (proto/make-signature-header :creator identity :nonce nonce))))

(defn make-envelope
  [channel-name user channel-header-type payload-data]
  (let [payload (proto/make-payload :header (make-header channel-name user {:channel-header-type channel-header-type})
                                    :data payload-data)]
   (proto/make-envelope :payload payload 
                        :signature (crypto-suite/sign (.toByteArray ^Common$Payload (proto/clj->proto payload))
                                                      (:private-key user)
                                                      {:algorithm (:key-algorithm (:crypto-suite user))}))))

(defn make-chaincode-proposal
  [chaincode-key channel-name user {:keys [args] :as opts}]
  (let [{:keys [chaincode-id header-extension proposal-payload]}
        (get-system-chaincode-request-parts chaincode-key :args args)]
    (proto/make-proposal :header
                         (make-header channel-name user
                                      (assoc opts
                                             :extension (proto/make-chaincode-header-extension :chaincode-id chaincode-id)))
                         :payload proposal-payload)))

(defn make-chaincode-signed-proposal
  [chaincode-key channel-name user opts]
  (let [proposal (make-chaincode-proposal chaincode-key channel-name user opts)
        signature (crypto-suite/sign (.toByteArray ^ProposalPackage$SignedProposal (proto/clj->proto proposal))
                                     (:private-key user)
                                     {:algorithm (:key-algorithm (:crypto-suite user))})]
    (proto/make-signed-proposal :proposal-bytes  proposal
                                :signature signature)))


(defn verify-response
  [^ProposalResponsePackage$ProposalResponse raw-response user]
  (let [endorsement (.getEndorsement raw-response)
        signature (.getSignature endorsement)
        endorser (.getEndorser endorsement)
        cert (Identities$SerializedIdentity/parseFrom endorser)
        text (.concat (.getPayload raw-response) endorser)]
    ;;(:crypto-suite user)
    (crypto-suite/verify (-> cert .getIdBytes .toByteArray)
                         (.toByteArray signature)
                         (.toByteArray text)
                         (:crypto-suite user))))

(defn get-random-node
  ([nodes-access-key]
   (core/get-nodes core/*channel* nodes-access-key))
  ([channel nodes-access-key]
   (second (rand-nth (seq (nodes-access-key channel))))))

(defn target->nodes [target]
  (if (sequential? target)
    target
    (condp instance? target
      Peer [target]
      Orderer [target]
      Channel [(get-random-node target :peers)])))

(defn send-chaincode-request
  [chaincode-key channel-name target user {:keys [verify?]
                                           :or {verify? false}
                                           :as opts}]
  ;; target==channel (get-random-node channel :peers)
  (let [nodes (target->nodes target)]
    (let [signed-proposal (make-chaincode-signed-proposal chaincode-key channel-name user opts)
          ->response (get-in system-chaincode-request-parts [chaincode-key :->response])]
      (->> nodes
           (mapv #(proto/send-chaincode-request-to-peer % signed-proposal))
           (mapv #(let [[peer raw-response] (async/<!! %)]
                    (if (instance? Exception raw-response)
                      raw-response
                      (if (and verify? (not (verify-response raw-response user)))
                        (Exception. "Verification failed!")
                        (if ->response
                          (let [response (.getResponse ^ProposalResponsePackage$ProposalResponse raw-response)]
                            (-> (.getPayload ^ProposalResponsePackage$Response response)
                                (->response)
                                (proto/proto->clj nil)))
                          raw-response)))))))))

;; Responses -
;;
;;(import [org.hyperledger.fabric.protos.peer Query$ChaincodeQueryResponse])
;;query-installed-chaincodes
;;(.getChaincodesList (Query$ChaincodeQueryResponse/parseFrom (.getPayload (.getResponse r1))))
;;
;;
;;(import [org.hyperledger.fabric.protos.peer Query$ChannelQueryResponse])
;;query-channel-info
;;(.getChannelsList (Query$ChannelQueryResponse/parseFrom (.getPayload (.getResponse x1))))
;;(.getChannelsList (Query$ChannelQueryResponse/parseFrom (.getPayload (.getResponse x2))))


