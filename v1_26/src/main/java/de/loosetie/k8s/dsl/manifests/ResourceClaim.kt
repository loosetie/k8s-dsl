package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceClaim_core_v1: K8sManifest {
  /** Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that
resource available inside a container. */
  @K8sDslMarker var name: String?
}