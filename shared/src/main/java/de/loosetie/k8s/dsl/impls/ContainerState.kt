package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("running", "terminated", "waiting")
class ContainerState_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerState_core_v1_k8s1_16, HasParent {
  override var running: ContainerStateRunning_core_v1_k8s1_16? = null
  override var terminated: ContainerStateTerminated_core_v1_k8s1_16? = null
  override var waiting: ContainerStateWaiting_core_v1_k8s1_16? = null
}
typealias ContainerState_core_v1_k8s1_17Impl = ContainerState_core_v1_k8s1_16Impl
typealias ContainerState_core_v1_k8s1_18Impl = ContainerState_core_v1_k8s1_17Impl
typealias ContainerState_core_v1_k8s1_19Impl = ContainerState_core_v1_k8s1_18Impl
typealias ContainerState_core_v1_k8s1_20Impl = ContainerState_core_v1_k8s1_19Impl
typealias ContainerState_core_v1_k8s1_21Impl = ContainerState_core_v1_k8s1_20Impl