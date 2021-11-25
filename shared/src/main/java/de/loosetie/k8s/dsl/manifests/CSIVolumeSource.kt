package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface CSIVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as
registered in the cluster. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI
driver which will determine the default filesystem to apply. */
  @K8sDslMarker var fsType: String?
  /** NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to
complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret
is required. If the secret object contains more than one secret, all secret references are passed. */
  val nodePublishSecretRef: LocalObjectReference_core_v1_k8s1_16?
  /** Specifies a read-only configuration for the volume. Defaults to false (read/write). */
  @K8sDslMarker var readOnly: Boolean?
  /** VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's
documentation for supported values. */
  @K8sDslMarker var volumeAttributes: Map<String, String>?
}      
typealias CSIVolumeSource_core_v1_k8s1_17 = CSIVolumeSource_core_v1_k8s1_16       
typealias CSIVolumeSource_core_v1_k8s1_18 = CSIVolumeSource_core_v1_k8s1_17       
typealias CSIVolumeSource_core_v1_k8s1_19 = CSIVolumeSource_core_v1_k8s1_18       
typealias CSIVolumeSource_core_v1_k8s1_20 = CSIVolumeSource_core_v1_k8s1_19       
typealias CSIVolumeSource_core_v1_k8s1_21 = CSIVolumeSource_core_v1_k8s1_20 