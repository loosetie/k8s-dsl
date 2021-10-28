package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "value")
class Sysctl_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Sysctl_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var value: String? = null
}
typealias Sysctl_core_v1_k8s1_17Impl = Sysctl_core_v1_k8s1_16Impl
typealias Sysctl_core_v1_k8s1_18Impl = Sysctl_core_v1_k8s1_17Impl
typealias Sysctl_core_v1_k8s1_19Impl = Sysctl_core_v1_k8s1_18Impl
typealias Sysctl_core_v1_k8s1_20Impl = Sysctl_core_v1_k8s1_19Impl
typealias Sysctl_core_v1_k8s1_21Impl = Sysctl_core_v1_k8s1_20Impl