package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("from", "ports")
class NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_21, HasParent {
  override var from: List<NetworkPolicyPeer_networking_k8s_io_v1_k8s1_21>? = null
  override var ports: List<NetworkPolicyPort_networking_k8s_io_v1_k8s1_21>? = null
}