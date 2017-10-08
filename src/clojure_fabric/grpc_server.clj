(ns clojure-fabric.grpc-server
  #_
  (:gen-class
   :name clojure-fabric.grpc-server.RouteGuideServer
   :extends io.grpc.examples.routeguide.RouteGuideGrpc$RouteGuideImplBase)
  (:import [io.grpc.stub StreamObserver])
  #_
  (:use [grpc-clj.util]))

