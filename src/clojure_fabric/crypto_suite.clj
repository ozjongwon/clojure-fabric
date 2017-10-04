(ns clojure-fabric.crypto-suite
  (:import org.hyperledger.fabric.sdk.security.CryptoSuite))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.security.CryptoSuite
;;;

;;;  init
(defn
 init
 [^org.hyperledger.fabric.sdk.security.CryptoSuite crypto-suite]
 (. crypto-suite init))

;;;  keyGen
(defn
 key-gen
 [^org.hyperledger.fabric.sdk.security.CryptoSuite crypto-suite]
 (. crypto-suite keyGen))

;;;  verify
(defn
 verify
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  
  bytes0
  ^java.lang.String
  string1
  
  bytes2
  
  bytes3]
 (. crypto-suite verify bytes0 string1 bytes2 bytes3))

;;;  getProperties
(defn
 get-properties
 [^org.hyperledger.fabric.sdk.security.CryptoSuite crypto-suite]
 (. crypto-suite getProperties))

;;;  hash
(defn
 hash
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  
  bytes0]
 (. crypto-suite hash bytes0))

;;;  setProperties
(defn
 set-properties
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  ^java.util.Properties
  properties0]
 (. crypto-suite setProperties properties0))

;;;  loadCACertificatesAsBytes
(defn
 load-ca-certificates-as-bytes
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  ^java.util.Collection
  collection0]
 (. crypto-suite loadCACertificatesAsBytes collection0))

;;;  loadCACertificates
(defn
 load-ca-certificates
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  ^java.util.Collection
  collection0]
 (. crypto-suite loadCACertificates collection0))

;;;  sign
(defn
 sign
 [^org.hyperledger.fabric.sdk.security.CryptoSuite
  crypto-suite
  ^java.security.PrivateKey
  private-key0
  
  bytes1]
 (. crypto-suite sign private-key0 bytes1))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.security.CryptoSuite$Factory
;;;

;;;  getCryptoSuite
(defn
 get-crypto-suite
 []
 (org.hyperledger.fabric.sdk.security.CryptoSuite$Factory/getCryptoSuite))
