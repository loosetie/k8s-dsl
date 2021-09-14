package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Ingressstatus_networking_k8s_io_v1_k8s1_20: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer. */
  val loadBalancer: LoadBalancerStatus_core_v1_k8s1_20?
}