package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.Affinity_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.NodeAffinity_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.PodAffinity_core_v1_k8s1_18
import de.loosetie.k8s.dsl.manifests.PodAntiAffinity_core_v1_k8s1_18

@JsonPropertyOrder("nodeAffinity", "podAffinity", "podAntiAffinity")
class Affinity_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Affinity_core_v1_k8s1_18, HasParent {
  override var nodeAffinity: NodeAffinity_core_v1_k8s1_18? = null
  override var podAffinity: PodAffinity_core_v1_k8s1_18? = null
  override var podAntiAffinity: PodAntiAffinity_core_v1_k8s1_18? = null
}