package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface TCPSocketAction_core_v1_k8s1_16: K8sManifest {
  /** Optional: Host name to connect to, defaults to the pod IP. */
  @K8sDslMarker var host: String?
  /** Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
IANA_SVC_NAME. */
  // val port: None
}      
typealias TCPSocketAction_core_v1_k8s1_17 = TCPSocketAction_core_v1_k8s1_16       
typealias TCPSocketAction_core_v1_k8s1_18 = TCPSocketAction_core_v1_k8s1_17       
typealias TCPSocketAction_core_v1_k8s1_19 = TCPSocketAction_core_v1_k8s1_18       
typealias TCPSocketAction_core_v1_k8s1_20 = TCPSocketAction_core_v1_k8s1_19       
typealias TCPSocketAction_core_v1_k8s1_21 = TCPSocketAction_core_v1_k8s1_20 