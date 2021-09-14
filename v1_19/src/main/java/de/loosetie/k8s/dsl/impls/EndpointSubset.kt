package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("addresses", "notReadyAddresses", "ports")
class EndpointSubset_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EndpointSubset_core_v1_k8s1_19, HasParent {
  override var addresses: List<EndpointAddress_core_v1_k8s1_19>? = null
  override var notReadyAddresses: List<EndpointAddress_core_v1_k8s1_19>? = null
  override var ports: List<EndpointPort_core_v1_k8s1_19>? = null
}