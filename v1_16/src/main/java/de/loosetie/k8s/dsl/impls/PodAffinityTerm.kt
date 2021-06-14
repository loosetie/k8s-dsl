package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("labelSelector", "namespaces", "topologyKey")
class PodAffinityTerm_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PodAffinityTerm_core_v1, HasParent {
  override var labelSelector: LabelSelector_meta_v1? = null
  override var namespaces: List<String>? = null
  override var topologyKey: String? = null
}