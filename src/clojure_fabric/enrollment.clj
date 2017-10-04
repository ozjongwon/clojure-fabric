(ns clojure-fabric.enrollment
  (:import org.hyperledger.fabric.sdk.Enrollment))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.Enrollment
;;;

;;;  getKey
(defn
 get-key
 [^org.hyperledger.fabric.sdk.Enrollment enrollment]
 (. enrollment getKey))

;;;  getCert
(defn
 get-cert
 [^org.hyperledger.fabric.sdk.Enrollment enrollment]
 (. enrollment getCert))
