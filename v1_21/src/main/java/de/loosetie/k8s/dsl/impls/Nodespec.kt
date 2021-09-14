package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("configSource", "externalID", "podCIDR", "podCIDRs", "providerID", "taints", "unschedulable")
class Nodespec_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Nodespec_core_v1_k8s1_21, HasParent {
  override var configSource: NodeConfigSource_core_v1_k8s1_21? = null
  override var externalID: String? = null
  override var podCIDR: String? = null
  override var podCIDRs: List<String>? = null
  override var providerID: String? = null
  override var taints: List<Taint_core_v1_k8s1_21>? = null
  override var unschedulable: Boolean? = null
}