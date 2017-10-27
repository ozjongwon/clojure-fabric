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
;; This is generated code (and some decoration changes).
;; Do not change.
;;
(ns clojure-fabric.proto
  (:import [com.google.protobuf ByteString Timestamp]
           [org.hyperledger.fabric.protos.common Common$ChannelHeader Common$SignatureHeader
            Common$Header]
           org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
           [org.hyperledger.fabric.protos.peer Chaincode$ChaincodeID Chaincode$ChaincodeInput
            Chaincode$ChaincodeInvocationSpec Chaincode$ChaincodeSpec Chaincode$ChaincodeSpec$Type
            ProposalPackage$ChaincodeHeaderExtension ProposalPackage$Proposal
            ProposalPackage$ChaincodeProposalPayload ProposalPackage$SignedProposal]))

;;;
;;;
(defprotocol ICljToProto
  (clj->proto [this]))

(defprotocol IProtoToClj
  (proto->clj [this]))

;;;
;;; Records are one to one relationship with proto message definitions
;;; Think about how to generate them
;;;
(defrecord ChaincodeID [^String name ^String version ^String path]
  ICljToProto
  (clj->proto [this]
    (-> (Chaincode$ChaincodeID/newBuilder)
        (.setName name)
        (.setVersion version)
        (.setPath path)
        (.build))))

(defrecord ChaincodeInput [^Iterable args ^java.util.Map decorations]
  ICljToProto
  (clj->proto [this]
    ;; Iterable - repeated
    ;; map has putAll* method
    (-> (Chaincode$ChaincodeInput/newBuilder)
        (.addAllArgs args)
        (.putAllDecorations decorations)
        (.build))))

(defonce lang-types {:undefined Chaincode$ChaincodeSpec$Type/UNDEFINED
                     :golang Chaincode$ChaincodeSpec$Type/GOLANG
                     :node Chaincode$ChaincodeSpec$Type/NODE
                     :car Chaincode$ChaincodeSpec$Type/CAR
                     :java Chaincode$ChaincodeSpec$Type/JAVA})

(defrecord ChaincodeSpec [^clojure.lang.Keyword type
                          ^ChaincodeID chaincode-id
                          ^ChaincodeInput chaincode-input
                          ^Long timeout]
  ICljToProto
  (clj->proto [this]
    (let [^Chaincode$ChaincodeID p-chaincode-id (clj->proto chaincode-id)
          ^Chaincode$ChaincodeInput p-chaincode-input (clj->proto chaincode-input)]
     (-> (Chaincode$ChaincodeSpec/newBuilder)
         (.setType (lang-types type))
         (.setChaincodeId p-chaincode-id)
         (.setInput p-chaincode-input)
         (.setTimeout timeout)
         (.build)))))

(defrecord ChaincodeInvocationSpec [^ChaincodeSpec chaincode-spec
                                    ^String id-generation-alg]
  ICljToProto
  (clj->proto [this]
    (-> (Chaincode$ChaincodeInvocationSpec/newBuilder)
        (.setChaincodeSpec ^Chaincode$ChaincodeSpec (clj->proto chaincode-spec))
        (.setIdGenerationAlg id-generation-alg)
        (.build))))

(defrecord ChaincodeHeaderExtension [payload-visibility ;; FIXME: type not sure
                                     ^ChaincodeID chaincode-id]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$ChaincodeHeaderExtension/newBuilder)
        (.setChaincodeId ^Chaincode$ChaincodeID (clj->proto chaincode-id))
        (.setPayloadVisibility ByteString/EMPTY) ;; FIXME: payload-visibility
        (.build))))

(defrecord ProtoTimestamp [^Long seconds ^Long nanos]
  ICljToProto
  (clj->proto [this]
    (-> (Timestamp/newBuilder)
        (.setSeconds seconds)
        (.setNanos nanos)
        (.build))))

(defn make-timestamp
  ([]
   (make-timestamp (System/currentTimeMillis)))
  ([ts]
   (map->ProtoTimestamp {:seconds (quot ts 1000) :nanos (-> (rem ts 1000) (* 1000000))})))


(defrecord ChannelHeader [^Long type ^Long version ^ProtoTimestamp timestamp ^String channel-id
                          ;; FIXME: extension type
                          ^String tx-id ^Long epoch extension]
  ICljToProto
  (clj->proto [this]
    (-> (Common$ChannelHeader/newBuilder)
        (.setType type)
        (.setVersion version)
        (.setTimestamp ^Timestamp (clj->proto timestamp))
        (.setChannelId channel-id)
        (.setTxId tx-id)
        (.setEpoch epoch)
        (.setExtension extension)
        (.build))))

;; FIXME: id-bytes type
(defrecord SerializedIdentity [^String mspid id-bytes]
  ICljToProto
  (clj->proto [this]
    (-> (Identities$SerializedIdentity/newBuilder)
        (.setMspid mspid)
        (.setIdBytes id-bytes)
        (.build))))

(defrecord SignatureHeader [creator nonce] ;; both bytes
  ICljToProto
  (clj->proto [this]
    (-> (Common$SignatureHeader/newBuilder)
        (.setCreator creator)
        (.setNonce nonce)
        (.build))))

(defrecord Header [channel-header signature-header] ;; both bytes
  ICljToProto
  (clj->proto [this]
    (-> (Common$Header/newBuilder)
        (.setChannelHeader channel-header)
        (.setSignatureHeader signature-header)
        (.build))))

(defrecord Proposal [header payload extension]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$Proposal/newBuilder)
        (.setHeader header)
        (.setPayload payload)
        (.setExtension extension)
        (.build))))

;; FIXME: input bytes
(defrecord ChaincodeProposalPayload [input ^java.util.Map transient-map]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$ChaincodeProposalPayload/newBuilder)
        (.setInput input)
        (.putAllTransientMap transient-map)
        (.build))))

(defrecord SignedProposal [proposal-bytes signature] ; both bytes
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$SignedProposal/newBuilder)
        (.setProposalBytes proposal-bytes)
        (.setSignature signature)
        (.build))))

;;; Generic constructor
(defn make-instance [record-type args-map]
  ((resolve (symbol (str "map->" record-type))) args-map))



;;;;
(comment
  (def chaincode-id1 (make-instance 'ChaincodeID {:name "name" :version "version" :path "path"}))
  (def chaincode-input1 (make-instance 'ChaincodeInput {:args [] :decorations {}}))
  (def chaincode-spec1 (make-instance 'ChaincodeSpec {:type :golang
                                                      :chaincode-id chaincode-id1
                                                      :chaincode-input chaincode-input1
                                                      :timeout 100}))

  (def chaincode-invocation-spec1 (make-instance 'ChaincodeInvocationSpec {:chaincode-spec chaincode-spec1
                                                                           :id-generation-alg ""}))

  (def chaincode-header-extention1 (make-instance 'ChaincodeHeaderExtension
                                                  {:payload-visibility "FIXME"
                                                   :chaincode-id chaincode-id1}))

  (def timestamp1 (make-timestamp))
  )
