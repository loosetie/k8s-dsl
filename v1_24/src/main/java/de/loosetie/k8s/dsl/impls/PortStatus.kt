package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("error", "port", "protocol")
open class PortStatus_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: PortStatus_core_v1, HasParent {
  override var error: String? = null
  override var port: Int? = null
  override var protocol: String? = null
}