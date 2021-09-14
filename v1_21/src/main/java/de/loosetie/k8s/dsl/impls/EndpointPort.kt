package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_core_v1_k8s1_21, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}

@JsonPropertyOrder("name", "appProtocol", "port", "protocol")
class EndpointPort_discovery_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointPort_discovery_k8s_io_v1_k8s1_21, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}