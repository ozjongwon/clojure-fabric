(ns clojure-fabric.transaction-context
  (:import org.hyperledger.fabric.sdk.transaction.TransactionContext))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.TransactionContext
;;;

;;;  getFabricTimestamp
(defn
 get-fabric-timestamp
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getFabricTimestamp))

;;;  getChannelID
(defn
 get-channel-id
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getChannelID))

;;;  getTxID
(defn
 get-tx-id
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getTxID))

;;;  setProposalWaitTime
(defn
 set-proposal-wait-time
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context
  ^long
  long0]
 (. transaction-context setProposalWaitTime long0))

;;;  getVerify
(defn
 get-verify
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getVerify))

;;;  getProposalWaitTime
(defn
 get-proposal-wait-time
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getProposalWaitTime))

;;;  getUser
(defn
 get-user
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getUser))

;;;  getIdentity
(defn
 get-identity
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getIdentity))

;;;  org.hyperledger.fabric.sdk.transaction.TransactionContext
(defn
 transaction-context
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context
  ^org.hyperledger.fabric.sdk.Channel
  channel0
  ^org.hyperledger.fabric.sdk.User
  user1
  ^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite2]
 (.
  transaction-context
  org.hyperledger.fabric.sdk.transaction.TransactionContext
  channel0
  user1
  crypto-suite2))

;;;  signByteStrings
(defn
 sign-byte-strings
 ([^org.hyperledger.fabric.sdk.transaction.TransactionContext
   transaction-context
   
   byte-strings0]
  (. transaction-context signByteStrings byte-strings0))
 ([^org.hyperledger.fabric.sdk.transaction.TransactionContext
   transaction-context
   
   users0
   
   byte-strings1]
  (. transaction-context signByteStrings users0 byte-strings1)))

;;;  getCryptoPrimitives
(defn
 get-crypto-primitives
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getCryptoPrimitives))

;;;  getEpoch
(defn
 get-epoch
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getEpoch))

;;;  getNonce
(defn
 get-nonce
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getNonce))

;;;  signByteString
(defn
 sign-byte-string
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context
  
  bytes0]
 (. transaction-context signByteString bytes0))

;;;  getChannel
(defn
 get-channel
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context]
 (. transaction-context getChannel))

;;;  verify
(defn
 verify
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext
  transaction-context
  
  boolean0]
 (. transaction-context verify boolean0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.TransactionContext$MyStructure
;;;

;;;  toASN1Primitive
(defn
 to-asn1-primitive
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext$MyStructure
  transaction-context$-my-structure]
 (. transaction-context$-my-structure toASN1Primitive))

;;;  Mspid
(defn
 mspid
 [^org.hyperledger.fabric.sdk.transaction.TransactionContext$MyStructure
  transaction-context$-my-structure]
 (. transaction-context$-my-structure Mspid))
