package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface BoundObjectReference_authentication_k8s_io_v1_k8s1_19: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "authentication.k8s.io/v1"
  /** Kind of the referent. Valid kinds are 'Pod' and 'Secret'. */
  override val kind: String
    get() = "BoundObjectReference"
  /** Name of the referent. */
  @K8sDslMarker var name: String?
  /** UID of the referent. */
  @K8sDslMarker var uid: String?
}