package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PhotonPersistentDiskVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** ID that identifies Photon Controller persistent disk */
  @K8sDslMarker var pdID: String?
}      
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_17 = PhotonPersistentDiskVolumeSource_core_v1_k8s1_16       
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_18 = PhotonPersistentDiskVolumeSource_core_v1_k8s1_17       
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_19 = PhotonPersistentDiskVolumeSource_core_v1_k8s1_18       
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_20 = PhotonPersistentDiskVolumeSource_core_v1_k8s1_19       
typealias PhotonPersistentDiskVolumeSource_core_v1_k8s1_21 = PhotonPersistentDiskVolumeSource_core_v1_k8s1_20 