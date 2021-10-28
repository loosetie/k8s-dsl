package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "value")
class PodDNSConfigOption_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodDNSConfigOption_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var value: String? = null
}
typealias PodDNSConfigOption_core_v1_k8s1_17Impl = PodDNSConfigOption_core_v1_k8s1_16Impl
typealias PodDNSConfigOption_core_v1_k8s1_18Impl = PodDNSConfigOption_core_v1_k8s1_17Impl
typealias PodDNSConfigOption_core_v1_k8s1_19Impl = PodDNSConfigOption_core_v1_k8s1_18Impl
typealias PodDNSConfigOption_core_v1_k8s1_20Impl = PodDNSConfigOption_core_v1_k8s1_19Impl
typealias PodDNSConfigOption_core_v1_k8s1_21Impl = PodDNSConfigOption_core_v1_k8s1_20Impl