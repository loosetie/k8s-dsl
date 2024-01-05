package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ready", "serving", "terminating")
class EndpointConditions_discovery_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: EndpointConditions_discovery_k8s_io_v1, HasParent {
  override var ready: Boolean? = null
  override var serving: Boolean? = null
  override var terminating: Boolean? = null
}