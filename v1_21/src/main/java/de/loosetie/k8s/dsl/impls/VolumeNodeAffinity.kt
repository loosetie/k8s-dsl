package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("required")
class VolumeNodeAffinity_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeNodeAffinity_core_v1_k8s1_21, HasParent {
  override var required: NodeSelector_core_v1_k8s1_21? = null
}