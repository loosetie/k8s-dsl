package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LocalVolumeSource_core_v1: K8sManifest {
  /** Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the
host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a fileystem if unspecified. */
  @K8sDslMarker var fsType: String?
  /** The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...). */
  @K8sDslMarker var path: String?
}