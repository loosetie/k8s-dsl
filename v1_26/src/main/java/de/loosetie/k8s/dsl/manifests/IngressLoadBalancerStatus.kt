package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressLoadBalancerStatus_networking_k8s_io_v1: K8sManifest {
  /** Ingress is a list containing ingress points for the load-balancer. */
  val ingress: List<IngressLoadBalancerIngress_networking_k8s_io_v1>?
}