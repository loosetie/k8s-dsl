package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Selfsubjectaccessreviewspec_authorization_k8s_io_v1: K8sManifest {
  /** NonResourceAttributes describes information for a non-resource access request */
  val nonResourceAttributes: NonResourceAttributes_authorization_k8s_io_v1?
  /** ResourceAuthorizationAttributes describes information for a resource access request */
  val resourceAttributes: ResourceAttributes_authorization_k8s_io_v1?
}