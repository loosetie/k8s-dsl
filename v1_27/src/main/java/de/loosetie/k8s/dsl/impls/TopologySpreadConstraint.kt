package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("labelSelector", "matchLabelKeys", "maxSkew", "minDomains", "nodeAffinityPolicy", "nodeTaintsPolicy", "topologyKey", "whenUnsatisfiable")
open class TopologySpreadConstraint_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: TopologySpreadConstraint_core_v1, HasParent {
  override var labelSelector: LabelSelector_meta_v1? = null
  override var matchLabelKeys: List<String>? = null
  override var maxSkew: Int? = null
  override var minDomains: Int? = null
  override var nodeAffinityPolicy: String? = null
  override var nodeTaintsPolicy: String? = null
  override var topologyKey: String? = null
  override var whenUnsatisfiable: String? = null
}