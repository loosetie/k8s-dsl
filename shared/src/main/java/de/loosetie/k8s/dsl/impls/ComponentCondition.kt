package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("error", "message", "status", "type")
class ComponentCondition_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentCondition_core_v1_k8s1_16, HasParent {
  override var error: String? = null
  override var message: String? = null
  override var status: String? = null
  override var type: String? = null
}
typealias ComponentCondition_core_v1_k8s1_17Impl = ComponentCondition_core_v1_k8s1_16Impl
typealias ComponentCondition_core_v1_k8s1_18Impl = ComponentCondition_core_v1_k8s1_17Impl
typealias ComponentCondition_core_v1_k8s1_19Impl = ComponentCondition_core_v1_k8s1_18Impl
typealias ComponentCondition_core_v1_k8s1_20Impl = ComponentCondition_core_v1_k8s1_19Impl
typealias ComponentCondition_core_v1_k8s1_21Impl = ComponentCondition_core_v1_k8s1_20Impl