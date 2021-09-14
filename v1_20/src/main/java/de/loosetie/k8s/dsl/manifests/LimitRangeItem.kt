package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LimitRangeItem_core_v1_k8s1_20: K8sManifest {
  /** Default resource requirement limit value by resource name if resource limit is omitted. */
  @K8sDslMarker var default: Any?
  /** DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. */
  @K8sDslMarker var defaultRequest: Any?
  /** Max usage constraints on this kind by resource name. */
  @K8sDslMarker var max: Any?
  /** MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit
divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. */
  @K8sDslMarker var maxLimitRequestRatio: Any?
  /** Min usage constraints on this kind by resource name. */
  @K8sDslMarker var min: Any?
  /** Type of resource that this limit applies to. */
  @K8sDslMarker var type: String?
}