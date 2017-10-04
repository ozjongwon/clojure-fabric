(ns clojure-fabric.config
  (:import org.hyperledger.fabric.sdk.helper.Config))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.helper.Config
;;;

;;;  PROPOSAL_CONSISTENCY_VALIDATION
(defn
 proposal_-consistency_-validation
 []
 (org.hyperledger.fabric.sdk.helper.Config/PROPOSAL_CONSISTENCY_VALIDATION))

;;;  KEY_AGREEMENT_ALGORITHM
(defn
 key_-agreement_-algorithm
 []
 (org.hyperledger.fabric.sdk.helper.Config/KEY_AGREEMENT_ALGORITHM))

;;;  getAsymmetricKeyType
(defn
 get-asymmetric-key-type
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getAsymmetricKeyType))

;;;  getGenesisBlockWaitTime
(defn
 get-genesis-block-wait-time
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getGenesisBlockWaitTime))

;;;  getOrdererRetryWaitTime
(defn
 get-orderer-retry-wait-time
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getOrdererRetryWaitTime))

;;;  getSecurityLevel
(defn
 get-security-level
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getSecurityLevel))

;;;  CACERTS
(defn cacerts [] (org.hyperledger.fabric.sdk.helper.Config/CACERTS))

;;;  DIAGNOTISTIC_FILE_DIRECTORY
(defn
 diagnotistic_-file_-directory
 []
 (org.hyperledger.fabric.sdk.helper.Config/DIAGNOTISTIC_FILE_DIRECTORY))

;;;  SYMMETRIC_ALGORITHM
(defn
 symmetric_-algorithm
 []
 (org.hyperledger.fabric.sdk.helper.Config/SYMMETRIC_ALGORITHM))

;;;  getSymmetricAlgorithm
(defn
 get-symmetric-algorithm
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getSymmetricAlgorithm))

;;;  getDiagnosticFileDumper
(defn
 get-diagnostic-file-dumper
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getDiagnosticFileDumper))

;;;  getEventHubConnectionWaitTime
(defn
 get-event-hub-connection-wait-time
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getEventHubConnectionWaitTime))

;;;  SYMMETRIC_KEY_TYPE
(defn
 symmetric_-key_-type
 []
 (org.hyperledger.fabric.sdk.helper.Config/SYMMETRIC_KEY_TYPE))

;;;  getSignatureAlgorithm
(defn
 get-signature-algorithm
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getSignatureAlgorithm))

;;;  maxLogStringLength
(defn
 max-log-string-length
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config maxLogStringLength))

;;;  ORDERER_RETRY_WAIT_TIME
(defn
 orderer_-retry_-wait_-time
 []
 (org.hyperledger.fabric.sdk.helper.Config/ORDERER_RETRY_WAIT_TIME))

;;;  getKeyAgreementAlgorithm
(defn
 get-key-agreement-algorithm
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getKeyAgreementAlgorithm))

;;;  getMACKeyByteCount
(defn
 get-mac-key-byte-count
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getMACKeyByteCount))

;;;  getPeerCACerts
(defn
 get-peer-ca-certs
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getPeerCACerts))

;;;  getProposalWaitTime
(defn
 get-proposal-wait-time
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getProposalWaitTime))

;;;  HASH_ALGORITHM
(defn
 hash_-algorithm
 []
 (org.hyperledger.fabric.sdk.helper.Config/HASH_ALGORITHM))

;;;  MAX_LOG_STRING_LENGTH
(defn
 max_-log_-string_-length
 []
 (org.hyperledger.fabric.sdk.helper.Config/MAX_LOG_STRING_LENGTH))

;;;  EXTRALOGLEVEL
(defn
 extraloglevel
 []
 (org.hyperledger.fabric.sdk.helper.Config/EXTRALOGLEVEL))

;;;  SIGNATURE_ALGORITHM
(defn
 signature_-algorithm
 []
 (org.hyperledger.fabric.sdk.helper.Config/SIGNATURE_ALGORITHM))

;;;  getCertificateFormat
(defn
 get-certificate-format
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getCertificateFormat))

;;;  getSymmetricKeyByteCount
(defn
 get-symmetric-key-byte-count
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getSymmetricKeyByteCount))

;;;  SYMMETRIC_KEY_BYTE_COUNT
(defn
 symmetric_-key_-byte_-count
 []
 (org.hyperledger.fabric.sdk.helper.Config/SYMMETRIC_KEY_BYTE_COUNT))

;;;  CERTIFICATE_FORMAT
(defn
 certificate_-format
 []
 (org.hyperledger.fabric.sdk.helper.Config/CERTIFICATE_FORMAT))

;;;  getConfig
(defn
 get-config
 []
 (org.hyperledger.fabric.sdk.helper.Config/getConfig))

;;;  SECURITY_LEVEL
(defn
 security_-level
 []
 (org.hyperledger.fabric.sdk.helper.Config/SECURITY_LEVEL))

;;;  getChannelConfigWaitTime
(defn
 get-channel-config-wait-time
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getChannelConfigWaitTime))

;;;  PROPOSAL_WAIT_TIME
(defn
 proposal_-wait_-time
 []
 (org.hyperledger.fabric.sdk.helper.Config/PROPOSAL_WAIT_TIME))

;;;  CHANNEL_CONFIG_WAIT_TIME
(defn
 channel_-config_-wait_-time
 []
 (org.hyperledger.fabric.sdk.helper.Config/CHANNEL_CONFIG_WAIT_TIME))

;;;  GENESISBLOCK_WAIT_TIME
(defn
 genesisblock_-wait_-time
 []
 (org.hyperledger.fabric.sdk.helper.Config/GENESISBLOCK_WAIT_TIME))

;;;  LOGGERLEVEL
(defn
 loggerlevel
 []
 (org.hyperledger.fabric.sdk.helper.Config/LOGGERLEVEL))

;;;  getSymmetricKeyType
(defn
 get-symmetric-key-type
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getSymmetricKeyType))

;;;  extraLogLevel
(defn
 extra-log-level
 ([^org.hyperledger.fabric.sdk.helper.Config config  int0]
  (. config extraLogLevel int0))
 ([^org.hyperledger.fabric.sdk.helper.Config config]
  (. config extraLogLevel)))

;;;  getProposalConsistencyValidation
(defn
 get-proposal-consistency-validation
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getProposalConsistencyValidation))

;;;  ASYMMETRIC_KEY_TYPE
(defn
 asymmetric_-key_-type
 []
 (org.hyperledger.fabric.sdk.helper.Config/ASYMMETRIC_KEY_TYPE))

;;;  MAC_KEY_BYTE_COUNT
(defn
 mac_-key_-byte_-count
 []
 (org.hyperledger.fabric.sdk.helper.Config/MAC_KEY_BYTE_COUNT))

;;;  EVENTHUB_CONNECTION_WAIT_TIME
(defn
 eventhub_-connection_-wait_-time
 []
 (org.hyperledger.fabric.sdk.helper.Config/EVENTHUB_CONNECTION_WAIT_TIME))

;;;  getHashAlgorithm
(defn
 get-hash-algorithm
 [^org.hyperledger.fabric.sdk.helper.Config config]
 (. config getHashAlgorithm))

;;;  ORG_HYPERLEDGER_FABRIC_SDK_CONFIGURATION
(defn
 org_-hyperledger_-fabric_-sdk_-configuration
 []
 (org.hyperledger.fabric.sdk.helper.Config/ORG_HYPERLEDGER_FABRIC_SDK_CONFIGURATION))
