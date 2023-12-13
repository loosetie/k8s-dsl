package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface CephFSPersistentVolumeSource_core_v1: K8sManifest {
  /** monitors is Required: Monitors is a collection of Ceph monitors More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var monitors: List<String>?
  /** path is Optional: Used as the mounted root, rather than the full Ceph tree, default is / */
  @K8sDslMarker var path: String?
  /** readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var readOnly: Boolean?
  /** secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var secretFile: String?
  /** secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  val secretRef: SecretReference_core_v1?
  /** user is Optional: User is the rados user name, default is admin More info:
https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it */
  @K8sDslMarker var user: String?
}