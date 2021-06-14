package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface TCPSocketAction_core_v1: K8sManifest {
  /** Optional: Host name to connect to, defaults to the pod IP. */
  @K8sDslMarker var host: String?
  /** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  var port: de.loosetie.k8s.dsl.types.IntOrString?
}