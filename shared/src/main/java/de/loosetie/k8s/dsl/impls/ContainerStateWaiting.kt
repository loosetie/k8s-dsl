package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("message", "reason")
class ContainerStateWaiting_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateWaiting_core_v1_k8s1_16, HasParent {
  override var message: String? = null
  override var reason: String? = null
}
typealias ContainerStateWaiting_core_v1_k8s1_17Impl = ContainerStateWaiting_core_v1_k8s1_16Impl
typealias ContainerStateWaiting_core_v1_k8s1_18Impl = ContainerStateWaiting_core_v1_k8s1_17Impl
typealias ContainerStateWaiting_core_v1_k8s1_19Impl = ContainerStateWaiting_core_v1_k8s1_18Impl
typealias ContainerStateWaiting_core_v1_k8s1_20Impl = ContainerStateWaiting_core_v1_k8s1_19Impl
typealias ContainerStateWaiting_core_v1_k8s1_21Impl = ContainerStateWaiting_core_v1_k8s1_20Impl