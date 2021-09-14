package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.ContainerStateRunning_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ContainerStateTerminated_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ContainerStateWaiting_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.ContainerState_core_v1_k8s1_18

@JsonPropertyOrder("running", "terminated", "waiting")
class ContainerState_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerState_core_v1_k8s1_18, HasParent {
  override var running: ContainerStateRunning_core_v1_k8s1_18? = null
  override var terminated: ContainerStateTerminated_core_v1_k8s1_18? = null
  override var waiting: ContainerStateWaiting_core_v1_k8s1_18? = null
}