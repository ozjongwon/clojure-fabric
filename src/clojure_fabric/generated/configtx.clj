(ns clojure-fabric.configtx
  (:import org.hyperledger.fabric.protos.common.Configtx))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.common.Configtx/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.common.Configtx/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.common.Configtx/registerAllExtensions
   generic-arg1)))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getSerializedSize))

;;;  getConfigOrBuilder
(defn
 get-config-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getConfigOrBuilder))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope toBuilder))

;;;  getLastUpdate
(defn
 get-last-update
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getLastUpdate))

;;;  getLastUpdateOrBuilder
(defn
 get-last-update-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getLastUpdateOrBuilder))

;;;  hasLastUpdate
(defn
 has-last-update
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope hasLastUpdate))

;;;  hasConfig
(defn
 has-config
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope hasConfig))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-envelope writeTo coded-output-stream0))

;;;  CONFIG_FIELD_NUMBER
(defn
 config_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/CONFIG_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope
  ^java.lang.Object
  object0]
 (. configtx$-config-envelope equals object0))

;;;  LAST_UPDATE_FIELD_NUMBER
(defn
 last_-update_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/LAST_UPDATE_FIELD_NUMBER))

;;;  getConfig
(defn
 get-config
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getConfig))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
   configtx$-config-envelope0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/newBuilder
   configtx$-config-envelope0))
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigEnvelope
  configtx$-config-envelope]
 (. configtx$-config-envelope getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
;;;

;;;  getValuesMap
(defn
 get-values-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getValuesMap))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getUnknownFields))

;;;  POLICIES_FIELD_NUMBER
(defn
 policies_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/POLICIES_FIELD_NUMBER))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getSerializedSize))

;;;  getPoliciesMap
(defn
 get-policies-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getPoliciesMap))

;;;  getPoliciesCount
(defn
 get-policies-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getPoliciesCount))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema toBuilder))

;;;  getPolicies
(defn
 get-policies
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getPolicies))

;;;  getGroupsCount
(defn
 get-groups-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getGroupsCount))

;;;  getValuesCount
(defn
 get-values-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getValuesCount))

;;;  getPoliciesOrDefault
(defn
 get-policies-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema1]
 (.
  configtx$-config-group-schema
  getPoliciesOrDefault
  string0
  configtx$-config-policy-schema1))

;;;  GROUPS_FIELD_NUMBER
(defn
 groups_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/GROUPS_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-group-schema writeTo coded-output-stream0))

;;;  getGroups
(defn
 get-groups
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getGroups))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseFrom
    
    generic-arg1))))

;;;  containsGroups
(defn
 contains-groups
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema containsGroups string0))

;;;  containsValues
(defn
 contains-values
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema containsValues string0))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema isInitialized))

;;;  getValuesOrDefault
(defn
 get-values-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema1]
 (.
  configtx$-config-group-schema
  getValuesOrDefault
  string0
  configtx$-config-value-schema1))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.Object
  object0]
 (. configtx$-config-group-schema equals object0))

;;;  getGroupsMap
(defn
 get-groups-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getGroupsMap))

;;;  getGroupsOrThrow
(defn
 get-groups-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema getGroupsOrThrow string0))

;;;  containsPolicies
(defn
 contains-policies
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema containsPolicies string0))

;;;  getGroupsOrDefault
(defn
 get-groups-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema1]
 (.
  configtx$-config-group-schema
  getGroupsOrDefault
  string0
  configtx$-config-group-schema1))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parser))

;;;  getValuesOrThrow
(defn
 get-values-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema getValuesOrThrow string0))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/parseDelimitedFrom
   input-stream0)))

;;;  getPoliciesOrThrow
(defn
 get-policies-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema
  ^java.lang.String
  string0]
 (. configtx$-config-group-schema getPoliciesOrThrow string0))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
   configtx$-config-group-schema0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/newBuilder
   configtx$-config-group-schema0)))

;;;  VALUES_FIELD_NUMBER
(defn
 values_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/VALUES_FIELD_NUMBER))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getDefaultInstanceForType))

