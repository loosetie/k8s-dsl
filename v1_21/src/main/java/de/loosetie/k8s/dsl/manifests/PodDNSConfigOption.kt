package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodDNSConfigOption_core_v1_k8s1_21: K8sManifest {
  /** Required. */
  @K8sDslMarker var name: String?
  /**  */
  @K8sDslMarker var value: String?
}