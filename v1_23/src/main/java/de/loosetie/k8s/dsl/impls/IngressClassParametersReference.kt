package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "namespace", "name", "apiGroup", "scope")
class IngressClassParametersReference_networking_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: IngressClassParametersReference_networking_k8s_io_v1, HasParent {
  override var kind: String? = null
  override var namespace: String? = null
  override var name: String? = null
  override var apiGroup: String? = null
  override var scope: String? = null
}