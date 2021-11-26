package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("backend", "path")
class HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1beta1_k8s1_16? = null
  override var path: String? = null
}
typealias HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_17Impl = HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("backend", "path", "pathType")
class HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1beta1_k8s1_18? = null
  override var path: String? = null
  override var pathType: String? = null
}
@JsonPropertyOrder("backend", "path", "pathType")
class HTTPIngressPath_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressPath_networking_k8s_io_v1_k8s1_19, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1_k8s1_19? = null
  override var path: String? = null
  override var pathType: String? = null
}
typealias HTTPIngressPath_networking_k8s_io_v1_k8s1_20Impl = HTTPIngressPath_networking_k8s_io_v1_k8s1_19Impl
typealias HTTPIngressPath_networking_k8s_io_v1_k8s1_21Impl = HTTPIngressPath_networking_k8s_io_v1_k8s1_20Impl