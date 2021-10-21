package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Handler_core_v1_k8s1_16: K8sManifest {
  /** One and only one of the following should be specified. Exec specifies the action to take. */
  val exec: ExecAction_core_v1_k8s1_16?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_core_v1_k8s1_16?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_core_v1_k8s1_16?
}      
typealias Handler_core_v1_k8s1_17 = Handler_core_v1_k8s1_16       
typealias Handler_core_v1_k8s1_18 = Handler_core_v1_k8s1_17       
typealias Handler_core_v1_k8s1_19 = Handler_core_v1_k8s1_18       
typealias Handler_core_v1_k8s1_20 = Handler_core_v1_k8s1_19       
typealias Handler_core_v1_k8s1_21 = Handler_core_v1_k8s1_20 