package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("rule", "seLinuxOptions")
class SELinuxStrategyOptions_policy_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: SELinuxStrategyOptions_policy_v1beta1, HasParent {
  override var rule: String? = null
  override var seLinuxOptions: SELinuxOptions_core_v1? = null
}