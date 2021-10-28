package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "reason", "status", "type")
class HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_16, HasParent {
  override var lastTransitionTime: Time_meta_v1_k8s1_16? = null
  override var message: String? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_17Impl = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_16Impl
typealias HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_18Impl = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_17Impl
typealias HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_19Impl = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_18Impl
typealias HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_20Impl = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_19Impl
typealias HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_21Impl = HorizontalPodAutoscalerCondition_autoscaling_v2beta2_k8s1_20Impl