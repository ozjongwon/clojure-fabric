(ns clojure-fabric.crypto-suite
  (:import [org.bouncycastle.crypto.generators ECKeyPairGenerator]
           [org.bouncycastle.jce ECNamedCurveTable]
           [org.bouncycastle.jce.spec ECNamedCurveParameterSpec]
           [org.bouncycastle.jce.provider BouncyCastleProvider]
           [org.bouncycastle.jcajce.provider.asymmetric.ec KeyPairGeneratorSpi$ECDSA]
           [java.security KeyPairGenerator SecureRandom]))

(defonce ecdsa-parameter-specs {:secp256r1 (ECNamedCurveTable/getParameterSpec "secp256r1")
                                :secp384r1 (ECNamedCurveTable/getParameterSpec "secp384r1")})
;;;generate_key
(defn generate-key
  "Generate a key based on the options. The utput can be a private key or a public key in an
  asymmetric algorithm, or a secret key of a symmetric algorithm.
  Params
        opts (Object): an object that encapsulates two properties, “algorithm” and
        “ephemeral”.
  Returns
        Result (Key): The key object"
  [algorithm ephemeral]
  (let [generator (-> algorithm
                      name
                      (KeyPairGenerator/getInstance BouncyCastleProvider/PROVIDER_NAME))
        param-specs (-> ephemeral name ECNamedCurveTable/getParameterSpec)]
    (.initialize generator param-specs (SecureRandom.))
    (.generateKeyPair generator)))

;;;deriveKey
(defn derive-key
  "Derives a key from k using opts.
  Params
        k (Key)
        opts (Object)
  Returns
        (Key) derived key"
  [k {:keys [algorithm ephemeral] :as opt}]
  ;; Derives the new private key from the source public key using the parameters passed in the opts.
  ;; This operation is needed for deriving private keys corresponding to the Transaction
  ;; Certificates.
  )

;;; importKey
(defn import-key
  "Imports a key from its raw representation using opts.
  Params
        k (Key)
        opts (Object)
  Returns
        (Key) An instance of the Key class wrapping the raw key bytes"
  []
  )

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


