;; Copyright 2017 Jong-won Choi <oz.jongwon.choi@gmail.com>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(ns clojure-fabric.crypto-suite
  (:require [clojure.data.codec.base64 :as b64])
  (:import [org.bouncycastle.crypto.generators ECKeyPairGenerator]
           [org.bouncycastle.jce ECNamedCurveTable]
           [org.bouncycastle.jce.spec ECNamedCurveParameterSpec ECNamedCurveSpec]
           [org.bouncycastle.jce.provider BouncyCastleProvider]
           [org.bouncycastle.jcajce.provider.asymmetric.ec KeyPairGeneratorSpi$ECDSA
            BCECPrivateKey BCECPublicKey]
           [org.bouncycastle.util.io.pem PemObject PemReader]

           [org.bouncycastle.util.encoders Hex]
           [java.io FileInputStream StringReader]
           [java.util Arrays]
           [javax.crypto Cipher SecretKeyFactory]
           [javax.crypto.spec SecretKeySpec]
           [java.security Key KeyStore KeyFactory KeyPairGenerator SecureRandom
            Security MessageDigest Signature PublicKey]
           [java.security.spec ECPoint ECParameterSpec ECPublicKeySpec ECPrivateKeySpec])
  (:refer-clojure :exclude [hash]))

;;;
;;; http://www.bouncycastle.org/wiki/display/JA1/Elliptic+Curve+Key+Pair+Generation+and+Key+Factories
;;; https://security.stackexchange.com/questions/129910/ecdsa-why-do-ssh-keygen-and-java-generated-public-keys-have-different-sizes
;;; 

;; Add provider!
(Security/addProvider (BouncyCastleProvider.))

;;;
;;; Utility functions
;;; 
(defn random-bytes
  [numbytes]
  (let [rbytes (byte-array numbytes)]
    (.nextBytes (SecureRandom.) rbytes)
    rbytes))

(defn cert-string->bytes
  [cert]
  (-> (StringReader. cert)
      (PemReader.)
      (.readPemObject)
      (.getContent)))

;;;
;;; Interface
;;;
;;; 'opts' is CryptoSuite
;;; 
(defrecord CryptoSuite [security-provider key-algorithm curve-name hash-algorithm])
(defn make-crypto-suite
  [{:keys [security-provider key-algorithm curve-name hash-algorithm]
    :or {security-provider BouncyCastleProvider/PROVIDER_NAME
         key-algorithm :ECDSA
         curve-name :secp256r1
         hash-algorithm :sha3-384}}]
  (->CryptoSuite security-provider key-algorithm curve-name hash-algorithm))


;; (defonce key-store (atom nil))

;; TBD
;; (defn init-key-store [file password {:keys [type] :or {type "PKCS12"}}]
;;   (let [ks (KeyStore/getInstance type)]
;;     (.load ks (FileInputStream. ^String file) (.toCharArray ^String password))
;;     (reset! key-store ks)))

;;;generate_key
(defn generate-key
  "Generate a key based on the options. The utput can be a private key or a public key in an
  asymmetric algorithm, or a secret key of a symmetric algorithm.
  Params
        opts (Object): an object that encapsulates two properties, “algorithm” and
        “ephemeral”.
  Returns
        Result (Key): The key object"
  [{:keys [algorithm curve ephemeral ^String security-provider]}]
  (let [generator (-> algorithm
                      name
                      (KeyPairGenerator/getInstance security-provider))
        param-specs (-> curve name ECNamedCurveTable/getParameterSpec)]
    (.initialize generator param-specs (SecureRandom.))
    (.generateKeyPair generator)))
