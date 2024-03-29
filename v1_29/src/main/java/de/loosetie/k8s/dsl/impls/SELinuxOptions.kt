package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("level", "role", "type", "user")
open class SELinuxOptions_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: SELinuxOptions_core_v1, HasParent {
  override var level: String? = null
  override var role: String? = null
  override var type: String? = null
  override var user: String? = null
}