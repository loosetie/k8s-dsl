package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("serviceName", "servicePort")
class IngressBackend_networking_k8s_io_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_networking_k8s_io_v1beta1, HasParent {
  override var serviceName: String? = null
  override var servicePort: de.loosetie.k8s.dsl.types.IntOrString? = null
}