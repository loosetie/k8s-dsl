package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAffinity_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinity_core_v1_k8s1_16, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_core_v1_k8s1_16>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_core_v1_k8s1_16>? = null
}
typealias PodAffinity_core_v1_k8s1_17Impl = PodAffinity_core_v1_k8s1_16Impl
typealias PodAffinity_core_v1_k8s1_18Impl = PodAffinity_core_v1_k8s1_17Impl
typealias PodAffinity_core_v1_k8s1_19Impl = PodAffinity_core_v1_k8s1_18Impl
typealias PodAffinity_core_v1_k8s1_20Impl = PodAffinity_core_v1_k8s1_19Impl
typealias PodAffinity_core_v1_k8s1_21Impl = PodAffinity_core_v1_k8s1_20Impl