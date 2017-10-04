(ns clojure-fabric.update-channel-configuration
  (:import org.hyperledger.fabric.sdk.UpdateChannelConfiguration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.UpdateChannelConfiguration
;;;

;;;  org.hyperledger.fabric.sdk.UpdateChannelConfiguration
(defn
 update-channel-configuration
 ([^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
   update-channel-configuration
   generic-arg1]
  (cond
   (instance? java.io.File generic-arg1)
   (.
    update-channel-configuration
    org.hyperledger.fabric.sdk.UpdateChannelConfiguration
    ^java.io.File
    generic-arg1)
   :else
   (.
    update-channel-configuration
    org.hyperledger.fabric.sdk.UpdateChannelConfiguration
    
    generic-arg1)))
 ([^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
   update-channel-configuration]
  (.
   update-channel-configuration
   org.hyperledger.fabric.sdk.UpdateChannelConfiguration)))

;;;  getUpdateChannelConfigurationAsBytes
(defn
 get-update-channel-configuration-as-bytes
 [^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
  update-channel-configuration]
 (. update-channel-configuration getUpdateChannelConfigurationAsBytes))

;;;  setUpdateChannelConfiguration
(defn
 set-update-channel-configuration
 [^org.hyperledger.fabric.sdk.UpdateChannelConfiguration
  update-channel-configuration
  
  bytes0]
 (. update-channel-configuration setUpdateChannelConfiguration bytes0))
