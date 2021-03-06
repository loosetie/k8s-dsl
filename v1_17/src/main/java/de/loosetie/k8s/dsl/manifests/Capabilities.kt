package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Capabilities_core_v1: K8sManifest {
  /** Added capabilities */
  @K8sDslMarker var add: List<String>?
  /** Removed capabilities */
  @K8sDslMarker var drop: List<String>?
}