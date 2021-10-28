package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ip")
class PodIP_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodIP_core_v1_k8s1_16, HasParent {
  override var ip: String? = null
}
typealias PodIP_core_v1_k8s1_17Impl = PodIP_core_v1_k8s1_16Impl
typealias PodIP_core_v1_k8s1_18Impl = PodIP_core_v1_k8s1_17Impl
typealias PodIP_core_v1_k8s1_19Impl = PodIP_core_v1_k8s1_18Impl
typealias PodIP_core_v1_k8s1_20Impl = PodIP_core_v1_k8s1_19Impl
typealias PodIP_core_v1_k8s1_21Impl = PodIP_core_v1_k8s1_20Impl