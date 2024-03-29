package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ForZone_discovery_k8s_io_v1: K8sManifest {
  /** name represents the name of the zone. */
  @K8sDslMarker var name: String?
}