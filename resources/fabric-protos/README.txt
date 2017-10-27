1. protos directory from fabric Git repo 

http://scriptedonachip.com/git-sparse-checkout

jc@kepler:~/Work/fabric$ git init
jc@kepler:~/Work/fabric$ git remote add origin -f https://github.com/hyperledger/fabric.git
jc@kepler:~/Work/fabric$ git config core.sparsecheckout true
jc@kepler:~/Work/fabric$ echo "protos/*" >> .git/info/sparse-checkout
jc@kepler:~/Work/fabric$ git pull --depth=2 origin master

2. build.gradle file
https://github.com/grpc/grpc-java
Search for protobuf:protoc and use correct versions for protoc and protoc-gen-grpc-java

jc@kepler:~/Work/clojure-fabric/resources/fabric-protos$ gradle clean
jc@kepler:~/Work/clojure-fabric/resources/fabric-protos$ gradle build
jc@kepler:~/Work/clojure-fabric/resources/fabric-protos$ gradle generateProto

3. lein compile


4. Add certs for tests(This may not work, see importing code in core_test.clj)
keytool -import -alias org1 -file fixture/balance-transfer/artifacts/channel/crypto-config/peerOrganizations/org1.example.com/ca/ca.org1.example.com-cert.pem -keystore SSL/clojure-fabric.store
keytool -import -alias org2 -file fixture/balance-transfer/artifacts/channel/crypto-config/peerOrganizations/org2.example.com/ca/ca.org2.example.com-cert.pem -keystore SSL/clojure-fabric.store
keytool -import -alias order1 -file fixture/balance-transfer/artifacts/channel/crypto-config/ordererOrganizations/example.com/ca/ca.example.com-cert.pem -keystore SSL/clojure-fabric.store
keytool -list -keystore SSL/clojure-fabric.store

--------------
https://lists.hyperledger.org/pipermail/hyperledger-fabric/2017-October/001934.html
