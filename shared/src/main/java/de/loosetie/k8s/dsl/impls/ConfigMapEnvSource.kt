package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "optional")
class ConfigMapEnvSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapEnvSource_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var optional: Boolean? = null
}
typealias ConfigMapEnvSource_core_v1_k8s1_17Impl = ConfigMapEnvSource_core_v1_k8s1_16Impl
typealias ConfigMapEnvSource_core_v1_k8s1_18Impl = ConfigMapEnvSource_core_v1_k8s1_17Impl
typealias ConfigMapEnvSource_core_v1_k8s1_19Impl = ConfigMapEnvSource_core_v1_k8s1_18Impl
typealias ConfigMapEnvSource_core_v1_k8s1_20Impl = ConfigMapEnvSource_core_v1_k8s1_19Impl
typealias ConfigMapEnvSource_core_v1_k8s1_21Impl = ConfigMapEnvSource_core_v1_k8s1_20Impl