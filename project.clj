(defproject clojure-fabric "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;;[org.clojure/core.cache "0.6.5"]
                 [org.clojure/data.codec "0.1.0"]
                 [medley "1.0.0"]
                 ;;[buddy/buddy-core "1.4.0"]
                 [org.bouncycastle/bcprov-jdk15on "1.58"]
                 [joda-time "2.9.9"]

                 [io.grpc/grpc-core "1.6.1" ]
                 [io.grpc/grpc-netty "1.6.1" :exclusions [io.grpc/grpc-core io.netty/netty-codec-http2]]
                 [io.grpc/grpc-protobuf "1.6.1"]
                 [io.grpc/grpc-stub "1.6.1"]
                 [io.netty/netty-codec-http2 "4.1.11.Final"]
                 ]
  :main ^:skip-aot grpc-clj.core
  :aot [grpc-clj.server]
  :target-path "target/%s"
  :java-source-paths ["resources/fabric-protos/generated/main/grpc"
                      "resources/fabric-protos/generated/main/java"])
