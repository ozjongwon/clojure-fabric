(ns clojure-fabric.msp-config-package
  (:import org.hyperledger.fabric.protos.msp.MspConfigPackage))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage
;;;

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage/getDescriptor))

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.msp.MspConfigPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.msp.MspConfigPackage/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.msp.MspConfigPackage/registerAllExtensions
   generic-arg1)))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getSerializedSize))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-config-package$-msp-config writeTo coded-output-stream0))

;;;  CONFIG_FIELD_NUMBER
(defn
 config_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/CONFIG_FIELD_NUMBER))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/getDescriptor))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/TYPE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config
  ^java.lang.Object
  object0]
 (. msp-config-package$-msp-config equals object0))

;;;  getConfig
(defn
 get-config
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getConfig))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
   msp-config-package$-msp-config0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/newBuilder
   msp-config-package$-msp-config0))
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$MSPConfig
  msp-config-package$-msp-config]
 (. msp-config-package$-msp-config getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
;;;

;;;  getCryptoConfig
(defn
 get-crypto-config
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getCryptoConfig))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getSerializedSize))

;;;  getRootCertsList
(defn
 get-root-certs-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getRootCertsList))

;;;  getOrganizationalUnitIdentifiersList
(defn
 get-organizational-unit-identifiers-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (.
  msp-config-package$-fabric-msp-config
  getOrganizationalUnitIdentifiersList))

;;;  getSigningIdentityOrBuilder
(defn
 get-signing-identity-or-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getSigningIdentityOrBuilder))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config toBuilder))

;;;  getAdmins
(defn
 get-admins
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getAdmins int0))

;;;  getOrganizationalUnitIdentifiers
(defn
 get-organizational-unit-identifiers
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (.
  msp-config-package$-fabric-msp-config
  getOrganizationalUnitIdentifiers
  int0))

;;;  ROOT_CERTS_FIELD_NUMBER
(defn
 root_-certs_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/ROOT_CERTS_FIELD_NUMBER))

;;;  getOrganizationalUnitIdentifiersOrBuilder
(defn
 get-organizational-unit-identifiers-or-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (.
  msp-config-package$-fabric-msp-config
  getOrganizationalUnitIdentifiersOrBuilder
  int0))

;;;  getRootCerts
(defn
 get-root-certs
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getRootCerts int0))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getName))

;;;  getIntermediateCertsCount
(defn
 get-intermediate-certs-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getIntermediateCertsCount))

;;;  getTlsIntermediateCerts
(defn
 get-tls-intermediate-certs
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getTlsIntermediateCerts int0))

;;;  getTlsRootCertsCount
(defn
 get-tls-root-certs-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getTlsRootCertsCount))

;;;  hasSigningIdentity
(defn
 has-signing-identity
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config hasSigningIdentity))

;;;  getAdminsCount
(defn
 get-admins-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getAdminsCount))

;;;  getRevocationListList
(defn
 get-revocation-list-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getRevocationListList))

;;;  getIntermediateCertsList
(defn
 get-intermediate-certs-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getIntermediateCertsList))

;;;  INTERMEDIATE_CERTS_FIELD_NUMBER
(defn
 intermediate_-certs_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/INTERMEDIATE_CERTS_FIELD_NUMBER))

;;;  getOrganizationalUnitIdentifiersCount
(defn
 get-organizational-unit-identifiers-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (.
  msp-config-package$-fabric-msp-config
  getOrganizationalUnitIdentifiersCount))

;;;  CRYPTO_CONFIG_FIELD_NUMBER
(defn
 crypto_-config_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/CRYPTO_CONFIG_FIELD_NUMBER))

;;;  TLS_INTERMEDIATE_CERTS_FIELD_NUMBER
(defn
 tls_-intermediate_-certs_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/TLS_INTERMEDIATE_CERTS_FIELD_NUMBER))

;;;  getRevocationListCount
(defn
 get-revocation-list-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getRevocationListCount))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-config-package$-fabric-msp-config writeTo coded-output-stream0))

;;;  ORGANIZATIONAL_UNIT_IDENTIFIERS_FIELD_NUMBER
(defn
 organizational_-unit_-identifiers_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/ORGANIZATIONAL_UNIT_IDENTIFIERS_FIELD_NUMBER))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/getDescriptor))

;;;  getIntermediateCerts
(defn
 get-intermediate-certs
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getIntermediateCerts int0))

;;;  getAdminsList
(defn
 get-admins-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getAdminsList))

;;;  TLS_ROOT_CERTS_FIELD_NUMBER
(defn
 tls_-root_-certs_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/TLS_ROOT_CERTS_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseFrom
    
    generic-arg1))))

;;;  getRootCertsCount
(defn
 get-root-certs-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getRootCertsCount))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config isInitialized))

;;;  ADMINS_FIELD_NUMBER
(defn
 admins_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/ADMINS_FIELD_NUMBER))

;;;  REVOCATION_LIST_FIELD_NUMBER
(defn
 revocation_-list_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/REVOCATION_LIST_FIELD_NUMBER))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  ^java.lang.Object
  object0]
 (. msp-config-package$-fabric-msp-config equals object0))

