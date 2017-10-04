(ns clojure-fabric.chaincode-endorsement-policy-parse-exception
  (:import org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
;;;

;;;  org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
(defn
 chaincode-endorsement-policy-parse-exception
 ([^org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
   chaincode-endorsement-policy-parse-exception
   ^java.lang.String
   string0]
  (.
   chaincode-endorsement-policy-parse-exception
   org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
   string0))
 ([^org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
   chaincode-endorsement-policy-parse-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   chaincode-endorsement-policy-parse-exception
   org.hyperledger.fabric.sdk.exception.ChaincodeEndorsementPolicyParseException
   string0
   exception1)))
