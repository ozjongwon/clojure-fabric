;; Peer implementation of "Fabric SDK Design Spec"
;; 
;; The Peer class represents the remote Peer node and its network membership materials,
;; aka the ECert used to verify signatures. Peer membership represents organizations,
;; unlike User membership which represents individuals.
;;
;; When constructed, a Peer instance can be designated as an event source, in which case
;; a “eventSourceUrl” attribute should be configured. This allows the SDK to automatically
;; attach transaction event listeners to the event stream.
;;
;; It should be noted that Peer event streams function at the Peer level and not at the chain
;; and chaincode levels.

(ns clojure-fabric.orderer
  (:require [clojure-fabric.user :as user]))

(defonce ^:dynamic *orderer* nil)

(defrecord Orderer [name url user certificate])

(defn make-orderer [m]
  (map->Orderer m))

(defn- broadcast-client
  ([]))

(defn send-broadcast
  ([]))
