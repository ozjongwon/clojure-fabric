(ns clojure-fabric.invalid-protocol-buffer-runtime-exception
  (:import org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
;;;

;;;  getCause
(defn
 get-cause
 [^org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
  invalid-protocol-buffer-runtime-exception]
 (. invalid-protocol-buffer-runtime-exception getCause))

;;;  org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
(defn
 invalid-protocol-buffer-runtime-exception
 ([^org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
   invalid-protocol-buffer-runtime-exception
   ^com.google.protobuf.InvalidProtocolBufferException
   invalid-protocol-buffer-exception0]
  (.
   invalid-protocol-buffer-runtime-exception
   org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
   invalid-protocol-buffer-exception0))
 ([^org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
   invalid-protocol-buffer-runtime-exception
   ^java.lang.String
   string0
   ^com.google.protobuf.InvalidProtocolBufferException
   invalid-protocol-buffer-exception1]
  (.
   invalid-protocol-buffer-runtime-exception
   org.hyperledger.fabric.sdk.exception.InvalidProtocolBufferRuntimeException
   string0
   invalid-protocol-buffer-exception1)))
