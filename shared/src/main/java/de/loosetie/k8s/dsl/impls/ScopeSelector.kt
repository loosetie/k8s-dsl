package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("matchExpressions")
class ScopeSelector_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ScopeSelector_core_v1_k8s1_16, HasParent {
  override var matchExpressions: List<ScopedResourceSelectorRequirement_core_v1_k8s1_16>? = null
}
typealias ScopeSelector_core_v1_k8s1_17Impl = ScopeSelector_core_v1_k8s1_16Impl
typealias ScopeSelector_core_v1_k8s1_18Impl = ScopeSelector_core_v1_k8s1_17Impl
typealias ScopeSelector_core_v1_k8s1_19Impl = ScopeSelector_core_v1_k8s1_18Impl
typealias ScopeSelector_core_v1_k8s1_20Impl = ScopeSelector_core_v1_k8s1_19Impl
typealias ScopeSelector_core_v1_k8s1_21Impl = ScopeSelector_core_v1_k8s1_20Impl