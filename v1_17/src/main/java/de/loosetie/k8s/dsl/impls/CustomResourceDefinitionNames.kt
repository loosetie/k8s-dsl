package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "categories", "listKind", "plural", "shortNames", "singular")
class CustomResourceDefinitionNames_apiextensions_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CustomResourceDefinitionNames_apiextensions_k8s_io_v1, HasParent {
  override var kind: String? = null
  override var categories: List<String>? = null
  override var listKind: String? = null
  override var plural: String? = null
  override var shortNames: List<String>? = null
  override var singular: String? = null
}