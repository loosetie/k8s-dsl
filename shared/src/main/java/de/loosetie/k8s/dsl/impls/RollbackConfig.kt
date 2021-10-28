package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("revision")
class RollbackConfig_apps_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: RollbackConfig_apps_v1beta1_k8s1_16, HasParent {
  override var revision: Int? = null
}
typealias RollbackConfig_apps_v1beta1_k8s1_17Impl = RollbackConfig_apps_v1beta1_k8s1_16Impl



