package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchLabelExpressions")
class TopologySelectorTerm_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySelectorTerm_core_v1_k8s1_16, HasParent {
  override var matchLabelExpressions: List<TopologySelectorLabelRequirement_core_v1_k8s1_16>? = null
}
typealias TopologySelectorTerm_core_v1_k8s1_17Impl = TopologySelectorTerm_core_v1_k8s1_16Impl
typealias TopologySelectorTerm_core_v1_k8s1_18Impl = TopologySelectorTerm_core_v1_k8s1_17Impl
typealias TopologySelectorTerm_core_v1_k8s1_19Impl = TopologySelectorTerm_core_v1_k8s1_18Impl
typealias TopologySelectorTerm_core_v1_k8s1_20Impl = TopologySelectorTerm_core_v1_k8s1_19Impl
typealias TopologySelectorTerm_core_v1_k8s1_21Impl = TopologySelectorTerm_core_v1_k8s1_20Impl