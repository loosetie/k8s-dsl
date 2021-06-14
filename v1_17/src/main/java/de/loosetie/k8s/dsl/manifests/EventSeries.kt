package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface EventSeries_core_v1: K8sManifest {
  /** Number of occurrences in this series up to the last heartbeat time */
  @K8sDslMarker var count: Int?
  /** Time of the last occurrence observed */
  val lastObservedTime: MicroTime_meta_v1?
  /** State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18 */
  @K8sDslMarker var state: String?
}