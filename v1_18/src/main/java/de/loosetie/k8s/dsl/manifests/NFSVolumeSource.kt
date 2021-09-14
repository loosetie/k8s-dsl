package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NFSVolumeSource_core_v1_k8s1_18: K8sManifest {
  /** Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var path: String?
  /** ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var readOnly: Boolean?
  /** Server is the hostname or IP address of the NFS server. More info:
https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  @K8sDslMarker var server: String?
}