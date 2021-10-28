package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("ranges", "rule")
class FSGroupStrategyOptions_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FSGroupStrategyOptions_policy_v1beta1_k8s1_16, HasParent {
  override var ranges: List<IDRange_policy_v1beta1_k8s1_16>? = null
  override var rule: String? = null
}
typealias FSGroupStrategyOptions_policy_v1beta1_k8s1_17Impl = FSGroupStrategyOptions_policy_v1beta1_k8s1_16Impl
typealias FSGroupStrategyOptions_policy_v1beta1_k8s1_18Impl = FSGroupStrategyOptions_policy_v1beta1_k8s1_17Impl
typealias FSGroupStrategyOptions_policy_v1beta1_k8s1_19Impl = FSGroupStrategyOptions_policy_v1beta1_k8s1_18Impl
typealias FSGroupStrategyOptions_policy_v1beta1_k8s1_20Impl = FSGroupStrategyOptions_policy_v1beta1_k8s1_19Impl
typealias FSGroupStrategyOptions_policy_v1beta1_k8s1_21Impl = FSGroupStrategyOptions_policy_v1beta1_k8s1_20Impl