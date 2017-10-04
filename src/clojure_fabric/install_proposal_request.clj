(ns clojure-fabric.install-proposal-request
  (:import org.hyperledger.fabric.sdk.InstallProposalRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.InstallProposalRequest
;;;

;;;  setChaincodeInputStream
(defn
 set-chaincode-input-stream
 [^org.hyperledger.fabric.sdk.InstallProposalRequest
  install-proposal-request
  ^java.io.InputStream
  input-stream0]
 (. install-proposal-request setChaincodeInputStream input-stream0))

;;;  getChaincodeSourceLocation
(defn
 get-chaincode-source-location
 [^org.hyperledger.fabric.sdk.InstallProposalRequest
  install-proposal-request]
 (. install-proposal-request getChaincodeSourceLocation))

;;;  getChaincodeInputStream
(defn
 get-chaincode-input-stream
 [^org.hyperledger.fabric.sdk.InstallProposalRequest
  install-proposal-request]
 (. install-proposal-request getChaincodeInputStream))

;;;  setChaincodeSourceLocation
(defn
 set-chaincode-source-location
 [^org.hyperledger.fabric.sdk.InstallProposalRequest
  install-proposal-request
  ^java.io.File
  file0]
 (. install-proposal-request setChaincodeSourceLocation file0))
