package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ranges", "rule")
class RunAsGroupStrategyOptions_policy_v1beta1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RunAsGroupStrategyOptions_policy_v1beta1_k8s1_21, HasParent {
  override var ranges: List<IDRange_policy_v1beta1_k8s1_21>? = null
  override var rule: String? = null
}