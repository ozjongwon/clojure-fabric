(ns clojure-fabric.block-listener
  (:import org.hyperledger.fabric.sdk.BlockListener))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.BlockListener
;;;

;;;  received
(defn
 received
 [^org.hyperledger.fabric.sdk.BlockListener
  block-listener
  ^org.hyperledger.fabric.sdk.BlockEvent
  block-event0]
 (. block-listener received block-event0))
