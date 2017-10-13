;; Copyright 2017 Jong-won Choi <oz.jongwon.choi@gmail.com>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

;;
;; Orderer implementation of "Fabric SDK Design Spec"
;; 
(ns clojure-fabric.orderer
  (:require [clojure-fabric.user :as user])
  (:import [clojure-fabric.core :as core]))


(defn- broadcast-client
  ([]))

(defn send-broadcast
  ([]))
