package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LoadBalancerStatus_core_v1_k8s1_21: K8sManifest {
  /** Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to
these ingress points. */
  val ingress: List<LoadBalancerIngress_core_v1_k8s1_21>?
}