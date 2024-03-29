package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("key", "operator", "values")
open class NodeSelectorRequirement_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NodeSelectorRequirement_core_v1, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}