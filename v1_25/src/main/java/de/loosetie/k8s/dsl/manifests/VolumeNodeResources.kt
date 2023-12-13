package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeNodeResources_storage_k8s_io_v1: K8sManifest {
  /** Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached
and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared
among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node
is unbounded. */
  @K8sDslMarker var count: Int?
}