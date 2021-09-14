package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("addresses", "allocatable", "capacity", "conditions", "config", "daemonEndpoints", "images", "nodeInfo", "phase", "volumesAttached", "volumesInUse")
class Nodestatus_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Nodestatus_core_v1_k8s1_18, HasParent {
  override var addresses: List<NodeAddress_core_v1_k8s1_18>? = null
  override var allocatable: Any? = null
  override var capacity: Any? = null
  override var conditions: List<NodeCondition_core_v1_k8s1_18>? = null
  override var config: NodeConfigStatus_core_v1_k8s1_18? = null
  override var daemonEndpoints: NodeDaemonEndpoints_core_v1_k8s1_18? = null
  override var images: List<ContainerImage_core_v1_k8s1_18>? = null
  override var nodeInfo: NodeSystemInfo_core_v1_k8s1_18? = null
  override var phase: String? = null
  override var volumesAttached: List<AttachedVolume_core_v1_k8s1_18>? = null
  override var volumesInUse: List<String>? = null
}