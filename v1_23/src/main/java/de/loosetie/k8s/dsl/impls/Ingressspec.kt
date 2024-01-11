package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("defaultBackend", "ingressClassName", "rules", "tls")
open class Ingressspec_networking_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Ingressspec_networking_k8s_io_v1, HasParent {
  override var defaultBackend: IngressBackend_networking_k8s_io_v1? = null
  override var ingressClassName: String? = null
  override var rules: List<IngressRule_networking_k8s_io_v1>? = null
  override var tls: List<IngressTLS_networking_k8s_io_v1>? = null
}