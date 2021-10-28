package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hostname", "ip")
class LoadBalancerIngress_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerIngress_core_v1_k8s1_16, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
}
typealias LoadBalancerIngress_core_v1_k8s1_17Impl = LoadBalancerIngress_core_v1_k8s1_16Impl
typealias LoadBalancerIngress_core_v1_k8s1_18Impl = LoadBalancerIngress_core_v1_k8s1_17Impl
typealias LoadBalancerIngress_core_v1_k8s1_19Impl = LoadBalancerIngress_core_v1_k8s1_18Impl
@JsonPropertyOrder("hostname", "ip", "ports")
class LoadBalancerIngress_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerIngress_core_v1_k8s1_20, HasParent {
  override var hostname: String? = null
  override var ip: String? = null
  override var ports: List<PortStatus_core_v1_k8s1_20>? = null
}
typealias LoadBalancerIngress_core_v1_k8s1_21Impl = LoadBalancerIngress_core_v1_k8s1_20Impl