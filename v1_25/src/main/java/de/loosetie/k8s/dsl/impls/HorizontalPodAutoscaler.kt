package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class HorizontalPodAutoscaler_autoscaling_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: HorizontalPodAutoscaler_autoscaling_v1, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Horizontalpodautoscalerspec_autoscaling_v1
  override var status: Horizontalpodautoscalerstatus_autoscaling_v1? = null
}

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class HorizontalPodAutoscaler_autoscaling_v2Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
  @JsonIgnore
  override val helmVariables: MutableMap<String, String> = mutableMapOf(),
      
)
: HorizontalPodAutoscaler_autoscaling_v2, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1
  override lateinit var spec: Any
  override var status: Any? = null
}