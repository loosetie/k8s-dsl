package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.ComponentCondition_core_v1_k8s1_18

@JsonPropertyOrder("error", "message", "status", "type")
class ComponentCondition_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentCondition_core_v1_k8s1_18, HasParent {
  override var error: String? = null
  override var message: String? = null
  override var status: String? = null
  override var type: String? = null
}