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


(ns clojure-fabric.utils)

(defn indices [pred col]
  (keep-indexed #(when (pred %2) %1) col))

(defn removev-index [v idx]
  (if (= idx 0)
    (subvec v 1)
    (into (subvec v 0 idx) (subvec v (inc idx)))))

(defonce bytes-type (type (byte-array 8)))
(defn bytes? [x]
  (instance? bytes-type x))

(defn ensure-vector [x]
  (cond (vector? x) x
        (sequential? x) (vec x)
        :else [x]))

(defonce hostname-regex "((?:[a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])(?:\\.(?:[a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]))*)")

(defonce grpc-url-pattern (re-pattern (str "((?i)grpcs?)[:]//" hostname-regex "[:](\\d+)")))

(defrecord gRpcUrl [protocol host port])
(defn parse-grpc-url [url]
  (let [[_ protocol host port] (re-matches grpc-url-pattern url)]
    (when-not (and protocol host port)
      (throw (Exception. "Invalid gRPC URL! Must be 'grpc|grpcs://<hostname>:<port>'")))
    (->gRpcUrl (clojure.string/lower-case protocol) host port)))

(defn map-vals
  [f m]
  (reduce (fn [m [k v]]
               (assoc m k (f v)))
          {}
          m))
