package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Tokenrequeststatus_authentication_k8s_io_v1: K8sManifest {
  /** ExpirationTimestamp is the time of expiration of the returned token. */
  val expirationTimestamp: Time_meta_v1?
  /** Token is the opaque bearer token. */
  @K8sDslMarker var token: String?
}