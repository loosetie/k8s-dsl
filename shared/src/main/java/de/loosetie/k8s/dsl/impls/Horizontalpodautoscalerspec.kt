package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxReplicas", "minReplicas", "scaleTargetRef", "targetCPUUtilizationPercentage")
class Horizontalpodautoscalerspec_autoscaling_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Horizontalpodautoscalerspec_autoscaling_v1_k8s1_16, HasParent {
  override var maxReplicas: Int? = null
  override var minReplicas: Int? = null
  override var scaleTargetRef: CrossVersionObjectReference_autoscaling_v1_k8s1_16? = null
  override var targetCPUUtilizationPercentage: Int? = null
}
typealias Horizontalpodautoscalerspec_autoscaling_v1_k8s1_17Impl = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_16Impl
typealias Horizontalpodautoscalerspec_autoscaling_v1_k8s1_18Impl = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_17Impl
typealias Horizontalpodautoscalerspec_autoscaling_v1_k8s1_19Impl = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_18Impl
typealias Horizontalpodautoscalerspec_autoscaling_v1_k8s1_20Impl = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_19Impl
typealias Horizontalpodautoscalerspec_autoscaling_v1_k8s1_21Impl = Horizontalpodautoscalerspec_autoscaling_v1_k8s1_20Impl