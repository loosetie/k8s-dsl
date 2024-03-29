package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("maxReplicas", "minReplicas", "scaleTargetRef", "targetCPUUtilizationPercentage")
open class Horizontalpodautoscalerspec_autoscaling_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Horizontalpodautoscalerspec_autoscaling_v1, HasParent {
  override var maxReplicas: Int? = null
  override var minReplicas: Int? = null
  override var scaleTargetRef: CrossVersionObjectReference_autoscaling_v1? = null
  override var targetCPUUtilizationPercentage: Int? = null
}