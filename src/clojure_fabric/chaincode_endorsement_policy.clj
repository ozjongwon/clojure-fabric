(ns clojure-fabric.chaincode-endorsement-policy
  (:import org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
;;;

;;;  getChaincodeEndorsementPolicyAsBytes
(defn
 get-chaincode-endorsement-policy-as-bytes
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy]
 (. chaincode-endorsement-policy getChaincodeEndorsementPolicyAsBytes))

;;;  fromBytes
(defn
 from-bytes
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  
  bytes0]
 (. chaincode-endorsement-policy fromBytes bytes0))

;;;  fromStream
(defn
 from-stream
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.InputStream
  input-stream0]
 (. chaincode-endorsement-policy fromStream input-stream0))

;;;  org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
(defn
 chaincode-endorsement-policy
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy]
 (.
  chaincode-endorsement-policy
  org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy))

;;;  fromFile
(defn
 from-file
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.File
  file0]
 (. chaincode-endorsement-policy fromFile file0))

;;;  fromYamlFile
(defn
 from-yaml-file
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy
  ^java.io.File
  file0]
 (. chaincode-endorsement-policy fromYamlFile file0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy$1
;;;


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy$IndexedHashMap
;;;

;;;  put
(defn
 put
 [^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy$IndexedHashMap
  chaincode-endorsement-policy$-indexed-hash-map
  ^java.lang.Object
  object0
  ^java.lang.Object
  object1]
 (. chaincode-endorsement-policy$-indexed-hash-map put object0 object1))
