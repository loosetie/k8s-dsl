package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hosts", "secretName")
class IngressTLS_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressTLS_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var hosts: List<String>? = null
  override var secretName: String? = null
}
typealias IngressTLS_networking_k8s_io_v1beta1_k8s1_17Impl = IngressTLS_networking_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("hosts", "secretName")
class IngressTLS_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressTLS_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var hosts: List<String>? = null
  override var secretName: String? = null
}
@JsonPropertyOrder("hosts", "secretName")
class IngressTLS_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressTLS_networking_k8s_io_v1_k8s1_19, HasParent {
  override var hosts: List<String>? = null
  override var secretName: String? = null
}
typealias IngressTLS_networking_k8s_io_v1_k8s1_20Impl = IngressTLS_networking_k8s_io_v1_k8s1_19Impl
typealias IngressTLS_networking_k8s_io_v1_k8s1_21Impl = IngressTLS_networking_k8s_io_v1_k8s1_20Impl