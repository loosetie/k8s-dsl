package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface NodeAddress_core_v1_k8s1_16: K8sManifest {
  /** The node address. */
  @K8sDslMarker var address: String?
  /** Node address type, one of Hostname, ExternalIP or InternalIP. */
  @K8sDslMarker var type: String?
}      
typealias NodeAddress_core_v1_k8s1_17 = NodeAddress_core_v1_k8s1_16       
typealias NodeAddress_core_v1_k8s1_18 = NodeAddress_core_v1_k8s1_17       
typealias NodeAddress_core_v1_k8s1_19 = NodeAddress_core_v1_k8s1_18       
typealias NodeAddress_core_v1_k8s1_20 = NodeAddress_core_v1_k8s1_19       
typealias NodeAddress_core_v1_k8s1_21 = NodeAddress_core_v1_k8s1_20 