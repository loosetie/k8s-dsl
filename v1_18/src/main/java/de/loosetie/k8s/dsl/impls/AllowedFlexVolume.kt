package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.AllowedFlexVolume_policy_v1beta1_k8s1_18

@JsonPropertyOrder("driver")
class AllowedFlexVolume_policy_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AllowedFlexVolume_policy_v1beta1_k8s1_18, HasParent {
  override var driver: String? = null
}