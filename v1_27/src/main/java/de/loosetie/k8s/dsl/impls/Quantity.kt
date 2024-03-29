package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("")
open class Quantity_core_resourceImpl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Quantity_core_resource, HasParent {
  
}