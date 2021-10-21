package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PodIP_core_v1_k8s1_16: K8sManifest {
  /** ip is an IP address (IPv4 or IPv6) assigned to the pod */
  @K8sDslMarker var ip: String?
}      
typealias PodIP_core_v1_k8s1_17 = PodIP_core_v1_k8s1_16       
typealias PodIP_core_v1_k8s1_18 = PodIP_core_v1_k8s1_17       
typealias PodIP_core_v1_k8s1_19 = PodIP_core_v1_k8s1_18       
typealias PodIP_core_v1_k8s1_20 = PodIP_core_v1_k8s1_19       
typealias PodIP_core_v1_k8s1_21 = PodIP_core_v1_k8s1_20 