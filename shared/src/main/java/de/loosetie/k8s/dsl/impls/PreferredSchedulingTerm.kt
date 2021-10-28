package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("preference", "weight")
class PreferredSchedulingTerm_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PreferredSchedulingTerm_core_v1_k8s1_16, HasParent {
  override var preference: NodeSelectorTerm_core_v1_k8s1_16? = null
  override var weight: Int? = null
}
typealias PreferredSchedulingTerm_core_v1_k8s1_17Impl = PreferredSchedulingTerm_core_v1_k8s1_16Impl
typealias PreferredSchedulingTerm_core_v1_k8s1_18Impl = PreferredSchedulingTerm_core_v1_k8s1_17Impl
typealias PreferredSchedulingTerm_core_v1_k8s1_19Impl = PreferredSchedulingTerm_core_v1_k8s1_18Impl
typealias PreferredSchedulingTerm_core_v1_k8s1_20Impl = PreferredSchedulingTerm_core_v1_k8s1_19Impl
typealias PreferredSchedulingTerm_core_v1_k8s1_21Impl = PreferredSchedulingTerm_core_v1_k8s1_20Impl