package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ipBlock", "namespaceSelector", "podSelector")
class NetworkPolicyPeer_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPeer_networking_k8s_io_v1_k8s1_16, HasParent {
  override var ipBlock: IPBlock_networking_k8s_io_v1_k8s1_16? = null
  override var namespaceSelector: LabelSelector_meta_v1_k8s1_16? = null
  override var podSelector: LabelSelector_meta_v1_k8s1_16? = null
}
typealias NetworkPolicyPeer_networking_k8s_io_v1_k8s1_17Impl = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_16Impl
typealias NetworkPolicyPeer_networking_k8s_io_v1_k8s1_18Impl = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_17Impl
typealias NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_18Impl
typealias NetworkPolicyPeer_networking_k8s_io_v1_k8s1_20Impl = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_19Impl
typealias NetworkPolicyPeer_networking_k8s_io_v1_k8s1_21Impl = NetworkPolicyPeer_networking_k8s_io_v1_k8s1_20Impl