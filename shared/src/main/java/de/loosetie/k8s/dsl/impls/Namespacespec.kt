package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("finalizers")
class Namespacespec_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Namespacespec_core_v1_k8s1_16, HasParent {
  override var finalizers: List<String>? = null
}
typealias Namespacespec_core_v1_k8s1_17Impl = Namespacespec_core_v1_k8s1_16Impl
typealias Namespacespec_core_v1_k8s1_18Impl = Namespacespec_core_v1_k8s1_17Impl
typealias Namespacespec_core_v1_k8s1_19Impl = Namespacespec_core_v1_k8s1_18Impl
typealias Namespacespec_core_v1_k8s1_20Impl = Namespacespec_core_v1_k8s1_19Impl
typealias Namespacespec_core_v1_k8s1_21Impl = Namespacespec_core_v1_k8s1_20Impl