(ns clojure-fabric.proposal-exception
  (:import org.hyperledger.fabric.sdk.exception.ProposalException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.ProposalException
;;;

;;;  org.hyperledger.fabric.sdk.exception.ProposalException
(defn
 proposal-exception
 ([^org.hyperledger.fabric.sdk.exception.ProposalException
   proposal-exception
   ^java.lang.String
   string0
   ^java.lang.Exception
   exception1]
  (.
   proposal-exception
   org.hyperledger.fabric.sdk.exception.ProposalException
   string0
   exception1))
 ([^org.hyperledger.fabric.sdk.exception.ProposalException
   proposal-exception
   generic-arg1]
  (cond
   (instance? java.lang.String generic-arg1)
   (.
    proposal-exception
    org.hyperledger.fabric.sdk.exception.ProposalException
    ^java.lang.String
    generic-arg1)
   (instance? java.lang.Throwable generic-arg1)
   (.
    proposal-exception
    org.hyperledger.fabric.sdk.exception.ProposalException
    ^java.lang.Throwable
    generic-arg1)
   :else
   (.
    proposal-exception
    org.hyperledger.fabric.sdk.exception.ProposalException
    generic-arg1))))
