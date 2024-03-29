package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("currentCPUUtilizationPercentage", "currentReplicas", "desiredReplicas", "lastScaleTime", "observedGeneration")
open class Horizontalpodautoscalerstatus_autoscaling_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Horizontalpodautoscalerstatus_autoscaling_v1, HasParent {
  override var currentCPUUtilizationPercentage: Int? = null
  override var currentReplicas: Int? = null
  override var desiredReplicas: Int? = null
  override var lastScaleTime: Time_meta_v1? = null
  override var observedGeneration: Int? = null
}