;;;  getValues
(defn
 get-values
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroupSchema
  configtx$-config-group-schema]
 (. configtx$-config-group-schema getValues))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-value-schema writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema
  ^java.lang.Object
  object0]
 (. configtx$-config-value-schema equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
   configtx$-config-value-schema0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/newBuilder
   configtx$-config-value-schema0))
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValueSchema
  configtx$-config-value-schema]
 (. configtx$-config-value-schema getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema toBuilder))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-policy-schema writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema
  ^java.lang.Object
  object0]
 (. configtx$-config-policy-schema equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
   configtx$-config-policy-schema0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/newBuilder
   configtx$-config-policy-schema0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicySchema
  configtx$-config-policy-schema]
 (. configtx$-config-policy-schema getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$Config
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getSerializedSize))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config toBuilder))

;;;  getChannelGroup
(defn
 get-channel-group
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getChannelGroup))

;;;  getSequence
(defn
 get-sequence
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getSequence))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config writeTo coded-output-stream0))

;;;  SEQUENCE_FIELD_NUMBER
(defn
 sequence_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$Config/SEQUENCE_FIELD_NUMBER))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$Config/TYPE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$Config/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config
  ^java.lang.Object
  object0]
 (. configtx$-config equals object0))

;;;  hasChannelGroup
(defn
 has-channel-group
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config hasChannelGroup))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$Config/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$Config/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$Config/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$Config
   configtx$-config0]
  (org.hyperledger.fabric.protos.common.Configtx$Config/newBuilder
   configtx$-config0))
 ([] (org.hyperledger.fabric.protos.common.Configtx$Config/newBuilder)))

;;;  CHANNEL_GROUP_FIELD_NUMBER
(defn
 channel_-group_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$Config/CHANNEL_GROUP_FIELD_NUMBER))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$Config/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getDefaultInstanceForType))

;;;  getChannelGroupOrBuilder
(defn
 get-channel-group-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$Config
  configtx$-config]
 (. configtx$-config getChannelGroupOrBuilder))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope toBuilder))

;;;  SIGNATURES_FIELD_NUMBER
(defn
 signatures_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/SIGNATURES_FIELD_NUMBER))

;;;  getSignaturesCount
(defn
 get-signatures-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getSignaturesCount))

;;;  getSignatures
(defn
 get-signatures
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope
  
  int0]
 (. configtx$-config-update-envelope getSignatures int0))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-update-envelope writeTo coded-output-stream0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope
  ^java.lang.Object
  object0]
 (. configtx$-config-update-envelope equals object0))

;;;  getSignaturesOrBuilder
(defn
 get-signatures-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope
  
  int0]
 (. configtx$-config-update-envelope getSignaturesOrBuilder int0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parser))

;;;  CONFIG_UPDATE_FIELD_NUMBER
(defn
 config_-update_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/CONFIG_UPDATE_FIELD_NUMBER))

;;;  getConfigUpdate
(defn
 get-config-update
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getConfigUpdate))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  getSignaturesList
(defn
 get-signatures-list
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getSignaturesList))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
   configtx$-config-update-envelope0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/newBuilder
   configtx$-config-update-envelope0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope/getDefaultInstance))

;;;  getSignaturesOrBuilderList
(defn
 get-signatures-or-builder-list
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getSignaturesOrBuilderList))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdateEnvelope
  configtx$-config-update-envelope]
 (. configtx$-config-update-envelope getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getSerializedSize))

;;;  getType
(defn
 get-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getType))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update toBuilder))

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getChannelId))

;;;  WRITE_SET_FIELD_NUMBER
(defn
 write_-set_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/WRITE_SET_FIELD_NUMBER))

;;;  CHANNEL_ID_FIELD_NUMBER
(defn
 channel_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/CHANNEL_ID_FIELD_NUMBER))

;;;  getWriteSet
(defn
 get-write-set
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getWriteSet))

;;;  getWriteSetOrBuilder
(defn
 get-write-set-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getWriteSetOrBuilder))

