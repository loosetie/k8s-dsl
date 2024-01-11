package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allocateLoadBalancerNodePorts", "clusterIP", "clusterIPs", "externalIPs", "externalName", "externalTrafficPolicy", "healthCheckNodePort", "internalTrafficPolicy", "ipFamilies", "ipFamilyPolicy", "loadBalancerClass", "loadBalancerIP", "loadBalancerSourceRanges", "ports", "publishNotReadyAddresses", "selector", "sessionAffinity", "sessionAffinityConfig", "type")
open class Servicespec_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Servicespec_core_v1, HasParent {
  override var allocateLoadBalancerNodePorts: Boolean? = null
  override var clusterIP: String? = null
  override var clusterIPs: List<String>? = null
  override var externalIPs: List<String>? = null
  override var externalName: String? = null
  override var externalTrafficPolicy: String? = null
  override var healthCheckNodePort: Int? = null
  override var internalTrafficPolicy: String? = null
  override var ipFamilies: List<String>? = null
  override var ipFamilyPolicy: String? = null
  override var loadBalancerClass: String? = null
  override var loadBalancerIP: String? = null
  override var loadBalancerSourceRanges: List<String>? = null
  override var ports: List<ServicePort_core_v1>? = null
  override var publishNotReadyAddresses: Boolean? = null
  override var selector: Map<String, String>? = null
  override var sessionAffinity: String? = null
  override var sessionAffinityConfig: SessionAffinityConfig_core_v1? = null
  override var type: String? = null
}