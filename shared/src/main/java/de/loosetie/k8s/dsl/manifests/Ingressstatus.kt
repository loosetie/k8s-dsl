package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Ingressstatus_networking_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer. */
  val loadBalancer: LoadBalancerStatus_core_v1_k8s1_16?
}      
typealias Ingressstatus_networking_k8s_io_v1beta1_k8s1_17 = Ingressstatus_networking_k8s_io_v1beta1_k8s1_16       
typealias Ingressstatus_networking_k8s_io_v1beta1_k8s1_18 = Ingressstatus_networking_k8s_io_v1beta1_k8s1_17       
@K8sDslMarker
interface Ingressstatus_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer. */
  val loadBalancer: LoadBalancerStatus_core_v1_k8s1_19?
}      
typealias Ingressstatus_networking_k8s_io_v1_k8s1_20 = Ingressstatus_networking_k8s_io_v1_k8s1_19       
typealias Ingressstatus_networking_k8s_io_v1_k8s1_21 = Ingressstatus_networking_k8s_io_v1_k8s1_20 