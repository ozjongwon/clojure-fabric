(ns clojure-fabric.hf-ca-client
  (:import [org.hyperledger.fabric_ca.sdk HFCAClient]))

(defn
 get-crypto-suite
 [^org.hyperledger.fabric_ca.sdk.HFCAClient hfca-client]
 (. hfca-client getCryptoSuite))


(defn
 enroll
 ([^org.hyperledger.fabric_ca.sdk.HFCAClient
   hfca-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1]
  (. hfca-client enroll string0 string1))
 ([^org.hyperledger.fabric_ca.sdk.HFCAClient
   hfca-client
   ^java.lang.String
   string0
   ^java.lang.String
   string1
   ^org.hyperledger.fabric_ca.sdk.EnrollmentRequest
   enrollment-request2]
  (. hfca-client enroll string0 string1 enrollment-request2)))


(defn
 create-new-instance
 ([^java.lang.String string0 ^java.util.Properties properties1]
  (org.hyperledger.fabric_ca.sdk.HFCAClient/createNewInstance
   string0
   properties1))
 ([^java.lang.String
   string0
   ^java.lang.String
   string1
   ^java.util.Properties
   properties2]
  (org.hyperledger.fabric_ca.sdk.HFCAClient/createNewInstance
   string0
   string1
   properties2)))


(defn
 revoke
 [^org.hyperledger.fabric_ca.sdk.HFCAClient
  hfca-client
  ^org.hyperledger.fabric.sdk.User
  user0
  generic-arg1
  ^java.lang.String
  string2]
 (clojure.core/cond
  (instance? java.lang.String generic-arg1)
  (. hfca-client revoke user0 ^java.lang.String generic-arg1 string2)
  (instance? org.hyperledger.fabric.sdk.Enrollment generic-arg1)
  (.
   hfca-client
   revoke
   user0
   ^org.hyperledger.fabric.sdk.Enrollment
   generic-arg1
   string2)))


(defn
 register
 [^org.hyperledger.fabric_ca.sdk.HFCAClient
  hfca-client
  ^org.hyperledger.fabric_ca.sdk.RegistrationRequest
  registration-request0
  ^org.hyperledger.fabric.sdk.User
  user1]
 (. hfca-client register registration-request0 user1))


(defn
 reenroll
 ([^org.hyperledger.fabric_ca.sdk.HFCAClient
   hfca-client
   ^org.hyperledger.fabric.sdk.User
   user0]
  (. hfca-client reenroll user0))
 ([^org.hyperledger.fabric_ca.sdk.HFCAClient
   hfca-client
   ^org.hyperledger.fabric.sdk.User
   user0
   ^org.hyperledger.fabric_ca.sdk.EnrollmentRequest
   enrollment-request1]
  (. hfca-client reenroll user0 enrollment-request1)))


(defn
 set-crypto-suite
 [^org.hyperledger.fabric_ca.sdk.HFCAClient
  hfca-client
  ^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite0]
 (. hfca-client setCryptoSuite crypto-suite0))


