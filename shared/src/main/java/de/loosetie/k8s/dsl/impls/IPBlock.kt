package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("cidr", "except")
class IPBlock_networking_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IPBlock_networking_k8s_io_v1_k8s1_16, HasParent {
  override var cidr: String? = null
  override var except: List<String>? = null
}
typealias IPBlock_networking_k8s_io_v1_k8s1_17Impl = IPBlock_networking_k8s_io_v1_k8s1_16Impl
@JsonPropertyOrder("cidr", "except")
class IPBlock_networking_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IPBlock_networking_k8s_io_v1_k8s1_18, HasParent {
  override var cidr: String? = null
  override var except: List<String>? = null
}
typealias IPBlock_networking_k8s_io_v1_k8s1_19Impl = IPBlock_networking_k8s_io_v1_k8s1_18Impl
typealias IPBlock_networking_k8s_io_v1_k8s1_20Impl = IPBlock_networking_k8s_io_v1_k8s1_19Impl
typealias IPBlock_networking_k8s_io_v1_k8s1_21Impl = IPBlock_networking_k8s_io_v1_k8s1_20Impl