package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.ConfigMapEnvSource_core_v1_k8s1_18

@JsonPropertyOrder("name", "optional")
class ConfigMapEnvSource_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ConfigMapEnvSource_core_v1_k8s1_18, HasParent {
  override var name: String? = null
  override var optional: Boolean? = null
}