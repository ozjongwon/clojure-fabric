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
;; Note that under the cover there are two different kinds of communications with the fabric backend
;; that trigger different events to be emitted back to the application’s handlers:
;; - the grpc client with the orderer service uses a “regular” stateless HTTP connection in
;;      a request/response fashion with the “broadcast” call. The method implementation should emit
;;      “transaction submitted” when a successful acknowledgement is received in the response, or
;;      “error” when an error is received
;; - The method implementation should also maintain a persistent connection with the Chain’s
;;      event source Peer as part of the internal event hub mechanism in order to support
;;      the fabric events “BLOCK”, “CHAINCODE” and “TRANSACTION”. These events should cause
;;      the method to emit “complete” or “error” events to the application
(ns clojure-fabric.grpc-core
  (:require [clojure-fabric.user :as user]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.utils :as utils])
  (:import [org.hyperledger.fabric.protos.peer Chaincode$ChaincodeID Chaincode$ChaincodeSpec
            Chaincode$ChaincodeInput Chaincode$ChaincodeSpec$Type Chaincode$ChaincodeInvocationSpec
            ProposalPackage$ChaincodeHeaderExtension ProposalPackage$ChaincodeProposalPayload
            ProposalPackage$Proposal ProposalPackage$SignedProposal]
           [org.hyperledger.fabric.protos.common Common$ChannelHeader Common$HeaderType
            Common$Header Common$SignatureHeader]
           [org.hyperledger.fabric.protos.msp Identities$SerializedIdentity]
           [com.google.protobuf ByteString Timestamp]))

;;;
;;; Low level functions
;;;

(defn make-chaincode-id
  ([name]
   (make-chaincode-id name {}))
  ([name {:keys [version path] :or {version "" path ""}}]
   (-> (Chaincode$ChaincodeID/newBuilder)
       (.setName name)
       (.setVersion version)
       (.setPath path)
       (.build))))

(defn make-chaincode-input
  ([args]
   (-> (Chaincode$ChaincodeInput/newBuilder)
       (.addAllArgs args)
       (.build)))
  ;; FIXME: can't find deatails on decorations
  #_
  ([args decorations]
   (-> (Chaincode$ChaincodeInput/newBuilder)
       (.addAllArgs args))))

(defn make-chaincode-spec
  ([chaincode-id input]
   (-> (Chaincode$ChaincodeSpec/newBuilder)
       (.setType Chaincode$ChaincodeSpec$Type/GOLANG)
       (.setChaincodeId ^Chaincode$ChaincodeID chaincode-id)
       (.setInput ^Chaincode$ChaincodeInput input)
       (.build)))
  ;; FIXME: use of timeout
  #_
  ([type chaincode-id input timeout]
   (-> (Chaincode$ChaincodeSpec/newBuilder)
       (.setType)
       (.setChaincodeId)
       (.setInput)
       (.setTimeout)
       (.build))))

(defn make-chaincode-invocation-spec
  ([^Chaincode$ChaincodeSpec chaincode-spec]
   (-> (Chaincode$ChaincodeInvocationSpec/newBuilder)
       (.setChaincodeSpec chaincode-spec)
       (.build)))
  ;; FIXME: setIdGenerationAlg
  #_
  ([^Chaincode$ChaincodeSpec chaincode-spec id-generation-alg]
   (-> (Chaincode$ChaincodeInvocationSpec/newBuilder)
       (.setChaincodeSpec chaincode-spec)
       (.setIdGenerationAlg id-generation-alg))))

(defn make-chaincode-header-extention
  ([chaincode-id]
   (make-chaincode-header-extention chaincode-id ByteString/EMPTY))
  ([^Chaincode$ChaincodeID chaincode-id payload-visibility]
   (-> (ProposalPackage$ChaincodeHeaderExtension/newBuilder)
       (.setChaincodeId chaincode-id)
       ;; FIXME: payload-visibility is ByteString
       ;; Use above arity 1 function - currently all other SDKs do this
       (.setPayloadVisibility payload-visibility)
       (.build))))

(defn make-current-grpc-timestamp
  []
  (let [now (System/currentTimeMillis)]
    (-> (Timestamp/newBuilder)
        (.setSeconds (quot now 1000))
        (.setNanos (-> now (rem 1000) (* 1000000)))
        (.build))))

