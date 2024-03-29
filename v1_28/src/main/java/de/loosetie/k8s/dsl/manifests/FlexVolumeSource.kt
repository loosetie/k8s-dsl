package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface FlexVolumeSource_core_v1: K8sManifest {
  /** driver is the name of the driver to use for this volume. */
  @K8sDslMarker var driver: String?
  /** fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4",
"xfs", "ntfs". The default filesystem depends on FlexVolume script. */
  @K8sDslMarker var fsType: String?
  /** options is Optional: this field holds extra command options if any. */
  @K8sDslMarker var options: Any?
  /** readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the
plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret,
all secrets are passed to the plugin scripts. */
  val secretRef: LocalObjectReference_core_v1?
}