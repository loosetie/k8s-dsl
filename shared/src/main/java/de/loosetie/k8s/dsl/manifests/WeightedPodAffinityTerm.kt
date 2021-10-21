package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface WeightedPodAffinityTerm_core_v1_k8s1_16: K8sManifest {
  /** Required. A pod affinity term, associated with the corresponding weight. */
  val podAffinityTerm: PodAffinityTerm_core_v1_k8s1_16?
  /** weight associated with matching the corresponding podAffinityTerm, in the range 1-100. */
  @K8sDslMarker var weight: Int?
}      
typealias WeightedPodAffinityTerm_core_v1_k8s1_17 = WeightedPodAffinityTerm_core_v1_k8s1_16       
typealias WeightedPodAffinityTerm_core_v1_k8s1_18 = WeightedPodAffinityTerm_core_v1_k8s1_17       
typealias WeightedPodAffinityTerm_core_v1_k8s1_19 = WeightedPodAffinityTerm_core_v1_k8s1_18       
typealias WeightedPodAffinityTerm_core_v1_k8s1_20 = WeightedPodAffinityTerm_core_v1_k8s1_19       
typealias WeightedPodAffinityTerm_core_v1_k8s1_21 = WeightedPodAffinityTerm_core_v1_k8s1_20 