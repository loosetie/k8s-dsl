package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchExpressions", "matchFields")
class NodeSelectorTerm_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NodeSelectorTerm_core_v1, HasParent {
  override var matchExpressions: List<NodeSelectorRequirement_core_v1>? = null
  override var matchFields: List<NodeSelectorRequirement_core_v1>? = null
}