(ns clojure-fabric.request
  (:import [org.hyperledger.fabric.sdk TransactionRequest TransactionProposalRequest]))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionRequest
;;;

;;;  getArgBytes
(defn
 get-arg-bytes
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getArgBytes))

;;;  getTransientMap
(defn
 get-transient-map
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getTransientMap))

;;;  setArgBytes
(defn
 set-arg-bytes
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  generic-arg1]
 (cond
  (instance? java.util.ArrayList generic-arg1)
  (. transaction-request setArgBytes ^java.util.ArrayList generic-arg1)
  :else
  (. transaction-request setArgBytes  generic-arg1)))

;;;  setArgs
(defn
 set-args
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  generic-arg1]
 (cond
  (instance? java.util.ArrayList generic-arg1)
  (. transaction-request setArgs ^java.util.ArrayList generic-arg1)
  :else
  (. transaction-request setArgs  generic-arg1)))

;;;  isSubmitted
(defn
 is-submitted
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request isSubmitted))

;;;  setChaincodeID
(defn
 set-chaincode-id
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^org.hyperledger.fabric.sdk.ChaincodeID
  chaincode-id0]
 (. transaction-request setChaincodeID chaincode-id0))

;;;  setUserContext
(defn
 set-user-context
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^org.hyperledger.fabric.sdk.User
  user0]
 (. transaction-request setUserContext user0))

;;;  getChaincodeVersion
(defn
 get-chaincode-version
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodeVersion))

;;;  getArgs
(defn
 get-args
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getArgs))

;;;  noChannelID
(defn
 no-channel-id
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request noChannelID))

;;;  setFcn
(defn
 set-fcn
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^java.lang.String
  string0]
 (. transaction-request setFcn string0))

;;;  getChaincodeLanguage
(defn
 get-chaincode-language
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodeLanguage))

;;;  setChaincodeEndorsementPolicy
(defn
 set-chaincode-endorsement-policy
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^org.hyperledger.fabric.sdk.ChaincodeEndorsementPolicy
  chaincode-endorsement-policy0]
 (.
  transaction-request
  setChaincodeEndorsementPolicy
  chaincode-endorsement-policy0))

;;;  getChaincodeID
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodeID))

;;;  setProposalWaitTime
(defn
 set-proposal-wait-time
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^long
  long0]
 (. transaction-request setProposalWaitTime long0))

;;;  getChaincodeName
(defn
 get-chaincode-name
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodeName))

;;;  getProposalWaitTime
(defn
 get-proposal-wait-time
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getProposalWaitTime))

;;;  setChaincodeName
(defn
 set-chaincode-name
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^java.lang.String
  string0]
 (. transaction-request setChaincodeName string0))

;;;  setChaincodeLanguage
(defn
 set-chaincode-language
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^org.hyperledger.fabric.sdk.TransactionRequest$Type
  transaction-request$-type0]
 (.
  transaction-request
  setChaincodeLanguage
  transaction-request$-type0))

;;;  setChaincodePath
(defn
 set-chaincode-path
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^java.lang.String
  string0]
 (. transaction-request setChaincodePath string0))

;;;  getChaincodePath
(defn
 get-chaincode-path
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodePath))

;;;  setChaincodeVersion
(defn
 set-chaincode-version
 [^org.hyperledger.fabric.sdk.TransactionRequest
  transaction-request
  ^java.lang.String
  string0]
 (. transaction-request setChaincodeVersion string0))

;;;  doVerify
(defn
 do-verify
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request doVerify))

;;;  getFcn
(defn
 get-fcn
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getFcn))

;;;  getChaincodeEndorsementPolicy
(defn
 get-chaincode-endorsement-policy
 [^org.hyperledger.fabric.sdk.TransactionRequest transaction-request]
 (. transaction-request getChaincodeEndorsementPolicy))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TransactionProposalRequest
;;;

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.TransactionProposalRequest
  transaction-proposal-request
  ^java.util.Map
  map0]
 (. transaction-proposal-request setTransientMap map0))

;;;  newInstance
(defn
 new-instance
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.TransactionProposalRequest/newInstance
  user0))
