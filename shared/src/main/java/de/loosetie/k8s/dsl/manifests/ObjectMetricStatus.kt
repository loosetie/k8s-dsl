package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ObjectMetricStatus_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_16?
  /**  */
  val describedObject: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_16?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16?
}      
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_17 = ObjectMetricStatus_autoscaling_v2beta2_k8s1_16       
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_18 = ObjectMetricStatus_autoscaling_v2beta2_k8s1_17       
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_19 = ObjectMetricStatus_autoscaling_v2beta2_k8s1_18       
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_20 = ObjectMetricStatus_autoscaling_v2beta2_k8s1_19       
typealias ObjectMetricStatus_autoscaling_v2beta2_k8s1_21 = ObjectMetricStatus_autoscaling_v2beta2_k8s1_20 