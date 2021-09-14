package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("host", "httpHeaders", "path", "port", "scheme")
class HTTPGetAction_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPGetAction_core_v1_k8s1_19, HasParent {
  override var host: String? = null
  override var httpHeaders: List<HTTPHeader_core_v1_k8s1_19>? = null
  override var path: String? = null
  override var scheme: String? = null
}