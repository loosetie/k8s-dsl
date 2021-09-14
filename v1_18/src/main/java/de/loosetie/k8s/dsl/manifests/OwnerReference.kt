package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface OwnerReference_meta_v1_k8s1_18: K8sTopLevel {
  /** API version of the referent. */
  override val apiVersion: String
    get() = "meta/v1"
  /** Kind of the referent. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "OwnerReference"
  /** Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  @K8sDslMarker var name: String?
  /** If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value
store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the
owner, otherwise 422 (Unprocessable Entity) will be returned. */
  @K8sDslMarker var blockOwnerDeletion: Boolean?
  /** If true, this reference points to the managing controller. */
  @K8sDslMarker var controller: Boolean?
  /** UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
  @K8sDslMarker var uid: String?
}