package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Horizontalpodautoscalerspec_autoscaling_v2: K8sManifest {
  /** behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields
respectively). If not set, the default HPAScalingRules for scale up and scale down are used. */
  val behavior: HorizontalPodAutoscalerBehavior_autoscaling_v2?
  /** maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that
minReplicas. */
  @K8sDslMarker var maxReplicas: Int?
  /** metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count
across all metrics will be used). The desired replica count is calculated multiplying the ratio between the target value
and the current value by the current number of pods. Ergo, metrics used must decrease as the pod count is increased, and
vice-versa. See the individual metric source types for more information about how each type of metric must respond. If
not set, the default metric will be set to 80% average CPU utilization. */
  val metrics: List<MetricSpec_autoscaling_v2>?
  /** minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.
minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External
metric is configured. Scaling is active as long as at least one metric value is available. */
  @K8sDslMarker var minReplicas: Int?
  /** scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as
well as to actually change the replica count. */
  val scaleTargetRef: CrossVersionObjectReference_autoscaling_v2?
}