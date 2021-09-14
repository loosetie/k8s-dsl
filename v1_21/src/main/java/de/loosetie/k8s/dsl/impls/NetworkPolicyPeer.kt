package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ipBlock", "namespaceSelector", "podSelector")
class NetworkPolicyPeer_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NetworkPolicyPeer_networking_k8s_io_v1_k8s1_21, HasParent {
  override var ipBlock: IPBlock_networking_k8s_io_v1_k8s1_21? = null
  override var namespaceSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var podSelector: LabelSelector_meta_v1_k8s1_21? = null
}