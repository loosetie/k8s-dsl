package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchExpressions", "matchLabels")
class LabelSelector_meta_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LabelSelector_meta_v1_k8s1_16, HasParent {
  override var matchExpressions: List<LabelSelectorRequirement_meta_v1_k8s1_16>? = null
  override var matchLabels: Any? = null
}
typealias LabelSelector_meta_v1_k8s1_17Impl = LabelSelector_meta_v1_k8s1_16Impl
typealias LabelSelector_meta_v1_k8s1_18Impl = LabelSelector_meta_v1_k8s1_17Impl
typealias LabelSelector_meta_v1_k8s1_19Impl = LabelSelector_meta_v1_k8s1_18Impl
typealias LabelSelector_meta_v1_k8s1_20Impl = LabelSelector_meta_v1_k8s1_19Impl
typealias LabelSelector_meta_v1_k8s1_21Impl = LabelSelector_meta_v1_k8s1_20Impl