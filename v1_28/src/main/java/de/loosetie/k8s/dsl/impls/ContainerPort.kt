package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "containerPort", "hostIP", "hostPort", "protocol")
class ContainerPort_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerPort_core_v1, HasParent {
  override var name: String? = null
  override var containerPort: Int? = null
  override var hostIP: String? = null
  override var hostPort: Int? = null
  override var protocol: String? = null
}