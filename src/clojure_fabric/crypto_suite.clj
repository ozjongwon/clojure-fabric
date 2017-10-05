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



