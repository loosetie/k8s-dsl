package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class PodAntiAffinity_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAntiAffinity_core_v1_k8s1_16, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm_core_v1_k8s1_16>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm_core_v1_k8s1_16>? = null
}
typealias PodAntiAffinity_core_v1_k8s1_17Impl = PodAntiAffinity_core_v1_k8s1_16Impl
typealias PodAntiAffinity_core_v1_k8s1_18Impl = PodAntiAffinity_core_v1_k8s1_17Impl
typealias PodAntiAffinity_core_v1_k8s1_19Impl = PodAntiAffinity_core_v1_k8s1_18Impl
typealias PodAntiAffinity_core_v1_k8s1_20Impl = PodAntiAffinity_core_v1_k8s1_19Impl
typealias PodAntiAffinity_core_v1_k8s1_21Impl = PodAntiAffinity_core_v1_k8s1_20Impl