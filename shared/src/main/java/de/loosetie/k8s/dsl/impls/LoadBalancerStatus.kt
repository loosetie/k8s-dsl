package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ingress")
class LoadBalancerStatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LoadBalancerStatus_core_v1_k8s1_16, HasParent {
  override var ingress: List<LoadBalancerIngress_core_v1_k8s1_16>? = null
}
typealias LoadBalancerStatus_core_v1_k8s1_17Impl = LoadBalancerStatus_core_v1_k8s1_16Impl
typealias LoadBalancerStatus_core_v1_k8s1_18Impl = LoadBalancerStatus_core_v1_k8s1_17Impl
typealias LoadBalancerStatus_core_v1_k8s1_19Impl = LoadBalancerStatus_core_v1_k8s1_18Impl
typealias LoadBalancerStatus_core_v1_k8s1_20Impl = LoadBalancerStatus_core_v1_k8s1_19Impl
typealias LoadBalancerStatus_core_v1_k8s1_21Impl = LoadBalancerStatus_core_v1_k8s1_20Impl