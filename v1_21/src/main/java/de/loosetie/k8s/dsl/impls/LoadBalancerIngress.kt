package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hostname", "ip", "ports")
class LoadBalancerIngress_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerIngress_core_v1_k8s1_21, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
  override var ports: List<PortStatus_core_v1_k8s1_21>? = null
}