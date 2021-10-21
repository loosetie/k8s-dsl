package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Capabilities_core_v1_k8s1_16: K8sManifest {
  /** Added capabilities */
  @K8sDslMarker var add: List<String>?
  /** Removed capabilities */
  @K8sDslMarker var drop: List<String>?
}      
typealias Capabilities_core_v1_k8s1_17 = Capabilities_core_v1_k8s1_16       
typealias Capabilities_core_v1_k8s1_18 = Capabilities_core_v1_k8s1_17       
typealias Capabilities_core_v1_k8s1_19 = Capabilities_core_v1_k8s1_18       
typealias Capabilities_core_v1_k8s1_20 = Capabilities_core_v1_k8s1_19       
typealias Capabilities_core_v1_k8s1_21 = Capabilities_core_v1_k8s1_20 