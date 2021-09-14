package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointSubset_core_v1_k8s1_19: K8sManifest {
  /** IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load
balancers and clients to utilize. */
  val addresses: List<EndpointAddress_core_v1_k8s1_19>?
  /** IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished
starting, have recently failed a readiness check, or have recently failed a liveness check. */
  val notReadyAddresses: List<EndpointAddress_core_v1_k8s1_19>?
  /** Port numbers available on the related IP addresses. */
  val ports: List<EndpointPort_core_v1_k8s1_19>?
}