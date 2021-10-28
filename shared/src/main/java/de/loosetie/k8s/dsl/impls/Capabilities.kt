package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("add", "drop")
class Capabilities_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Capabilities_core_v1_k8s1_16, HasParent {
  override var add: List<String>? = null
  override var drop: List<String>? = null
}
typealias Capabilities_core_v1_k8s1_17Impl = Capabilities_core_v1_k8s1_16Impl
typealias Capabilities_core_v1_k8s1_18Impl = Capabilities_core_v1_k8s1_17Impl
typealias Capabilities_core_v1_k8s1_19Impl = Capabilities_core_v1_k8s1_18Impl
typealias Capabilities_core_v1_k8s1_20Impl = Capabilities_core_v1_k8s1_19Impl
typealias Capabilities_core_v1_k8s1_21Impl = Capabilities_core_v1_k8s1_20Impl