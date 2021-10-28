package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchExpressions", "matchFields")
class NodeSelectorTerm_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeSelectorTerm_core_v1_k8s1_16, HasParent {
  override var matchExpressions: List<NodeSelectorRequirement_core_v1_k8s1_16>? = null
  override var matchFields: List<NodeSelectorRequirement_core_v1_k8s1_16>? = null
}
typealias NodeSelectorTerm_core_v1_k8s1_17Impl = NodeSelectorTerm_core_v1_k8s1_16Impl
typealias NodeSelectorTerm_core_v1_k8s1_18Impl = NodeSelectorTerm_core_v1_k8s1_17Impl
typealias NodeSelectorTerm_core_v1_k8s1_19Impl = NodeSelectorTerm_core_v1_k8s1_18Impl
typealias NodeSelectorTerm_core_v1_k8s1_20Impl = NodeSelectorTerm_core_v1_k8s1_19Impl
typealias NodeSelectorTerm_core_v1_k8s1_21Impl = NodeSelectorTerm_core_v1_k8s1_20Impl