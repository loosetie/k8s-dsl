package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "containerPort", "hostIP", "hostPort", "protocol")
class ContainerPort_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerPort_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var containerPort: Int? = null
  override var hostIP: String? = null
  override var hostPort: Int? = null
  override var protocol: String? = null
}
typealias ContainerPort_core_v1_k8s1_17Impl = ContainerPort_core_v1_k8s1_16Impl
typealias ContainerPort_core_v1_k8s1_18Impl = ContainerPort_core_v1_k8s1_17Impl
typealias ContainerPort_core_v1_k8s1_19Impl = ContainerPort_core_v1_k8s1_18Impl
typealias ContainerPort_core_v1_k8s1_20Impl = ContainerPort_core_v1_k8s1_19Impl
typealias ContainerPort_core_v1_k8s1_21Impl = ContainerPort_core_v1_k8s1_20Impl