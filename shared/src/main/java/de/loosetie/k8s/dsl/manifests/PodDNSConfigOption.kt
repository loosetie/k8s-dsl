package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PodDNSConfigOption_core_v1_k8s1_16: K8sManifest {
  /** Required. */
  @K8sDslMarker var name: String?
  /**  */
  @K8sDslMarker var value: String?
}      
typealias PodDNSConfigOption_core_v1_k8s1_17 = PodDNSConfigOption_core_v1_k8s1_16       
typealias PodDNSConfigOption_core_v1_k8s1_18 = PodDNSConfigOption_core_v1_k8s1_17       
typealias PodDNSConfigOption_core_v1_k8s1_19 = PodDNSConfigOption_core_v1_k8s1_18       
typealias PodDNSConfigOption_core_v1_k8s1_20 = PodDNSConfigOption_core_v1_k8s1_19       
typealias PodDNSConfigOption_core_v1_k8s1_21 = PodDNSConfigOption_core_v1_k8s1_20 