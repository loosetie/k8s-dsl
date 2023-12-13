package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "items", "optional")
class ConfigMapProjection_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapProjection_core_v1, HasParent {
  override var name: String? = null
  override var items: List<KeyToPath_core_v1>? = null
  override var optional: Boolean? = null
}