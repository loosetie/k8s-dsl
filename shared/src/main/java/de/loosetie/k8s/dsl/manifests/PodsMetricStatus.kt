package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PodsMetricStatus_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_16?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16?
}      
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_17 = PodsMetricStatus_autoscaling_v2beta2_k8s1_16       
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_18 = PodsMetricStatus_autoscaling_v2beta2_k8s1_17       
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_19 = PodsMetricStatus_autoscaling_v2beta2_k8s1_18       
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_20 = PodsMetricStatus_autoscaling_v2beta2_k8s1_19       
typealias PodsMetricStatus_autoscaling_v2beta2_k8s1_21 = PodsMetricStatus_autoscaling_v2beta2_k8s1_20 