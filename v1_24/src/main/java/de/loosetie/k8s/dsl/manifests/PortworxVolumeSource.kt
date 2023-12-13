package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PortworxVolumeSource_core_v1: K8sManifest {
  /** fSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex.
"ext4", "xfs". Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** volumeID uniquely identifies a Portworx volume */
  @K8sDslMarker var volumeID: String?
}