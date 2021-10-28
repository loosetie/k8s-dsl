package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("key", "values")
class TopologySelectorLabelRequirement_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySelectorLabelRequirement_core_v1_k8s1_16, HasParent {
  override var key: String? = null
  override var values: List<String>? = null
}
typealias TopologySelectorLabelRequirement_core_v1_k8s1_17Impl = TopologySelectorLabelRequirement_core_v1_k8s1_16Impl
typealias TopologySelectorLabelRequirement_core_v1_k8s1_18Impl = TopologySelectorLabelRequirement_core_v1_k8s1_17Impl
typealias TopologySelectorLabelRequirement_core_v1_k8s1_19Impl = TopologySelectorLabelRequirement_core_v1_k8s1_18Impl
typealias TopologySelectorLabelRequirement_core_v1_k8s1_20Impl = TopologySelectorLabelRequirement_core_v1_k8s1_19Impl
typealias TopologySelectorLabelRequirement_core_v1_k8s1_21Impl = TopologySelectorLabelRequirement_core_v1_k8s1_20Impl