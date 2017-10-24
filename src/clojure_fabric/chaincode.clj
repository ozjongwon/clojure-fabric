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
  (:require [clojure-fabric.grpc-core :as grpc]
            [clojure-fabric.utils :as utils]
            [clojure.core.async :as async])
  (:import [org.hyperledger.fabric.protos.common Ledger$BlockchainInfo Common$Block]
           [org.hyperledger.fabric.protos.peer TransactionPackage$ProcessedTransaction]))

;;; System Chaincodes
(defonce lifecycle-system-chaincode (grpc/make-chaincode-id "lscc"))
(defonce configuration-system-chaincode (grpc/make-chaincode-id "cscc"))
(defonce query-system-chaincode (grpc/make-chaincode-id "qscc"))

;;; System header extensions
(defonce lscc-chaincode-header-extension
  (grpc/make-chaincode-header-extention lifecycle-system-chaincode))
(defonce cscc-chaincode-header-extension
  (grpc/make-chaincode-header-extention configuration-system-chaincode))
(defonce qscc-chaincode-header-extension
  (grpc/make-chaincode-header-extention query-system-chaincode))

;;;

(defmacro response-processor [class getter]
  `(fn [resp#]
     (. (. ~class ~(symbol "parseFrom") (.getPayload (.getResponse resp#))) ~(symbol (name getter)))))

(defrecord SystemChaincodeRequestParts [chaincode-id header-extension proposal-payload])

(defonce system-chaincode-request-parts
  {;; :install-chaincode
   ;; (map->SystemChaincodeRequestParts
   ;;  {:chaincode-id (grpc/make-chaincode-id name :version 1 :path "/")
   ;;   :header-extension lscc-chaincode-header-extension
   ;;   :proposal-payload (grpc/make-chaincode-proposal-payload lifecycle-system-chaincode ??????
   ;;                                                 "install"
   ;;                                                 [])})
   :query-installed-chaincodes
   (map->SystemChaincodeRequestParts
    {:chaincode-id lifecycle-system-chaincode
     :header-extension lscc-chaincode-header-extension
     :proposal-payload (grpc/make-chaincode-proposal-payload lifecycle-system-chaincode
                                                   "getinstalledchaincodes"
                                                   [])
     :->response (response-processor Query$ChaincodeQueryResponse
                                     {:chaincodes getChaincodesList})})

   :query-channels
   (map->SystemChaincodeRequestParts
    {:chaincode-id configuration-system-chaincode
     :header-extension cscc-chaincode-header-extension
     :proposal-payload (grpc/make-chaincode-proposal-payload configuration-system-chaincode
                                                   "GetChannels"
                                                   [])
     :->response (response-processor Query$ChannelQueryResponse
                                     {:channels getChannelsList})})

   :query-blockchain-info
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-chaincode-proposal-payload
                                lifecycle-system-chaincode "GetChainInfo")
     :->response (response-processor Ledger$BlockchainInfo
                                     {:heigh getHeight
                                      :current-block-hash getCurrentBlockHash
                                      :previous-block-hash getPreviousBlockHash}) })
   
   :query-block-by-hash
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByHash")
     :->response (response-processor Common$Block
                                     {:block-header     getBlockHeader
                                      :block-data       getBlockData
                                      :block-metadata   getBlockMetadata})})

   :query-block-by-number
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByNumber")
     :->response (response-processor Common$Block
                                     {:block-header     getBlockHeader
                                      :block-data       getBlockData
                                      :block-metadata   getBlockMetadata})})

   :query-block-by-tx-id
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-chaincode-proposal-payload
                                query-system-chaincode "GetBlockByTxID")
     :->response (response-processor Common$Block
                                     {:block-header     getBlockHeader
                                      :block-data       getBlockData
                                      :block-metadata   getBlockMetadata})})
   
   :query-tx-by-id
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-chaincode-proposal-payload
                                query-system-chaincode "GetTransactionByID")
     :response-type TransactionPackage$ProcessedTransaction})})

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
(defn make-chaincode-proposal
  [chaincode-key channel-name user & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload]}
        (get-system-chaincode-request-parts chaincode-key :args args)

        identity-byte-string (grpc/make-identity-byte-string user)
        nonce-byte-string (grpc/make-nonce-byte-string)]
    (grpc/make-proposal
     (grpc/make-header
      (grpc/make-chaincode-header
       chaincode-id
       channel-name
       (grpc/identity-nonce->tx-id identity-byte-string nonce-byte-string (:crypto-suite user))
       (grpc/get-epoch channel-name))
      (grpc/make-signature-header identity-byte-string nonce-byte-string))
     proposal-payload)))

(defn make-chaincode-signed-proposal
  [chaincode-key channel-name user & {:keys [args]}]
  (-> chaincode-key
      (make-chaincode-proposal channel-name user :args args)
      (grpc/make-signed-proposal user)))

(defn send-chaincode-request
  [chaincode-key channel-name peers user & {:keys [args]}]
  (let [peers (utils/ensure-vector peers)]
    (let [signed-proposal (make-chaincode-signed-proposal chaincode-key channel-name user
                                                          :args args)
          response-fn (get-in system-chaincode-request-parts [chaincode-key :->response])]
      (->> peers
           (mapv #(grpc/send-chaincode-request-to-peer % signed-proposal))
           (mapv #(response-fn (async/<!! %)))))))

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


