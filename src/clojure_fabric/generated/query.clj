(ns clojure-fabric.query
  (:import org.hyperledger.fabric.protos.peer.Query))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Query
;;;

;;;  registerAllExtensions
(defn
 register-all-extensions
 [generic-arg1]
 (cond
  (instance? com.google.protobuf.ExtensionRegistry generic-arg1)
  (org.hyperledger.fabric.protos.peer.Query/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistry
   generic-arg1)
  (instance? com.google.protobuf.ExtensionRegistryLite generic-arg1)
  (org.hyperledger.fabric.protos.peer.Query/registerAllExtensions
   ^com.google.protobuf.ExtensionRegistryLite
   generic-arg1)
  :else
  (org.hyperledger.fabric.protos.peer.Query/registerAllExtensions
   generic-arg1)))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
;;;

;;;  getChaincodesOrBuilderList
(defn
 get-chaincodes-or-builder-list
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getChaincodesOrBuilderList))

;;;  getChaincodesList
(defn
 get-chaincodes-list
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getChaincodesList))

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response toBuilder))

;;;  CHAINCODES_FIELD_NUMBER
(defn
 chaincodes_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/CHAINCODES_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. query$-chaincode-query-response writeTo coded-output-stream0))

;;;  getChaincodes
(defn
 get-chaincodes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response
  
  int0]
 (. query$-chaincode-query-response getChaincodes int0))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response
  ^java.lang.Object
  object0]
 (. query$-chaincode-query-response equals object0))

;;;  getChaincodesOrBuilder
(defn
 get-chaincodes-or-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response
  
  int0]
 (. query$-chaincode-query-response getChaincodesOrBuilder int0))

;;;  getChaincodesCount
(defn
 get-chaincodes-count
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getChaincodesCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
   query$-chaincode-query-response0]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/newBuilder
   query$-chaincode-query-response0))
 ([]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeQueryResponse
  query$-chaincode-query-response]
 (. query$-chaincode-query-response getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info toBuilder))

;;;  INPUT_FIELD_NUMBER
(defn
 input_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/INPUT_FIELD_NUMBER))

;;;  getName
(defn
 get-name
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getName))

;;;  getPathBytes
(defn
 get-path-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getPathBytes))

;;;  VSCC_FIELD_NUMBER
(defn
 vscc_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/VSCC_FIELD_NUMBER))

;;;  getEscc
(defn
 get-escc
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getEscc))

;;;  getInputBytes
(defn
 get-input-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getInputBytes))

;;;  getVersion
(defn
 get-version
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getVersion))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. query$-chaincode-info writeTo coded-output-stream0))

;;;  getEsccBytes
(defn
 get-escc-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getEsccBytes))

;;;  VERSION_FIELD_NUMBER
(defn
 version_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/VERSION_FIELD_NUMBER))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  getVscc
(defn
 get-vscc
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getVscc))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info newBuilderForType))

;;;  getPath
(defn
 get-path
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getPath))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info
  ^java.lang.Object
  object0]
 (. query$-chaincode-info equals object0))

;;;  NAME_FIELD_NUMBER
(defn
 name_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/NAME_FIELD_NUMBER))

;;;  ESCC_FIELD_NUMBER
(defn
 escc_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/ESCC_FIELD_NUMBER))

;;;  PATH_FIELD_NUMBER
(defn
 path_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/PATH_FIELD_NUMBER))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/parseDelimitedFrom
   input-stream0)))

;;;  getVsccBytes
(defn
 get-vscc-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getVsccBytes))

;;;  getInput
(defn
 get-input
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getInput))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
   query$-chaincode-info0]
  (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/newBuilder
   query$-chaincode-info0)))

;;;  getVersionBytes
(defn
 get-version-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getVersionBytes))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getDefaultInstanceForType))

;;;  getNameBytes
(defn
 get-name-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChaincodeInfo
  query$-chaincode-info]
 (. query$-chaincode-info getNameBytes))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response toBuilder))

;;;  getChannels
(defn
 get-channels
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response
  
  int0]
 (. query$-channel-query-response getChannels int0))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. query$-channel-query-response writeTo coded-output-stream0))

;;;  getChannelsOrBuilder
(defn
 get-channels-or-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response
  
  int0]
 (. query$-channel-query-response getChannelsOrBuilder int0))

