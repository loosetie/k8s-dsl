package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HTTPGetAction_core_v1_k8s1_16: K8sManifest {
  /** Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead. */
  @K8sDslMarker var host: String?
  /** Custom headers to set in the request. HTTP allows repeated headers. */
  val httpHeaders: List<HTTPHeader_core_v1_k8s1_16>?
  /** Path to access on the HTTP server. */
  @K8sDslMarker var path: String?
  /** Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  // val port: None
  /** Scheme to use for connecting to the host. Defaults to HTTP. */
  @K8sDslMarker var scheme: String?
}      
typealias HTTPGetAction_core_v1_k8s1_17 = HTTPGetAction_core_v1_k8s1_16       
typealias HTTPGetAction_core_v1_k8s1_18 = HTTPGetAction_core_v1_k8s1_17       
typealias HTTPGetAction_core_v1_k8s1_19 = HTTPGetAction_core_v1_k8s1_18       
typealias HTTPGetAction_core_v1_k8s1_20 = HTTPGetAction_core_v1_k8s1_19       
typealias HTTPGetAction_core_v1_k8s1_21 = HTTPGetAction_core_v1_k8s1_20 