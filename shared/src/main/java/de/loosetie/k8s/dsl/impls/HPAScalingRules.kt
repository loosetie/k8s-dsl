package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("policies", "selectPolicy", "stabilizationWindowSeconds")
class HPAScalingRules_autoscaling_v2beta2_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HPAScalingRules_autoscaling_v2beta2_k8s1_18, HasParent {
  override var policies: List<HPAScalingPolicy_autoscaling_v2beta2_k8s1_18>? = null
  override var selectPolicy: String? = null
  override var stabilizationWindowSeconds: Int? = null
}
typealias HPAScalingRules_autoscaling_v2beta2_k8s1_19Impl = HPAScalingRules_autoscaling_v2beta2_k8s1_18Impl
typealias HPAScalingRules_autoscaling_v2beta2_k8s1_20Impl = HPAScalingRules_autoscaling_v2beta2_k8s1_19Impl
typealias HPAScalingRules_autoscaling_v2beta2_k8s1_21Impl = HPAScalingRules_autoscaling_v2beta2_k8s1_20Impl