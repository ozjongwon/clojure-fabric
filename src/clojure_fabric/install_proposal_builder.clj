(ns clojure-fabric.install-proposal-builder
  (:import org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
;;;

;;;  setChaincodeSource
(defn
 set-chaincode-source
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^java.io.File
  file0]
 (. install-proposal-builder setChaincodeSource file0))

;;;  setChaincodeLanguage
(defn
 set-chaincode-language
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^org.hyperledger.fabric.sdk.TransactionRequest$Type
  transaction-request$-type0]
 (.
  install-proposal-builder
  setChaincodeLanguage
  transaction-request$-type0))

;;;  chaincodeName
(defn
 chaincode-name
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^java.lang.String
  string0]
 (. install-proposal-builder chaincodeName string0))

;;;  chaincodePath
(defn
 chaincode-path
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^java.lang.String
  string0]
 (. install-proposal-builder chaincodePath string0))

;;;  setChaincodeInputStream
(defn
 set-chaincode-input-stream
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^java.io.InputStream
  input-stream0]
 (. install-proposal-builder setChaincodeInputStream input-stream0))

;;;  newBuilder
(defn
 new-builder
 []
 (org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder/newBuilder))

;;;  chaincodeVersion
(defn
 chaincode-version
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder
  ^java.lang.String
  string0]
 (. install-proposal-builder chaincodeVersion string0))

;;;  build
(defn
 build
 [^org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder
  install-proposal-builder]
 (. install-proposal-builder build))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.transaction.InstallProposalBuilder$1
;;;
