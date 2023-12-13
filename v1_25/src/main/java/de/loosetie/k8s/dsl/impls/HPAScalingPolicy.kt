package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("periodSeconds", "type", "value")
class HPAScalingPolicy_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HPAScalingPolicy_autoscaling_v2, HasParent {
  override var periodSeconds: Int? = null
  override var type: String? = null
  override var value: Int? = null
}