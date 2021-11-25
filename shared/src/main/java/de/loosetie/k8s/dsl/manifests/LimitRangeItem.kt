package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface LimitRangeItem_core_v1_k8s1_16: K8sManifest {
  /** Default resource requirement limit value by resource name if resource limit is omitted. */
  var default: de.loosetie.k8s.dsl.types.CpuMem?
  /** DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. */
  var defaultRequest: de.loosetie.k8s.dsl.types.CpuMem?
  /** Max usage constraints on this kind by resource name. */
  var max: de.loosetie.k8s.dsl.types.CpuMem?
  /** MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit
divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. */
  var maxLimitRequestRatio: de.loosetie.k8s.dsl.types.CpuMem?
  /** Min usage constraints on this kind by resource name. */
  var min: de.loosetie.k8s.dsl.types.CpuMem?
  /** Type of resource that this limit applies to. */
  @K8sDslMarker var type: String?
}      
typealias LimitRangeItem_core_v1_k8s1_17 = LimitRangeItem_core_v1_k8s1_16       
typealias LimitRangeItem_core_v1_k8s1_18 = LimitRangeItem_core_v1_k8s1_17       
typealias LimitRangeItem_core_v1_k8s1_19 = LimitRangeItem_core_v1_k8s1_18       
typealias LimitRangeItem_core_v1_k8s1_20 = LimitRangeItem_core_v1_k8s1_19       
typealias LimitRangeItem_core_v1_k8s1_21 = LimitRangeItem_core_v1_k8s1_20 