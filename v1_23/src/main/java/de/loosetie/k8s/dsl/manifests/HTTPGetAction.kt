package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HTTPGetAction_core_v1: K8sManifest {
  /** Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead. */
  @K8sDslMarker var host: String?
  /** Custom headers to set in the request. HTTP allows repeated headers. */
  val httpHeaders: List<HTTPHeader_core_v1>?
  /** Path to access on the HTTP server. */
  @K8sDslMarker var path: String?
  /** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
  /** Scheme to use for connecting to the host. Defaults to HTTP. Possible enum values: - `"HTTP"` means that the scheme used
will be http:// - `"HTTPS"` means that the scheme used will be https:// */
  @K8sDslMarker var scheme: String?
}