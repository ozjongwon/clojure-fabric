(ns clojure-fabric.core
  "Clojure wrapper for Hyperledger Java SDK functions"
  (:require [clojure.algo.generic.functor :as algo]
            [clojure.string :as str]
            [buddy.core.certificates :as certs]
            [buddy.core.keys :as keys]
            [clojure-fabric.block :as block]
            [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.crypto-suite :as crypto]
            [clojure-fabric.client :as client]
            [clojure-fabric.request :as request]
            [clojure-fabric.response :as response]
            [clojure-fabric.user :as user])
  (:import [org.hyperledger.fabric.sdk User Enrollment]))

(defn- fabric-package?
  [clazz]
  (->> (.getName clazz)
       (re-find #"org\.hyperledger\.fabric\.sdk")
       some?))

(defprotocol IMarshall
  "Defines the contract for converting Java types to Clojure
  data. All return values from FABRIC service calls are
  marshalled. As such, the FABRIC service-specific namespaces
  will frequently need to implement this protocol in order
  to provide convenient data representations. See also the
  register-coercions function for coercing Clojure data to
  Java types."
  (marshall [obj]))

(extend-protocol IMarshall
  nil
  (marshall [obj] nil)

  java.util.Map
  (marshall [obj]
    (if-not (empty? obj)
      (apply assoc {}
             (interleave
              (algo/fmap #(if (string? %) (keyword %) %)
                         (apply vector (keys obj)))
              (algo/fmap marshall
                         (apply vector (vals obj)))))))

  java.util.Collection
  (marshall [obj]
    (if (instance? clojure.lang.IPersistentSet obj)
      obj
      (algo/fmap marshall (apply vector obj))))

  ;; java.util.Date
  ;; (marshall [obj] (DateTime. (.getTime obj)))

                                        ; `false` boolean objects (i.e. (Boolean. false)) come out of e.g.
                                        ; .doesBucketExist, which wreak havoc on Clojure truthiness
  Boolean
  (marshall [obj] (when-not (nil? obj) (.booleanValue obj)))

  ;; Object
  ;; (marshall [obj]
  ;;   (if (fabric-package? (class obj))
  ;;     (get-fields obj)
  ;;     obj))
  )

;; ;;;
;; ;;; From Amazonica
;; ;;;
;; (defn- unmarshall
;;   "Transform Clojure data to the required Java objects."
;;   [types col]
;;   (let [type (last (or (:actual types)
;;                        (:generic types)))
;;         pp   (partial populate types :actual)]
;;     (try
;;       (if (aws-package? type)
;;         (if (map? col)
;;           (if (contains? types :actual)
;;             (if (< (:depth types) 3)
;;               (apply assoc {}
;;                      (interleave (fmap kw->str (apply vector (keys col)))
;;                                  (fmap pp (apply vector (vals col)))))
;;               (apply assoc {}
;;                      (interleave (fmap kw->str (apply vector (keys col)))
;;                                  [(fmap #(populate {:generic [type]}
;;                                                    :generic
;;                                                    %)
;;                                         (first (apply vector (vals col))))])))
;;             (populate types :generic col))
;;           (if (and (contains? types :actual)
;;                    (= (:depth types) 3))
;;             (fmap #(fmap pp %) col)
;;             (fmap pp col)))
;;         (if (and (contains? types :actual)
;;                  (aws-package? type))
;;           (fmap pp col)
;;           (fmap #(coerce-value % type) col)))
;;       (catch Throwable e
;;         (throw (RuntimeException. (str
;;                                    "Failed to create an instance of "
;;                                    (.getName type)
;;                                    " from " col
;;                                    " due to " e
;;                                    ". Make sure the data matches an existing constructor and setters.")))))))

;; (defprotocol IMarshall
;;   "Defines the contract for converting Java types to Clojure
;;   data. All return values from AWS service calls are
;;   marshalled. As such, the AWS service-specific namespaces
;;   will frequently need to implement this protocol in order
;;   to provide convenient data representations. See also the
;;   register-coercions function for coercing Clojure data to
;;   Java types."
;;   (marshall [obj]))

;; (extend-protocol IMarshall
;;   nil
;;   (marshall [obj] nil)

;;   java.util.Map
;;   (marshall [obj]
;;     (if-not (empty? obj)
;;       (apply assoc {}
;;         (interleave
;;           (fmap #(if (string? %) (keyword %) %)
;;                 (apply vector (keys obj)))
;;           (fmap marshall
;;                 (apply vector (vals obj)))))))

;;   java.util.Collection
;;   (marshall [obj]
;;     (if (instance? clojure.lang.IPersistentSet obj)
;;       obj
;;       (fmap marshall (apply vector obj))))

;;   java.util.Date
;;   (marshall [obj] (DateTime. (.getTime obj)))

;;   ; `false` boolean objects (i.e. (Boolean. false)) come out of e.g.
;;   ; .doesBucketExist, which wreak havoc on Clojure truthiness
;;   Boolean
;;   (marshall [obj] (when-not (nil? obj) (.booleanValue obj)))

;;   Object
;;   (marshall [obj]
;;     (if (aws-package? (class obj))
;;         (get-fields obj)
;;         obj)))



;;;;;;;;;;; Ex
#_
(comment
  ;; sudo openssl req -x509 -nodes -days 365 -newkey rsa:2048 -keyout resource/creds/clojure-fabric.key -out resource/creds/clojure-fabric.crt
  ;; mv <result-files>

  ;; Copy from fabcar example
  (defonce options
    {:channel-id "mychannel" :chaincode-id "fabcar" :network-url "grpc://localhost:7051"
     :peer-admin
     {:name "PeerAdmin"
      :mspid "Org1MSP" :roles nil :affiliation "" 
      :enrollment-secret "" 
      :enrollment {:signing-identity "cd96d5260ad4757551ed4a5a991e62130f8008a0bf996e4e4b84cd097a747fec" 
                   :identity {:certificate "-----BEGIN CERTIFICATE-----\nMIICGDCCAb+gAwIBAgIQFSxnLAGsu04zrFkAEwzn6zAKBggqhkjOPQQDAjBzMQsw\nCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZy\nYW5jaXNjbzEZMBcGA1UEChMQb3JnMS5leGFtcGxlLmNvbTEcMBoGA1UEAxMTY2Eu\nb3JnMS5leGFtcGxlLmNvbTAeFw0xNzA4MzEwOTE0MzJaFw0yNzA4MjkwOTE0MzJa\nMFsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1T\nYW4gRnJhbmNpc2NvMR8wHQYDVQQDDBZBZG1pbkBvcmcxLmV4YW1wbGUuY29tMFkw\nEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEV1dfmKxsFKWo7o6DNBIaIVebCCPAM9C/\nsLBt4pJRre9pWE987DjXZoZ3glc4+DoPMtTmBRqbPVwYcUvpbYY8p6NNMEswDgYD\nVR0PAQH/BAQDAgeAMAwGA1UdEwEB/wQCMAAwKwYDVR0jBCQwIoAgQjmqDc122u64\nugzacBhR0UUE0xqtGy3d26xqVzZeSXwwCgYIKoZIzj0EAwIDRwAwRAIgXMy26AEU\n/GUMPfCMs/nQjQME1ZxBHAYZtKEuRR361JsCIEg9BOZdIoioRivJC+ZUzvJUnkXu\no2HkWiuxLsibGxtE\n-----END CERTIFICATE-----\n"}}}})

  ;; 1. Client setup
  (defonce cli (client/create-new-instance))
  (client/set-crypto-suite cli (crypto/get-crypto-suite))
 
  ;; 2. User context
  (defonce peer-admin-enrollment
    (reify Enrollment
      ;; FIXME: enrollment!
      ;; How to iniitiate key and cert?
      (getKey [this]
        (-> (slurp (str "resources/creds/"
                     (->  options
                          (get-in [:peer-admin :enrollment :signing-identity])
                          (str "-priv"))))
            (keys/str->private-key)))
      (getCert [this]
        (get-in options [:peer-admin :enrollment :identity :certificate]))))
  
  (defonce peer-admin
    (reify User
      (getName [this]
        (get-in options [:peer-admin :name]))
      ;; Set<String>
      (getRoles [this]
        (get-in options [:peer-admin :roles]))
      (getAccount [this]
        nil)
      (getAffiliation [this]
        (get-in options [:peer-admin :affiliation]))
      (getEnrollment [this]
        peer-admin-enrollment)
      (getMspId [this]
        (get-in options [:peer-admin :mspid]))))
  
  (client/set-user-context cli peer-admin)

  
  ;; 2. Channel
  (defonce chan (client/new-channel cli (:channel-id options)))
  (channel/add-orderer chan (client/new-orderer cli "orderer0" "grpc://localhost:7050"))
  (channel/add-peer chan (client/new-peer cli "peer0" "grpc://localhost:7051"))
  (channel/initialize chan)

  ;; 3. Request
  (defonce req (client/new-transaction-proposal-request cli))

  (defonce chaincode-id (-> (chaincode/new-builder)
                            (chaincode/set-name "fabcar")
                            (chaincode/set-version "1.0")
                            (chaincode/set-path "resources/")
                            (chaincode/build)))
  (request/set-chaincode-id req chaincode-id)
  (request/set-fcn req "some_function")
  ;; timeout
  (request/set-proposal-wait-time req 10000)
  ;; FIXME: marshall
  (request/set-args req ["some args"])

  (defonce resp (channel/send-transaction-proposal chan req))
  (defonce future1 (channel/send-transaction chan resp (client/get-user-context cli)))
  (.get future1)
  )

