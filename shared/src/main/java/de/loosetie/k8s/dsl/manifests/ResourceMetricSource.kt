package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ResourceMetricSource_autoscaling_v2beta2_k8s1_16: K8sManifest {
  /** name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2beta2_k8s1_16?
}      
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_17 = ResourceMetricSource_autoscaling_v2beta2_k8s1_16       
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_18 = ResourceMetricSource_autoscaling_v2beta2_k8s1_17       
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_19 = ResourceMetricSource_autoscaling_v2beta2_k8s1_18       
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_20 = ResourceMetricSource_autoscaling_v2beta2_k8s1_19       
typealias ResourceMetricSource_autoscaling_v2beta2_k8s1_21 = ResourceMetricSource_autoscaling_v2beta2_k8s1_20 