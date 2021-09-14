package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchExpressions", "matchLabels")
class LabelSelector_meta_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelector_meta_v1_k8s1_20, HasParent {
  override var matchExpressions: List<LabelSelectorRequirement_meta_v1_k8s1_20>? = null
  override var matchLabels: Any? = null
}