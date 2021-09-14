package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointHints_discovery_k8s_io_v1_k8s1_21: K8sManifest {
  /** forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. */
  val forZones: List<ForZone_discovery_k8s_io_v1_k8s1_21>?
}