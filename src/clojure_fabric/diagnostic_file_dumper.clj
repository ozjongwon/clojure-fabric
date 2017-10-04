(ns clojure-fabric.diagnostic-file-dumper
  (:import org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper
;;;

;;;  createDiagnosticFile
(defn
 create-diagnostic-file
 ([^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper
   diagnostic-file-dumper
   
   bytes0]
  (. diagnostic-file-dumper createDiagnosticFile bytes0))
 ([^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper
   diagnostic-file-dumper
   
   bytes0
   ^java.lang.String
   string1
   ^java.lang.String
   string2]
  (.
   diagnostic-file-dumper
   createDiagnosticFile
   bytes0
   string1
   string2)))

;;;  run
(defn
 run
 [^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper
  diagnostic-file-dumper]
 (. diagnostic-file-dumper run))

;;;  createDiagnosticProtobufFile
(defn
 create-diagnostic-protobuf-file
 [^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper
  diagnostic-file-dumper
  
  bytes0]
 (. diagnostic-file-dumper createDiagnosticProtobufFile bytes0))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper$1
;;;

;;;  failed
(defn
 failed
 [^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper$1
  diagnostic-file-dumper$1
  ^java.lang.Throwable
  throwable0
  ^java.lang.Object
  object1]
 (. diagnostic-file-dumper$1 failed throwable0 object1))

;;;  completed
(defn
 completed
 [^org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper$1
  diagnostic-file-dumper$1
  ^java.lang.Integer
  integer0
  ^java.lang.Object
  object1]
 (. diagnostic-file-dumper$1 completed integer0 object1))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper$QueEntry
;;;
