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
  (:require [clojure-fabric.proto :as proto]
            [clojure-fabric.crypto-suite :as crypto-suite] 
            [clojure-fabric.utils :as utils]
            [clojure.core.async :as async])
  
  (:import [org.hyperledger.fabric.protos.common Common$Block Ledger$BlockchainInfo]
           org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
           [com.google.protobuf ByteString Timestamp GeneratedMessageV3]
           org.bouncycastle.util.encoders.Hex
           
           [org.hyperledger.fabric.protos.peer Query$ChaincodeQueryResponse Query$ChannelQueryResponse
            TransactionPackage$ProcessedTransaction ProposalPackage$SignedProposal
            ProposalResponsePackage$ProposalResponse]))

;;; System Chaincodes
(defonce lifecycle-system-chaincode (proto/make-chaincode-id :name "lscc"))
(defonce configuration-system-chaincode (proto/make-chaincode-id :name "cscc"))
(defonce query-system-chaincode (proto/make-chaincode-id :name "qscc"))

;;; System header extensions
(defonce lscc-chaincode-header-extension
  (proto/make-chaincode-header-extension :chaincode-id lifecycle-system-chaincode))
(defonce cscc-chaincode-header-extension
  (proto/make-chaincode-header-extension :chaincode-id configuration-system-chaincode))
(defonce qscc-chaincode-header-extension
  (proto/make-chaincode-header-extension :chaincode-id query-system-chaincode))

(defrecord SystemChaincodeRequestParts [chaincode-id header-extension proposal-payload])

(defn make-chaincode-proposal-payload
  ([chaincode-id fcn args]
   (make-chaincode-proposal-payload chaincode-id fcn args {}))
  ([chaincode-id fcn args transient-map]
   (assert (vector? args))
   (let [^Chaincode$ChaincodeInvocationSpec
         chaincode-invocation-spec
         (->> (proto/make-chaincode-input :args `[~fcn ~@args])
              (proto/make-chaincode-spec :chaincode-id chaincode-id :chaincode-input)
              (proto/make-chaincode-invocation-spec :chaincode-spec))]
     (proto/make-chaincode-proposal-payload :input chaincode-invocation-spec :transient-map transient-map))))

(defonce system-chaincode-request-parts
  {;; :install-chaincode
   ;; (map->SystemChaincodeRequestParts
   ;;  {:chaincode-id (proto/make-chaincode-id name :version 1 :path "/")
   ;;   :header-extension lscc-chaincode-header-extension
   ;;   :proposal-payload (make-chaincode-proposal-payload lifecycle-system-chaincode ??????
   ;;                                                 "install"
   ;;                                                 [])})
   :query-installed-chaincodes
   (map->SystemChaincodeRequestParts
    {:chaincode-id lifecycle-system-chaincode
     :header-extension lscc-chaincode-header-extension
     :proposal-payload (make-chaincode-proposal-payload lifecycle-system-chaincode
                                                        "getinstalledchaincodes"
                                                        [])
     :response-fn #(Query$ChaincodeQueryResponse/parseFrom ^ByteString %)})

   :query-channels
   (map->SystemChaincodeRequestParts
    {:chaincode-id configuration-system-chaincode
     :header-extension cscc-chaincode-header-extension
     :proposal-payload (make-chaincode-proposal-payload configuration-system-chaincode
                                                        "GetChannels"
                                                        [])
     :response-fn #(Query$ChannelQueryResponse/parseFrom ^ByteString %)})

   :query-blockchain-info
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'make-chaincode-proposal-payload
                                lifecycle-system-chaincode "GetChainInfo")
     :response-fn #(Ledger$BlockchainInfo/parseFrom ^ByteString %)})
   
   :query-block-by-hash
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByHash")
     :response-fn #(Common$Block/parseFrom ^ByteString %)})

   :query-block-by-number
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByNumber")
     :response-fn #(Common$Block/parseFrom ^ByteString %)})

   :query-block-by-tx-id
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByTxID")
     :response-fn #(Common$Block/parseFrom ^ByteString %)})
   
   :query-tx-by-id
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'make-chaincode-proposal-payload
                                query-system-chaincode "GetTransactionByID")
     :response-fn #(TransactionPackage$ProcessedTransaction/parseFrom ^ByteString %)})})

(defn get-system-chaincode-request-parts
  [k & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload] :as parts}
        (system-chaincode-request-parts k)]
    (if (fn? proposal-payload)
      (assoc parts :proposal-payload (proposal-payload args))
      parts)))

(defn make-chaincode-header
  [chaincode-id channel-id tx-id epoch]
  (proto/make-channel-header :type :endorser-transaction
                             :version 1
                             :channel-id channel-id
                             :tx-id tx-id
                             :epoch epoch
                             :extension
                             (proto/make-chaincode-header-extension :chaincode-id chaincode-id)))
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

(defn make-chaincode-proposal
  [chaincode-key channel-name user & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload]}
        (get-system-chaincode-request-parts chaincode-key :args args)
        identity (proto/make-serialized-identity :mspid (:msp-id user) :id-bytes (:certificate user))
        nonce (make-nonce)]
    (proto/make-proposal :header
                         (proto/make-header :channel-header (make-chaincode-header chaincode-id
                                                                                   channel-name
                                                                                   (identity-nonce->tx-id identity nonce (:crypto-suite user))
                                                                                   (get-epoch channel-name))
                                            :signature-header (proto/make-signature-header :creator identity :nonce nonce))
                         
                         :payload proposal-payload)))

(defn make-chaincode-signed-proposal
  [chaincode-key channel-name user & {:keys [args]}]
  (let [proposal (make-chaincode-proposal chaincode-key channel-name user :args args)
        signatures (crypto-suite/sign (.toByteArray ^ProposalPackage$SignedProposal (proto/clj->proto proposal))
                                      (:private-key user)
                                      {:algorithm (:key-algorithm (:crypto-suite user))})]
    (proto/make-signed-proposal :proposal-bytes  proposal
                                :signature signatures)))


(defn send-chaincode-request
  [chaincode-key channel-name peers user & {:keys [args]}]
  (let [peers (utils/ensure-vector peers)]
    (let [signed-proposal (make-chaincode-signed-proposal chaincode-key channel-name user :args args)
          response-fn (get-in system-chaincode-request-parts [chaincode-key :response-fn])]
      (->> peers
           (mapv #(proto/send-chaincode-request-to-peer % signed-proposal))
           (mapv #(let [[peer return] (async/<!! %)]
                    (if (instance? Exception return)
                      return
                      
                      (->> (.getResponse ^ProposalResponsePackage$ProposalResponse return)
                           (.getPayload)
                           (response-fn)
                           (proto/proto->clj))

                      
                      #_
                      (->> (.getResponse ^ProposalResponsePackage$ProposalResponse return)
                             (.getPayload)
                             (response-fn)
                             (proto/proto->clj)))))))))

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


