package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerResourceMetricSource_autoscaling_v2: K8sManifest {
  /** name is the name of the resource in question. */
  @K8sDslMarker var name: String?
  /** container is the name of the container in the pods of the scaling target */
  @K8sDslMarker var container: String?
  /** target specifies the target value for the given metric */
  val target: MetricTarget_autoscaling_v2?
}