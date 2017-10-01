(ns clojure-fabric.user
  (:import [org.hyperledger.fabric.sdk User]))


(defn
 user-context-check
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.User/userContextCheck user0))


(defn
 get-account
 [^org.hyperledger.fabric.sdk.User user]
 (. user getAccount))


(defn
 get-msp-id
 [^org.hyperledger.fabric.sdk.User user]
 (. user getMspId))


(defn
 get-enrollment
 [^org.hyperledger.fabric.sdk.User user]
 (. user getEnrollment))


(defn
 get-affiliation
 [^org.hyperledger.fabric.sdk.User user]
 (. user getAffiliation))


(defn
 get-roles
 [^org.hyperledger.fabric.sdk.User user]
 (. user getRoles))


(defn get-name [^org.hyperledger.fabric.sdk.User user] (. user getName))


