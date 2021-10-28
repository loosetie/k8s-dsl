package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("loadBalancer")
class Ingressstatus_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressstatus_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var loadBalancer: LoadBalancerStatus_core_v1_k8s1_16? = null
}
typealias Ingressstatus_networking_k8s_io_v1beta1_k8s1_17Impl = Ingressstatus_networking_k8s_io_v1beta1_k8s1_16Impl
typealias Ingressstatus_networking_k8s_io_v1beta1_k8s1_18Impl = Ingressstatus_networking_k8s_io_v1beta1_k8s1_17Impl
@JsonPropertyOrder("loadBalancer")
class Ingressstatus_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Ingressstatus_networking_k8s_io_v1_k8s1_19, HasParent {
  override var loadBalancer: LoadBalancerStatus_core_v1_k8s1_19? = null
}


typealias Ingressstatus_networking_k8s_io_v1_k8s1_20Impl = Ingressstatus_networking_k8s_io_v1_k8s1_19Impl


typealias Ingressstatus_networking_k8s_io_v1_k8s1_21Impl = Ingressstatus_networking_k8s_io_v1_k8s1_20Impl

