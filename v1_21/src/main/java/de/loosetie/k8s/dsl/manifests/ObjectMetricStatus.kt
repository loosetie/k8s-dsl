package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ObjectMetricStatus_autoscaling_v2beta2_k8s1_21: K8sManifest {
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_21?
  /**  */
  val describedObject: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_21?
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2beta2_k8s1_21?
}