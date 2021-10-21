package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Sysctl_core_v1_k8s1_16: K8sManifest {
  /** Name of a property to set */
  @K8sDslMarker var name: String?
  /** Value of a property to set */
  @K8sDslMarker var value: String?
}      
typealias Sysctl_core_v1_k8s1_17 = Sysctl_core_v1_k8s1_16       
typealias Sysctl_core_v1_k8s1_18 = Sysctl_core_v1_k8s1_17       
typealias Sysctl_core_v1_k8s1_19 = Sysctl_core_v1_k8s1_18       
typealias Sysctl_core_v1_k8s1_20 = Sysctl_core_v1_k8s1_19       
typealias Sysctl_core_v1_k8s1_21 = Sysctl_core_v1_k8s1_20 