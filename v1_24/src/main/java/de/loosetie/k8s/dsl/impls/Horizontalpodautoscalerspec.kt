package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("behavior", "maxReplicas", "metrics", "minReplicas", "scaleTargetRef")
class Horizontalpodautoscalerspec_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Horizontalpodautoscalerspec_autoscaling_v2, HasParent {
  override var behavior: HorizontalPodAutoscalerBehavior_autoscaling_v2? = null
  override var maxReplicas: Int? = null
  override var metrics: List<MetricSpec_autoscaling_v2>? = null
  override var minReplicas: Int? = null
  override var scaleTargetRef: CrossVersionObjectReference_autoscaling_v2? = null
}