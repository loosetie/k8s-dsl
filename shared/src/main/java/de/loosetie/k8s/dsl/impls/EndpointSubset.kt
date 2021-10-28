package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("addresses", "notReadyAddresses", "ports")
class EndpointSubset_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSubset_core_v1_k8s1_16, HasParent {
  override var addresses: List<EndpointAddress_core_v1_k8s1_16>? = null
  override var notReadyAddresses: List<EndpointAddress_core_v1_k8s1_16>? = null
  override var ports: List<EndpointPort_core_v1_k8s1_16>? = null
}
typealias EndpointSubset_core_v1_k8s1_17Impl = EndpointSubset_core_v1_k8s1_16Impl
typealias EndpointSubset_core_v1_k8s1_18Impl = EndpointSubset_core_v1_k8s1_17Impl
typealias EndpointSubset_core_v1_k8s1_19Impl = EndpointSubset_core_v1_k8s1_18Impl
typealias EndpointSubset_core_v1_k8s1_20Impl = EndpointSubset_core_v1_k8s1_19Impl
typealias EndpointSubset_core_v1_k8s1_21Impl = EndpointSubset_core_v1_k8s1_20Impl