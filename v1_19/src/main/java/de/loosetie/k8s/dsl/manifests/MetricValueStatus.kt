package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface MetricValueStatus_autoscaling_v2beta2_k8s1_19: K8sManifest {
  /** currentAverageUtilization is the current value of the average of the resource metric across all relevant pods,
represented as a percentage of the requested value of the resource for the pods. */
  @K8sDslMarker var averageUtilization: Int?
  /** averageValue is the current value of the average of the metric across all relevant pods (as a quantity) */
  val averageValue: Quantity_core_resource_k8s1_19?
  /** value is the current value of the metric (as a quantity). */
  val value: Quantity_core_resource_k8s1_19?
}