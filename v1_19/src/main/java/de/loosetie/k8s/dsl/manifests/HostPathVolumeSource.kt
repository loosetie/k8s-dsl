package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HostPathVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info:
https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  @K8sDslMarker var path: String?
  /** Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  @K8sDslMarker var type: String?
}