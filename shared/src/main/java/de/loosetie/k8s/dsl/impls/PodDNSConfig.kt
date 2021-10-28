package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nameservers", "options", "searches")
class PodDNSConfig_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfig_core_v1_k8s1_16, HasParent {
  override var nameservers: List<String>? = null
  override var options: List<PodDNSConfigOption_core_v1_k8s1_16>? = null
  override var searches: List<String>? = null
}
typealias PodDNSConfig_core_v1_k8s1_17Impl = PodDNSConfig_core_v1_k8s1_16Impl
typealias PodDNSConfig_core_v1_k8s1_18Impl = PodDNSConfig_core_v1_k8s1_17Impl
typealias PodDNSConfig_core_v1_k8s1_19Impl = PodDNSConfig_core_v1_k8s1_18Impl
typealias PodDNSConfig_core_v1_k8s1_20Impl = PodDNSConfig_core_v1_k8s1_19Impl
typealias PodDNSConfig_core_v1_k8s1_21Impl = PodDNSConfig_core_v1_k8s1_20Impl