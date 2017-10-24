(ns clojure-fabric.msp-principal
  (:import org.hyperledger.fabric.protos.common.MspPrincipal))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
;;;
;;;  getPrincipalClassification
(defn
 get-principal-classification
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getPrincipalClassification))

;;;  getPrincipal
(defn
 get-principal
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getPrincipal))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal
  ^java.lang.Object
  object0]
 (. msp-principal$-msp-principal equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
   msp-principal$-msp-principal0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/newBuilder
   msp-principal$-msp-principal0))
 ([]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
;;;
;;;  getOrganizationalUnitIdentifier
(defn
 get-organizational-unit-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getOrganizationalUnitIdentifier))

;;;  getMspIdentifier
(defn
 get-msp-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getMspIdentifier))

;;;  getMspIdentifierBytes
(defn
 get-msp-identifier-bytes
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getMspIdentifierBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit
  ^java.lang.Object
  object0]
 (. msp-principal$-organization-unit equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parser))

;;;  getCertifiersIdentifier
(defn
 get-certifiers-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getCertifiersIdentifier))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
   msp-principal$-organization-unit0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/newBuilder
   msp-principal$-organization-unit0))
 ([]
  (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getDefaultInstanceForType))

;;;  getOrganizationalUnitIdentifierBytes
(defn
 get-organizational-unit-identifier-bytes
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (.
  msp-principal$-organization-unit
  getOrganizationalUnitIdentifierBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
;;;

;;;  getMspIdentifier
(defn
 get-msp-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getMspIdentifier))

;;;  getMspIdentifierBytes
(defn
 get-msp-identifier-bytes
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getMspIdentifierBytes))

;;;  getRole
(defn
 get-role
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getRole))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role
  ^java.lang.Object
  object0]
 (. msp-principal$-msp-role equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/newBuilder))
 ([^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
   msp-principal$-msp-role0]
  (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/newBuilder
   msp-principal$-msp-role0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getDefaultInstanceForType))
