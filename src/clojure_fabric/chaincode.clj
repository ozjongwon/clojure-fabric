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
  (:require [clojure-fabric.grpc-core :as grpc]))

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

;;; System chaincode map
(defrecord SystemChaincodeParts [chaincode-id header-extension proposal-payload])
(defonce system-chaincode-parts
  {:query-installed-chaincodes
   (map->SystemChaincodeParts
    {:chaincode-id lifecycle-system-chaincode
     :header-extension lscc-chaincode-header-extension
     :proposal-payload (grpc/make-proposal-payload lifecycle-system-chaincode
                                                   "queryinstalledchaincodes"
                                                   [])})
   :query-info
   (map->SystemChaincodeParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetChainInfo")})
   
   :query-block-by-hash
   (map->SystemChaincodeParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetBlockByHash")})

   :query-block
   (map->SystemChaincodeParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetBlockByNumber")})

   :query-transaction
   (map->SystemChaincodeParts
    {:chaincode-id query-system-chaincode
     :header-extension qscc-chaincode-header-extension
     :proposal-payload (partial grpc/make-proposal-payload
                                lifecycle-system-chaincode "GetTransactionByID")})})

(defn get-system-chaincode-parts
  [k & {:keys [args]}]
  (let [{:keys [chaincode-id header-extension proposal-payload] :as parts}
        (system-chaincode-parts k)]
    (if (fn? proposal-payload)
      (assoc parts :proposal-payload (proposal-payload args))
      parts)))


