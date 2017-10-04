(ns clojure-fabric.query-by-chaincode-request
  (:import org.hyperledger.fabric.sdk.QueryByChaincodeRequest))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.QueryByChaincodeRequest
;;;

;;;  newInstance
(defn
 new-instance
 [^org.hyperledger.fabric.sdk.User user0]
 (org.hyperledger.fabric.sdk.QueryByChaincodeRequest/newInstance user0))

;;;  setTransientMap
(defn
 set-transient-map
 [^org.hyperledger.fabric.sdk.QueryByChaincodeRequest
  query-by-chaincode-request
  ^java.util.Map
  map0]
 (. query-by-chaincode-request setTransientMap map0))
