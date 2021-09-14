package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("labelSelector", "maxSkew", "topologyKey", "whenUnsatisfiable")
class TopologySpreadConstraint_core_v1_k8s1_20Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TopologySpreadConstraint_core_v1_k8s1_20, HasParent {
  override var labelSelector: LabelSelector_meta_v1_k8s1_20? = null
  override var maxSkew: Int? = null
  override var topologyKey: String? = null
  override var whenUnsatisfiable: String? = null
}