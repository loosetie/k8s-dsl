package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ExternalMetricSource_autoscaling_v2: K8sManifest {
  /** metric identifies the target metric by name and selector */
  val metric: MetricIdentifier_autoscaling_v2?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2?
}