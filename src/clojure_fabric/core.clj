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

(ns clojure-fabric.core
  (:import org.bouncycastle.jce.provider.BouncyCastleProvider))

;;;
;;; User(and Client)
;;; Clients are applications that act on behalf of a person to propose transactions on the network.
;;;
;;;

(defprotocol INodes
  (get-nodes [this type]))

;; Toplevel users: all mutation happens with 'users'
(defonce users (atom {}))     ; key = [msp-id name]

(defonce ^:dynamic *user* nil)

(defn get-user
  [msp-id name]
  (get @users [msp-id name]))

(defrecord User [msp-id name channels crypto-suite
                 roles %roles
                 private-key certificate
                 ;; For CA-Client
                 ca-location]
  INodes
  (get-nodes [this type]
    (mapcat (fn [[_ ch]] (get-nodes ch type)) (:channels this))))

(defn make-user
  [{:keys [msp-id name channels crypto-suite roles %roles private-key certificate ca-location]
    :or {channels {} roles #{} %roles #{}}}]
  (->User msp-id name channels crypto-suite roles %roles private-key certificate ca-location))

;;;
;;; Channel
;;;
(defonce ^:dynamic *channel* nil)

(defrecord Channel [user-key name peers orderers]
  INodes
  (get-nodes [this type]
    (map second (get this type))))

(defn make-channel [{:keys [user-key name peers orderers] :or {peers {} orderers {}}}]
  (->Channel user-key name peers orderers))

;;;
;;; CryptoSuite
;;; 
(defrecord CryptoSuite [security-provider key-algorithm curve-name hash-algorithm])
(defn make-crypto-suite
  [{:keys [security-provider key-algorithm curve-name hash-algorithm]
    :or {security-provider BouncyCastleProvider/PROVIDER_NAME
         key-algorithm :sha256-ecdsa
         curve-name :secp256r1
         hash-algorithm :sha256}}]
  (->CryptoSuite security-provider key-algorithm curve-name hash-algorithm))

;;;
;;; Peer
;;; Peers maintain the state of the network and a copy of the ledger.
;;; There are two different types of peers: endorsing and committing peers.
;;; However, there is an overlap between endorsing and committing peers, in that endorsing peers
;;; are a special kind of committing peers. All peers commit blocks to the distributed ledger.
;;; - Endorsers simulate and endorse transactions
;;; - Committers verify endorsements and validate transaction results, prior to committing
;;;     transactions to the blockchain.

(defonce ^:dynamic *peer* nil)

;; an endorser, committer and/or submitter
;; endorser is a committer
;; %roles ex : #{:endorser :submitter :committer}, #{}, etc
(defrecord Peer [name url pem hostname-override?])

(defn make-peer [m]
  (map->Peer m))

;;;
;;; Orderer
;;;
;;; The ordering service accepts endorsed transactions, orders them into a block, and delivers
;;; the blocks to the committing peers.
(defonce ^:dynamic *orderer* nil)

(defrecord Orderer [name url pem hostname-override?])


(defn make-orderer [m]
  (map->Orderer m))
