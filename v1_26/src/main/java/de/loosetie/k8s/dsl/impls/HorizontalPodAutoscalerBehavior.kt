package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("scaleDown", "scaleUp")
class HorizontalPodAutoscalerBehavior_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: HorizontalPodAutoscalerBehavior_autoscaling_v2, HasParent {
  override var scaleDown: HPAScalingRules_autoscaling_v2? = null
  override var scaleUp: HPAScalingRules_autoscaling_v2? = null
}