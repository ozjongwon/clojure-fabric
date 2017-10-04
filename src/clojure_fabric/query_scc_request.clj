(ns clojure-fabric.query-scc-request
  (:import org.hyperledger.fabric.sdk.QuerySCCRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.QuerySCCRequest
;;;

;;;  GETBLOCKBYHASH
(defn
 getblockbyhash
 []
 (org.hyperledger.fabric.sdk.QuerySCCRequest/GETBLOCKBYHASH))

;;;  GETBLOCKBYNUMBER
(defn
 getblockbynumber
 []
 (org.hyperledger.fabric.sdk.QuerySCCRequest/GETBLOCKBYNUMBER))

;;;  GETTRANSACTIONBYID
(defn
 gettransactionbyid
 []
 (org.hyperledger.fabric.sdk.QuerySCCRequest/GETTRANSACTIONBYID))

;;;  getChaincodeID
(defn
 get-chaincode-id
 [^org.hyperledger.fabric.sdk.QuerySCCRequest query-scc-request]
 (. query-scc-request getChaincodeID))

;;;  org.hyperledger.fabric.sdk.QuerySCCRequest
(defn
 query-scc-request
 [^org.hyperledger.fabric.sdk.QuerySCCRequest
  query-scc-request
  ^org.hyperledger.fabric.sdk.User
  user0]
 (. query-scc-request org.hyperledger.fabric.sdk.QuerySCCRequest user0))

;;;  GETCHAININFO
(defn
 getchaininfo
 []
 (org.hyperledger.fabric.sdk.QuerySCCRequest/GETCHAININFO))

;;;  GETBLOCKBYTXID
(defn
 getblockbytxid
 []
 (org.hyperledger.fabric.sdk.QuerySCCRequest/GETBLOCKBYTXID))
