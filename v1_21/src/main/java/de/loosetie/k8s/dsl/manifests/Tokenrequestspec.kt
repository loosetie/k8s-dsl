package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Tokenrequestspec_authentication_k8s_io_v1_k8s1_21: K8sManifest {
  /** Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in
the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be
used to authenticate against any of the audiences listed but implies a high degree of trust between the target
audiences. */
  @K8sDslMarker var audiences: List<String>?
  /** BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as
the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other
audiences may not. Keep ExpirationSeconds small if you want prompt revocation. */
  val boundObjectRef: BoundObjectReference_authentication_k8s_io_v1_k8s1_21?
  /** ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a
different validity duration so a client needs to check the 'expiration' field in a response. */
  @K8sDslMarker var expirationSeconds: Int?
}