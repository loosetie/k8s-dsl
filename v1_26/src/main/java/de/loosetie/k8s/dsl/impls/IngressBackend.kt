package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("resource", "service")
class IngressBackend_networking_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressBackend_networking_k8s_io_v1, HasParent {
  override var resource: TypedLocalObjectReference_core_v1? = null
  override var service: IngressServiceBackend_networking_k8s_io_v1? = null
}