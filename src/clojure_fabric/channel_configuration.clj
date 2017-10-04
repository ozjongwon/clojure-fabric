(ns clojure-fabric.channel-configuration
  (:import org.hyperledger.fabric.sdk.ChannelConfiguration))

;;;---------------------------------------------------
;;;org.hyperledger.fabric.sdk.ChannelConfiguration
;;;

;;;  org.hyperledger.fabric.sdk.ChannelConfiguration
(defn
 channel-configuration
 ([^org.hyperledger.fabric.sdk.ChannelConfiguration
   channel-configuration]
  (.
   channel-configuration
   org.hyperledger.fabric.sdk.ChannelConfiguration))
 ([^org.hyperledger.fabric.sdk.ChannelConfiguration
   channel-configuration
   generic-arg1]
  (cond
   (instance? java.io.File generic-arg1)
   (.
    channel-configuration
    org.hyperledger.fabric.sdk.ChannelConfiguration
    ^java.io.File
    generic-arg1)
   :else
   (.
    channel-configuration
    org.hyperledger.fabric.sdk.ChannelConfiguration
    
    generic-arg1))))

;;;  setChannelConfiguration
(defn
 set-channel-configuration
 [^org.hyperledger.fabric.sdk.ChannelConfiguration
  channel-configuration
  
  bytes0]
 (. channel-configuration setChannelConfiguration bytes0))

;;;  getChannelConfigurationAsBytes
(defn
 get-channel-configuration-as-bytes
 [^org.hyperledger.fabric.sdk.ChannelConfiguration
  channel-configuration]
 (. channel-configuration getChannelConfigurationAsBytes))
