package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("backend", "rules", "tls")
class Ingressspec_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressspec_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1beta1_k8s1_16? = null
  override var rules: List<IngressRule_networking_k8s_io_v1beta1_k8s1_16>? = null
  override var tls: List<IngressTLS_networking_k8s_io_v1beta1_k8s1_16>? = null
}
typealias Ingressspec_networking_k8s_io_v1beta1_k8s1_17Impl = Ingressspec_networking_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("backend", "ingressClassName", "rules", "tls")
class Ingressspec_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressspec_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var backend: IngressBackend_networking_k8s_io_v1beta1_k8s1_18? = null
  override var ingressClassName: String? = null
  override var rules: List<IngressRule_networking_k8s_io_v1beta1_k8s1_18>? = null
  override var tls: List<IngressTLS_networking_k8s_io_v1beta1_k8s1_18>? = null
}
@JsonPropertyOrder("defaultBackend", "ingressClassName", "rules", "tls")
class Ingressspec_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressspec_networking_k8s_io_v1_k8s1_19, HasParent {
  override var defaultBackend: IngressBackend_networking_k8s_io_v1_k8s1_19? = null
  override var ingressClassName: String? = null
  override var rules: List<IngressRule_networking_k8s_io_v1_k8s1_19>? = null
  override var tls: List<IngressTLS_networking_k8s_io_v1_k8s1_19>? = null
}


typealias Ingressspec_networking_k8s_io_v1_k8s1_20Impl = Ingressspec_networking_k8s_io_v1_k8s1_19Impl


typealias Ingressspec_networking_k8s_io_v1_k8s1_21Impl = Ingressspec_networking_k8s_io_v1_k8s1_20Impl

