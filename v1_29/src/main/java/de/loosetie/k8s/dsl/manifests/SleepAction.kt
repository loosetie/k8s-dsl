package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SleepAction_core_v1: K8sManifest {
  /** Seconds is the number of seconds to sleep. */
  @K8sDslMarker var seconds: Int?
}