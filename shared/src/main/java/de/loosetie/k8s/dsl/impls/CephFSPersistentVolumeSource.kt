package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("monitors", "path", "readOnly", "secretFile", "secretRef", "user")
class CephFSPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CephFSPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var monitors: List<String>? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var secretFile: String? = null
  override var secretRef: SecretReference_core_v1_k8s1_16? = null
  override var user: String? = null
}
typealias CephFSPersistentVolumeSource_core_v1_k8s1_17Impl = CephFSPersistentVolumeSource_core_v1_k8s1_16Impl
typealias CephFSPersistentVolumeSource_core_v1_k8s1_18Impl = CephFSPersistentVolumeSource_core_v1_k8s1_17Impl
typealias CephFSPersistentVolumeSource_core_v1_k8s1_19Impl = CephFSPersistentVolumeSource_core_v1_k8s1_18Impl
typealias CephFSPersistentVolumeSource_core_v1_k8s1_20Impl = CephFSPersistentVolumeSource_core_v1_k8s1_19Impl
typealias CephFSPersistentVolumeSource_core_v1_k8s1_21Impl = CephFSPersistentVolumeSource_core_v1_k8s1_20Impl