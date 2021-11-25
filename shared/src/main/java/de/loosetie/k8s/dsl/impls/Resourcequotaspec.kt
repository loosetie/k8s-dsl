package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hard", "scopeSelector", "scopes")
class Resourcequotaspec_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourcequotaspec_core_v1_k8s1_16, HasParent {
  override var hard: Map<String, de.loosetie.k8s.dsl.types.DoubleOrString>? = null
  override var scopeSelector: ScopeSelector_core_v1_k8s1_16? = null
  override var scopes: List<String>? = null
}
typealias Resourcequotaspec_core_v1_k8s1_17Impl = Resourcequotaspec_core_v1_k8s1_16Impl
typealias Resourcequotaspec_core_v1_k8s1_18Impl = Resourcequotaspec_core_v1_k8s1_17Impl
typealias Resourcequotaspec_core_v1_k8s1_19Impl = Resourcequotaspec_core_v1_k8s1_18Impl
typealias Resourcequotaspec_core_v1_k8s1_20Impl = Resourcequotaspec_core_v1_k8s1_19Impl
typealias Resourcequotaspec_core_v1_k8s1_21Impl = Resourcequotaspec_core_v1_k8s1_20Impl