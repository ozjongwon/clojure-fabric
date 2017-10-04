(ns clojure-fabric.crypto-primitives
  (:import org.hyperledger.fabric.sdk.security.CryptoPrimitives))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.security.CryptoPrimitives
;;;

;;;  loadCACertificates
(defn
 load-ca-certificates
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.util.Collection
  collection0]
 (. crypto-primitives loadCACertificates collection0))

;;;  bytesToCertificate
(defn
 bytes-to-certificate
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  
  bytes0]
 (. crypto-primitives bytesToCertificate bytes0))

;;;  getTrustStore
(defn
 get-trust-store
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives]
 (. crypto-primitives getTrustStore))

;;;  generateCertificationRequest
(defn
 generate-certification-request
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.lang.String
  string0
  ^java.security.KeyPair
  key-pair1]
 (. crypto-primitives generateCertificationRequest string0 key-pair1))

;;;  sign
(defn
 sign
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.security.PrivateKey
  private-key0
  
  bytes1]
 (. crypto-primitives sign private-key0 bytes1))

;;;  hash
(defn
 hash
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  
  bytes0]
 (. crypto-primitives hash bytes0))

;;;  getProperties
(defn
 get-properties
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives]
 (. crypto-primitives getProperties))

;;;  init
(defn
 init
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives]
 (. crypto-primitives init))

;;;  keyGen
(defn
 key-gen
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives]
 (. crypto-primitives keyGen))

;;;  certificateToDER
(defn
 certificate-to-der
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.lang.String
  string0]
 (. crypto-primitives certificateToDER string0))

;;;  addCACertificateToTrustStore
(defn
 add-ca-certificate-to-trust-store
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.io.File
  file0
  ^java.lang.String
  string1]
 (. crypto-primitives addCACertificateToTrustStore file0 string1))

;;;  loadCACertificatesAsBytes
(defn
 load-ca-certificates-as-bytes
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.util.Collection
  collection0]
 (. crypto-primitives loadCACertificatesAsBytes collection0))

;;;  setProperties
(defn
 set-properties
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^java.util.Properties
  properties0]
 (. crypto-primitives setProperties properties0))

;;;  org.hyperledger.fabric.sdk.security.CryptoPrimitives
(defn
 crypto-primitives
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives]
 (.
  crypto-primitives
  org.hyperledger.fabric.sdk.security.CryptoPrimitives))

;;;  certificationRequestToPEM
(defn
 certification-request-to-pem
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  ^org.bouncycastle.pkcs.PKCS10CertificationRequest
  pkcs10-certification-request0]
 (.
  crypto-primitives
  certificationRequestToPEM
  pkcs10-certification-request0))

;;;  verify
(defn
 verify
 [^org.hyperledger.fabric.sdk.security.CryptoPrimitives
  crypto-primitives
  
  bytes0
  ^java.lang.String
  string1
  
  bytes2
  
  bytes3]
 (. crypto-primitives verify bytes0 string1 bytes2 bytes3))