(defn make-channel-header
  ([type version channel-id tx-id epoch]
   (make-channel-header type version channel-id tx-id epoch ByteString/EMPTY))
  ([^Common$HeaderType type version channel-id tx-id epoch extension]
   (let [now (System/currentTimeMillis)]
    (-> (Common$ChannelHeader/newBuilder)
        (.setType (.getNumber type))
        (.setVersion version)
        (.setTimestamp ^Timestamp (make-current-grpc-timestamp))
        (.setChannelId ^Chaincode$ChaincodeID channel-id)
        (.setTxId tx-id)
        (.setEpoch epoch)
        (.setExtension (.toByteString ^ProposalPackage$ChaincodeHeaderExtension extension))
        (.build)))))

(defn make-serialized-identity [user]   ; i.e. user-context
  (-> (Identities$SerializedIdentity/newBuilder)
      (.setIdBytes (ByteString/copyFromUtf8 (user/get-enrollment-certificate user)))
      (.setMspid (:msp-id user))
      (.build)))

(defn make-identity-byte-string [user]
  (.toByteString ^Identities$SerializedIdentity (make-serialized-identity user)))

(defonce nonce-size 24)
(defn make-nonce-byte-string
  []
  (ByteString/copyFrom #^bytes (crypto-suite/random-bytes nonce-size)))

(defn identity-nonce->tx-id
  [^ByteString identity ^ByteString nonce {algorithm :hash-algorithm}]
  (-> (.concat nonce identity)
      (.toByteArray)
      (crypto-suite/hash {:algorithm algorithm})))


(defonce default-epoch 0)
(defn get-epoch [& _]
  ;; FIXME: currently always default-epoch, 0
  default-epoch)

(defn make-chaincode-header
  [^Chaincode$ChaincodeID chaincode-id channel-id tx-id epoch]
  (make-channel-header Common$HeaderType/ENDORSER_TRANSACTION ; type
                       1                ; version
                       channel-id
                       tx-id
                       epoch
                       (make-chaincode-header-extention chaincode-id)))

(defonce java-empty-map (java.util.Collections/emptyMap))

(defn make-chaincode-proposal-payload
  ([chaincode-invocation-spec]
   (make-chaincode-proposal-payload chaincode-invocation-spec java-empty-map))
  ([^Chaincode$ChaincodeInvocationSpec chaincode-invocation-spec transient-map]
   (-> (ProposalPackage$ChaincodeProposalPayload/newBuilder)
       (.setInput (.toByteString chaincode-invocation-spec))
       (.putAllTransientMap transient-map)
       (.build))))

(defn make-signature-header
  [creator nonce]
  (-> (Common$SignatureHeader/newBuilder)
      (.setCreator creator)
      (.setNonce nonce)
      (.build)))

(defn make-header
  [^Common$ChannelHeader channel-header ^Common$SignatureHeader signature-header]
  (-> (Common$Header/newBuilder)
      (.setChannelHeader (.toByteString channel-header))
      (.setSignatureHeader (.toByteString signature-header))
      (.build)))

(defn make-proposal
  ([header payload]
   (make-proposal header payload ByteString/EMPTY))
  ([header payload extension]
   (-> (ProposalPackage$Proposal/newBuilder)
       (.setHeader (.toByteString ^Common$Header header))
       (.setPayload (.toByteString ^ProposalPackage$ChaincodeProposalPayload payload))
       (.setExtension extension)
       (.build))))

;;;
;;; User level functions
;;;

(defn make-proposal-payload [chaincode-id fcn args]
  (assert (vector? args))
  ;; FIXME: From Java comment
  ;; 
  (->> (make-chaincode-input (mapv #(if (utils/bytes? %)
                                      (ByteString/copyFrom #^bytes %)
                                      (ByteString/copyFromUtf8 (str %)))
                                   `[~fcn ~@args]))
       (make-chaincode-spec chaincode-id)
       (make-chaincode-invocation-spec)
       (make-chaincode-proposal-payload)))

(defn make-signed-proposal
  [^ProposalPackage$Proposal proposal user-context crypto-suite]
  (-> (ProposalPackage$SignedProposal/newBuilder)
      (.setProposalBytes (.toByteString proposal))
      (.setSignature (-> (.toByteArray proposal)
                         #^bytes (crypto-suite/sign
                                  (:private-key user-context)
                                  {:algorithm (:key-algorithm crypto-suite)})
                         (ByteString/copyFrom)))
      (.build)))
