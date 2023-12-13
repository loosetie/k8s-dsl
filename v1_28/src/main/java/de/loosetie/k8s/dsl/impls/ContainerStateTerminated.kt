package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("containerID", "exitCode", "finishedAt", "message", "reason", "signal", "startedAt")
class ContainerStateTerminated_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateTerminated_core_v1, HasParent {
  override var containerID: String? = null
  override var exitCode: Int? = null
  override var finishedAt: Time_meta_v1? = null
  override var message: String? = null
  override var reason: String? = null
  override var signal: Int? = null
  override var startedAt: Time_meta_v1? = null
}