package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "containerID", "image", "imageID", "lastState", "ready", "restartCount", "started", "state")
open class Containerstatus_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Containerstatus_core_v1, HasParent {
  override var name: String? = null
  override var containerID: String? = null
  override var image: String? = null
  override var imageID: String? = null
  override var lastState: ContainerState_core_v1? = null
  override var ready: Boolean? = null
  override var restartCount: Int? = null
  override var started: Boolean? = null
  override var state: ContainerState_core_v1? = null
}