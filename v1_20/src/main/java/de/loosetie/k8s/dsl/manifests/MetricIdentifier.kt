package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface MetricIdentifier_autoscaling_v2beta2_k8s1_20: K8sManifest {
  /** name is the name of the given metric */
  @K8sDslMarker var name: String?
  /** selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed
as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will
be used to gather metrics. */
  val selector: LabelSelector_meta_v1_k8s1_20?
}