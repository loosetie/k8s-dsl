package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "pdID")
class PhotonPersistentDiskVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PhotonPersistentDiskVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var pdID: String? = null
}
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_17Impl = PhotonPersistentDiskVolumeSource_core_v1_k8s1_16Impl
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_18Impl = PhotonPersistentDiskVolumeSource_core_v1_k8s1_17Impl
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_19Impl = PhotonPersistentDiskVolumeSource_core_v1_k8s1_18Impl
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_20Impl = PhotonPersistentDiskVolumeSource_core_v1_k8s1_19Impl
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_21Impl = PhotonPersistentDiskVolumeSource_core_v1_k8s1_20Impl