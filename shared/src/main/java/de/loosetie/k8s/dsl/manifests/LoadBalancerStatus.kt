package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface LoadBalancerStatus_core_v1_k8s1_16: K8sManifest {
  /** Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to
these ingress points. */
  val ingress: List<LoadBalancerIngress_core_v1_k8s1_16>?
}      
typealias LoadBalancerStatus_core_v1_k8s1_17 = LoadBalancerStatus_core_v1_k8s1_16       
typealias LoadBalancerStatus_core_v1_k8s1_18 = LoadBalancerStatus_core_v1_k8s1_17       
typealias LoadBalancerStatus_core_v1_k8s1_19 = LoadBalancerStatus_core_v1_k8s1_18       
typealias LoadBalancerStatus_core_v1_k8s1_20 = LoadBalancerStatus_core_v1_k8s1_19       
typealias LoadBalancerStatus_core_v1_k8s1_21 = LoadBalancerStatus_core_v1_k8s1_20 