;;;  containsIsolatedData
(defn
 contains-isolated-data
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update
  ^java.lang.String
  string0]
 (. configtx$-config-update containsIsolatedData string0))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-update writeTo coded-output-stream0))

;;;  READ_SET_FIELD_NUMBER
(defn
 read_-set_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/READ_SET_FIELD_NUMBER))

;;;  TYPE_FIELD_NUMBER
(defn
 type_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/TYPE_FIELD_NUMBER))

;;;  getChannelIdBytes
(defn
 get-channel-id-bytes
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getChannelIdBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getReadSetOrBuilder
(defn
 get-read-set-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getReadSetOrBuilder))

;;;  ISOLATED_DATA_FIELD_NUMBER
(defn
 isolated_-data_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/ISOLATED_DATA_FIELD_NUMBER))

;;;  getIsolatedDataOrThrow
(defn
 get-isolated-data-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update
  ^java.lang.String
  string0]
 (. configtx$-config-update getIsolatedDataOrThrow string0))

;;;  getReadSet
(defn
 get-read-set
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getReadSet))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update isInitialized))

;;;  getIsolatedDataCount
(defn
 get-isolated-data-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getIsolatedDataCount))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update
  ^java.lang.Object
  object0]
 (. configtx$-config-update equals object0))

;;;  hasWriteSet
(defn
 has-write-set
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update hasWriteSet))

;;;  getIsolatedDataOrDefault
(defn
 get-isolated-data-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update
  ^java.lang.String
  string0
  ^com.google.protobuf.ByteString
  byte-string1]
 (.
  configtx$-config-update
  getIsolatedDataOrDefault
  string0
  byte-string1))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parser))

;;;  hasReadSet
(defn
 has-read-set
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update hasReadSet))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/parseDelimitedFrom
   input-stream0)))

;;;  getIsolatedData
(defn
 get-isolated-data
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getIsolatedData))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
   configtx$-config-update0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/newBuilder
   configtx$-config-update0))
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getDefaultInstanceForType))

;;;  getIsolatedDataMap
(defn
 get-isolated-data-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigUpdate
  configtx$-config-update]
 (. configtx$-config-update getIsolatedDataMap))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
;;;

;;;  getValuesMap
(defn
 get-values-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getValuesMap))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getUnknownFields))

;;;  POLICIES_FIELD_NUMBER
(defn
 policies_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/POLICIES_FIELD_NUMBER))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getSerializedSize))

;;;  getPoliciesMap
(defn
 get-policies-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getPoliciesMap))

;;;  getPoliciesCount
(defn
 get-policies-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getPoliciesCount))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group toBuilder))

;;;  MOD_POLICY_FIELD_NUMBER
(defn
 mod_-policy_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/MOD_POLICY_FIELD_NUMBER))

;;;  getPolicies
(defn
 get-policies
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getPolicies))

;;;  getGroupsCount
(defn
 get-groups-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getGroupsCount))

;;;  getValuesCount
(defn
 get-values-count
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getValuesCount))

;;;  getPoliciesOrDefault
(defn
 get-policies-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy1]
 (.
  configtx$-config-group
  getPoliciesOrDefault
  string0
  configtx$-config-policy1))

;;;  GROUPS_FIELD_NUMBER
(defn
 groups_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/GROUPS_FIELD_NUMBER))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getVersion))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-group writeTo coded-output-stream0))

;;;  getGroups
(defn
 get-groups
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getGroups))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/VERSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseFrom
    
    generic-arg1))))

;;;  getModPolicy
(defn
 get-mod-policy
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getModPolicy))

;;;  containsGroups
(defn
 contains-groups
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group containsGroups string0))

;;;  containsValues
(defn
 contains-values
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group containsValues string0))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group isInitialized))

;;;  getValuesOrDefault
(defn
 get-values-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value1]
 (.
  configtx$-config-group
  getValuesOrDefault
  string0
  configtx$-config-value1))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.Object
  object0]
 (. configtx$-config-group equals object0))

;;;  getGroupsMap
(defn
 get-groups-map
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getGroupsMap))

