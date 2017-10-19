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

(defproject clojure-fabric "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;;[org.clojure/core.cache "0.6.5"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.clojure/core.async "0.3.443"]
                 
                 [medley "1.0.0"]
                 [buddy/buddy-core "1.4.0"] ;; for test
                 [org.bouncycastle/bcprov-jdk15on "1.58"]
                 [joda-time "2.9.9"]

                 [io.grpc/grpc-core "1.7.0" ]
                 [io.grpc/grpc-netty "1.7.0" :exclusions [io.grpc/grpc-core io.netty/netty-codec-http2]]
                 [io.grpc/grpc-protobuf "1.7.0"]
                 [io.grpc/grpc-stub "1.7.0"]
                 [io.netty/netty-codec-http2 "4.1.16.Final"]
                 [io.netty/netty-tcnative-boringssl-static "2.0.6.Final"]
                 ]
  :main ^:skip-aot grpc-clj.core
  :target-path "target/%s"
  :java-source-paths ["resources/fabric-protos/generated/main"]
  :profiles {:dev {:jvm-opts ["-Djavax.net.debug=ssl"
                              #=(eval (str "-Djavax.net.ssl.trustStore=" (System/getenv "PWD") "/resources/SSL/clojure-fabric.store"))
                              #=(eval (str "-Djavax.net.ssl.keyStore=" (System/getenv "PWD") "/resources/SSL/clojure-fabric.store"))]
                   :plugins [[lein-expectations "0.0.8"]]
                   :dependencies [[expectations "2.1.9"]]
                   :warn-on-reflection true}}
  :jvm-opts ["-Duser.timezone=GMT" #_ "-Xmx1g" #_ "-server"]

  :plugins [[lein-expectations "0.0.8"]]
  )

