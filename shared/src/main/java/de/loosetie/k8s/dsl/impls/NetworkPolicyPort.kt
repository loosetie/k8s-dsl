package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("port", "protocol")
class NetworkPolicyPort_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPort_networking_k8s_io_v1_k8s1_16, HasParent {
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
  override var protocol: String? = null
}
typealias NetworkPolicyPort_networking_k8s_io_v1_k8s1_17Impl = NetworkPolicyPort_networking_k8s_io_v1_k8s1_16Impl
typealias NetworkPolicyPort_networking_k8s_io_v1_k8s1_18Impl = NetworkPolicyPort_networking_k8s_io_v1_k8s1_17Impl
typealias NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl = NetworkPolicyPort_networking_k8s_io_v1_k8s1_18Impl
typealias NetworkPolicyPort_networking_k8s_io_v1_k8s1_20Impl = NetworkPolicyPort_networking_k8s_io_v1_k8s1_19Impl
@JsonPropertyOrder("endPort", "port", "protocol")
class NetworkPolicyPort_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPort_networking_k8s_io_v1_k8s1_21, HasParent {
  override var endPort: Int? = null
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
  override var protocol: String? = null
}