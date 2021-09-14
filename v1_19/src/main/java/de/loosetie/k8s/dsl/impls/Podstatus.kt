package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions", "containerStatuses", "ephemeralContainerStatuses", "hostIP", "initContainerStatuses", "message", "nominatedNodeName", "phase", "podIP", "podIPs", "qosClass", "reason", "startTime")
class Podstatus_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Podstatus_core_v1_k8s1_19, HasParent {
  override var conditions: List<PodCondition_core_v1_k8s1_19>? = null
  override var containerStatuses: List<Containerstatus_core_v1_k8s1_19>? = null
  override var ephemeralContainerStatuses: List<Containerstatus_core_v1_k8s1_19>? = null
  override var hostIP: String? = null
  override var initContainerStatuses: List<Containerstatus_core_v1_k8s1_19>? = null
  override var message: String? = null
  override var nominatedNodeName: String? = null
  override var phase: String? = null
  override var podIP: String? = null
  override var podIPs: List<PodIP_core_v1_k8s1_19>? = null
  override var qosClass: String? = null
  override var reason: String? = null
  override var startTime: Time_meta_v1_k8s1_19? = null
}