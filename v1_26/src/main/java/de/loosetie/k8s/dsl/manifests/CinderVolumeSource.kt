package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CinderVolumeSource_core_v1: K8sManifest {
  /** fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples:
"ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var fsType: String?
  /** readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info:
https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var readOnly: Boolean?
  /** secretRef is optional: points to a secret object containing parameters used to connect to OpenStack. */
  val secretRef: LocalObjectReference_core_v1?
  /** volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md */
  @K8sDslMarker var volumeID: String?
}