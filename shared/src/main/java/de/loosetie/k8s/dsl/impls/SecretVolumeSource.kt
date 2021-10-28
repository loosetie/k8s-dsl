package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("defaultMode", "items", "optional", "secretName")
class SecretVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretVolumeSource_core_v1_k8s1_16, HasParent {
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_core_v1_k8s1_16>? = null
  override var optional: Boolean? = null
  override var secretName: String? = null
}
typealias SecretVolumeSource_core_v1_k8s1_17Impl = SecretVolumeSource_core_v1_k8s1_16Impl
typealias SecretVolumeSource_core_v1_k8s1_18Impl = SecretVolumeSource_core_v1_k8s1_17Impl
@JsonPropertyOrder("defaultMode", "items", "optional", "secretName")
class SecretVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SecretVolumeSource_core_v1_k8s1_19, HasParent {
  override var defaultMode: Int? = null
  override var items: List<KeyToPath_core_v1_k8s1_19>? = null
  override var optional: Boolean? = null
  override var secretName: String? = null
}
typealias SecretVolumeSource_core_v1_k8s1_20Impl = SecretVolumeSource_core_v1_k8s1_19Impl
typealias SecretVolumeSource_core_v1_k8s1_21Impl = SecretVolumeSource_core_v1_k8s1_20Impl