(ns clojure-fabric.proto-utils
  (:import org.hyperledger.fabric.sdk.transaction.ProtoUtils))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.ProtoUtils
;;;

;;;  createSerializedIdentity
(defn
 create-serialized-identity
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/createSerializedIdentity
  user0))

;;;  createDeploymentSpec
(defn
 create-deployment-spec
 [^org.hyperledger.fabric.protos.peer.Chaincode$ChaincodeSpec$Type
  chaincode$-chaincode-spec$-type0
  ^java.lang.String
  string1
  ^java.lang.String
  string2
  ^java.lang.String
  string3
  ^java.util.List
  list4
  
  bytes5]
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/createDeploymentSpec
  chaincode$-chaincode-spec$-type0
  string1
  string2
  string3
  list4
  bytes5))

;;;  getSignatureHeaderAsByteString
(defn
 get-signature-header-as-byte-string
 ([^org.hyperledger.fabric.sdk.User
   user0
   ^org.hyperledger.fabric.sdk.transaction.TransactionContext
   transaction-context1]
  (org.hyperledger.fabric.sdk.transaction.ProtoUtils/getSignatureHeaderAsByteString
   user0
   transaction-context1))
 ([^org.hyperledger.fabric.sdk.transaction.TransactionContext
   transaction-context0]
  (org.hyperledger.fabric.sdk.transaction.ProtoUtils/getSignatureHeaderAsByteString
   transaction-context0)))

;;;  suite
(defn
 suite
 []
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/suite))

;;;  getDateFromTimestamp
(defn
 get-date-from-timestamp
 [^com.google.protobuf.Timestamp timestamp0]
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/getDateFromTimestamp
  timestamp0))

;;;  getCurrentFabricTimestamp
(defn
 get-current-fabric-timestamp
 []
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/getCurrentFabricTimestamp))

;;;  createChannelHeader
(defn
 create-channel-header
 [^org.hyperledger.fabric.protos.common.Common$HeaderType
  common$-header-type0
  ^java.lang.String
  string1
  ^java.lang.String
  string2
  ;; FIXME:
  ;; CompilerException java.lang.IllegalArgumentException: fns taking primitives support only 4 or fewer args, compiling:(clojure_fabric/proto_utils.clj:73:1)
  ;; ^long
  long3
  ^com.google.protobuf.Timestamp
  timestamp4
  ^org.hyperledger.fabric.protos.peer.FabricProposal$ChaincodeHeaderExtension
  fabric-proposal$-chaincode-header-extension5]
 (org.hyperledger.fabric.sdk.transaction.ProtoUtils/createChannelHeader
  common$-header-type0
  string1
  string2
  long3
  timestamp4
  fabric-proposal$-chaincode-header-extension5))
