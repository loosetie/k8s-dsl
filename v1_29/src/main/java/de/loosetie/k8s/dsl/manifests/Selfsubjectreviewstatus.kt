package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Selfsubjectreviewstatus_authentication_k8s_io_v1: K8sManifest {
  /** User attributes of the user making this request. */
  val userInfo: UserInfo_authentication_k8s_io_v1?
}