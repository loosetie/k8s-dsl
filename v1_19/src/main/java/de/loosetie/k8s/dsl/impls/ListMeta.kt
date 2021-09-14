package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("continue", "remainingItemCount", "resourceVersion", "selfLink")
class ListMeta_meta_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ListMeta_meta_v1_k8s1_19, HasParent {
  override var `continue`: String? = null
  override var remainingItemCount: Int? = null
  override var resourceVersion: String? = null
  override var selfLink: String? = null
}