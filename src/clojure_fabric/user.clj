;; User implementation of "Fabric SDK Design Spec"
;; 
;; The User class represents users that have been enrolled and represented by an enrollment
;; certificate (ECert) and a signing key. The ECert must have been signed by one of the CAs
;; the blockchain network has been configured to trust. An enrolled user (having a signing key
;; and ECert) can conduct chaincode deployments, transactions and queries with the Chain. 
;; User ECerts can be obtained from a CA beforehand as part of deploying the application,
;; or it can be obtained from the optional Fabric COP service via its enrollment process.
;; Sometimes User identities are confused with Peer identities. User identities represent
;; signing capability because it has access to the private key, while Peer identities
;; in the context of the application/SDK only has the certificate for verifying signatures.
;; An application cannot use the Peer identity to sign things because the application doesn’t
;; have access to the Peer identity’s private key.

(ns clojure-fabric.user)

(defonce ^:dynamic *user* nil)

(defrecord User [name roles certificate])

(defn %make-user [m]
  (map->User m))

;;; get_name
(defn get-name
  "Get member name. Required property for the instance objects.
  Returns (str): 
        The name of the user"
  ([]
   (get-name *user*))
  ([user]
   (:name user)))


;;; get_roles
(defn get-roles
 "Get the user’s roles. It’s an array of possible values in “client”, and “auditor”.
  The member service defines two more roles reserved for peer membership: “peer” and “validator”,
  which are not exposed to the applications.
  Returns: (str[]): 
        The roles for this user"
  ([]
   (get-roles *user*))
  ([user]
   (:roles user)))

;;; get_enrollment_certificate
(defn get-enrollment-certificate
  "Returns the underlying ECert representing this user’s identity.
  Params: none
  Returns:
        Certificate in PEM format signed by the trusted CA"
  ([]
   (get-enrollment-certificate *user*))
  ([user]
   (:certificate user)))

;;; set_name
;;; Immutable

;;; set_roles
;;; Immutable

;;; set_enrollment_certificate
;;; Immutable


;;; generate_tcerts
;; Not required any more(?) - https://jira.hyperledger.org/browse/FAB-5740
;; (defn generate-tcerts
;;   "Gets a batch of TCerts to use for transaction. there is a 1-to-1 relationship between TCert
;;   and Transaction. The TCert can be generated locally by the SDK using the user’s crypto materials.
;;   Params:
;;         count (number): how many in the batch to obtain?
;;         Attributes (string[]): list of attributes to include in the TCert
;;   Returns (TCert[]): 
;;         An array of TCerts"
;;   ([count attributes]
;;    (generate-tcerts *user*))
;;   ([user count attributes])
;;   ;; TBD
;;   ;; Not sure if this is required now (couldn't find any usage in Java code)
;;   )
