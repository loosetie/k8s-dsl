package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "name", "uid")
class BoundObjectReference_authentication_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: BoundObjectReference_authentication_k8s_io_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var uid: String? = null
}
typealias BoundObjectReference_authentication_k8s_io_v1_k8s1_17Impl = BoundObjectReference_authentication_k8s_io_v1_k8s1_16Impl
typealias BoundObjectReference_authentication_k8s_io_v1_k8s1_18Impl = BoundObjectReference_authentication_k8s_io_v1_k8s1_17Impl
typealias BoundObjectReference_authentication_k8s_io_v1_k8s1_19Impl = BoundObjectReference_authentication_k8s_io_v1_k8s1_18Impl
typealias BoundObjectReference_authentication_k8s_io_v1_k8s1_20Impl = BoundObjectReference_authentication_k8s_io_v1_k8s1_19Impl
typealias BoundObjectReference_authentication_k8s_io_v1_k8s1_21Impl = BoundObjectReference_authentication_k8s_io_v1_k8s1_20Impl