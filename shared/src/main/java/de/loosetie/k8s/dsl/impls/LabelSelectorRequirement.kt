package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("key", "operator", "values")
class LabelSelectorRequirement_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelectorRequirement_meta_v1_k8s1_16, HasParent {
  override var key: String? = null
  override var operator: String? = null
  override var values: List<String>? = null
}
typealias LabelSelectorRequirement_meta_v1_k8s1_17Impl = LabelSelectorRequirement_meta_v1_k8s1_16Impl
typealias LabelSelectorRequirement_meta_v1_k8s1_18Impl = LabelSelectorRequirement_meta_v1_k8s1_17Impl
typealias LabelSelectorRequirement_meta_v1_k8s1_19Impl = LabelSelectorRequirement_meta_v1_k8s1_18Impl
typealias LabelSelectorRequirement_meta_v1_k8s1_20Impl = LabelSelectorRequirement_meta_v1_k8s1_19Impl
typealias LabelSelectorRequirement_meta_v1_k8s1_21Impl = LabelSelectorRequirement_meta_v1_k8s1_20Impl