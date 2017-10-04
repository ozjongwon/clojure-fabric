(ns clojure-fabric.tx-read-write-set-info
  (:import org.hyperledger.fabric.sdk.TxReadWriteSetInfo))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TxReadWriteSetInfo
;;;

;;;  org.hyperledger.fabric.sdk.TxReadWriteSetInfo
(defn
 tx-read-write-set-info
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  tx-read-write-set-info
  ^org.hyperledger.fabric.protos.ledger.rwset.Rwset$TxReadWriteSet
  rwset$-tx-read-write-set0]
 (.
  tx-read-write-set-info
  org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  rwset$-tx-read-write-set0))

;;;  getNsRwsetInfos
(defn
 get-ns-rwset-infos
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  tx-read-write-set-info]
 (. tx-read-write-set-info getNsRwsetInfos))

;;;  getNsRwsetCount
(defn
 get-ns-rwset-count
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  tx-read-write-set-info]
 (. tx-read-write-set-info getNsRwsetCount))

;;;  getNsRwsetInfo
(defn
 get-ns-rwset-info
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  tx-read-write-set-info
  
  int0]
 (. tx-read-write-set-info getNsRwsetInfo int0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfo
;;;

;;;  getNamespace
(defn
 get-namespace
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfo
  tx-read-write-set-info$-ns-rwset-info]
 (. tx-read-write-set-info$-ns-rwset-info getNamespace))

;;;  getRwset
(defn
 get-rwset
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfo
  tx-read-write-set-info$-ns-rwset-info]
 (. tx-read-write-set-info$-ns-rwset-info getRwset))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterable
;;;

;;;  org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterable
(defn
 tx-read-write-set-info$-ns-rwset-info-iterable
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterable
  tx-read-write-set-info$-ns-rwset-info-iterable
  ^org.hyperledger.fabric.sdk.TxReadWriteSetInfo
  tx-read-write-set-info0]
 (.
  tx-read-write-set-info$-ns-rwset-info-iterable
  org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterable
  tx-read-write-set-info0))

;;;  iterator
(defn
 iterator
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterable
  tx-read-write-set-info$-ns-rwset-info-iterable]
 (. tx-read-write-set-info$-ns-rwset-info-iterable iterator))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterator
;;;

;;;  next
(defn
 next
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterator
  tx-read-write-set-info$-ns-rwset-info-iterator]
 (. tx-read-write-set-info$-ns-rwset-info-iterator next))

;;;  hasNext
(defn
 has-next
 [^org.hyperledger.fabric.sdk.TxReadWriteSetInfo$NsRwsetInfoIterator
  tx-read-write-set-info$-ns-rwset-info-iterator]
 (. tx-read-write-set-info$-ns-rwset-info-iterator hasNext))
