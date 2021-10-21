package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface LoadBalancerIngress_core_v1_k8s1_16: K8sManifest {
  /** Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) */
  @K8sDslMarker var hostname: String?
  /** IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) */
  @K8sDslMarker var ip: String?
}      
typealias LoadBalancerIngress_core_v1_k8s1_17 = LoadBalancerIngress_core_v1_k8s1_16       
typealias LoadBalancerIngress_core_v1_k8s1_18 = LoadBalancerIngress_core_v1_k8s1_17       
typealias LoadBalancerIngress_core_v1_k8s1_19 = LoadBalancerIngress_core_v1_k8s1_18       
@K8sDslMarker
interface LoadBalancerIngress_core_v1_k8s1_20: LoadBalancerIngress_core_v1_k8s1_19 {
  /** Ports is a list of records of service ports If used, every port defined in the service should have an entry in it */
  val ports: List<PortStatus_core_v1_k8s1_20>?
}      
typealias LoadBalancerIngress_core_v1_k8s1_21 = LoadBalancerIngress_core_v1_k8s1_20 