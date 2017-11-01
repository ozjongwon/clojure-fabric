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
  (:require [clojure-fabric.utils :as utils]
            [clojure.core.async :as async])
  (:import [com.google.protobuf ByteString Timestamp]
           [io.grpc.netty GrpcSslContexts NegotiationType NettyChannelBuilder]
           io.grpc.stub.StreamObserver
           io.netty.handler.ssl.SslProvider
           io.netty.handler.ssl.util.InsecureTrustManagerFactory
           [org.hyperledger.fabric.protos.common Common$Block Common$BlockData Common$BlockHeader Common$BlockMetadata Common$ChannelHeader Common$Envelope Common$Header Common$HeaderType Common$Payload Common$SignatureHeader Configtx$ConfigSignature Configtx$ConfigUpdateEnvelope Ledger$BlockchainInfo]
           org.hyperledger.fabric.protos.msp.Identities$SerializedIdentity
           [org.hyperledger.fabric.protos.peer Chaincode$ChaincodeDeploymentSpec Chaincode$ChaincodeDeploymentSpec$ExecutionEnvironment Chaincode$ChaincodeID Chaincode$ChaincodeInput Chaincode$ChaincodeInvocationSpec Chaincode$ChaincodeSpec Chaincode$ChaincodeSpec$Type EndorserGrpc ProposalPackage$ChaincodeHeaderExtension ProposalPackage$ChaincodeProposalPayload ProposalPackage$Proposal ProposalPackage$SignedProposal Query$ChaincodeInfo Query$ChaincodeQueryResponse Query$ChannelInfo Query$ChannelQueryResponse TransactionPackage$ProcessedTransaction]))

