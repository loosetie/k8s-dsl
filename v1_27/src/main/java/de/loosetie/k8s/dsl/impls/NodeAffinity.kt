package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("preferredDuringSchedulingIgnoredDuringExecution", "requiredDuringSchedulingIgnoredDuringExecution")
class NodeAffinity_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: NodeAffinity_core_v1, HasParent {
  override var preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm_core_v1>? = null
  override var requiredDuringSchedulingIgnoredDuringExecution: NodeSelector_core_v1? = null
}