package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("egress", "ingress", "podSelector", "policyTypes")
class Networkpolicyspec_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Networkpolicyspec_networking_k8s_io_v1_k8s1_16, HasParent {
  override var egress: List<NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_16>? = null
  override var ingress: List<NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_16>? = null
  override var podSelector: LabelSelector_meta_v1_k8s1_16? = null
  override var policyTypes: List<String>? = null
}
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_17Impl = Networkpolicyspec_networking_k8s_io_v1_k8s1_16Impl
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_18Impl = Networkpolicyspec_networking_k8s_io_v1_k8s1_17Impl
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl = Networkpolicyspec_networking_k8s_io_v1_k8s1_18Impl
typealias Networkpolicyspec_networking_k8s_io_v1_k8s1_20Impl = Networkpolicyspec_networking_k8s_io_v1_k8s1_19Impl
@JsonPropertyOrder("egress", "ingress", "podSelector", "policyTypes")
class Networkpolicyspec_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Networkpolicyspec_networking_k8s_io_v1_k8s1_21, HasParent {
  override var egress: List<NetworkPolicyEgressRule_networking_k8s_io_v1_k8s1_21>? = null
  override var ingress: List<NetworkPolicyIngressRule_networking_k8s_io_v1_k8s1_21>? = null
  override var podSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var policyTypes: List<String>? = null
}