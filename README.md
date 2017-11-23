# Clojure-fabric, Hyperledger Fabric SDK for Clojure
This is my own reference implementation of [Fabric SDK Design Spec](https://docs.google.com/document/d/1R5RtIBMW9fZpli37E5Li5_Q9ve3BnQ4q3gWmGZj6Sv4)

## Goals
The major goals of this project are:
- Make it simple.
- Avoid conceptual duplication as well as coding level duplication.
- Build layers of abstraction to control complexity.
- Make easy to extend.
- Build mechanisms rather than type in manually.
- Make future proof.
- Provide fast and scalable API 

## Status
All major infrastructures were done - message building, message sending, event hub, parsing and building raw structures, and crypto suite.

### User(Client)
#### Done
- create-or-update-channel
- install-chaincode
- query-channels
- query-installed-chaincodes

#### Todo
None

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

#### Todo
- query-instantiated-chaincodes
- send-instantiate-proposal
- send-transaction
- send-transaction-proposal
- send-upgrade-proposal

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
None

### Fabric CA Client
Not implemented yet

### Orderer
#### Done
- send-broadcast
- send-deliver
#### Todo
None

### Peer
#### Done
- send-proposal - This is a low level function. See send-proposal in proto.clj
#### Todo
None

## License
Copyright &copy; 2017 Jong-won Choi. 

Licensed under the Apache License, Version 2.0 (the "License")