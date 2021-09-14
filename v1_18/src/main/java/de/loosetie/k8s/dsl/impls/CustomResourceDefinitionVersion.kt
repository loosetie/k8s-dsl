package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_18

@JsonPropertyOrder("name", "additionalPrinterColumns", "schema", "served", "storage", "subresources")
class CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var additionalPrinterColumns: List<CustomResourceColumnDefinition_apiextensions_k8s_io_v1_k8s1_18>? = null
  override var schema: CustomResourceValidation_apiextensions_k8s_io_v1_k8s1_18? = null
  override var served: Boolean? = null
  override var storage: Boolean? = null
  override var subresources: CustomResourceSubresources_apiextensions_k8s_io_v1_k8s1_18? = null
}