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
;; Client and User are merged to simplify mutation operations
;; User is 'top-level' object and has all information including
;;      channels and crypto-suite

;;
;; User implementation of "Fabric SDK Design Spec"
;; 
;; The User class represents users that have been enrolled and represented by an enrollment
;; certificate (ECert) and a signing key. The ECert must have been signed by one of the CAs
;; the blockchain network has been configured to trust. An enrolled user (having a signing key
;; and ECert) can conduct chaincode deployments, transactions and queries with the Chain. 
;; User ECerts can be obtained from a CA beforehand as part of deploying the application,
;; or it can be obtained from the optional Fabric COP service via its enrollment process.
;; Sometimes User identities are confused with Peer identities. User identities represent
;; signing capability because it has access to the private key, while Peer identities
;; in the context of the application/SDK only has the certificate for verifying signatures.
;; An application cannot use the Peer identity to sign things because the application doesn’t
;; have access to the Peer identity’s private key.

(ns clojure-fabric.user
  (:require [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.core :as core]
            [clojure-fabric.crypto-suite :as crypto-suite]
            [clojure-fabric.event-hub :as event-hub]
            [clojure-fabric.proto :as proto]
            [clojure-fabric.orderer :as orderer]
            [clojure.java.io :as io])
  (:import [java.io ByteArrayOutputStream File FileInputStream]
           [org.apache.commons.compress.archivers.tar TarArchiveEntry TarArchiveOutputStream]
           org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream
           org.apache.commons.io.IOUtils
           [org.hyperledger.fabric.protos.common Common$Envelope Common$SignatureHeader Configtx$ConfigUpdate]))

(defn ca-user?
  [user]
  (not (nil? (:ca-location user))))

