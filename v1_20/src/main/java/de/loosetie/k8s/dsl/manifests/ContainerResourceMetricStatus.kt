package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerResourceMetricStatus_autoscaling_v2beta2_k8s1_20: K8sManifest {
  /** Name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** Container is the name of the container in the pods of the scaling target */
  @K8sDslMarker var container: String?
  /** current contains the current value for the given metric */
  val current: MetricValueStatus_autoscaling_v2beta2_k8s1_20?
}