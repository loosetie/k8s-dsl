package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "name")
class CrossVersionObjectReference_autoscaling_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CrossVersionObjectReference_autoscaling_v1_k8s1_19, HasParent {
  override var name: String? = null
}

@JsonPropertyOrder("apiVersion", "kind", "name")
class CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CrossVersionObjectReference_autoscaling_v2beta2_k8s1_19, HasParent {
  override var name: String? = null
}