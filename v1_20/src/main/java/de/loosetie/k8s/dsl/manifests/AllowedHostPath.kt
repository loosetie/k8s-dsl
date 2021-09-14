package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AllowedHostPath_policy_v1beta1_k8s1_20: K8sManifest {
  /** pathPrefix is the path prefix that the host volume must match. It does not support ``*``. Trailing slashes are trimmed
when validating the path prefix with a host path. Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo`
would not allow `/food` or `/etc/foo` */
  @K8sDslMarker var pathPrefix: String?
  /** when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly. */
  @K8sDslMarker var readOnly: Boolean?
}