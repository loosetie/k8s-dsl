package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kubeletEndpoint")
class NodeDaemonEndpoints_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeDaemonEndpoints_core_v1_k8s1_16, HasParent {
  override var kubeletEndpoint: DaemonEndpoint_core_v1_k8s1_16? = null
}
typealias NodeDaemonEndpoints_core_v1_k8s1_17Impl = NodeDaemonEndpoints_core_v1_k8s1_16Impl
typealias NodeDaemonEndpoints_core_v1_k8s1_18Impl = NodeDaemonEndpoints_core_v1_k8s1_17Impl
typealias NodeDaemonEndpoints_core_v1_k8s1_19Impl = NodeDaemonEndpoints_core_v1_k8s1_18Impl
typealias NodeDaemonEndpoints_core_v1_k8s1_20Impl = NodeDaemonEndpoints_core_v1_k8s1_19Impl
typealias NodeDaemonEndpoints_core_v1_k8s1_21Impl = NodeDaemonEndpoints_core_v1_k8s1_20Impl