;;;
;;; Macros
(defmacro with-default-empty-byte-string [[arg] & body]
  `(if (nil? ~arg)
     ByteString/EMPTY
     ~@body))

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

(defn make-chaincode-id
  [& {:keys [name version path] :or {version "" path ""}}]
  (map->ChaincodeID {:name name :version version :path path}))

(declare convert-args)
(defrecord ChaincodeInput [^Iterable args ^java.util.Map decorations]
  ICljToProto
  (clj->proto [this]
    ;; Iterable - repeated
    ;; map has putAll* method
    (-> (Chaincode$ChaincodeInput/newBuilder)
        (.addAllArgs (convert-args args))
        (.putAllDecorations decorations)
        (.build))))

(defn make-chaincode-input
  ;; args = fn + fn-args
  [& {:keys [args decorations] :or {args [] decorations {}}}]
  (map->ChaincodeInput {:args args :decorations decorations}))

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
    (-> (Chaincode$ChaincodeSpec/newBuilder)
        (.setType (lang-types type))
        (.setChaincodeId ^Chaincode$ChaincodeID (clj->proto chaincode-id))
        (.setInput ^Chaincode$ChaincodeInput (clj->proto chaincode-input))
        (.setTimeout ^Timestamp timeout)
        (.build))))

(defn make-chaincode-spec
  [& {:keys [type chaincode-id chaincode-input timeout] :or {type :golang timeout 2000}}]
  (map->ChaincodeSpec {:type type :chaincode-id chaincode-id :timeout timeout
                       :chaincode-input chaincode-input}))

(defrecord ChaincodeInvocationSpec [^ChaincodeSpec chaincode-spec
                                    ^String id-generation-alg]
  ICljToProto
  (clj->proto [this]
    (-> (Chaincode$ChaincodeInvocationSpec/newBuilder)
        (.setChaincodeSpec ^Chaincode$ChaincodeSpec (clj->proto chaincode-spec))
        (.setIdGenerationAlg id-generation-alg)
        (.build))))

(defn make-chaincode-invocation-spec
  [& {:keys [chaincode-spec id-generation-alg] :or {id-generation-alg ""}}]
  (map->ChaincodeInvocationSpec {:chaincode-spec chaincode-spec
                                           :id-generation-alg id-generation-alg}))

(defrecord ChaincodeHeaderExtension [payload-visibility ;; FIXME: type not sure
                                     ^ChaincodeID chaincode-id]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$ChaincodeHeaderExtension/newBuilder)
        (.setChaincodeId ^Chaincode$ChaincodeID (clj->proto chaincode-id))
        (.setPayloadVisibility (with-default-empty-byte-string [payload-visibility]
                                 (throw (Exception. "Currently only supports default visibility 'all'"))))
        (.build))))

(defn make-chaincode-header-extension
  [& {:keys [payload-visibility chaincode-id]}]
  (map->ChaincodeHeaderExtension {:payload-visibility payload-visibility
                                  :chaincode-id chaincode-id}))

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

(defonce header-types {:message                 Common$HeaderType/MESSAGE
                       :config                  Common$HeaderType/CONFIG
                       :config-update           Common$HeaderType/CONFIG_UPDATE
                       :endorser-transaction    Common$HeaderType/ENDORSER_TRANSACTION
                       :orderer-transaction     Common$HeaderType/ORDERER_TRANSACTION
                       :deliver-seek-info       Common$HeaderType/DELIVER_SEEK_INFO
                       :chaincode-package       Common$HeaderType/CHAINCODE_PACKAGE})

(defrecord ChannelHeader [^Long type ^Long version ^Long timestamp ^String channel-id
                          ^String tx-id ^Long epoch extension]
  ICljToProto
  (clj->proto [this]
    (-> (Common$ChannelHeader/newBuilder)
        (.setType (.getNumber ^Common$HeaderType (header-types type)))
        (.setVersion version)
        (.setTimestamp ^Timestamp (clj->proto (make-timestamp timestamp)))
        (.setChannelId channel-id)
        (.setTxId tx-id)
        (.setEpoch epoch)
        (.setExtension (with-default-empty-byte-string [extension]
                         (.toByteString ^ProposalPackage$ChaincodeHeaderExtension
                                        (clj->proto extension))))
        (.build))))

(defn make-channel-header
  [& {:keys [type version timestamp channel-id tx-id epoch extension]
      :or {type :endorser-transaction version 1 timestamp (System/currentTimeMillis) epoch 0}}]
  (map->ChannelHeader {:type type :version version :timestamp timestamp :epoch epoch
                       :channel-id channel-id :tx-id tx-id :extension extension}))

;; FIXME: id-bytes type
(defrecord SerializedIdentity [^String mspid ^String id-bytes] ;; mspid and certificate
  ICljToProto
  (clj->proto [this]
    (-> (Identities$SerializedIdentity/newBuilder)
        (.setMspid mspid)
        (.setIdBytes (ByteString/copyFromUtf8 id-bytes))
        (.build))))


(defn make-serialized-identity
  [& {:keys [mspid id-bytes]}]
  (map->SerializedIdentity {:mspid mspid :id-bytes id-bytes}))

(defrecord SignatureHeader [^SerializedIdentity creator ^bytes nonce]
  ICljToProto
  (clj->proto [this]
    (-> (Common$SignatureHeader/newBuilder)
        (.setCreator (.toByteString ^Identities$SerializedIdentity (clj->proto creator)))
        (.setNonce (ByteString/copyFrom nonce))
        (.build))))

(defn make-signature-header
  [& {:keys [creator nonce]}]
  (map->SignatureHeader {:creator creator :nonce nonce}))

(defrecord Header [channel-header signature-header] ;; both bytes
  ICljToProto
  (clj->proto [this]
    (-> (Common$Header/newBuilder)
        (.setChannelHeader (.toByteString ^Common$ChannelHeader (clj->proto channel-header)))
        (.setSignatureHeader (.toByteString ^Common$SignatureHeader (clj->proto signature-header)))
        (.build))))

(defn make-header
  [& {:keys [channel-header signature-header]}]
  (map->Header {:channel-header channel-header :signature-header signature-header}))

(defrecord Proposal [header payload extension] ; all bytes
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$Proposal/newBuilder)
        (.setHeader (.toByteString ^Common$Header (clj->proto header)))
        (.setPayload (.toByteString ^ProposalPackage$ChaincodeProposalPayload (clj->proto payload)))
        (.setExtension (with-default-empty-byte-string [extension]
                         (.toByteString
                          ;; FIXME: not sure 'type' yet and can't give type
                          (clj->proto extension))))
        (.build))))

(defn make-proposal
  [& {:keys [header payload extension]}]
  (map->Proposal {:header header :payload payload :extension extension}))

;; FIXME: input bytes
(defrecord ChaincodeProposalPayload [input ^java.util.Map transient-map]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$ChaincodeProposalPayload/newBuilder)
        (.setInput (.toByteString ^Chaincode$ChaincodeInvocationSpec (clj->proto input)))
        (.putAllTransientMap transient-map)
        (.build))))

(defn make-chaincode-proposal-payload
  [& {:keys [input transient-map] :or {transient-map {}}}]
  (map->ChaincodeProposalPayload {:input input :transient-map transient-map}))

(defrecord SignedProposal [^Proposal proposal-bytes ^bytes signature]
  ICljToProto
  (clj->proto [this]
    (-> (ProposalPackage$SignedProposal/newBuilder)
        (.setProposalBytes (.toByteString ^ProposalPackage$Proposal (clj->proto proposal-bytes)))
        (.setSignature (ByteString/copyFrom signature))
        (.build))))

(defn make-signed-proposal
  [& {:keys [proposal-bytes signature]}]
  (map->SignedProposal {:proposal-bytes proposal-bytes :signature signature}))

(defonce exec-env-map {:docker Chaincode$ChaincodeDeploymentSpec$ExecutionEnvironment/DOCKER
                       :system Chaincode$ChaincodeDeploymentSpec$ExecutionEnvironment/SYSTEM})

(defrecord ChaincodeDeploymentSpec [^ChaincodeSpec chaincode-spec ^Long effective-date
                                    ^bytes code-package exec-env]
  ICljToProto
  (clj->proto [this]
    (-> (Chaincode$ChaincodeDeploymentSpec/newBuilder)
        (.setChaincodeSpec ^Chaincode$ChaincodeSpec (clj->proto chaincode-spec))
        (.setEffectiveDate ^Timestamp (clj->proto (make-timestamp effective-date)))
        ;; code-package must exist at this point
        (.setCodePackage (ByteString/copyFrom code-package))
        (.setExecEnv (exec-env-map exec-env))
        (.build))))

(defn make-chaincode-deployment-spec
  [& {:keys [chaincode-spec effective-date code-package exec-env]
      :or {effective-date (System/currentTimeMillis) exec-env :docker}}]
  (map->ChaincodeDeploymentSpec {:chaincode-spec chaincode-spec
                                 :effective-date effective-date
                                 :code-package code-package
                                 :exec-env exec-env}))

(defrecord ConfigSignature [^bytes signature-header ^bytes signature]
  ICljToProto
  (clj->proto [this]
    (-> (Configtx$ConfigSignature/newBuilder)
        (.setSignatureHeader (ByteString/copyFrom signature-header))
        (.setSignature (Configtx$ConfigSignature/parseFrom signature))
        (.build))))

(defrecord ConfigUpdateEnvelope [^bytes config-update signatures]
  ICljToProto
  (clj->proto [this]
    (-> (Configtx$ConfigUpdateEnvelope/newBuilder)
        (.setConfigUpdate (ByteString/copyFrom config-update))
        (.addAllSignagures (mapv #(Configtx$ConfigSignature/parseFrom ^bytes %) signatures))
        (.build))))

(defn make-config-update-envelope
  [& {:keys [config-update signatures]}]
  (map->ConfigUpdateEnvelope {:config-update config-update :signatures signatures}))

;;;
;;; Responses
;;;

(defrecord ChannelInfo [^String channel-id])
(defn make-channel-info
  [& {:keys [channel-id]}]
  (map->ChannelInfo {:channel-id channel-id}))

(defrecord ChaincodeInfo [^String name ^String version ^String path ^String input ^String escc ^String vscc])
(defn make-chaincode-info
  [& {:keys [name version path input escc vscc]}]
  (map->ChaincodeInfo {:name name :version version :path path :input input :escc escc :vscc vscc}))

(defrecord BlockchainInfo [^Long height current-block-hash previous-block-hash] ;; bytes
  )

(defn make-blockchain-info
  [& {:keys [height current-block-hash previous-block-hash]}]
  (map->BlockchainInfo {:height height :current-block-hash current-block-hash :previous-block-hash previous-block-hash}))

(defrecord BlockHeader [^Long number previous-hash data-hash]) ;; bytes
(defn make-block-header
  [& {:keys [number previous-hash data-hash]}]
  (map->BlockHeader {:number number :previous-hash previous-hash :data-hash data-hash}))

(defrecord BlockData [^clojure.lang.PersistentVector data])
(defn make-block-data
  [& {:keys [data]}]
  (map->BlockData {:data data}))

(defrecord BlockMetadata [^clojure.lang.PersistentVector metadata])
(defn make-block-metadata
  [& {:keys [metadata]}]
  (map->BlockMetadata {:metadata metadata}))

(defrecord Block [^BlockHeader header ^BlockData data ^BlockMetadata metadata])
(defn make-block
  [& {:keys [header data metadata]}]
  (map->Block {:header header :data data :metadata metadata}))

(defrecord Envelope [payload signature]) ;; bytes
(defn make-envelope
  [& {:keys [payload signature]}]
  (map->Envelope {:payload payload :signature signature}))

(defrecord ProcessedTransaction [^Envelope transaction-envelope ^Long validation-code] )
(defn make-processed-transaction
  [& {:keys [transaction-envelope validation-code]}]
  (map->ProcessedTransaction {:transaction-envelope transaction-envelope :validation-code validation-code}))

(defn- convert-args
  [args]
  (mapv #(cond (utils/bytes? %) (ByteString/copyFrom #^bytes %)
                                  (instance? ChaincodeDeploymentSpec %) (.toByteString ^Chaincode$ChaincodeDeploymentSpec (clj->proto %))
                                  :else (ByteString/copyFromUtf8 (str %)))
                           args))

(extend-protocol IProtoToClj

  Query$ChaincodeQueryResponse
  (proto->clj [this]
    (mapv (fn [^Query$ChaincodeInfo ci]
            (make-chaincode-info :name (.getName ci) :version (.getVersion ci) :path (.getPath ci)
                                 :input (.getInput ci) :escc (.getEscc ci) :vscc (.getVscc ci)))
          (.getChaincodesList this)))

  Query$ChannelQueryResponse
  (proto->clj [this]
    (mapv (fn [^Query$ChannelInfo ci] (make-channel-info :channel-id (.getChannelId ci)))
          (.getChannelsList this)))
  
  Ledger$BlockchainInfo
  (proto->clj [this]
    (make-blockchain-info :height (.getHeight this)
                          :current-block-hash (.getCurrentBlockHash this) :previous-block-hash (.getPreviousBlockHash this)))

  Common$BlockHeader
  (proto->clj [this]
    (make-block-header :number (.getNumber this) :previous-hash (.getPreviousHash this) :data-hash (.getDataHash this)))
  
  Common$BlockData
  (proto->clj [this]
    (make-block-data :data (.getDataList this)))
  
  Common$BlockMetadata
  (proto->clj [this]
    (make-block-metadata :metadata (.getMetadataList this)))

  Common$Block
  (proto->clj [this]
    (make-block :header         (proto->clj (.getHeader this))
                :data           (proto->clj (.getData this))
                :metadata       (proto->clj (.getMetadata this))))

  TransactionPackage$ProcessedTransaction
  (proto->clj [this]
    (make-processed-transaction :transaction-envelope (proto->clj (.getTransactionEnvelope this))
                                :validation-code (.getValidationCode this)))
  
  Common$Envelope
  (proto->clj [this]
    (make-envelope :payload (.getPayload this) :signature (.getSignature this)))
  )

;;;
(defn send-update-channel-using-envelope
  [channel-name ^bytes envelope]
  (let [cc-envelope (Common$Envelope/parseFrom envelope)
        cc-payload (Common$Payload/parseFrom (.getPayload cc-envelope))
        cc-channel-header (Common$ChannelHeader/parseFrom (.getChannelHeader (.getHeader cc-payload)))]
    (assert (= (.getNumber Common$HeaderType/CONFIG_UPDATE) (.getType cc-channel-header)))
    (assert (= channel-name (.getChannelId cc-channel-header)))
    (let [config-update-env (Configtx$ConfigUpdateEnvelope/parseFrom (.getData cc-payload))
          config-update (.getConfigUpdate config-update-env)]
      
      #_
      (send-dupate-channel (.toByteArray config-update singers orderer))
      )))

;;;
;;; Async processing
;;;
(defn peer->channel
  [{:keys [url pem hostname-override?]
    :as peer}]
  ;; pem = byte of ASN.1 encoding 
  (let [{:keys [protocol host port]} (utils/parse-grpc-url url)
        channel-builder (NettyChannelBuilder/forAddress ^String host (Integer/parseInt port))]
    (case protocol
      "grpc"  (.usePlaintext channel-builder true)
      ;; From Fabric Java SDK
      "grpcs" (if (nil? pem)
                (throw (Exception. "FIXME: Implement - use root certificate!"))

                ;; FIXME: somehow this does not work!!
                ;; (maybe 'overrideAuthority' is still experimental??
                ;; 
                ;; (let [ssl-context (-> (GrpcSslContexts/forClient)
                ;;                       (.trustManager (ByteArrayInputStream. pem))
                ;;                       (.sslProvider SslProvider/OPENSSL)
                ;;                       (.build))]
                ;;   (when hostname-override?
                ;;     (let [{:keys [host port]} (utils/parse-grpc-url url)]
                ;;       (.overrideAuthority channel-builder ^String (str host ":" port))))
                ;;   (.negotiationType (.sslContext channel-builder (.build ssl-context)) NegotiationType/TLS)
                ;;   ;; set builder properties
                ;;   ;; keepAliveTime
                ;;   ;; keepAliveTimeout
                ;;   ;; withOption
                ;;   )
                (let [ssl-context-builder (-> (GrpcSslContexts/forClient)
                                              (.sslProvider SslProvider/OPENSSL))]
                  (when hostname-override?
                    ;; This is for 'development' purpose
                    (.trustManager ssl-context-builder (InsecureTrustManagerFactory/INSTANCE)))
                  (.negotiationType (.sslContext channel-builder (.build ssl-context-builder)) NegotiationType/TLS)
                  ;; set builder properties
                  ;; keepAliveTime
                  ;; keepAliveTimeout
                  ;; withOption
                  )))
    (.build channel-builder)))

(defn response-waiting-observer
  [k ch]
  (reify StreamObserver
    (onNext [this proposal-response]
      (async/put! ch [k proposal-response]))
    (onError [this err]
      (async/put! ch [k err]))
    (onCompleted [this])))

(defmacro binding-grpc-waiting-auto-callback [[k callback-fn] & body]
  `(let [ch# (async/chan)
         ~callback-fn (response-waiting-observer ~k ch#)]
     ~@body
     ch#))

(defn send-chaincode-request-to-peer
  [peer proposal]
  (binding-grpc-waiting-auto-callback [peer callback]
    (.processProposal (EndorserGrpc/newStub ^ManagedChannel (peer->channel peer))
                      (clj->proto proposal)
                      callback)))

;;;;
(comment
  (def chaincode-id1 (map->ChaincodeID {:name "name" :version "version" :path "path"}))
  (def chaincode-input1 (map->ChaincodeInput {:args [] :decorations {}}))
  (def chaincode-spec1 (map->ChaincodeSpec {:type :golang
                                                      :chaincode-id chaincode-id1
                                                      :chaincode-input chaincode-input1
                                                      :timeout 100}))

  (def chaincode-invocation-spec1 (map->ChaincodeInvocationSpec {:chaincode-spec chaincode-spec1
                                                                           :id-generation-alg ""}))

  (def chaincode-header-extension1 (map->ChaincodeHeaderExtension
                                                  {:payload-visibility "FIXME"
                                                   :chaincode-id chaincode-id1}))

  (def timestamp1 (make-timestamp))
  )
