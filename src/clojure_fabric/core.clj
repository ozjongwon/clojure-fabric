(ns clojure-fabric.core
  "Clojure wrapper for Hyperledger Java SDK functions"
  (:require [clojure-fabric.block :as block]
            [clojure-fabric.chaincode :as chaincode]
            [clojure-fabric.channel :as channel]
            [clojure-fabric.crypto-suite :as crypto]
            [clojure-fabric.hf-client :as client]
            [clojure-fabric.request :as request]
            [clojure-fabric.response :as response]
            [clojure-fabric.user :as user])
  #_
  (:import [org.hyperledger.fabric.sdk User Enrollment]))

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
(comment

  (defonce user-info {:name "test1" :roles nil :account nil :affiliation nil
                      :certificate nil :private-key nil
                      :channel-name "mychannel"})

  ;; 1. Client setup
  (defonce cli (client/create-new-instance))
  (client/set-crypto-suite cli (crypto/get-crypto-suite))

  ;; 2. User context
  (defonce enrollment
    (reify Enrollment
      ;; FIXME: enrollment!
      ;; How to iniitiate key and cert?
      (getKey [this]
        (:private-key user-info))
      (getCert [this]
        (:certificate user-info))))
  (defonce user
    (reify User
      (getName [this]
        (:name user-info))
      ;; Set<String>
      (getRoles [this]
        (:roles user-info))
      (getAccount [this]
        (:account user-info))
      (getAffiliation [this]
        (:affiliation user-info))
      (getEnrollment [this]
        enrollment)
      (getMspId [this]
        "Org1MSP")))
  
  (client/set-user-context cli user)

  
  ;; 2. Channel setup
  
  (defonce chan (client/new-channel cli "mychannel"))
  (cha)

  )

