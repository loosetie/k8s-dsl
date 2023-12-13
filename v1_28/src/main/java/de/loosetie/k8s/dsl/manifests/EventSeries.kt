package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EventSeries_events_k8s_io_v1: K8sManifest {
  /** count is the number of occurrences in this series up to the last heartbeat time. */
  @K8sDslMarker var count: Int?
  /** lastObservedTime is the time when last Event from the series was seen before last heartbeat. */
  val lastObservedTime: MicroTime_meta_v1?
}