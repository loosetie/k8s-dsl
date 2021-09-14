package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("hard", "used")
class Resourcequotastatus_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Resourcequotastatus_core_v1_k8s1_20, HasParent {
  override var hard: Any? = null
  override var used: Any? = null
}