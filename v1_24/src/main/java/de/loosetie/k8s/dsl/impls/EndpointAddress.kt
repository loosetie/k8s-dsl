package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hostname", "ip", "nodeName", "targetRef")
open class EndpointAddress_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: EndpointAddress_core_v1, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
  override var nodeName: String? = null
  override var targetRef: ObjectReference_core_v1? = null
}