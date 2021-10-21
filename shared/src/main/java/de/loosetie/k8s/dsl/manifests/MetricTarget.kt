package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface MetricTarget_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a
percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type */
  @K8sDslMarker var averageUtilization: Int?
  /** averageValue is the target value of the average of the metric across all relevant pods (as a quantity) */
  val averageValue: Quantity_core_resource_k8s1_16?
  /** type represents whether the metric type is Utilization, Value, or AverageValue */
  @K8sDslMarker var type: String?
  /** value is the target value of the metric (as a quantity). */
  val value: Quantity_core_resource_k8s1_16?
}      
typealias MetricTarget_autoscaling_v2beta2_k8s1_17 = MetricTarget_autoscaling_v2beta2_k8s1_16       
typealias MetricTarget_autoscaling_v2beta2_k8s1_18 = MetricTarget_autoscaling_v2beta2_k8s1_17       
typealias MetricTarget_autoscaling_v2beta2_k8s1_19 = MetricTarget_autoscaling_v2beta2_k8s1_18       
typealias MetricTarget_autoscaling_v2beta2_k8s1_20 = MetricTarget_autoscaling_v2beta2_k8s1_19       
typealias MetricTarget_autoscaling_v2beta2_k8s1_21 = MetricTarget_autoscaling_v2beta2_k8s1_20 