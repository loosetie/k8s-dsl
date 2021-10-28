package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastHeartbeatTime", "lastTransitionTime", "message", "reason", "status", "type")
class NodeCondition_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeCondition_core_v1_k8s1_16, HasParent {
  override var lastHeartbeatTime: Time_meta_v1_k8s1_16? = null
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias NodeCondition_core_v1_k8s1_17Impl = NodeCondition_core_v1_k8s1_16Impl
typealias NodeCondition_core_v1_k8s1_18Impl = NodeCondition_core_v1_k8s1_17Impl
typealias NodeCondition_core_v1_k8s1_19Impl = NodeCondition_core_v1_k8s1_18Impl
typealias NodeCondition_core_v1_k8s1_20Impl = NodeCondition_core_v1_k8s1_19Impl
typealias NodeCondition_core_v1_k8s1_21Impl = NodeCondition_core_v1_k8s1_20Impl