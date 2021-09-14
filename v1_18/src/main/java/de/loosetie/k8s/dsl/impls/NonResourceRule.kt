package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("nonResourceURLs", "verbs")
class NonResourceRule_authorization_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NonResourceRule_authorization_k8s_io_v1_k8s1_18, HasParent {
  override var nonResourceURLs: List<String>? = null
  override var verbs: List<String>? = null
}