package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("scaleDown", "scaleUp")
class HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_18, HasParent {
  override var scaleDown: HPAScalingRules_autoscaling_v2beta2_k8s1_18? = null
  override var scaleUp: HPAScalingRules_autoscaling_v2beta2_k8s1_18? = null
}
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19Impl = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_18Impl
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_20Impl = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_19Impl
typealias HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_21Impl = HorizontalPodAutoscalerBehavior_autoscaling_v2beta2_k8s1_20Impl