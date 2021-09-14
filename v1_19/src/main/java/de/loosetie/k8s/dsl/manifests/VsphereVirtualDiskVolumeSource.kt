package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VsphereVirtualDiskVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
Implicitly inferred to be "ext4" if unspecified. */
  @K8sDslMarker var fsType: String?
  /** Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName. */
  @K8sDslMarker var storagePolicyID: String?
  /** Storage Policy Based Management (SPBM) profile name. */
  @K8sDslMarker var storagePolicyName: String?
  /** Path that identifies vSphere volume vmdk */
  @K8sDslMarker var volumePath: String?
}