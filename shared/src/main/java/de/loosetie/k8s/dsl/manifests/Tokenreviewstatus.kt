package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16: K8sManifest {
  /** Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token.
An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client
of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is
returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns
an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the
Kubernetes API server. */
  @K8sDslMarker var audiences: List<String>?
  /** Authenticated indicates that the token was associated with a known user. */
  @K8sDslMarker var authenticated: Boolean?
  /** Error indicates that the token couldn't be checked */
  @K8sDslMarker var error: String?
  /** User is the UserInfo associated with the provided token. */
  val user: UserInfo_authentication_k8s_io_v1_k8s1_16?
}      
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_17 = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16       
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_18 = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_17       
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19 = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_18       
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_20 = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_19       
typealias Tokenreviewstatus_authentication_k8s_io_v1_k8s1_21 = Tokenreviewstatus_authentication_k8s_io_v1_k8s1_20 