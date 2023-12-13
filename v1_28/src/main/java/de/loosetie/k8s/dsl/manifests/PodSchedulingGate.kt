package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodSchedulingGate_core_v1: K8sManifest {
  /** Name of the scheduling gate. Each scheduling gate must have a unique name field. */
  @K8sDslMarker var name: String?
}