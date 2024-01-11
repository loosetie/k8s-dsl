package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "additionalPrinterColumns", "deprecated", "deprecationWarning", "schema", "served", "storage", "subresources")
open class CustomResourceDefinitionVersion_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: CustomResourceDefinitionVersion_apiextensions_k8s_io_v1, HasParent {
  override var name: String? = null
  override var additionalPrinterColumns: List<CustomResourceColumnDefinition_apiextensions_k8s_io_v1>? = null
  override var deprecated: Boolean? = null
  override var deprecationWarning: String? = null
  override var schema: CustomResourceValidation_apiextensions_k8s_io_v1? = null
  override var served: Boolean? = null
  override var storage: Boolean? = null
  override var subresources: CustomResourceSubresources_apiextensions_k8s_io_v1? = null
}