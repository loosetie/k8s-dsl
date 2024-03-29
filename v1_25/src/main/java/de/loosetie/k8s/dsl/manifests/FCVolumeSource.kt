package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface FCVolumeSource_core_v1: K8sManifest {
  /** fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4",
"xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** lun is Optional: FC target lun number */
  @K8sDslMarker var lun: Int?
  /** readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** targetWWNs is Optional: FC target worldwide names (WWNs) */
  @K8sDslMarker var targetWWNs: List<String>?
  /** wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set,
but not both simultaneously. */
  @K8sDslMarker var wwids: List<String>?
}