package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("level", "role", "type", "user")
class SELinuxOptions_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SELinuxOptions_core_v1_k8s1_16, HasParent {
  override var level: String? = null
  override var role: String? = null
  override var type: String? = null
  override var user: String? = null
}
typealias SELinuxOptions_core_v1_k8s1_17Impl = SELinuxOptions_core_v1_k8s1_16Impl
typealias SELinuxOptions_core_v1_k8s1_18Impl = SELinuxOptions_core_v1_k8s1_17Impl
typealias SELinuxOptions_core_v1_k8s1_19Impl = SELinuxOptions_core_v1_k8s1_18Impl
typealias SELinuxOptions_core_v1_k8s1_20Impl = SELinuxOptions_core_v1_k8s1_19Impl
typealias SELinuxOptions_core_v1_k8s1_21Impl = SELinuxOptions_core_v1_k8s1_20Impl