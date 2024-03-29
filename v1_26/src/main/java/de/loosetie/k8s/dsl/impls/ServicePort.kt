package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "appProtocol", "nodePort", "port", "protocol", "targetPort")
open class ServicePort_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ServicePort_core_v1, HasParent {
  override var name: String? = null
  override var appProtocol: String? = null
  override var nodePort: Int? = null
  override var port: Int? = null
  override var protocol: String? = null
  override var targetPort: de.loosetie.k8s.dsl.types.IntOrString? = null
}