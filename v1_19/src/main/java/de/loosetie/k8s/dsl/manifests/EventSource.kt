package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EventSource_core_v1_k8s1_19: K8sManifest {
  /** Component from which the event is generated. */
  @K8sDslMarker var component: String?
  /** Node name on which the event is generated. */
  @K8sDslMarker var host: String?
}