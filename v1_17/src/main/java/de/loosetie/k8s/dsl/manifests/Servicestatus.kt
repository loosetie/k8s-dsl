package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Servicestatus_core_v1: K8sManifest {
  /** LoadBalancer contains the current status of the load-balancer, if one is present. */
  val loadBalancer: LoadBalancerStatus_core_v1?
}