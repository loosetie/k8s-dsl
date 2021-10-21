package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Servicestatus_core_v1_k8s1_16: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer, if one is present. */
  val loadBalancer: LoadBalancerStatus_core_v1_k8s1_16?
}      
typealias Servicestatus_core_v1_k8s1_17 = Servicestatus_core_v1_k8s1_16       
typealias Servicestatus_core_v1_k8s1_18 = Servicestatus_core_v1_k8s1_17       
typealias Servicestatus_core_v1_k8s1_19 = Servicestatus_core_v1_k8s1_18       
@K8sDslMarker
interface Servicestatus_core_v1_k8s1_20: Servicestatus_core_v1_k8s1_19 {
  /** Current service state */
  val conditions: List<Condition_meta_v1_k8s1_20>?
}      
typealias Servicestatus_core_v1_k8s1_21 = Servicestatus_core_v1_k8s1_20 