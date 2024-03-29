package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VsphereVirtualDiskVolumeSource_core_v1: K8sManifest {
  /** fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs",
"ntfs". Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName. */
  @K8sDslMarker var storagePolicyID: String?
  /** storagePolicyName is the storage Policy Based Management (SPBM) profile name. */
  @K8sDslMarker var storagePolicyName: String?
  /** volumePath is the path that identifies vSphere volume vmdk */
  @K8sDslMarker var volumePath: String?
}