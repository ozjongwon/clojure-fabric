(ns clojure-fabric.user
  (:import org.hyperledger.fabric.sdk.User))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.User
;;;

;;;  userContextCheck
(defn
 user-context-check
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.User/userContextCheck user0))

;;;  getAccount
(defn
 get-account
 [^org.hyperledger.fabric.sdk.User user]
 (. user getAccount))

;;;  getMspId
(defn
 get-msp-id
 [^org.hyperledger.fabric.sdk.User user]
 (. user getMspId))

;;;  getEnrollment
(defn
 get-enrollment
 [^org.hyperledger.fabric.sdk.User user]
 (. user getEnrollment))

;;;  getAffiliation
(defn
 get-affiliation
 [^org.hyperledger.fabric.sdk.User user]
 (. user getAffiliation))

;;;  getRoles
(defn
 get-roles
 [^org.hyperledger.fabric.sdk.User user]
 (. user getRoles))

;;;  getName
(defn get-name [^org.hyperledger.fabric.sdk.User user] (. user getName))
