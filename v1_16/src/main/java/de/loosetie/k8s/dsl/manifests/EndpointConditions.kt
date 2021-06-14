package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EndpointConditions_discovery_k8s_io_v1alpha1: K8sManifest {
  /** ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the
endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. */
  @K8sDslMarker var ready: Boolean?
}