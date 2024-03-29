package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("allowedRuntimeClassNames", "defaultRuntimeClassName")
open class RuntimeClassStrategyOptions_policy_v1beta1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: RuntimeClassStrategyOptions_policy_v1beta1, HasParent {
  override var allowedRuntimeClassNames: List<String>? = null
  override var defaultRuntimeClassName: String? = null
}