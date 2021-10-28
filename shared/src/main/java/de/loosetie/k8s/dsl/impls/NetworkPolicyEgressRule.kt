package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ports", "to")
class NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_16, HasParent {
  override var ports: List<NetworkPolicyPort_networking_k8s_io_v1_k8s1_16>? = null
  override var to: List<NetworkPolicyPeer_networking_k8s_io_v1_k8s1_16>? = null
}
typealias NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_17Impl = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_16Impl
typealias NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_18Impl = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_17Impl
typealias NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19Impl = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_18Impl
typealias NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_20Impl = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_19Impl
typealias NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_21Impl = NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_20Impl