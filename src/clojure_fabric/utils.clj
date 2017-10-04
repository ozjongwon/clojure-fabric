(ns clojure-fabric.utils
  (:import org.hyperledger.fabric.sdk.helper.Utils))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.helper.Utils
;;;

;;;  generateUUID
(defn
 generate-uuid
 []
 (org.hyperledger.fabric.sdk.helper.Utils/generateUUID))

;;;  parseGrpcUrl
(defn
 parse-grpc-url
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.helper.Utils/parseGrpcUrl string0))

;;;  readFile
(defn
 read-file
 [^java.io.File file0]
 (org.hyperledger.fabric.sdk.helper.Utils/readFile file0))

;;;  hash
(defn
 hash
 [ bytes0 ^org.bouncycastle.crypto.Digest digest1]
 (org.hyperledger.fabric.sdk.helper.Utils/hash bytes0 digest1))

;;;  isNullOrEmpty
(defn
 is-null-or-empty
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.helper.Utils/isNullOrEmpty string0))

;;;  deleteFileOrDirectory
(defn
 delete-file-or-directory
 [^java.io.File file0]
 (org.hyperledger.fabric.sdk.helper.Utils/deleteFileOrDirectory file0))

;;;  generateParameterHash
(defn
 generate-parameter-hash
 [^java.lang.String
  string0
  ^java.lang.String
  string1
  ^java.util.List
  list2]
 (org.hyperledger.fabric.sdk.helper.Utils/generateParameterHash
  string0
  string1
  list2))

;;;  generateDirectoryHash
(defn
 generate-directory-hash
 [^java.lang.String
  string0
  ^java.lang.String
  string1
  ^java.lang.String
  string2]
 (org.hyperledger.fabric.sdk.helper.Utils/generateDirectoryHash
  string0
  string1
  string2))

;;;  checkGrpcUrl
(defn
 check-grpc-url
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.helper.Utils/checkGrpcUrl string0))

;;;  combinePaths
(defn
 combine-paths
 [^java.lang.String string0  strings1]
 (org.hyperledger.fabric.sdk.helper.Utils/combinePaths
  string0
  strings1))

;;;  logString
(defn
 log-string
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.helper.Utils/logString string0))

;;;  generateTarGz
(defn
 generate-tar-gz
 [^java.io.File file0 ^java.lang.String string1]
 (org.hyperledger.fabric.sdk.helper.Utils/generateTarGz file0 string1))

;;;  readFileFromClasspath
(defn
 read-file-from-classpath
 [^java.lang.String string0]
 (org.hyperledger.fabric.sdk.helper.Utils/readFileFromClasspath
  string0))

;;;  generateTimestamp
(defn
 generate-timestamp
 []
 (org.hyperledger.fabric.sdk.helper.Utils/generateTimestamp))

;;;  toHexString
(defn
 to-hex-string
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ByteString generic-arg1)
  (org.hyperledger.fabric.sdk.helper.Utils/toHexString
   ^com.google.protobuf.ByteString
   generic-arg1)
  :else
  (org.hyperledger.fabric.sdk.helper.Utils/toHexString  generic-arg1)))

;;;  generateNonce
(defn
 generate-nonce
 []
 (org.hyperledger.fabric.sdk.helper.Utils/generateNonce))
