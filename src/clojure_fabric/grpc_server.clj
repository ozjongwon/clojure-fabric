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

(ns clojure-fabric.grpc-server
  #_
  (:gen-class
   :name clojure-fabric.grpc-server.RouteGuideServer
   :extends io.grpc.examples.routeguide.RouteGuideGrpc$RouteGuideImplBase)
  #_
  (:import [io.grpc.stub StreamObserver])
  #_
  (:use [grpc-clj.util]))

