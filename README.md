# Clojure-fabric, Hyperledger Fabric SDK for Clojure
This is my own reference implementation of [Fabric SDK Design Spec](https://docs.google.com/document/d/1R5RtIBMW9fZpli37E5Li5_Q9ve3BnQ4q3gWmGZj6Sv4)

## Goals
The major goals of this project are:
- Make it simple.
- Avoid conceptual and code level duplication.
- Build layers of abstraction to control complexity.
- Make easy to extend.
- Build mechanisms rather than type in manually.
- Make future proof.
- Provide fast and scalable API.

## Test examples
To understand its usage, see some test cases:

### Run query-installed-chaincodes with unprivileged/privileged user

```clojure
(expect io.grpc.StatusRuntimeException
        (let [user (core/get-user "Org1MSP" "user1") ;; user == error!
              mychannel (user/get-channel user "mychannel")]
          (user/query-installed-chaincodes user (proto/get-random-node mychannel :peers))))

(expect true
        (let [user (core/get-user "Org1MSP" "admin")
              mychannel (user/get-channel user "mychannel")
              chaincodes1 (user/query-installed-chaincodes user (proto/get-random-node mychannel :peers))]
          (user/install-chaincode user (str "test" (System/currentTimeMillis)) "github.com/example_cc" "v1"
                                  "/home/jc/Work/clojure-fabric/resources/gocc/src/github.com"
                                  :golang (core/get-nodes mychannel  :peers))
          (= (inc (count chaincodes1))
             (count (user/query-installed-chaincodes user (proto/get-random-node mychannel :peers))))))
```

### Channel creation - get config-update from a template, create channel, and join channel
```clojure
(expect true
        (let [orderer-admin (core/get-user "Orderer" "admin")
              org1-admin (core/get-user "Org1MSP" "admin")
              org2-admin (core/get-user "Org2MSP" "admin")
              org1-user (core/get-user "Org1MSP" "user1")
              org2-user (core/get-user "Org2MSP" "user1")
              ;; orderer is shared between Org1MSP and Org2MSP
              orderer (first (core/get-nodes (core/get-user "Org1MSP" "user1") :orderers))
              channel-name (str "mychannel" (System/currentTimeMillis))
              config-update (assoc (user/tx-file->config-update "resources/fixture/balance-transfer/artifacts/channel/mychannel.tx")
                                   :channel-id channel-name)
              org1-peers [(core/find-peer "peer0" org1-user) (core/find-peer "peer1" org1-user)]
              org2-peers [(core/find-peer "peer0" org2-user) (core/find-peer "peer1" org2-user)]]
          (->> (user/clj-config-update->proto-byte-array config-update)
               (user/create-or-update-channel-from-nodes org1-admin
                                                         channel-name
                                                         orderer
                                                         [org1-admin org2-admin orderer-admin]))
          (user/new-channel! org1-admin {:name channel-name
                                         :orderers {(:name orderer) orderer}
                                         :peers org1-peers})

          (user/new-channel! org2-admin {:name channel-name
                                         :orderers {(:name orderer) orderer}
                                         :peers org2-peers})
          (let [org1-admin (core/get-user "Org1MSP" "admin")
                org2-admin (core/get-user "Org2MSP" "admin")
                genesis-block (channel/get-genesis-block (get-in org1-admin [:channels channel-name]))]
            (every? (fn [resp]
                      (-> (.getResponse resp)
                          (.getStatus)
                          (= 200)))
                    (concat (channel/join-channel (user/get-channel org1-admin channel-name) org1-peers genesis-block)
                            (channel/join-channel (user/get-channel org2-admin channel-name) org2-peers genesis-block))))))
```


### Block comparison by calling get-genesis-block and query-block-by-number
```clojure
(expect (let [org1-admin (core/get-user "Org1MSP" "admin")]
          (-> (channel/get-genesis-block (get-in org1-admin [:channels "mychannel"]))
              (proto/proto->clj (proto/parse-trees :block-transaction))
              (dissoc :metadata)))
        (let [org1-admin (core/get-user "Org1MSP" "admin")
              mychannel (user/get-channel org1-admin "mychannel")]
          (-> (channel/query-block-by-number mychannel 0)
              (first)
              (dissoc :metadata))))
```

See more examples in core_test.clj

## Status
All major infrastructures were done - message building, message sending, event hub, parsing and building raw structures, and crypto suite.

### User(Client)
#### Done
- create-or-update-channel
- install-chaincode
- query-channels
- query-installed-chaincodes

#### Todo
Write test cases

### Channel
#### Done
- get-genesis-block
- join-channel
- query-blockchain-info
- query-block-by-number
- query-block-by-hash
- query-block-by-tx-id
- query-by-chaincode
- query-transaction
- query-instantiated-chaincodes
- send-instantiate-proposal
- send-transaction-proposal
- send-transaction (Use proto/send-proposal or chaincode/send-system-chaincode-request)
- send-upgrade-proposal
#### Todo
Write test cases

### Crypto Suite
#### Done
- decrypt
- derive-key
- encrypt
- generate-key
- hash
- import-key
- sign
- verify

#### Todo
- get-key
Write test cases

### Event Hub
#### Done
- connect
- disconnect
- connected?
- register-block-event
- register-chaincode-event
- register-tx-event
- unregister-block-event
- unregister-chaincode-event
- unregister-tx-event

#### Todo
Write test cases

### Fabric CA Client
Not implemented yet

### Orderer
#### Done
- send-broadcast
- send-deliver
#### Todo
Write test cases

### Peer
#### Done
- send-proposal - This is a low level function. See send-proposal in proto.clj
#### Todo
Write test cases

## License
Copyright &copy; 2017 Jong-won Choi. 

Licensed under the Apache License, Version 2.0 (the "License")