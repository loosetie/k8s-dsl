package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hostnames", "ip")
class HostAlias_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostAlias_core_v1_k8s1_16, HasParent {
  override var hostnames: List<String>? = null
  override var ip: String? = null
}
typealias HostAlias_core_v1_k8s1_17Impl = HostAlias_core_v1_k8s1_16Impl
typealias HostAlias_core_v1_k8s1_18Impl = HostAlias_core_v1_k8s1_17Impl
typealias HostAlias_core_v1_k8s1_19Impl = HostAlias_core_v1_k8s1_18Impl
typealias HostAlias_core_v1_k8s1_20Impl = HostAlias_core_v1_k8s1_19Impl
typealias HostAlias_core_v1_k8s1_21Impl = HostAlias_core_v1_k8s1_20Impl