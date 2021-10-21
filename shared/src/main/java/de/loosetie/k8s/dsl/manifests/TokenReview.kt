package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface TokenReview_authentication_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "TokenReview"
  /**  */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Spec holds information about the request being evaluated */
  val spec: Tokenreviewspec_authentication_k8s_io_v1_k8s1_16
  /** Status is filled in by the server and indicates whether the request can be authenticated. */
  val status: Tokenreviewstatus_authentication_k8s_io_v1_k8s1_16?
}      
typealias TokenReview_authentication_k8s_io_v1_k8s1_17 = TokenReview_authentication_k8s_io_v1_k8s1_16       
typealias TokenReview_authentication_k8s_io_v1_k8s1_18 = TokenReview_authentication_k8s_io_v1_k8s1_17       
typealias TokenReview_authentication_k8s_io_v1_k8s1_19 = TokenReview_authentication_k8s_io_v1_k8s1_18       
typealias TokenReview_authentication_k8s_io_v1_k8s1_20 = TokenReview_authentication_k8s_io_v1_k8s1_19       
typealias TokenReview_authentication_k8s_io_v1_k8s1_21 = TokenReview_authentication_k8s_io_v1_k8s1_20 