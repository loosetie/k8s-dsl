package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("key", "operator", "values")
class NodeSelectorRequirement_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorRequirement_core_v1_k8s1_16, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}
typealias NodeSelectorRequirement_core_v1_k8s1_17Impl = NodeSelectorRequirement_core_v1_k8s1_16Impl
typealias NodeSelectorRequirement_core_v1_k8s1_18Impl = NodeSelectorRequirement_core_v1_k8s1_17Impl
typealias NodeSelectorRequirement_core_v1_k8s1_19Impl = NodeSelectorRequirement_core_v1_k8s1_18Impl
typealias NodeSelectorRequirement_core_v1_k8s1_20Impl = NodeSelectorRequirement_core_v1_k8s1_19Impl
typealias NodeSelectorRequirement_core_v1_k8s1_21Impl = NodeSelectorRequirement_core_v1_k8s1_20Impl