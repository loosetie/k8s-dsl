package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface UserInfo_authentication_k8s_io_v1_k8s1_21: K8sManifest {
  /** Any additional information provided by the authenticator. */
  @K8sDslMarker var extra: Any?
  /** The names of groups this user is a part of. */
  @K8sDslMarker var groups: List<String>?
  /** A unique value that identifies this user across time. If this user is deleted and another user by the same name is
added, they will have different UIDs. */
  @K8sDslMarker var uid: String?
  /** The name that uniquely identifies this user among all active users. */
  @K8sDslMarker var username: String?
}