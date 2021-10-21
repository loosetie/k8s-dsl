package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ResourceMetricStatus_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** Name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_16?
}      
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_17 = ResourceMetricStatus_autoscaling_v2beta2_k8s1_16       
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_18 = ResourceMetricStatus_autoscaling_v2beta2_k8s1_17       
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_19 = ResourceMetricStatus_autoscaling_v2beta2_k8s1_18       
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_20 = ResourceMetricStatus_autoscaling_v2beta2_k8s1_19       
typealias ResourceMetricStatus_autoscaling_v2beta2_k8s1_21 = ResourceMetricStatus_autoscaling_v2beta2_k8s1_20 