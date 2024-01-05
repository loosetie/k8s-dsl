package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conditions", "currentMetrics", "currentReplicas", "desiredReplicas", "lastScaleTime", "observedGeneration")
class Horizontalpodautoscalerstatus_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Horizontalpodautoscalerstatus_autoscaling_v2, HasParent {
  override var conditions: List<HorizontalPodAutoscalerCondition_autoscaling_v2>? = null
  override var currentMetrics: List<MetricStatus_autoscaling_v2>? = null
  override var currentReplicas: Int? = null
  override var desiredReplicas: Int? = null
  override var lastScaleTime: Time_meta_v1? = null
  override var observedGeneration: Int? = null
}