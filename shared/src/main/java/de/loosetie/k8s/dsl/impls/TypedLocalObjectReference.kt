package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "name", "apiGroup")
class TypedLocalObjectReference_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TypedLocalObjectReference_core_v1_k8s1_16, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
}
typealias TypedLocalObjectReference_core_v1_k8s1_17Impl = TypedLocalObjectReference_core_v1_k8s1_16Impl
typealias TypedLocalObjectReference_core_v1_k8s1_18Impl = TypedLocalObjectReference_core_v1_k8s1_17Impl
typealias TypedLocalObjectReference_core_v1_k8s1_19Impl = TypedLocalObjectReference_core_v1_k8s1_18Impl
typealias TypedLocalObjectReference_core_v1_k8s1_20Impl = TypedLocalObjectReference_core_v1_k8s1_19Impl
typealias TypedLocalObjectReference_core_v1_k8s1_21Impl = TypedLocalObjectReference_core_v1_k8s1_20Impl