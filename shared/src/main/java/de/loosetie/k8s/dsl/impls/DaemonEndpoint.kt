package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("Port")
class DaemonEndpoint_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DaemonEndpoint_core_v1_k8s1_16, HasParent {
  override var Port: Int? = null
}
typealias DaemonEndpoint_core_v1_k8s1_17Impl = DaemonEndpoint_core_v1_k8s1_16Impl
typealias DaemonEndpoint_core_v1_k8s1_18Impl = DaemonEndpoint_core_v1_k8s1_17Impl
typealias DaemonEndpoint_core_v1_k8s1_19Impl = DaemonEndpoint_core_v1_k8s1_18Impl
typealias DaemonEndpoint_core_v1_k8s1_20Impl = DaemonEndpoint_core_v1_k8s1_19Impl
typealias DaemonEndpoint_core_v1_k8s1_21Impl = DaemonEndpoint_core_v1_k8s1_20Impl