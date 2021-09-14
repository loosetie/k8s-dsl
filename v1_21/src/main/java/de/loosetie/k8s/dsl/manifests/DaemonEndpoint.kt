package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface DaemonEndpoint_core_v1_k8s1_21: K8sManifest {
  /** Port number of the given endpoint. */
  @K8sDslMarker var Port: Int?
}