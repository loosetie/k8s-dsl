package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceMetricSource_autoscaling_v2beta2_k8s1_18: K8sManifest {
  /** name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2beta2_k8s1_18?
}