package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "name", "categories", "group", "namespaced", "shortNames", "singularName", "storageVersionHash", "verbs", "version")
class APIResource_meta_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: APIResource_meta_v1_k8s1_19, HasParent {
  override var kind: String? = null
  override var name: String? = null
  override var categories: List<String>? = null
  override var group: String? = null
  override var namespaced: Boolean? = null
  override var shortNames: List<String>? = null
  override var singularName: String? = null
  override var storageVersionHash: String? = null
  override var verbs: List<String>? = null
  override var version: String? = null
}