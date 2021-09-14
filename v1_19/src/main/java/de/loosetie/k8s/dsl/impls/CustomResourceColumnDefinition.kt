package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "description", "format", "jsonPath", "priority", "type")
class CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_19, HasParent {
  override var name: String? = null
  override var description: String? = null
  override var format: String? = null
  override var jsonPath: String? = null
  override var priority: Int? = null
  override var type: String? = null
}