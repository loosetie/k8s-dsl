package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("message", "reason")
open class ContainerStateWaiting_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ContainerStateWaiting_core_v1, HasParent {
  override var message: String? = null
  override var reason: String? = null
}