package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface WeightedPodAffinityTerm_core_v1: K8sManifest {
  /** Required. A pod affinity term, associated with the corresponding weight. */
  val podAffinityTerm: PodAffinityTerm_core_v1?
  /** weight associated with matching the corresponding podAffinityTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}