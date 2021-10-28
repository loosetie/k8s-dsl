package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "image", "keyring", "monitors", "pool", "readOnly", "secretRef", "user")
class RBDVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RBDVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var image: String? = null
  override var keyring: String? = null
  override var monitors: List<String>? = null
  override var pool: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_16? = null
  override var user: String? = null
}
typealias RBDVolumeSource_core_v1_k8s1_17Impl = RBDVolumeSource_core_v1_k8s1_16Impl
typealias RBDVolumeSource_core_v1_k8s1_18Impl = RBDVolumeSource_core_v1_k8s1_17Impl
typealias RBDVolumeSource_core_v1_k8s1_19Impl = RBDVolumeSource_core_v1_k8s1_18Impl
typealias RBDVolumeSource_core_v1_k8s1_20Impl = RBDVolumeSource_core_v1_k8s1_19Impl
typealias RBDVolumeSource_core_v1_k8s1_21Impl = RBDVolumeSource_core_v1_k8s1_20Impl