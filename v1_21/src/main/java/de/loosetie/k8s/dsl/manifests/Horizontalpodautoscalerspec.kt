package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Horizontalpodautoscalerspec_autoscaling_v1_k8s1_21: K8sManifest {
  /** upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas. */
  @K8sDslMarker var maxReplicas: Int?
  /** minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.
minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External
metric is configured. Scaling is active as long as at least one metric value is available. */
  @K8sDslMarker var minReplicas: Int?
  /** reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the
desired number of pods by using its Scale subresource. */
  val scaleTargetRef: CrossVersionObjectReference_autoscaling_v1_k8s1_21?
  /** target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the
default autoscaling policy will be used. */
  @K8sDslMarker var targetCPUUtilizationPercentage: Int?
}