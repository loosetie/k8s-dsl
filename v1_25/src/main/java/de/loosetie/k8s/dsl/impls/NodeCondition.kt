package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastHeartbeatTime", "lastTransitionTime", "message", "reason", "status", "type")
class NodeCondition_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NodeCondition_core_v1, HasParent {
  override var lastHeartbeatTime: Time_meta_v1? = null
  override var lastTransitionTime: Time_meta_v1? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}