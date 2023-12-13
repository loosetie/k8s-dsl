package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Horizontalpodautoscalerstatus_autoscaling_v2: K8sManifest {
  /** conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those
conditions are met. */
  val conditions: List<HorizontalPodAutoscalerCondition_autoscaling_v2>?
  /** currentMetrics is the last read state of the metrics used by this autoscaler. */
  val currentMetrics: List<MetricStatus_autoscaling_v2>?
  /** currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler. */
  @K8sDslMarker var currentReplicas: Int?
  /** desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the
autoscaler. */
  @K8sDslMarker var desiredReplicas: Int?
  /** lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control
how often the number of pods is changed. */
  val lastScaleTime: Time_meta_v1?
  /** observedGeneration is the most recent generation observed by this autoscaler. */
  @K8sDslMarker var observedGeneration: Int?
}