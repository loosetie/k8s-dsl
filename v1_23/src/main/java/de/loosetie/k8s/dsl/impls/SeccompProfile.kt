package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("localhostProfile", "type")
open class SeccompProfile_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: SeccompProfile_core_v1, HasParent {
  override var localhostProfile: String? = null
  override var type: String? = null
}