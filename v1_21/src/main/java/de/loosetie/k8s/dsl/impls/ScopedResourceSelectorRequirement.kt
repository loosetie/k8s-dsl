package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("operator", "scopeName", "values")
class ScopedResourceSelectorRequirement_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScopedResourceSelectorRequirement_core_v1_k8s1_21, HasParent {
  override var operator: String? = null
  override var scopeName: String? = null
  override var values: List<String>? = null
}