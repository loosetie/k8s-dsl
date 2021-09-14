package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.Capabilities_core_v1_k8s1_18

@JsonPropertyOrder("add", "drop")
class Capabilities_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Capabilities_core_v1_k8s1_18, HasParent {
  override var add: List<String>? = null
  override var drop: List<String>? = null
}