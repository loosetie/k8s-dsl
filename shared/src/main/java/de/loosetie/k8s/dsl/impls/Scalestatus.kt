package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("replicas", "selector", "targetSelector")
class Scalestatus_apps_v1beta1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Scalestatus_apps_v1beta1_k8s1_17, HasParent {
  override var replicas: Int? = null
  override var selector: Map<String, String>? = null
  override var targetSelector: String? = null
}



