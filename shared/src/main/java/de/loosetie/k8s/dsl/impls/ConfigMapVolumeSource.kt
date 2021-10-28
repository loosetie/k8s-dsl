package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "defaultMode", "items", "optional")
class ConfigMapVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapVolumeSource_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_core_v1_k8s1_16>? = null
  override var optional: Boolean? = null
}
typealias ConfigMapVolumeSource_core_v1_k8s1_17Impl = ConfigMapVolumeSource_core_v1_k8s1_16Impl
typealias ConfigMapVolumeSource_core_v1_k8s1_18Impl = ConfigMapVolumeSource_core_v1_k8s1_17Impl
@JsonPropertyOrder("name", "defaultMode", "items", "optional")
class ConfigMapVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapVolumeSource_core_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_core_v1_k8s1_19>? = null
  override var optional: Boolean? = null
}
typealias ConfigMapVolumeSource_core_v1_k8s1_20Impl = ConfigMapVolumeSource_core_v1_k8s1_19Impl
typealias ConfigMapVolumeSource_core_v1_k8s1_21Impl = ConfigMapVolumeSource_core_v1_k8s1_20Impl