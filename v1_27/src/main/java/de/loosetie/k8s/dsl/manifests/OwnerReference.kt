package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface OwnerReference_meta_v1: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind of the referent. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "OwnerReference"
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names */
  @K8sDslMarker var name: String?
  /** If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value
store until this reference is removed. See
https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector
interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs
"delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. */
  @K8sDslMarker var blockOwnerDeletion: Boolean?
  /** If true, this reference points to the managing controller. */
  @K8sDslMarker var controller: Boolean?
  /** UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids */
  @K8sDslMarker var uid: String?
}