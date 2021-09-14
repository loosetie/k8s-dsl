package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class HorizontalPodAutoscaler_autoscaling_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HorizontalPodAutoscaler_autoscaling_v1_k8s1_20, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_20
  override lateinit var spec: Horizontalpodautoscalerspec_autoscaling_v1_k8s1_20
  override var status: Horizontalpodautoscalerstatus_autoscaling_v1_k8s1_20? = null
}