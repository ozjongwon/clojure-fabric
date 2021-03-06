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
;; Endorsement System Chaincode (ESCC) is a system chaincode that handles the endorsement policy
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
            [medley.core :as medley])
  (:import com.google.protobuf.ByteString
           [org.hyperledger.fabric.protos.common Common$Block Ledger$BlockchainInfo]
           [org.hyperledger.fabric.protos.peer Query$ChaincodeQueryResponse Query$ChannelQueryResponse TransactionPackage$ProcessedTransaction]))

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

(defn make-system-chaincode-proposal-payload-message
  ([k fcn args]
   (make-system-chaincode-proposal-payload-message k fcn args {}))
  ([k fcn args transient-map]
   (proto/make-chaincode-proposal-payload-message (get-in system-chaincode-map [k :chaincode-id])
                                                  fcn
                                                  args
                                                  transient-map)))

(defonce system-chaincode-request-parts
  {:install-chaincode
   (make-system-chaincode-request-parts :lscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :lscc "install"))
   :query-installed-chaincodes
   (make-system-chaincode-request-parts :lscc
                                        (make-system-chaincode-proposal-payload-message :lscc
                                                                         "getinstalledchaincodes"
                                                                         [])
                                        #(Query$ChaincodeQueryResponse/parseFrom ^ByteString %))
   :query-channels
   (make-system-chaincode-request-parts :cscc
                                        (make-system-chaincode-proposal-payload-message :cscc
                                                                         "GetChannels"
                                                                         [])
                                        #(Query$ChannelQueryResponse/parseFrom ^ByteString %))

   :query-blockchain-info
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :qscc "GetChainInfo")
                                        #(Ledger$BlockchainInfo/parseFrom ^ByteString %))
   
   :query-block-by-hash
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :qscc "GetBlockByHash")
                                        #(Common$Block/parseFrom ^ByteString %))

   :query-block-by-number
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :qscc "GetBlockByNumber")
                                        #(Common$Block/parseFrom ^ByteString %))

   :query-block-by-tx-id
   (make-system-chaincode-request-parts :qscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :qscc "GetBlockByTxID")
                                        #(Common$Block/parseFrom ^ByteString %))
   
   :query-tx-by-id
   (map->SystemChaincodeRequestParts
    (make-system-chaincode-request-parts :qscc
                                         (partial #'make-system-chaincode-proposal-payload-message
                                                  :qscc "GetTransactionByID")
                                         #(TransactionPackage$ProcessedTransaction/parseFrom ^ByteString %)))
   :query-instantiated-chaincodes
   (make-system-chaincode-request-parts :lscc
                                        (make-system-chaincode-proposal-payload-message :lscc
                                                                                        "getchaincodes"
                                                                                        [])
                                        #(Query$ChaincodeQueryResponse/parseFrom ^ByteString %))
   :join-channel
   (make-system-chaincode-request-parts :cscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :cscc "JoinChain"))
   :deploy
   (make-system-chaincode-request-parts :lscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :lscc "deploy"))
   :upgrade
   (make-system-chaincode-request-parts :lscc
                                        (partial #'make-system-chaincode-proposal-payload-message
                                                 :lscc "upgrade"))})

(defn get-system-chaincode-request-parts
  [k & {:keys [args chaincode-id-version chaincode-id-path]}]
  (let [{:keys [chaincode-id header-extension proposal-payload] :as parts}
        (system-chaincode-request-parts k)]
    (if (fn? proposal-payload)
      (assoc parts :proposal-payload (proposal-payload args))
      ;; Update for version or path information 
      (if (or chaincode-id-version chaincode-id-path)
        (let [new-chaincode-id (medley/assoc-some chaincode-id
                                                  :version chaincode-id-version
                                                  :path chaincode-id-path)
              new-header-extension (medley/assoc-some header-extension
                                                      :chaincode-id new-chaincode-id)]
         (assoc parts :chaincode-id new-chaincode-id :header-extension new-header-extension))
        parts))))

;;;
;;; User level functions
;;;

(defn make-chaincode-signed-proposal
  [chaincode-key channel-name user {:keys [args] :as opts}]
  (let [{:keys [header-extension proposal-payload]}
        (get-system-chaincode-request-parts chaincode-key :args args)]
    (proto/make-chaincode-signed-proposal-message channel-name
                                                  user
                                                  header-extension
                                                  proposal-payload
                                                  opts)))

(defn send-system-chaincode-request
  [chaincode-key channel-name target user opts]
  (proto/send-proposal (make-chaincode-signed-proposal chaincode-key channel-name user opts)
                       target
                       user
                       (get-in system-chaincode-request-parts [chaincode-key :->response])
                       opts))

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


