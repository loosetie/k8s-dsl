package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("containerName", "divisor", "resource")
open class ResourceFieldSelector_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: ResourceFieldSelector_core_v1, HasParent {
  override var containerName: String? = null
  override var divisor: Quantity_core_resource? = null
  override var resource: String? = null
}