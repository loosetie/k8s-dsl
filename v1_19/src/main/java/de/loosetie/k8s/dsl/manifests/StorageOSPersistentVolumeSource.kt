package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StorageOSPersistentVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will
be attempted. */
  val secretRef: ObjectReference_core_v1_k8s1_19?
  /** VolumeName is the human-readable name of the StorageOS volume. Volume names are only unique within a namespace. */
  @K8sDslMarker var volumeName: String?
  /** VolumeNamespace specifies the scope of the volume within StorageOS. If no namespace is specified then the Pod's
namespace will be used. This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration.
Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within
StorageOS. Namespaces that do not pre-exist within StorageOS will be created. */
  @K8sDslMarker var volumeNamespace: String?
}