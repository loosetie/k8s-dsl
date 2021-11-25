package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("serviceName", "servicePort")
class IngressBackend_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var serviceName: String? = null
  override var servicePort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
typealias IngressBackend_networking_k8s_io_v1beta1_k8s1_17Impl = IngressBackend_networking_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("resource", "serviceName", "servicePort")
class IngressBackend_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var resource: TypedLocalObjectReference_core_v1_k8s1_18? = null
  override var serviceName: String? = null
  override var servicePort: de.loosetie.k8s.dsl.types.IntOrString? = null
}
@JsonPropertyOrder("resource", "service")
class IngressBackend_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_networking_k8s_io_v1_k8s1_19, HasParent {
  override var resource: TypedLocalObjectReference_core_v1_k8s1_19? = null
  override var service: IngressServiceBackend_networking_k8s_io_v1_k8s1_19? = null
}


typealias IngressBackend_networking_k8s_io_v1_k8s1_20Impl = IngressBackend_networking_k8s_io_v1_k8s1_19Impl


typealias IngressBackend_networking_k8s_io_v1_k8s1_21Impl = IngressBackend_networking_k8s_io_v1_k8s1_20Impl

