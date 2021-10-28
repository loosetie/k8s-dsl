package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("podAffinityTerm", "weight")
class WeightedPodAffinityTerm_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WeightedPodAffinityTerm_core_v1_k8s1_16, HasParent {
  override var podAffinityTerm: PodAffinityTerm_core_v1_k8s1_16? = null
  override var weight: Int? = null
}
typealias WeightedPodAffinityTerm_core_v1_k8s1_17Impl = WeightedPodAffinityTerm_core_v1_k8s1_16Impl
typealias WeightedPodAffinityTerm_core_v1_k8s1_18Impl = WeightedPodAffinityTerm_core_v1_k8s1_17Impl
typealias WeightedPodAffinityTerm_core_v1_k8s1_19Impl = WeightedPodAffinityTerm_core_v1_k8s1_18Impl
typealias WeightedPodAffinityTerm_core_v1_k8s1_20Impl = WeightedPodAffinityTerm_core_v1_k8s1_19Impl
typealias WeightedPodAffinityTerm_core_v1_k8s1_21Impl = WeightedPodAffinityTerm_core_v1_k8s1_20Impl