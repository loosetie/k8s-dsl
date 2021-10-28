package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nodeAffinity", "podAffinity", "podAntiAffinity")
class Affinity_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Affinity_core_v1_k8s1_16, HasParent {
  override var nodeAffinity: NodeAffinity_core_v1_k8s1_16? = null
  override var podAffinity: PodAffinity_core_v1_k8s1_16? = null
  override var podAntiAffinity: PodAntiAffinity_core_v1_k8s1_16? = null
}
typealias Affinity_core_v1_k8s1_17Impl = Affinity_core_v1_k8s1_16Impl
typealias Affinity_core_v1_k8s1_18Impl = Affinity_core_v1_k8s1_17Impl
typealias Affinity_core_v1_k8s1_19Impl = Affinity_core_v1_k8s1_18Impl
typealias Affinity_core_v1_k8s1_20Impl = Affinity_core_v1_k8s1_19Impl
typealias Affinity_core_v1_k8s1_21Impl = Affinity_core_v1_k8s1_20Impl