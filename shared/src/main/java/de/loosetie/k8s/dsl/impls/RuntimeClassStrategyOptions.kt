package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allowedRuntimeClassNames", "defaultRuntimeClassName")
class RuntimeClassStrategyOptions_policy_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClassStrategyOptions_policy_v1beta1_k8s1_16, HasParent {
  override var allowedRuntimeClassNames: List<String>? = null
  override var defaultRuntimeClassName: String? = null
}
typealias RuntimeClassStrategyOptions_policy_v1beta1_k8s1_17Impl = RuntimeClassStrategyOptions_policy_v1beta1_k8s1_16Impl
typealias RuntimeClassStrategyOptions_policy_v1beta1_k8s1_18Impl = RuntimeClassStrategyOptions_policy_v1beta1_k8s1_17Impl
@JsonPropertyOrder("allowedRuntimeClassNames", "defaultRuntimeClassName")
class RuntimeClassStrategyOptions_policy_v1beta1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RuntimeClassStrategyOptions_policy_v1beta1_k8s1_19, HasParent {
  override var allowedRuntimeClassNames: List<String>? = null
  override var defaultRuntimeClassName: String? = null
}
typealias RuntimeClassStrategyOptions_policy_v1beta1_k8s1_20Impl = RuntimeClassStrategyOptions_policy_v1beta1_k8s1_19Impl
typealias RuntimeClassStrategyOptions_policy_v1beta1_k8s1_21Impl = RuntimeClassStrategyOptions_policy_v1beta1_k8s1_20Impl