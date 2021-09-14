package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("policies", "selectPolicy", "stabilizationWindowSeconds")
class HPAScalingRules_autoscaling_v2beta2_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HPAScalingRules_autoscaling_v2beta2_k8s1_21, HasParent {
  override var policies: List<HPAScalingPolicy_autoscaling_v2beta2_k8s1_21>? = null
  override var selectPolicy: String? = null
  override var stabilizationWindowSeconds: Int? = null
}