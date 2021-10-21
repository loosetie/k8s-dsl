package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ObjectMetricSource_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /**  */
  val describedObject: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_16?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_16?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2beta2_k8s1_16?
}      
typealias ObjectMetricSource_autoscaling_v2beta2_k8s1_17 = ObjectMetricSource_autoscaling_v2beta2_k8s1_16       
typealias ObjectMetricSource_autoscaling_v2beta2_k8s1_18 = ObjectMetricSource_autoscaling_v2beta2_k8s1_17       
typealias ObjectMetricSource_autoscaling_v2beta2_k8s1_19 = ObjectMetricSource_autoscaling_v2beta2_k8s1_18       
typealias ObjectMetricSource_autoscaling_v2beta2_k8s1_20 = ObjectMetricSource_autoscaling_v2beta2_k8s1_19       
typealias ObjectMetricSource_autoscaling_v2beta2_k8s1_21 = ObjectMetricSource_autoscaling_v2beta2_k8s1_20 