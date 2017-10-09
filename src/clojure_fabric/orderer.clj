;; Orderer implementation of "Fabric SDK Design Spec"
;; 

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
