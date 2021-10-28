package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("currentCPUUtilizationPercentage", "currentReplicas", "desiredReplicas", "lastScaleTime", "observedGeneration")
class Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16, HasParent {
  override var currentCPUUtilizationPercentage: Int? = null
  override var currentReplicas: Int? = null
  override var desiredReplicas: Int? = null
  override var lastScaleTime: Time_meta_v1_k8s1_16? = null
  override var observedGeneration: Int? = null
}
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_17Impl = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_16Impl
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_18Impl = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_17Impl
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19Impl = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_18Impl
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20Impl = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_19Impl
typealias Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_21Impl = Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20Impl