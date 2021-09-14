package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface MetricSpec_autoscaling_v2beta2_k8s1_19: K8sManifest {
  /** external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on
information coming from components running outside of cluster (for example length of queue in cloud messaging service,
or QPS from loadbalancer running outside of cluster). */
  val external: ExternalMetricSource_autoscaling_v2beta2_k8s1_19?
  /** object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
  val `object`: ObjectMetricSource_autoscaling_v2beta2_k8s1_19?
  /** pods refers to a metric describing each pod in the current scale target (for example,
transactions-processed-per-second). The values will be averaged together before being compared to the target value. */
  val pods: PodsMetricSource_autoscaling_v2beta2_k8s1_19?
  /** resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing
each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special
scaling options on top of those available to normal per-pod metrics using the "pods" source. */
  val resource: ResourceMetricSource_autoscaling_v2beta2_k8s1_19?
  /** type is the type of metric source. It should be one of "Object", "Pods" or "Resource", each mapping to a matching field
in the object. */
  @K8sDslMarker var type: String?
}