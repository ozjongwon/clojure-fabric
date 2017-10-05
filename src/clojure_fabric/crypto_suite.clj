(ns clojure-fabric.crypto-suite
  (:require [clojure.data.codec.base64 :as b64])
  (:import [org.bouncycastle.crypto.generators ECKeyPairGenerator]
           [org.bouncycastle.jce ECNamedCurveTable]
           [org.bouncycastle.jce.spec ECNamedCurveParameterSpec ECParameterSpec ECNamedCurveSpec]
           [org.bouncycastle.jce.provider BouncyCastleProvider]
           [org.bouncycastle.jcajce.provider.asymmetric.ec KeyPairGeneratorSpi$ECDSA
            BCECPrivateKey BCECPublicKey]
           [java.security KeyPairGenerator KeyFactory SecureRandom Security])
  (:refer-clojure :exclude [hash]))
;;;
;;; http://www.bouncycastle.org/wiki/display/JA1/Elliptic+Curve+Key+Pair+Generation+and+Key+Factories
;;;

;; Add provider!
(Security/addProvider (BouncyCastleProvider.))

;;;generate_key
(defn generate-key
  "Generate a key based on the options. The utput can be a private key or a public key in an
  asymmetric algorithm, or a secret key of a symmetric algorithm.
  Params
        opts (Object): an object that encapsulates two properties, “algorithm” and
        “ephemeral”.
  Returns
        Result (Key): The key object"
  [algorithm {:keys [curve ephemeral]}]
  (let [generator (-> algorithm
                      name
                      (KeyPairGenerator/getInstance BouncyCastleProvider/PROVIDER_NAME))
        param-specs (-> curve name ECNamedCurveTable/getParameterSpec)]
    (.initialize generator param-specs (SecureRandom.))
    (.generateKeyPair generator)))
;;;
;;; Ex - (generate-key :ECDSA :secp256r1)
;;; 

(defprotocol IBCECKey
  (algorithm [this])
  (curve-spec [this])
  (curve-params [this])
  (%derive-key [this opts]))

(defn- %curve-params [params]
  ;; (.multiply g (biginteger 100000000000000000000))
  ;; 
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
  ;; (def kp (generate-key :ECDSA :secp256r1))
  ;; (def pri (.getPrivate kp))
  ;; (def pub (.getPublic kp))
  ;; (derive-key pri {})
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
  [k-str {:keys [algorithm curve ephemeral]}]
  ;; (def b64-str (-> pub .getEncoded b64/encode String.))
  ;;  {algorithm :ECDSA :curve :secp256r1}
  (let [decoded-bytes (b64/decode (.getBytes ^String k-str))
        key-factory (-> algorithm
                        name
                        (KeyFactory/getInstance BouncyCastleProvider/PROVIDER_NAME))
        param-specs (-> curve name ECNamedCurveTable/getParameterSpec)
        point (.decodePoint (.getCurve param-specs) decoded-bytes)]
    (.generatePublic key-factory )))

;;;getKey
(defn get-key
  "Returns the key this CSP associates to the Subject Key Identifier ski.
  Params
        ski (byte[])
  Returns
        (Key) An instance of the Key class corresponding to the ski"
  [ski]
  
  )


;;;hash
(defn hash
  "Hashes messages msg using options opts.
  Params
        msg (byte[])
        opts (Object) an object that encapsulates property “algorithm” with values for hashing algorithms such as “SHA2” or “SHA3”
  Returns
        (Key) An instance of the Key class corresponding to the ski"
  [msg opts]
  )


;;;encrypt
(defn encrypt
  "Encrypt plain text.
  Params
        key (Key) public encryption key
        plainText (byte[])
        opts (Object)
  Returns
        (byte[]) Cipher text"
  [key prain-text opts]
  )

;;; decrypt
(defn decrypt
  "Decrypt cipher text.
  Params
        key (Key) private decryption key
        cipherText (byte[])
        opts (Object)
  Returns
        (byte[]) Plain text"
  [key cipher-text opts])


;;;sign
(defn sign
  "Sign the data.
  Params
        Key (Key) private signing key
        digest (byte[]) fixed-length digest of the target message to be signed
        opts (function) hashing function to use
  Returns
        Result(Object):Signature object"
  [key digest opts])



;;; verify
(defn verify
  "Verify the signature.
  Params
        key (Key) public verification key
        signature (byte[]) signature
        digest (byte[]) original digest that was signed
  Returns
        (bool): verification successful or not"
  [key signature digest])


