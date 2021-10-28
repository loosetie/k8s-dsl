package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rule", "seLinuxOptions")
class SELinuxStrategyOptions_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: SELinuxStrategyOptions_policy_v1beta1_k8s1_16, HasParent {
  override var rule: String? = null
  override var seLinuxOptions: SELinuxOptions_core_v1_k8s1_16? = null
}
typealias SELinuxStrategyOptions_policy_v1beta1_k8s1_17Impl = SELinuxStrategyOptions_policy_v1beta1_k8s1_16Impl
typealias SELinuxStrategyOptions_policy_v1beta1_k8s1_18Impl = SELinuxStrategyOptions_policy_v1beta1_k8s1_17Impl
typealias SELinuxStrategyOptions_policy_v1beta1_k8s1_19Impl = SELinuxStrategyOptions_policy_v1beta1_k8s1_18Impl
typealias SELinuxStrategyOptions_policy_v1beta1_k8s1_20Impl = SELinuxStrategyOptions_policy_v1beta1_k8s1_19Impl
typealias SELinuxStrategyOptions_policy_v1beta1_k8s1_21Impl = SELinuxStrategyOptions_policy_v1beta1_k8s1_20Impl