;;;  getChannelsOrBuilderList
(defn
 get-channels-or-builder-list
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getChannelsOrBuilderList))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    
    generic-arg1
    extension-registry-lite1)))
 ([generic-arg1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^java.io.InputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseFrom
    
    generic-arg1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response
  ^java.lang.Object
  object0]
 (. query$-channel-query-response equals object0))

;;;  getChannelsCount
(defn
 get-channels-count
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getChannelsCount))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response hashCode))

;;;  getChannelsList
(defn
 get-channels-list
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getChannelsList))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseDelimitedFrom
   input-stream0))
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/parseDelimitedFrom
   input-stream0
   extension-registry-lite1)))

;;;  CHANNELS_FIELD_NUMBER
(defn
 channels_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/CHANNELS_FIELD_NUMBER))

;;;  newBuilder
(defn
 new-builder
 ([]
  (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/newBuilder))
 ([^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
   query$-channel-query-response0]
  (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/newBuilder
   query$-channel-query-response0)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelQueryResponse
  query$-channel-query-response]
 (. query$-channel-query-response getDefaultInstanceForType))


;;;---------------------------------------------------
;;;org.hyperledger.fabric.protos.peer.Query$ChannelInfo
;;;

;;;  getUnknownFields
(defn
 get-unknown-fields
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getUnknownFields))

;;;  getSerializedSize
(defn
 get-serialized-size
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getSerializedSize))

;;;  toBuilder
(defn
 to-builder
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info toBuilder))

;;;  getChannelId
(defn
 get-channel-id
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getChannelId))

;;;  CHANNEL_ID_FIELD_NUMBER
(defn
 channel_-id_-field_-number
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/CHANNEL_ID_FIELD_NUMBER))

;;;  writeTo
(defn
 write-to
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info
  ^com.google.protobuf.CodedOutputStream
  coded-output-stream0]
 (. query$-channel-info writeTo coded-output-stream0))

;;;  getChannelIdBytes
(defn
 get-channel-id-bytes
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getChannelIdBytes))

;;;  parseFrom
(defn
 parse-from
 ([generic-arg1]
  (cond
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1)
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^java.io.InputStream
    generic-arg1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    
    generic-arg1)))
 ([generic-arg1
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (cond
   (instance? java.io.InputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^java.io.InputStream
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.ByteString generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^com.google.protobuf.ByteString
    generic-arg1
    extension-registry-lite1)
   (instance? java.nio.ByteBuffer generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^java.nio.ByteBuffer
    generic-arg1
    extension-registry-lite1)
   (instance? com.google.protobuf.CodedInputStream generic-arg1)
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    ^com.google.protobuf.CodedInputStream
    generic-arg1
    extension-registry-lite1)
   :else
   (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseFrom
    
    generic-arg1
    extension-registry-lite1))))

;;;  newBuilderForType
(defn
 new-builder-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info newBuilderForType))

;;;  isInitialized
(defn
 is-initialized
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info isInitialized))

;;;  getParserForType
(defn
 get-parser-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getParserForType))

;;;  equals
(defn
 equals
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info
  ^java.lang.Object
  object0]
 (. query$-channel-info equals object0))

;;;  hashCode
(defn
 hash-code
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info hashCode))

;;;  parser
(defn
 parser
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parser))

;;;  parseDelimitedFrom
(defn
 parse-delimited-from
 ([^java.io.InputStream
   input-stream0
   ^com.google.protobuf.ExtensionRegistryLite
   extension-registry-lite1]
  (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseDelimitedFrom
   input-stream0
   extension-registry-lite1))
 ([^java.io.InputStream input-stream0]
  (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/parseDelimitedFrom
   input-stream0)))

;;;  newBuilder
(defn
 new-builder
 ([^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
   query$-channel-info0]
  (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/newBuilder
   query$-channel-info0))
 ([] (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/newBuilder)))

;;;  getDefaultInstance
(defn
 get-default-instance
 []
 (org.hyperledger.fabric.protos.peer.Query$ChannelInfo/getDefaultInstance))

;;;  getDefaultInstanceForType
(defn
 get-default-instance-for-type
 [^org.hyperledger.fabric.protos.peer.Query$ChannelInfo
  query$-channel-info]
 (. query$-channel-info getDefaultInstanceForType))
