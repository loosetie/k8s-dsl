package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AzureDiskVolumeSource_core_v1_k8s1_21: K8sManifest {
  /** Expected values Shared: multiple blob disks per storage account Dedicated: single blob disk per storage account Managed:
azure managed data disk (only in managed availability set). defaults to shared */
  @K8sDslMarker var kind: String?
  /** Host Caching mode: None, Read Only, Read Write. */
  @K8sDslMarker var cachingMode: String?
  /** The Name of the data disk in the blob storage */
  @K8sDslMarker var diskName: String?
  /** The URI the data disk in the blob storage */
  @K8sDslMarker var diskURI: String?
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
}