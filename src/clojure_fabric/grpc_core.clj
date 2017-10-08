(ns clojure-fabric.grpc-core)



;; Note that under the cover there are two different kinds of communications with the fabric backend
;; that trigger different events to be emitted back to the application’s handlers:
;; - the grpc client with the orderer service uses a “regular” stateless HTTP connection in
;;      a request/response fashion with the “broadcast” call. The method implementation should emit
;;      “transaction submitted” when a successful acknowledgement is received in the response, or
;;      “error” when an error is received
;; - The method implementation should also maintain a persistent connection with the Chain’s
;;      event source Peer as part of the internal event hub mechanism in order to support
;;      the fabric events “BLOCK”, “CHAINCODE” and “TRANSACTION”. These events should cause
;;      the method to emit “complete” or “error” events to the application