;;;  getGroupsOrThrow
(defn
 get-groups-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group getGroupsOrThrow string0))

;;;  containsPolicies
(defn
 contains-policies
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group containsPolicies string0))

;;;  getModPolicyBytes
(defn
 get-mod-policy-bytes
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getModPolicyBytes))

;;;  getGroupsOrDefault
(defn
 get-groups-or-default
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0
  ^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group1]
 (.
  configtx$-config-group
  getGroupsOrDefault
  string0
  configtx$-config-group1))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parser))

;;;  getValuesOrThrow
(defn
 get-values-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group getValuesOrThrow string0))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/parseDelimitedFrom
   input-stream0)))

;;;  getPoliciesOrThrow
(defn
 get-policies-or-throw
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group
  ^java.lang.String
  string0]
 (. configtx$-config-group getPoliciesOrThrow string0))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
   configtx$-config-group0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/newBuilder
   configtx$-config-group0)))

;;;  VALUES_FIELD_NUMBER
(defn
 values_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/VALUES_FIELD_NUMBER))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigGroup/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getDefaultInstanceForType))

;;;  getValues
(defn
 get-values
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigGroup
  configtx$-config-group]
 (. configtx$-config-group getValues))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigValue
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value toBuilder))

;;;  MOD_POLICY_FIELD_NUMBER
(defn
 mod_-policy_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/MOD_POLICY_FIELD_NUMBER))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getVersion))

;;;  getValue
(defn
 get-value
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getValue))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-value writeTo coded-output-stream0))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/VERSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getModPolicy
(defn
 get-mod-policy
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getModPolicy))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value
  ^java.lang.Object
  object0]
 (. configtx$-config-value equals object0))

;;;  getModPolicyBytes
(defn
 get-mod-policy-bytes
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getModPolicyBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parser))

;;;  VALUE_FIELD_NUMBER
(defn
 value_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/VALUE_FIELD_NUMBER))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
   configtx$-config-value0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/newBuilder
   configtx$-config-value0))
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigValue/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigValue
  configtx$-config-value]
 (. configtx$-config-value getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy toBuilder))

;;;  MOD_POLICY_FIELD_NUMBER
(defn
 mod_-policy_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/MOD_POLICY_FIELD_NUMBER))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getVersion))

;;;  hasPolicy
(defn
 has-policy
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy hasPolicy))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-policy writeTo coded-output-stream0))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/VERSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getModPolicy
(defn
 get-mod-policy
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getModPolicy))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy
  ^java.lang.Object
  object0]
 (. configtx$-config-policy equals object0))

;;;  getPolicy
(defn
 get-policy
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getPolicy))

;;;  POLICY_FIELD_NUMBER
(defn
 policy_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/POLICY_FIELD_NUMBER))

;;;  getModPolicyBytes
(defn
 get-mod-policy-bytes
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getModPolicyBytes))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parser))

;;;  getPolicyOrBuilder
(defn
 get-policy-or-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getPolicyOrBuilder))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/newBuilder))
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
   configtx$-config-policy0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/newBuilder
   configtx$-config-policy0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigPolicy
  configtx$-config-policy]
 (. configtx$-config-policy getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getSerializedSize))

;;;  getSignature
(defn
 get-signature
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getSignature))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature toBuilder))

;;;  getSignatureHeader
(defn
 get-signature-header
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getSignatureHeader))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. configtx$-config-signature writeTo coded-output-stream0))

;;;  SIGNATURE_FIELD_NUMBER
(defn
 signature_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/SIGNATURE_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseFrom
    
    generic-arg1))))

;;;  SIGNATURE_HEADER_FIELD_NUMBER
(defn
 signature_-header_-field_-number
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/SIGNATURE_HEADER_FIELD_NUMBER))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature
  ^java.lang.Object
  object0]
 (. configtx$-config-signature equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
   configtx$-config-signature0]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/newBuilder
   configtx$-config-signature0))
 ([]
  (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.common.Configtx$ConfigSignature/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.common.Configtx$ConfigSignature
  configtx$-config-signature]
 (. configtx$-config-signature getDefaultInstanceForType))
