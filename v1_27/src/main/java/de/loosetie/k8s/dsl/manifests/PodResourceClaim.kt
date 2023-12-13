package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodResourceClaim_core_v1: K8sManifest {
  /** Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL. */
  @K8sDslMarker var name: String?
  /** Source describes where to find the ResourceClaim. */
  val source: ClaimSource_core_v1?
}