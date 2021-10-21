package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface DaemonEndpoint_core_v1_k8s1_16: K8sManifest {
  /** Port number of the given endpoint. */
  @K8sDslMarker var Port: Int?
}      
typealias DaemonEndpoint_core_v1_k8s1_17 = DaemonEndpoint_core_v1_k8s1_16       
typealias DaemonEndpoint_core_v1_k8s1_18 = DaemonEndpoint_core_v1_k8s1_17       
typealias DaemonEndpoint_core_v1_k8s1_19 = DaemonEndpoint_core_v1_k8s1_18       
typealias DaemonEndpoint_core_v1_k8s1_20 = DaemonEndpoint_core_v1_k8s1_19       
typealias DaemonEndpoint_core_v1_k8s1_21 = DaemonEndpoint_core_v1_k8s1_20 