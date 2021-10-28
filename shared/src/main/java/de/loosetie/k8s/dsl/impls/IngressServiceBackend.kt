package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "port")
class IngressServiceBackend_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressServiceBackend_networking_k8s_io_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var port: ServiceBackendPort_networking_k8s_io_v1_k8s1_19? = null
}
typealias IngressServiceBackend_networking_k8s_io_v1_k8s1_20Impl = IngressServiceBackend_networking_k8s_io_v1_k8s1_19Impl
typealias IngressServiceBackend_networking_k8s_io_v1_k8s1_21Impl = IngressServiceBackend_networking_k8s_io_v1_k8s1_20Impl