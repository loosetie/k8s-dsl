package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ServiceAccountTokenProjection_core_v1: K8sManifest {
  /** Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified
in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the
apiserver. */
  @K8sDslMarker var audience: String?
  /** ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches
expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying
to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24
hours.Defaults to 1 hour and must be at least 10 minutes. */
  @K8sDslMarker var expirationSeconds: Int?
  /** Path is the path relative to the mount point of the file to project the token into. */
  @K8sDslMarker var path: String?
}