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
            [clojure.core.async :as async]))

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
(defrecord SystemChaincodeRequestParts [chaincode-id header-extension proposal-payload])
(defonce system-chaincode-request-parts
  {:query-installed-chaincodes
   (map->SystemChaincodeRequestParts
    {:chaincode-id lifecycle-system-chaincode
     :header-extension lscc-chaincode-header-extension
     :proposal-payload (grpc/make-proposal-payload lifecycle-system-chaincode
                                                   "queryinstalledchaincodes"
                                                   [])})

   :query-channel-info
   (map->SystemChaincodeRequestParts
    {:chaincode-id configuration-system-chaincode
     :header-extension cscc-chaincode-header-extension
     :proposal-payload (grpc/make-proposal-payload configuration-system-chaincode
                                                   "GetChannels"
                                                   [])})
   :query-info
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetChainInfo")})
   
   :query-block-by-hash
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetBlockByHash")})

   :query-block
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetBlockByNumber")})

   :query-transaction
   (map->SystemChaincodeRequestParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial #'grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetTransactionByID")})})

(defn get-system-chaincode-request-parts
  [k & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload] :as parts}
        (system-chaincode-request-parts k)]
    (if (fn? proposal-payload)
      (assoc parts :proposal-payload (proposal-payload args))
      parts)))

(defonce system-channel-name "")

;;;
;;; User level functions
;;;
(defn make-chaincode-proposal
  [chaincode-key user & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload]}
        (get-system-chaincode-request-parts chaincode-key :args args)

        identity-byte-string (grpc/make-identity-byte-string user)
        nonce-byte-string (grpc/make-nonce-byte-string)]
    (grpc/make-proposal
     (grpc/make-header
      (grpc/make-chaincode-header
       chaincode-id
       system-channel-name
       (grpc/identity-nonce->tx-id identity-byte-string nonce-byte-string (:crypto-suite user))
       (grpc/get-epoch system-channel-name))
      (grpc/make-signature-header identity-byte-string nonce-byte-string))
     proposal-payload)))

(defn make-chaincode-signed-proposal
  [chaincode-key user & {:keys [args]}]
  (-> chaincode-key
      (make-chaincode-proposal user :args args)
      (grpc/make-signed-proposal user)))

(defn send-chaincode-request
  [chaincode-key peers user & {:keys [args]}]
  (let [peers (utils/ensure-vector peers)]
    (let [signed-proposal (make-chaincode-signed-proposal chaincode-key user :args args)]
      (->> peers
           (mapv #(grpc/send-chaincode-request-to-peer % signed-proposal))
           (mapv #(async/<!! %))))))

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


