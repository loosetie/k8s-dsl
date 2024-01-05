package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("controller", "parameters")
class Ingressclassspec_networking_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Ingressclassspec_networking_k8s_io_v1, HasParent {
  override var controller: String? = null
  override var parameters: IngressClassParametersReference_networking_k8s_io_v1? = null
}