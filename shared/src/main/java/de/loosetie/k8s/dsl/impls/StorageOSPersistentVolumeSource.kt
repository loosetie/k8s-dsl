package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeName", "volumeNamespace")
class StorageOSPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageOSPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: ObjectReference_core_v1_k8s1_16? = null
  override var volumeName: String? = null
  override var volumeNamespace: String? = null
}
typealias StorageOSPersistentVolumeSource_core_v1_k8s1_17Impl = StorageOSPersistentVolumeSource_core_v1_k8s1_16Impl
typealias StorageOSPersistentVolumeSource_core_v1_k8s1_18Impl = StorageOSPersistentVolumeSource_core_v1_k8s1_17Impl
typealias StorageOSPersistentVolumeSource_core_v1_k8s1_19Impl = StorageOSPersistentVolumeSource_core_v1_k8s1_18Impl
typealias StorageOSPersistentVolumeSource_core_v1_k8s1_20Impl = StorageOSPersistentVolumeSource_core_v1_k8s1_19Impl
typealias StorageOSPersistentVolumeSource_core_v1_k8s1_21Impl = StorageOSPersistentVolumeSource_core_v1_k8s1_20Impl