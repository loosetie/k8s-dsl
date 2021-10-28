package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("startedAt")
class ContainerStateRunning_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerStateRunning_core_v1_k8s1_16, HasParent {
  override var startedAt: Time_meta_v1_k8s1_16? = null
}
typealias ContainerStateRunning_core_v1_k8s1_17Impl = ContainerStateRunning_core_v1_k8s1_16Impl
typealias ContainerStateRunning_core_v1_k8s1_18Impl = ContainerStateRunning_core_v1_k8s1_17Impl
typealias ContainerStateRunning_core_v1_k8s1_19Impl = ContainerStateRunning_core_v1_k8s1_18Impl
typealias ContainerStateRunning_core_v1_k8s1_20Impl = ContainerStateRunning_core_v1_k8s1_19Impl
typealias ContainerStateRunning_core_v1_k8s1_21Impl = ContainerStateRunning_core_v1_k8s1_20Impl