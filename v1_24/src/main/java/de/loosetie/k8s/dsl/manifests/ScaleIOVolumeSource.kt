package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ScaleIOVolumeSource_core_v1: K8sManifest {
  /** fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4",
"xfs", "ntfs". Default is "xfs". */
  @K8sDslMarker var fsType: String?
  /** gateway is the host address of the ScaleIO API Gateway. */
  @K8sDslMarker var gateway: String?
  /** protectionDomain is the name of the ScaleIO Protection Domain for the configured storage. */
  @K8sDslMarker var protectionDomain: String?
  /** readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login
operation will fail. */
  val secretRef: LocalObjectReference_core_v1?
  /** sslEnabled Flag enable/disable SSL communication with Gateway, default false */
  @K8sDslMarker var sslEnabled: Boolean?
  /** storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is
ThinProvisioned. */
  @K8sDslMarker var storageMode: String?
  /** storagePool is the ScaleIO Storage Pool associated with the protection domain. */
  @K8sDslMarker var storagePool: String?
  /** system is the name of the storage system as configured in ScaleIO. */
  @K8sDslMarker var system: String?
  /** volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source. */
  @K8sDslMarker var volumeName: String?
}