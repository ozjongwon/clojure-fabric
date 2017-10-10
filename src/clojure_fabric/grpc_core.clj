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
  (:import [org.hyperledger.fabric.protos.peer Chaincode$ChaincodeID Chaincode$ChaincodeSpec
            Chaincode$ChaincodeInput Chaincode$ChaincodeSpec$Type Chaincode$ChaincodeInvocationSpec
            ProposalPackage$ChaincodeHeaderExtension ProposalPackage$ChaincodeProposalPayload
            ProposalPackage$Proposal]
           [org.hyperledger.fabric.protos.common Common$ChannelHeader Common$HeaderType
            Common$Header Common$SignatureHeader]
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
        (.setNanos (-> now (rem 1000) (* 10000000)))
        (.build))))

(defn make-channel-header
  ([type version channel-id tx-id epoch]
   (make-channel-header type version channel-id tx-id epoch ByteString/EMPTY))
  ([type version channel-id tx-id epoch extension]
   (let [now (System/currentTimeMillis)]
    (-> (Common$ChannelHeader/newBuilder)
        (.setType type)
        (.setVersion version)
        (.setTimestamp ^Timestamp (make-current-grpc-timestamp))
        (.setChannelId ^Chaincode$ChaincodeID channel-id)
        (.setTxId tx-id)
        (.setEpoch epoch)
        (.setExtension extension)
        (.build)))))

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
  [^Common$ChannelHeader channel-header signature-header]
  (-> (Common$Header/newBuilder)
      (.setChannelHeader (.toByteString channel-header))
      (.setSignatureHeader channel-header)
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
  (->> (make-chaincode-input (mapv #(ByteString/copyFromUtf8 (str %)) `[~fcn ~@args]))
       (make-chaincode-spec chaincode-id)
       (make-chaincode-invocation-spec)
       (make-chaincode-proposal-payload)))
