package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LoadBalancerIngress_core_v1: K8sManifest {
  /** Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) */
  @K8sDslMarker var hostname: String?
  /** IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) */
  @K8sDslMarker var ip: String?
  /** IPMode specifies how the load-balancer IP behaves, and may only be specified when the ip field is specified. Setting
this to "VIP" indicates that traffic is delivered to the node with the destination set to the load-balancer's IP and
port. Setting this to "Proxy" indicates that traffic is delivered to the node or pod with the destination set to the
node's IP and node port or the pod's IP and port. Service implementations may use this information to adjust traffic
routing. */
  @K8sDslMarker var ipMode: String?
  /** Ports is a list of records of service ports If used, every port defined in the service should have an entry in it */
  val ports: List<PortStatus_core_v1>?
}