;;;  SIGNING_IDENTITY_FIELD_NUMBER
(defn
 signing_-identity_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/SIGNING_IDENTITY_FIELD_NUMBER))

;;;  NAME_FIELD_NUMBER
(defn
 name_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/NAME_FIELD_NUMBER))

;;;  getRevocationList
(defn
 get-revocation-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getRevocationList int0))

;;;  getSigningIdentity
(defn
 get-signing-identity
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getSigningIdentity))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parser))

;;;  getTlsRootCertsList
(defn
 get-tls-root-certs-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getTlsRootCertsList))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/parseDelimitedFrom
   input-stream0)))

;;;  getTlsIntermediateCertsList
(defn
 get-tls-intermediate-certs-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getTlsIntermediateCertsList))

;;;  getOrganizationalUnitIdentifiersOrBuilderList
(defn
 get-organizational-unit-identifiers-or-builder-list
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (.
  msp-config-package$-fabric-msp-config
  getOrganizationalUnitIdentifiersOrBuilderList))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
   msp-config-package$-fabric-msp-config0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/newBuilder
   msp-config-package$-fabric-msp-config0))
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig/getDefaultInstance))

;;;  getCryptoConfigOrBuilder
(defn
 get-crypto-config-or-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getCryptoConfigOrBuilder))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getDefaultInstanceForType))

;;;  hasCryptoConfig
(defn
 has-crypto-config
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config hasCryptoConfig))

;;;  getTlsRootCerts
(defn
 get-tls-root-certs
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config
  
  int0]
 (. msp-config-package$-fabric-msp-config getTlsRootCerts int0))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getNameBytes))

;;;  getTlsIntermediateCertsCount
(defn
 get-tls-intermediate-certs-count
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricMSPConfig
  msp-config-package$-fabric-msp-config]
 (. msp-config-package$-fabric-msp-config getTlsIntermediateCertsCount))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
;;;

;;;  SIGNATURE_HASH_FAMILY_FIELD_NUMBER
(defn
 signature_-hash_-family_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/SIGNATURE_HASH_FAMILY_FIELD_NUMBER))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config toBuilder))

;;;  getIdentityIdentifierHashFunctionBytes
(defn
 get-identity-identifier-hash-function-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (.
  msp-config-package$-fabric-crypto-config
  getIdentityIdentifierHashFunctionBytes))

;;;  getIdentityIdentifierHashFunction
(defn
 get-identity-identifier-hash-function
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (.
  msp-config-package$-fabric-crypto-config
  getIdentityIdentifierHashFunction))

;;;  getSignatureHashFamilyBytes
(defn
 get-signature-hash-family-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (.
  msp-config-package$-fabric-crypto-config
  getSignatureHashFamilyBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  msp-config-package$-fabric-crypto-config
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config getParserForType))

;;;  IDENTITY_IDENTIFIER_HASH_FUNCTION_FIELD_NUMBER
(defn
 identity_-identifier_-hash_-function_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/IDENTITY_IDENTIFIER_HASH_FUNCTION_FIELD_NUMBER))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config
  ^java.lang.Object
  object0]
 (. msp-config-package$-fabric-crypto-config equals object0))

;;;  getSignatureHashFamily
(defn
 get-signature-hash-family
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config getSignatureHashFamily))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/newBuilder))
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
   msp-config-package$-fabric-crypto-config0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/newBuilder
   msp-config-package$-fabric-crypto-config0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricCryptoConfig
  msp-config-package$-fabric-crypto-config]
 (. msp-config-package$-fabric-crypto-config getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getSerializedSize))

;;;  getSignerOrBuilder
(defn
 get-signer-or-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getSignerOrBuilder))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config toBuilder))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getName))

;;;  getIPk
(defn
 get-i-pk
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getIPk))

;;;  SIGNER_FIELD_NUMBER
(defn
 signer_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/SIGNER_FIELD_NUMBER))

;;;  IPK_FIELD_NUMBER
(defn
 ipk_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/IPK_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-config-package$-idemix-msp-config writeTo coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config isInitialized))

;;;  hasSigner
(defn
 has-signer
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config hasSigner))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config
  ^java.lang.Object
  object0]
 (. msp-config-package$-idemix-msp-config equals object0))

;;;  getSigner
(defn
 get-signer
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getSigner))

;;;  NAME_FIELD_NUMBER
(defn
 name_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/NAME_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
   msp-config-package$-idemix-msp-config0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/newBuilder
   msp-config-package$-idemix-msp-config0))
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPConfig
  msp-config-package$-idemix-msp-config]
 (. msp-config-package$-idemix-msp-config getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config toBuilder))

;;;  getOrganizationalUnitIdentifier
(defn
 get-organizational-unit-identifier
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (.
  msp-config-package$-idemix-msp-signer-config
  getOrganizationalUnitIdentifier))

;;;  ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER
(defn
 organizational_-unit_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER))

;;;  getSk
(defn
 get-sk
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getSk))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  msp-config-package$-idemix-msp-signer-config
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/getDescriptor))

