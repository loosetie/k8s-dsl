package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("conversion", "group", "names", "preserveUnknownFields", "scope", "versions")
class Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Customresourcedefinitionspec_apiextensions_k8s_io_v1_k8s1_19, HasParent {
  override var conversion: CustomResourceConversion_apiextensions_k8s_io_v1_k8s1_19? = null
  override var group: String? = null
  override var names: CustomResourceDefinitionNames_apiextensions_k8s_io_v1_k8s1_19? = null
  override var preserveUnknownFields: Boolean? = null
  override var scope: String? = null
  override var versions: List<CustomResourceDefinitionVersion_apiextensions_k8s_io_v1_k8s1_19>? = null
}