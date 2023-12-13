package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressLoadBalancerIngress_networking_k8s_io_v1: K8sManifest {
  /** hostname is set for load-balancer ingress points that are DNS based. */
  @K8sDslMarker var hostname: String?
  /** ip is set for load-balancer ingress points that are IP based. */
  @K8sDslMarker var ip: String?
  /** ports provides information about the ports exposed by this LoadBalancer. */
  val ports: List<IngressPortStatus_networking_k8s_io_v1>?
}