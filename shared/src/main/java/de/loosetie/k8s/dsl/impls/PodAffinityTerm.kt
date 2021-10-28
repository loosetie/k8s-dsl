package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("labelSelector", "namespaces", "topologyKey")
class PodAffinityTerm_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinityTerm_core_v1_k8s1_16, HasParent {
  override var labelSelector: LabelSelector_meta_v1_k8s1_16? = null
  override var namespaces: List<String>? = null
  override var topologyKey: String? = null
}
typealias PodAffinityTerm_core_v1_k8s1_17Impl = PodAffinityTerm_core_v1_k8s1_16Impl
typealias PodAffinityTerm_core_v1_k8s1_18Impl = PodAffinityTerm_core_v1_k8s1_17Impl
typealias PodAffinityTerm_core_v1_k8s1_19Impl = PodAffinityTerm_core_v1_k8s1_18Impl
typealias PodAffinityTerm_core_v1_k8s1_20Impl = PodAffinityTerm_core_v1_k8s1_19Impl
@JsonPropertyOrder("labelSelector", "namespaceSelector", "namespaces", "topologyKey")
class PodAffinityTerm_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinityTerm_core_v1_k8s1_21, HasParent {
  override var labelSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var namespaceSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var namespaces: List<String>? = null
  override var topologyKey: String? = null
}