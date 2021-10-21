package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface NodeDaemonEndpoints_core_v1_k8s1_16: K8sManifest {
  /** Endpoint on which Kubelet is listening. */
  val kubeletEndpoint: DaemonEndpoint_core_v1_k8s1_16?
}      
typealias NodeDaemonEndpoints_core_v1_k8s1_17 = NodeDaemonEndpoints_core_v1_k8s1_16       
typealias NodeDaemonEndpoints_core_v1_k8s1_18 = NodeDaemonEndpoints_core_v1_k8s1_17       
typealias NodeDaemonEndpoints_core_v1_k8s1_19 = NodeDaemonEndpoints_core_v1_k8s1_18       
typealias NodeDaemonEndpoints_core_v1_k8s1_20 = NodeDaemonEndpoints_core_v1_k8s1_19       
typealias NodeDaemonEndpoints_core_v1_k8s1_21 = NodeDaemonEndpoints_core_v1_k8s1_20 