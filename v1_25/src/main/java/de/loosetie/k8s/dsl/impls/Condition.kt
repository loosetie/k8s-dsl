package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("lastTransitionTime", "message", "observedGeneration", "reason", "status", "type")
open class Condition_meta_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Condition_meta_v1, HasParent {
  override var lastTransitionTime: Time_meta_v1? = null
  override var message: String? = null
  override var observedGeneration: Int? = null
  override var reason: String? = null
  override var status: String? = null
  override var type: String? = null
}