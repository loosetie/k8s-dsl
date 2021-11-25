package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface FlexPersistentVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Driver is the name of the driver to use for this volume. */
  @K8sDslMarker var driver: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
The default filesystem depends on FlexVolume script. */
  @K8sDslMarker var fsType: String?
  /** Optional: Extra command options if any. */
  @K8sDslMarker var options: Map<String, String>?
  /** Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are
passed to the plugin scripts. */
  val secretRef: SecretReference_core_v1_k8s1_16?
}      
typealias FlexPersistentVolumeSource_core_v1_k8s1_17 = FlexPersistentVolumeSource_core_v1_k8s1_16       
typealias FlexPersistentVolumeSource_core_v1_k8s1_18 = FlexPersistentVolumeSource_core_v1_k8s1_17       
typealias FlexPersistentVolumeSource_core_v1_k8s1_19 = FlexPersistentVolumeSource_core_v1_k8s1_18       
typealias FlexPersistentVolumeSource_core_v1_k8s1_20 = FlexPersistentVolumeSource_core_v1_k8s1_19       
typealias FlexPersistentVolumeSource_core_v1_k8s1_21 = FlexPersistentVolumeSource_core_v1_k8s1_20 