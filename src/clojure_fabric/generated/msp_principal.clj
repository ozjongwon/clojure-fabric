(ns clojure-fabric.msp-principal
  (:import org.hyperledger.fabric.protos.common.MspPrincipal))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.MspPrincipal
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.common.MspPrincipal/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.common.MspPrincipal/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.common.MspPrincipal/registerAllExtensions
   generic-arg1)))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getSerializedSize))

;;;  PRINCIPAL_FIELD_NUMBER
(defn
 principal_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/PRINCIPAL_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal toBuilder))

;;;  PRINCIPAL_CLASSIFICATION_FIELD_NUMBER
(defn
 principal_-classification_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal/PRINCIPAL_CLASSIFICATION_FIELD_NUMBER))

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

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-principal$-msp-principal writeTo coded-output-stream0))

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

;;;  getPrincipalClassificationValue
(defn
 get-principal-classification-value
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPPrincipal
  msp-principal$-msp-principal]
 (. msp-principal$-msp-principal getPrincipalClassificationValue))

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

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getSerializedSize))

;;;  MSP_IDENTIFIER_FIELD_NUMBER
(defn
 msp_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/MSP_IDENTIFIER_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit toBuilder))

;;;  getOrganizationalUnitIdentifier
(defn
 get-organizational-unit-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getOrganizationalUnitIdentifier))

;;;  ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER
(defn
 organizational_-unit_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER))

;;;  getMspIdentifier
(defn
 get-msp-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit]
 (. msp-principal$-organization-unit getMspIdentifier))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit
  msp-principal$-organization-unit
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-principal$-organization-unit writeTo coded-output-stream0))

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

;;;  CERTIFIERS_IDENTIFIER_FIELD_NUMBER
(defn
 certifiers_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$OrganizationUnit/CERTIFIERS_IDENTIFIER_FIELD_NUMBER))

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

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getSerializedSize))

;;;  MSP_IDENTIFIER_FIELD_NUMBER
(defn
 msp_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/MSP_IDENTIFIER_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role toBuilder))

;;;  ROLE_FIELD_NUMBER
(defn
 role_-field_-number
 []
 (org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole/ROLE_FIELD_NUMBER))

;;;  getMspIdentifier
(defn
 get-msp-identifier
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getMspIdentifier))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-principal$-msp-role writeTo coded-output-stream0))

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

;;;  getRoleValue
(defn
 get-role-value
 [^org.hyperledger.fabric.protos.common.MspPrincipal$MSPRole
  msp-principal$-msp-role]
 (. msp-principal$-msp-role getRoleValue))

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
