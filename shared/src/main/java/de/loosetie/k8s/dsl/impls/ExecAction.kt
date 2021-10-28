package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("command")
class ExecAction_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ExecAction_core_v1_k8s1_16, HasParent {
  override var command: List<String>? = null
}
typealias ExecAction_core_v1_k8s1_17Impl = ExecAction_core_v1_k8s1_16Impl
typealias ExecAction_core_v1_k8s1_18Impl = ExecAction_core_v1_k8s1_17Impl
typealias ExecAction_core_v1_k8s1_19Impl = ExecAction_core_v1_k8s1_18Impl
typealias ExecAction_core_v1_k8s1_20Impl = ExecAction_core_v1_k8s1_19Impl
typealias ExecAction_core_v1_k8s1_21Impl = ExecAction_core_v1_k8s1_20Impl