;;;  CRED_FIELD_NUMBER
(defn
 cred_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/CRED_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseFrom
    
    generic-arg1))))

;;;  getCred
(defn
 get-cred
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getCred))

;;;  getIsAdmin
(defn
 get-is-admin
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getIsAdmin))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config
  ^java.lang.Object
  object0]
 (. msp-config-package$-idemix-msp-signer-config equals object0))

;;;  IS_ADMIN_FIELD_NUMBER
(defn
 is_-admin_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/IS_ADMIN_FIELD_NUMBER))

;;;  SK_FIELD_NUMBER
(defn
 sk_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/SK_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (. msp-config-package$-idemix-msp-signer-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/newBuilder))
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
   msp-config-package$-idemix-msp-signer-config0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/newBuilder
   msp-config-package$-idemix-msp-signer-config0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (.
  msp-config-package$-idemix-msp-signer-config
  getDefaultInstanceForType))

;;;  getOrganizationalUnitIdentifierBytes
(defn
 get-organizational-unit-identifier-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$IdemixMSPSignerConfig
  msp-config-package$-idemix-msp-signer-config]
 (.
  msp-config-package$-idemix-msp-signer-config
  getOrganizationalUnitIdentifierBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info getSerializedSize))

;;;  getPublicSigner
(defn
 get-public-signer
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info getPublicSigner))

;;;  PRIVATE_SIGNER_FIELD_NUMBER
(defn
 private_-signer_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/PRIVATE_SIGNER_FIELD_NUMBER))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info toBuilder))

;;;  getPrivateSignerOrBuilder
(defn
 get-private-signer-or-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (.
  msp-config-package$-signing-identity-info
  getPrivateSignerOrBuilder))

;;;  getPrivateSigner
(defn
 get-private-signer
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info getPrivateSigner))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  msp-config-package$-signing-identity-info
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseFrom
    
    generic-arg1))))

;;;  hasPrivateSigner
(defn
 has-private-signer
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info hasPrivateSigner))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info
  ^java.lang.Object
  object0]
 (. msp-config-package$-signing-identity-info equals object0))

;;;  PUBLIC_SIGNER_FIELD_NUMBER
(defn
 public_-signer_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/PUBLIC_SIGNER_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (. msp-config-package$-signing-identity-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
   msp-config-package$-signing-identity-info0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/newBuilder
   msp-config-package$-signing-identity-info0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$SigningIdentityInfo
  msp-config-package$-signing-identity-info]
 (.
  msp-config-package$-signing-identity-info
  getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info toBuilder))

;;;  KEY_IDENTIFIER_FIELD_NUMBER
(defn
 key_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/KEY_IDENTIFIER_FIELD_NUMBER))

;;;  getKeyIdentifierBytes
(defn
 get-key-identifier-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getKeyIdentifierBytes))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. msp-config-package$-key-info writeTo coded-output-stream0))

;;;  KEY_MATERIAL_FIELD_NUMBER
(defn
 key_-material_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/KEY_MATERIAL_FIELD_NUMBER))

;;;  getKeyIdentifier
(defn
 get-key-identifier
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getKeyIdentifier))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/getDescriptor))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info
  ^java.lang.Object
  object0]
 (. msp-config-package$-key-info equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/parseDelimitedFrom
   input-stream0)))

;;;  getKeyMaterial
(defn
 get-key-material
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getKeyMaterial))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
   msp-config-package$-key-info0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/newBuilder
   msp-config-package$-key-info0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$KeyInfo
  msp-config-package$-key-info]
 (. msp-config-package$-key-info getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier toBuilder))

;;;  getOrganizationalUnitIdentifier
(defn
 get-organizational-unit-identifier
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (.
  msp-config-package$-fabric-ou-identifier
  getOrganizationalUnitIdentifier))

;;;  CERTIFICATE_FIELD_NUMBER
(defn
 certificate_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/CERTIFICATE_FIELD_NUMBER))

;;;  ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER
(defn
 organizational_-unit_-identifier_-field_-number
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/ORGANIZATIONAL_UNIT_IDENTIFIER_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (.
  msp-config-package$-fabric-ou-identifier
  writeTo
  coded-output-stream0))

;;;  getDescriptor
(defn
 get-descriptor
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/getDescriptor))

;;;  getCertificate
(defn
 get-certificate
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier getCertificate))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier
  ^java.lang.Object
  object0]
 (. msp-config-package$-fabric-ou-identifier equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
   msp-config-package$-fabric-ou-identifier0]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/newBuilder
   msp-config-package$-fabric-ou-identifier0))
 ([]
  (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (. msp-config-package$-fabric-ou-identifier getDefaultInstanceForType))

;;;  getOrganizationalUnitIdentifierBytes
(defn
 get-organizational-unit-identifier-bytes
 [^org.hyperledger.fabric.protos.msp.MspConfigPackage$FabricOUIdentifier
  msp-config-package$-fabric-ou-identifier]
 (.
  msp-config-package$-fabric-ou-identifier
  getOrganizationalUnitIdentifierBytes))
