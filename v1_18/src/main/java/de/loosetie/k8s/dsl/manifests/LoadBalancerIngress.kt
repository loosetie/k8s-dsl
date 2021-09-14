package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LoadBalancerIngress_core_v1_k8s1_18: K8sManifest {
  /** Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) */
  @K8sDslMarker var hostname: String?
  /** IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) */
  @K8sDslMarker var ip: String?
}