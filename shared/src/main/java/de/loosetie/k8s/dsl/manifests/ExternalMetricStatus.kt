package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ExternalMetricStatus_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_16?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16?
}      
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_17 = ExternalMetricStatus_autoscaling_v2beta2_k8s1_16       
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_18 = ExternalMetricStatus_autoscaling_v2beta2_k8s1_17       
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_19 = ExternalMetricStatus_autoscaling_v2beta2_k8s1_18       
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_20 = ExternalMetricStatus_autoscaling_v2beta2_k8s1_19       
typealias ExternalMetricStatus_autoscaling_v2beta2_k8s1_21 = ExternalMetricStatus_autoscaling_v2beta2_k8s1_20 