(defmacro with-validating-peers
  [[user-or-channel target-peers] & body]
  `(let [unknown-peers# (clojure.set/difference (set ~target-peers)
                                                (core/get-nodes ~user-or-channel :peers))]
     (when-not (empty? unknown-peers#)
       (throw (Exception. "The target Peer(s) does not know anything about the channel")))
     ~@body))

(defonce system-channel-name "")

;; (defonce ^:private client-state-store (atom {}))
;; ;;; set_state_store
;;
;; (defn set-state-store!
;;   "The SDK should have a built-in key value store implementation (suggest a file-based
;;   implementation to allow easy setup during development). But production systems would want
;;   a store backed by database for more robust storage and clustering, so that multiple
;;   app instances can share app state via the database (note that this doesn't necessarily
;;   make the app stateful). This API makes this pluggable so that different store implementations
;;   can be selected by the application.

;;   Params:
;;         store (KeyValueStore): instance of an alternative KeyValueStore implementation 
;;         provided by the consuming app.
;;   Returns:
;;         None"
;;   ([store]
;;    (set-state-store! *client* store))
;;   ([client store]
;;    (swap! client-state-store assoc client (atom {}))))

;; ;;; get_state_store
;; (defn get-state-store
;;   "A convenience method for obtaining the state store object in use for this client.
;; Params:
;;         None
;; Returns: 
;;         (KeyValueStore instance): The KeyValueStore implementation object set within this Client, 
;;         or null if it does not exist "
;;   ([]
;;    (get-state-store *client*))
;;   ([client]
;;    (get @client-state-store client)))

;;; set_crypto_suite
;;   "Sets an instance of the CryptoSuite interface implementation. A crypto suite encapsulates
;;   algorithms for digital signatures and encryption with asymmetric key pairs, message encryption
;;   with a symmetric key, and secure hashing and MAC.

(defn new-crypto-suite!
  ([crypto-opts]
   (new-crypto-suite! core/*user* crypto-opts))
  ([{:keys [msp-id name]} crypto-opts]
   (swap! core/users assoc-in [[msp-id name] crypto-opts]
          (core/make-crypto-suite crypto-opts))))

;;; set_user_context
;; "Sets an instance of the User class as the security context of this client instance.
;;   This user's credentials (ECert) will be used to conduct transactions and queries with
;;   the blockchain network. Upon setting the user context, the SDK saves the object in a persistence
;;   cache if the \"state store\" has been set on the Client instance. If no state store has been set,
;;   this cache will not be established and the application is responsible for setting the user
;;   context again when the application crashed and is recovered.
;;   Params:
;;         user (User): an instance of the User class encapsulating the authenticated user’s
;;         signing materials (private key and enrollment certificate)"
;;
;; See new-user!


;;; get_user_context

;; (defn get-user-context
;;  "As explained above, the client instance can have an optional state store. The SDK saves enrolled
;;   users in the storage which can be accessed by authorized users of the application 
;;   (authentication is done by the application outside of the SDK). This function attempts to load
;;   the user by name from the local storage (via the KeyValueStore interface). 
;;   The loaded user object must represent an enrolled user with a valid enrollment certificate 
;;   signed by a trusted CA (such as the COP server). 
;;   Params:
;;         name (str): The name of the user
;;   Returns: 
;;         (User instance): The user object corresponding to the name, or null if the user does not
;;         exist or if the state store has not been set"
;;   ([name]
;;    (get-user-context *client* name))
;;   ([client name]
;;    ;; TBD
;;    ))
;;
;; See get-user


;;;
;;; Not in spec, but in some SDKs
;;;

(defn known-channel-node?
  [channel {target-name :name target-url :url target-pem :pem} plural-type-key]
  (loop [[[_ {:keys [name url pem]}] & more-peer] (seq (plural-type-key channel))]
    (cond (nil? name) false
          (and (= target-name name) (= target-url url) (= target-pem pem)) true
          :else (recur more-peer))))

(defn known-user-node?
  [user node plural-type-key]
  (loop [[[_ c] & more-c] (seq (:channels user))]
    (cond (nil? c) false
          (known-channel-node? c node plural-type-key) true
          :else (recur more-c))))

;;; get_name
(defn get-name
  "Get member name. Required property for the instance objects.
  Returns (str): 
        The name of the user"
  ([]
   (get-name core/*user*))
  ([user]
   (:name user)))


;;; get_roles
(defn get-roles
 "Get the user’s roles. It’s an array of possible values in “client”, and “auditor”.
  The member service defines two more roles reserved for peer membership: “peer” and “validator”,
  which are not exposed to the applications.
  Returns: (str[]): 
        The roles for this user"
  ([]
   (get-roles core/*user*))
  ([user]
   (:roles user)))

;;; get_enrollment_certificate
;;;
;;; FIXME: just use :certificate and remove this function?
(defn get-enrollment-certificate
  "Returns the underlying ECert representing this user’s identity.
  Params: none
  Returns:
        Certificate in PEM format signed by the trusted CA"
  ([]
   (get-enrollment-certificate core/*user*))
  ([user]
   (:certificate user)))


;;(def cu (tx-file->config-update "/home/jc/Work/clojure-fabric/resources/fixture/balance-transfer/artifacts/channel/mychannel.tx"))
;;
;; (create-or-update-channel-from-nodes (core/get-user "Org1MSP" "user1") "testchan14"
;;                                      (merge (first (core/get-nodes (core/get-user "Org1MSP" "user1") :orderers))
;;                                             (get @core/users  ["Orderer" "admin"]))
;;                                      [(get @core/users  ["Org1MSP" "admin"]) (get @core/users  ["Org2MSP" "admin"])
;;                                       (get @core/users  ["Orderer" "admin"])]
;;                                      cu2)
;;; set_name
;;; Immutable

;;; set_roles
;;; Immutable

;;; set_enrollment_certificate
;;; Immutable


;;; generate_tcerts
;; Not required any more(?) - https://jira.hyperledger.org/browse/FAB-5740
;; (defn generate-tcerts
;;   "Gets a batch of TCerts to use for transaction. there is a 1-to-1 relationship between TCert
;;   and Transaction. The TCert can be generated locally by the SDK using the user’s crypto materials.
;;   Params:
;;         count (number): how many in the batch to obtain?
;;         Attributes (string[]): list of attributes to include in the TCert
;;   Returns (TCert[]): 
;;         An array of TCerts"
;;   ([count attributes]
;;    (generate-tcerts core/*user*))
;;   ([user count attributes])
;;   ;; TBD
;;   ;; Not sure if this is required now (couldn't find any usage in Java code)
;;   )

(defn make-config-signature
  [user config-update {:keys [header-version] :or {header-version 1}}]
  (let [identity (proto/user->serialized-identity user)
        nonce (proto/make-nonce)
        signature-header (proto/make-signature-header :creator identity :nonce nonce)
        signature-header-bytes (.toByteArray ^Common$SignatureHeader (proto/clj->proto signature-header))
        signature-header-length (alength signature-header-bytes)
        config-update-length (alength ^bytes config-update)
        header+config-bytes (byte-array (+ signature-header-length config-update-length))]
    (System/arraycopy signature-header-bytes 0 header+config-bytes 0 signature-header-length)
    (System/arraycopy config-update 0 header+config-bytes signature-header-length config-update-length)
    (->> (crypto-suite/sign header+config-bytes
                            (:private-key user)
                            {:algorithm (:key-algorithm (:crypto-suite user))})
         (proto/make-config-signature :signature-header signature-header
                                      :signature))))

;;;
;;; Utility functions
;;;
(defonce default-tgz-size 500000)       ;500kb, from Java SDK

(defonce type->file-extensions {:golang #{"go"} :java #{"java"} :node #{"js"}})

(defn make-tgz-package
  [type path filename]
  (let [target-extensions (type->file-extensions type)
        file-size-pairs (for [^File f (file-seq (io/as-file filename))
                              :let [name (.getName f)
                                    idx (inc (.lastIndexOf name "."))]
                              :when (and (pos? idx) 
                                         (contains? target-extensions (subs name idx)))]
                          [f (.length f)])
        total-size (reduce #(+ %1 (second %2)) 0 file-size-pairs)]
    (when-not (empty? file-size-pairs)
      (let [tgz-path (str "src/" (if (->> path count dec (get path) (= \/))
                                   path
                                   (str path "/")))
            byte-ostream (ByteArrayOutputStream. (min total-size default-tgz-size))
            tgz-ostream (doto (TarArchiveOutputStream. (GzipCompressorOutputStream. byte-ostream))
                          (.setLongFileMode TarArchiveOutputStream/LONGFILE_GNU))]
        (try 
          (doseq [[^File f s] file-size-pairs]
            (let [archive-entry (TarArchiveEntry. f
                                                  (str tgz-path (.getName ^java.io.File f)))
                  istream (FileInputStream. f)]
              (try (.putArchiveEntry tgz-ostream archive-entry)
                   (IOUtils/copy istream tgz-ostream)
                   (finally (IOUtils/closeQuietly istream)
                            (.closeArchiveEntry tgz-ostream)))))
          (finally
            (IOUtils/closeQuietly tgz-ostream)))
        (.toByteArray byte-ostream)
        ;; test
        #_
        (with-open [w (clojure.java.io/output-stream "/tmp/test.tgz")]
          (.write w (.toByteArray byte-ostream)))))))

;; (make-tgz-package :golang "github.com/example_cc" "/home/jc/Work/clojure-fabric/resources/gocc")


(defonce max-tx-file-size 1024)
(defn clj-config-update->proto-byte-array
  [config-update]
  (-> ^Configtx$ConfigUpdate (proto/clj->proto config-update)
      (.toByteArray)))

(defn tx-file->config-update
  [tx-filename]
  (let [tx-file (io/as-file tx-filename)]
    (assert (<= (.length tx-file) max-tx-file-size))
    (let [envelope (->> (with-open [in (io/input-stream tx-file)
                                    out (java.io.ByteArrayOutputStream.)]
                          (io/copy in out)
                          (Common$Envelope/parseFrom (.toByteArray out))))]
      (-> (proto/proto->clj envelope
                            (proto/parse-trees :block-config-update-envelope))
          (get-in [:payload :data :config-update])))))
;;;
;;; Public API
;;;

(defn create-or-update-channel
  ([orderer envelope]
   (orderer/send-broadcast orderer envelope)
   (proto/broadcast-or-deliver-via-orderer :broadcast orderer envelope))
  ([user channel-id orderer config-update signatures]
   (->> (proto/make-config-update-envelope :config-update config-update :signatures signatures)
        (proto/make-envelope-message channel-id user :config-update)
        (create-or-update-channel orderer))))

;; This is like create-channel
(defn create-or-update-channel-from-nodes
  [user channel-id orderer nodes config-update]
  ;; participants = orderers + peers
  (create-or-update-channel user
                            channel-id
                            orderer
                            config-update
                            (mapv (fn [node]
                                    (make-config-signature node config-update {}))
                                  nodes)))

;; This is like create-user
(defn new-user!
  [{:keys [msp-id name]
    :as args}]
  ;; roles - client, auditor
  ;; %roles - peer, validator
  (swap! core/users assoc [msp-id name] (core/make-user args)))

;;; get_chain
(defn get-channel
  "Get a chain instance from the state storage. This allows existing chain instances to be saved
  for retrieval later and to be shared among instances of the application. Note that it's the 
  application/SDK’s responsibility to record the chain information. If an application is not able to
  look up the chain information from storage, it may call another API that queries one or more Peers
  for that information.
  Params:
        name (str): The name of the chain
  Returns:
        (Chain instance or None): the chain instance for the name.
  Error:  The state store has not been set
        A chain does not exist under that name"
  ;; Implementation Note:
  ;;    Not a storage operation 
  ([channel-name]
   (get-channel core/*user* channel-name))
  ([{:keys [channels]} channel-name]
   (if-let [found (get channels channel-name)]
     found
     ;; Implementation Note
     ;;       The spec says that Returns is chain Instance or None
     ;;       How it can be None and also throw an exception?
     (throw (Exception. "A channel does not exist under that name")))))

;;; get_crypto_suite 
(defn get-crypto-suite
  "A convenience method for obtaining the CryptoSuite object in use for this client.
  Params:
        None
  Returns:
        (CryptoSuite instance): The CryptoSuite implementation object set within this Client, 
        or null if it does not exist"
  ([]
   (get-crypto-suite core/*user*))
  ([user]
   (:crypto-suite user)))

(defn install-chaincode
  ([name path version package-filename type target-peers]
   (install-chaincode core/*user* name path version package-filename target-peers))
  ([user name path version package-filename type target-peers]
   ;; path 'mycompany.com/myproject/mypackage/mychaincode'
   ;; package 'src/mycompany.com/myproject/mypackage/mychaincode'
   (with-validating-peers [user target-peers]
     (let [chaincode-id (proto/make-chaincode-id :name name :version version :path path)
           chaincode-input (proto/make-chaincode-input) ;; no args and decorations
           spec (proto/make-chaincode-spec :type type
                                           :chaincode-id chaincode-id
                                           :chaincode-input chaincode-input)
           tgz-package (make-tgz-package type path package-filename)
           deployment-spec (proto/make-chaincode-deployment-spec :chaincode-spec spec
                                                                 :code-package tgz-package)]
       (chaincode/send-system-chaincode-request :install-chaincode
                                                system-channel-name
                                                target-peers
                                                user
                                                {:args [deployment-spec]})))))

;;; new_chain
;;;
;; "Initializes a chain instance with the given name. This is really representing the \"Channel\"
;;   (as explained above), and this call returns an empty object. To initialize the channel, a list of
;;   participating endorsers and orderer peers must be configured first on the returned object.
;;   Params:
;;         name (str): The name of the chain, recommend using namespaces to avoid collision
;;   Returns:
;;         (Chain instance): The uninitialized chain instance."
;;
;;
(defn new-channel!
  ([channel-opts]
   (new-channel! core/*user* channel-opts))
  ([{msp-id :msp-id user-name :name} channel-opts]
   (let [user-key [msp-id user-name]]
     (swap! core/users assoc-in [user-key :channels (:name channel-opts)]
            (core/make-channel (assoc channel-opts :user-key user-key))))))

(defn new-event-hub!
  [user peer]
  (if-let [existing-eh (deref (:event-hub peer))]
    (throw (Exception. "An event-hub already exists!"))
    (let [event-hub (event-hub/make-event-hub user peer)]
      (reset! (:event-hub peer) event-hub)
      event-hub)))


;;; query_chain-info
(defn query-channels
    "This is a network call to the designated Peer(s) to discover the chain information.
  The target Peer(s) must be part of the chain in question to be able to return the requested
  information.
  Params:
        name (str): The name of the chain
        peers (array of Peer instances): target Peers to query
  Returns: 
        (Chain instance or None): the chain instance for the name.
  Error: 
        The target Peer(s) does not know anything about the chain"
  ([peers]
   (query-channels core/*user* peers))
  ([user target-peers]
   (chaincode/send-system-chaincode-request :query-channels
                                            system-channel-name
                                            target-peers
                                            user
                                            {})))


(defn query-installed-chaincodes
  ([peer]
   (query-installed-chaincodes core/*user* peer))
  ([user peer]
   (if (known-user-node? user peer :peers)
     (first (chaincode/send-system-chaincode-request :query-installed-chaincodes
                                                     system-channel-name
                                                     peer
                                                     user
                                                     {}))
     (throw (Exception. "The target Peer does not know anything about the channel")))))


;; (def e1 (Common$Envelope/parseFrom buf))
;; (def p0 (.getPayload e1))
;; (def p1 (Common$Payload/parseFrom p0))
;; (def h1 (.getHeader p1))
;; (def d1 (.getData p1))
;; (def e2 (Configtx$ConfigUpdateEnvelope/parseFrom d1))
;; (def c1 (.getConfigUpdate e2))
;; (def s1 (.getSignatures e2))


;; Example Envelope
;; 
;; {:payload
;;  {:header
;;   {:channel-header
;;    {:type 2,
;;     :version 0,
;;     :timestamp
;;     #object[com.google.protobuf.Timestamp 0x2a83646 "seconds: 1504437450\n"],
;;     :channel-id "mychannel",
;;     :tx-id
;;     "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855",
;;     :epoch 0,
;;     :extension nil},
;;    :signature-header nil},
;;   :data
;;   {:config-update
;;    {:channel-id "mychannel",
;;     :read-set
;;     {:version 0,
;;      :groups
;;      {"Application"
;;       {:version 0,
;;        :groups
;;        {"Org1MSP"
;;         {:version 0,
;;          :groups {},
;;          :values {},
;;          :policies {},
;;          :mod-policy ""},
;;         "Org2MSP"
;;         {:version 0,
;;          :groups {},
;;          :values {},
;;          :policies {},
;;          :mod-policy ""}},
;;        :values {},
;;        :policies {},
;;        :mod-policy ""}},
;;      :values
;;      {"Consortium"
;;       {:version 0,
;;        :value
;;        #object[com.google.protobuf.ByteString$LiteralByteString 0x21fc45b8 "<ByteString@21fc45b8 size=18>"],
;;        :mod-policy ""}},
;;      :policies {},
;;      :mod-policy ""},
;;     :write-set
;;     {:version 0,
;;      :groups
;;      {"Application"
;;       {:version 1,
;;        :groups
;;        {"Org1MSP"
;;         {:version 0,
;;          :groups {},
;;          :values {},
;;          :policies {},
;;          :mod-policy ""},
;;         "Org2MSP"
;;         {:version 0,
;;          :groups {},
;;          :values {},
;;          :policies {},
;;          :mod-policy ""}},
;;        :values {},
;;        :policies
;;        {"Readers"
;;         {:version 0,
;;          :value nil,
;;          :mod-policy "Admins",
;;          :policy
;;          {:type 3,
;;           :value
;;           #object[com.google.protobuf.ByteString$LiteralByteString 0xce868e0 "<ByteString@ce868e0 size=9>"]}},
;;         "Admins"
;;         {:version 0,
;;          :value nil,
;;          :mod-policy "Admins",
;;          :policy
;;          {:type 3,
;;           :value
;;           #object[com.google.protobuf.ByteString$LiteralByteString 0x6be90317 "<ByteString@6be90317 size=10>"]}},
;;         "Writers"
;;         {:version 0,
;;          :value nil,
;;          :mod-policy "Admins",
;;          :policy
;;          {:type 3,
;;           :value
;;           #object[com.google.protobuf.ByteString$LiteralByteString 0x2a69065e "<ByteString@2a69065e size=9>"]}}},
;;        :mod-policy "Admins"}},
;;      :values
;;      {"Consortium"
;;       {:version 0,
;;        :value
;;        #object[com.google.protobuf.ByteString$LiteralByteString 0x6b243e92 "<ByteString@6b243e92 size=18>"],
;;        :mod-policy ""}},
;;      :policies {},
;;      :mod-policy ""},
;;     :type 0,
;;     :isolated-data {}},
;;    :signatures []}},
;;  :signature nil}