;;;
;;; Ex - (generate-key {:algorithm :ECDSA :curve :secp256r1)
;;; 

(defprotocol IBCECKey
  (algorithm [this])
  (curve-spec [this])
  (curve-params [this])
  (%derive-key [this opts]))

(defn- %curve-params [params]
  ;; (.multiply g (biginteger 100000000000000000000))
  ;;
  #_
  (zipmap [:curve :g :h :n]
          ((juxt #(.getCurve ^ECParameterSpec %) #(.getG ^ECParameterSpec %) #(.getH ^ECParameterSpec %)
                 #(.getN ^ECParameterSpec %))
           params)))

(defn derive-bcec-key [curve-params]
  ;; {:curve
  ;;  #object[org.bouncycastle.math.ec.custom.sec.SecP256R1Curve 0x5fbf2061 "org.bouncycastle.math.ec.custom.sec.SecP256R1Curve@d4e69b7f"],
  ;;  :g
  ;;  #object[org.bouncycastle.math.ec.custom.sec.SecP256R1Point 0x642eb9c "(6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296,4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5,1)"],
  ;;  :h 1,
  ;;  :n
  ;;  115792089210356248762697446949407573529996955224135760342422259061068512044369}
  ;;
  :TBD
  )

;;;
;;; To avoid reflection at run time, duplicate code :(
;;;
(extend-type BCECPrivateKey
  IBCECKey
  (algorithm [this] (-> this .getAlgorithm keyword))
  (curve-spec [this] (keyword (.getName ^ECNamedCurveSpec (.getParams this))))
  (curve-params [this] (-> this .getParameters %curve-params))
  (%derive-key [this opts]
    (derive-bcec-key (curve-params this))))

(extend-type BCECPublicKey
  IBCECKey
  (algorithm [this] (-> this .getAlgorithm keyword))
  (curve-spec [this] (keyword (.getName ^ECNamedCurveSpec (.getParams this))))
  (curve-params [this] (-> this .getParameters %curve-params))
  (%derive-key [this opts]
    (derive-bcec-key (curve-params this))))


;;;deriveKey
(defn derive-key
  "Derives a key from k using opts.
  Params
        k (Key)
        opts (Object)
  Returns
        (Key) derived key"
  [k opts]
  ;; From JS SDK doc
  ;; Derives the new private key from the source public key using the parameters passed in the opts.
  ;; This operation is needed for deriving private keys corresponding to the Transaction
  ;; Certificates.
  ;;
  ;; Implementation Note:
  ;;    Only Go SDK implements this function(and hard to understand Go code!).
  ;;    Wait until ithere are test cases to check correctness
  ;;
  ;; (def kp (generate-key {:algorithm :ECDSA :curve :secp256r1}))
  ;; (def pri (.getPrivate kp))
  ;; (def pub (.getPublic kp))
  ;; (derive-key pri {})
  ;; (.String (b64/encode (.getEncoded pub)))
  ;; (.String (b64/encode (.getEncoded pri)))
  ;; 
  (%derive-key k opts))

;;; importKey
(defn import-key
  "Imports a key from its raw representation using opts.
  Params
        k (Key)
        opts (Object)
  Returns
        (Key) An instance of the Key class wrapping the raw key bytes"
  [k {:keys [algorithm curve ephemeral type ^String security-provider]}]
  (let [curve-name (name curve)
        parameter-spec (ECNamedCurveTable/getParameterSpec curve-name)
        curve (.getCurve parameter-spec)
        curve-size (/ (* 2 (.getFieldSize curve)) 8) ;; x + y
        #^bytes k-byte-array (if (string? k)
                       ;; assume base64
                       (b64/decode (.getBytes ^String k))
                       ;; otherwise bytes
                       k)
        key-size (count k-byte-array)]
    (if (= curve-size key-size)
      (let [middle (int (/ key-size 2))
            kf (KeyFactory/getInstance (name algorithm) security-provider)
            spec (ECPublicKeySpec. (ECPoint. (java.math.BigInteger. 1 (Arrays/copyOfRange k-byte-array (int 0) middle))
                                             (java.math.BigInteger. 1 (Arrays/copyOfRange k-byte-array middle key-size)))
                                   (ECNamedCurveSpec. curve-name curve (.getG parameter-spec) (.getN parameter-spec)
                                                      (.getH parameter-spec) (.getSeed parameter-spec)))]
        (case type
          :public (.generatePublic kf spec)
          :private (.generatePrivate kf spec)))
      (throw (Exception. (format "Key size(%d) does not match with the chosen curve(%d)" key-size curve-size))))))
;; (b64/decode (.getBytes "BOg4fylDlzNxMFFTvtQBRsakfxaBJBPJf25sx8Iaim8v3h0ml9mnNCrUVJjBAeXyeGAX69NbAxbaAkNHT+6gJtU="))
;; (def x (Arrays/copyOfRange *1 1 65))
;; (import-key x {:algorithm :ECDSA :curve :secp256r1 :type :public})
                                         

;;;getKey
(defn get-key
  "Returns the key this CSP(Crypto Service Provider) associates to the Subject Key Identifier ski.
  Params
        ski (byte[])
  Returns
        (Key) An instance of the Key class corresponding to the ski"
  [ski]
  ;; Implementation Note:
  ;;    This is a data store operation. Not supported yet
  :TBD
  )

;;;hash
(defn hash
  "Hashes messages msg using options opts.
  Params
        msg (byte[])
        opts (Object) an object that encapsulates property “algorithm” with values for
        hashing algorithms such as “SHA2” or “SHA3”
  Returns
        (Key) An instance of the Key class corresponding to the ski"
  [msg {:keys [algorithm]}]
  (let [md (MessageDigest/getInstance (name algorithm))]
    (->> (if (string? msg)
           (.getBytes ^String msg)
           msg)
         (.digest md)
         (Hex/toHexString))))
;;(hash test-msg {:algorithm :sha384})

(defonce cipher-mode-map {:encrypt Cipher/ENCRYPT_MODE
                          :decrypt Cipher/DECRYPT_MODE})

(defn %encrypt-or-decrypt
  ;; https://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html
  [k text {:keys [algorithm cipher-mode]}]
  (let [tname (name algorithm)
        tk (SecretKeySpec. k tname)
        cipher (doto (Cipher/getInstance tname)
                 (.init ^java.lang.Integer (cipher-mode-map cipher-mode) tk))]
    (.doFinal cipher
              (if (string? text)
                (.getBytes ^String text)
                text))))

;;;encrypt
(defn encrypt
  "Encrypt plain text.
  Params
        key (Key) public encryption key
        plainText (byte[])
        opts (Object)
  Returns
        (byte[]) Cipher text"
  [k plain-text {:keys [algorithm] :as opts}]
  (%encrypt-or-decrypt k plain-text (assoc opts :cipher-mode :encrypt)))

;;; decrypt
(defn decrypt
  "Decrypt cipher text.
  Params
        key (Key) private decryption key
        cipherText (byte[])
        opts (Object)
  Returns
        (byte[]) Plain text"
  [k cipher-text {:keys [algorithm] :as opts}]
  (%encrypt-or-decrypt k cipher-text (assoc opts :cipher-mode :decrypt)))

;;;sign
(defn sign
  "Sign the data.
  Params
        digest (byte[]) fixed-length digest of the target message to be signed
        Key (Key) private signing key
        opts (function) hashing function to use
  Returns
        Result(Object):Signature object"
  [^bytes digest priv-key {:keys [algorithm]}]
  (let [signer (Signature/getInstance (name algorithm))]
    (.initSign signer priv-key)
    (.update signer digest)
    (.sign signer)))

;;; verify
(defn verify
  "Verify the signature.
  Params
        key (Key) public verification key
        signature (byte[]) signature
        digest (byte[]) original digest that was signed
  Returns
        (bool): verification successful or not"
  [pub-key-byte signature ^bytes digest {:keys [algorithm curve type security-provider] :as opts}]
  (let [^PublicKey pub-key (import-key pub-key-byte opts)
        signer (Signature/getInstance (name algorithm))]
    (.initVerify signer pub-key)
    (.update signer digest)
    (.verify signer signature)))

#_
(comment
  ;; Copy from JS SDK
  (def test-msg "this is a test message")
  (def test-long-msg
    (str "The Hyperledger project is an open source collaborative effort created to advance cross-industry blockchain technologies. "
         "It is a global collaboration including leaders in finance, banking, Internet of Things, supply chains, manufacturing and Technology. The Linux "
         "Foundation hosts Hyperledger as a Collaborative Project under the foundation. Why Create the Project? Not since the Web itself has a technology "
         "promised broader and more fundamental revolution than blockchain technology. A blockchain is a peer-to-peer distributed ledger forged by consensus, "
         "combined with a system for “smart contracts” and other assistive technologies. Together these can be used to build a new generation of transactional "
         "applications that establishes trust, accountability and transparency at their core, while streamlining business processes and legal constraints. "
         "Think of it as an operating system for marketplaces, data-sharing networks, micro-currencies, and decentralized digital communities. It has the potential "
         "to vastly reduce the cost and complexity of getting things done in the real world. Only an Open Source, collaborative software development approach can "
         "ensure the transparency, longevity, interoperability and support required to bring blockchain technologies forward to mainstream commercial adoption. That "
         "is what Hyperledger is about – communities of software developers building blockchain frameworks and platforms."))

  (def hash-msg-sha384 "6247065855a812ecd182476576c02d46a675845ef4b0056e973ca42dcf8191d3adabc8c6c4b909f20f96136032ab723a")
  (def hash-long-msg-sha384 "e647ea97fec64412a34f522b5d80cbba9a293f89d4dc63802c79bf485078ecbaed59a0d53cd7ab08a9ae983e64f886a6")
  (def hash-msg-sha3-384 "9e9c2e5edf6cbc0b512807a8efa2917daff71b83e04dee28fcc00b1a1dd935fb5afc5eafa06bf55bd64792a597e2a8f3")
  (def hash-long-msg-sha3-384 "47a90d6721523682e09b81da0a60e6ee1faf839f0503252316638daf038cf682c0a842edaf310eb0f480a2e181a07af0")
  (def hash-msg-sha256 "4e4aa09b6d80efbd684e80f54a70c1d8605625c3380f4cb012b32644a002b5be")
  (def hash-long-msg-sha256 "0d98987f5e4e3ea611f0e3d768c594ff9aac25404265d73554d12c86d7f6fbbc")
  (def hash-msg-sha3-256 "7daeff454f7e91e3cd2d1c1bd5fcd1b6c9d4d5fffc6c327710d8fae7b06ee4a3")
  (def hash-long-msg-sha3-256 "577174210438a85ae4311a62e5fccf2441b960013f5691993cdf38ed6ba0c84f")

  (def test-key-private "93f15b31e3c3f3bddcd776d9219e93d8559e31453757b79e193a793cbd239573")
  (def test-key-public "04f46815aa00fe2ba2814b906aa4ef1755caf152658de8997a6a858088296054baf45b06b2eba514bcbc37ae0c0cc7465115d36429d0e0bff23dc40e3760c10aa9")
  (def test-msg-signature-sha2-256 "3046022100a6460b29373fa16ee96172bfe04666140405fdef78182280545d451f08547736022100d9022fe620ceadabbef1714b894b8d6be4b74c0f9c573bd774871764f4f789c9")
  (def test-long-msg-signature-sha2-256 "3045022073266302d730b07499aabd0f88f12c8749a0f90144034dbc86a8cd742722ad29022100852346f93e50911008ab97afc452f83c5985a19fa3aa6d58f615c03bddaa90a1")

  (def test-cert-pem
    (str "-----BEGIN CERTIFICATE-----"
"MIIDVDCCAvqgAwIBAgIBATAKBggqhkjOPQQDAjBOMRMwEQYDVQQKDArOoyBBY21l"
"IENvMRkwFwYDVQQDExB0ZXN0LmV4YW1wbGUuY29tMQ8wDQYDVQQqEwZHb3BoZXIx"
"CzAJBgNVBAYTAk5MMB4XDTE2MTIxNjIzMTAxM1oXDTE2MTIxNzAxMTAxM1owTjET"
"MBEGA1UECgwKzqMgQWNtZSBDbzEZMBcGA1UEAxMQdGVzdC5leGFtcGxlLmNvbTEP"
"MA0GA1UEKhMGR29waGVyMQswCQYDVQQGEwJOTDBZMBMGByqGSM49AgEGCCqGSM49"
"AwEHA0IABFKnXh7hBdp6s9OJ/aadigT1z2WzBbSc7Hzb3rkaWFz4e+9alqqWg9lr"
"ur/mDYzG9dudC8jFjVa7KIh+2BxgBayjggHHMIIBwzAOBgNVHQ8BAf8EBAMCAgQw"
"JgYDVR0lBB8wHQYIKwYBBQUHAwIGCCsGAQUFBwMBBgIqAwYDgQsBMA8GA1UdEwEB"
"/wQFMAMBAf8wDQYDVR0OBAYEBAECAwQwDwYDVR0jBAgwBoAEAQIDBDBiBggrBgEF"
"BQcBAQRWMFQwJgYIKwYBBQUHMAGGGmh0dHA6Ly9vY0JDQ1NQLmV4YW1wbGUuY29t"
"MCoGCCsGAQUFBzAChh5odHRwOi8vY3J0LmV4YW1wbGUuY29tL2NhMS5jcnQwRgYD"
"VR0RBD8wPYIQdGVzdC5leGFtcGxlLmNvbYERZ29waGVyQGdvbGFuZy5vcmeHBH8A"
"AAGHECABSGAAACABAAAAAAAAAGgwDwYDVR0gBAgwBjAEBgIqAzAqBgNVHR4EIzAh"
"oB8wDoIMLmV4YW1wbGUuY29tMA2CC2V4YW1wbGUuY29tMFcGA1UdHwRQME4wJaAj"
"oCGGH2h0dHA6Ly9jcmwxLmV4YW1wbGUuY29tL2NhMS5jcmwwJaAjoCGGH2h0dHA6"
"Ly9jcmwyLmV4YW1wbGUuY29tL2NhMS5jcmwwFgYDKgMEBA9leHRyYSBleHRlbnNp"
"b24wCgYIKoZIzj0EAwIDSAAwRQIgcguBb6FUxO+X8DbY17gpqSGuNC4NT4BddPg1"
"UWUxIC0CIQDNyHQAwzhw+512meXRwG92GfpzSBssDKLdwlrqiHOu5A=="
"-----END CERTIFICATE-----"))

  (def test-key-private-pem
    (str "-----BEGIN PRIVATE KEY-----"
"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgZYMvf3w5VkzzsTQY"
"I8Z8IXuGFZmmfjIX2YSScqCvAkihRANCAAS6BhFgW/q0PzrkwT5RlWTt41VgXLgu"
"Pv6QKvGsW7SqK6TkcCfxsWoSjy6/r1SzzTMni3J8iQRoJ3roPmoxPLK4"
"-----END PRIVATE KEY-----"))
  
  (def test-key-private-cert-pem
    (str "-----BEGIN CERTIFICATE-----"
"MIICEDCCAbagAwIBAgIUXoY6X7jIpHAAgL267xHEpVr6NSgwCgYIKoZIzj0EAwIw"
"fzELMAkGA1UEBhMCVVMxEzARBgNVBAgTCkNhbGlmb3JuaWExFjAUBgNVBAcTDVNh"
"biBGcmFuY2lzY28xHzAdBgNVBAoTFkludGVybmV0IFdpZGdldHMsIEluYy4xDDAK"
"BgNVBAsTA1dXVzEUMBIGA1UEAxMLZXhhbXBsZS5jb20wHhcNMTcwMTAzMDEyNDAw"
"WhcNMTgwMTAzMDEyNDAwWjAQMQ4wDAYDVQQDEwVhZG1pbjBZMBMGByqGSM49AgEG"
"CCqGSM49AwEHA0IABLoGEWBb+rQ/OuTBPlGVZO3jVWBcuC4+/pAq8axbtKorpORw"
"J/GxahKPLr+vVLPNMyeLcnyJBGgneug+ajE8srijfzB9MA4GA1UdDwEB/wQEAwIF"
"oDAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwDAYDVR0TAQH/BAIwADAd"
"BgNVHQ4EFgQU9BUt7QfgDXx9g6zpzCyJGxXsNM0wHwYDVR0jBBgwFoAUF2dCPaqe"
"gj/ExR2fW8OZ0bWcSBAwCgYIKoZIzj0EAwIDSAAwRQIgcWQbMzluyZsmvQCvGzPg"
"f5B7ECxK0kdmXPXIEBiizYACIQD2x39Q4oVwO5uL6m3AVNI98C2LZWa0g2iea8wk"
"BAHpeA=="
"-----END CERTIFICATE-----"))

  (= (hash test-msg {:algorithm :sha256}) hash-msg-sha256)
  (= (hash test-long-msg {:algorithm :sha256}) hash-long-msg-sha256)
  (= (hash test-msg {:algorithm :sha384}) hash-msg-sha384)
  (= (hash test-long-msg {:algorithm :sha384}) hash-long-msg-sha384)

  (= (hash test-msg {:algorithm :sha3-256}) hash-msg-sha3-256)
  (= (hash test-long-msg {:algorithm :sha3-256}) hash-long-msg-sha3-256)
  (= (hash test-msg {:algorithm :sha3-384}) hash-msg-sha3-384)
  (= (hash test-long-msg {:algorithm :sha3-384}) hash-long-msg-sha3-384)
  
  )

