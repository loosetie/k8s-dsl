package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface MetricStatus_autoscaling_v2: K8sManifest {
  /** container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes
describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to
Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods"
source. */
  val containerResource: ContainerResourceMetricStatus_autoscaling_v2?
  /** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
  val external: ExternalMetricStatus_autoscaling_v2?
  /** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
  val `object`: ObjectMetricStatus_autoscaling_v2?
  /** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
  val pods: PodsMetricStatus_autoscaling_v2?
  /** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
  val resource: ResourceMetricStatus_autoscaling_v2?
  /** type is the type of metric source. It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource",
each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate
HPAContainerMetrics is enabled */
  @K8sDslMarker var type: String?
}