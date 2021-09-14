package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("backend", "path", "pathType")
class HTTPIngressPath_networking_k8s_io_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressPath_networking_k8s_io_v1_k8s1_20, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1_k8s1_20? = null
  override var path: String? = null
  override var pathType: String? = null
}