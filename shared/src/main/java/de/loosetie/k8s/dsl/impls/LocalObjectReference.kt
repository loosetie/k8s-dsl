package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name")
class LocalObjectReference_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalObjectReference_core_v1_k8s1_16, HasParent {
  override var name: String? = null
}
typealias LocalObjectReference_core_v1_k8s1_17Impl = LocalObjectReference_core_v1_k8s1_16Impl
typealias LocalObjectReference_core_v1_k8s1_18Impl = LocalObjectReference_core_v1_k8s1_17Impl
typealias LocalObjectReference_core_v1_k8s1_19Impl = LocalObjectReference_core_v1_k8s1_18Impl
typealias LocalObjectReference_core_v1_k8s1_20Impl = LocalObjectReference_core_v1_k8s1_19Impl
typealias LocalObjectReference_core_v1_k8s1_21Impl = LocalObjectReference_core_v1_k8s1_20Impl