package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "conditions")
class ComponentStatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentStatus_core_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var conditions: List<ComponentCondition_core_v1_k8s1_16>? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "conditions")
class ComponentStatus_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ComponentStatus_core_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var conditions: List<ComponentCondition_core_v1_k8s1_17>? = null
}
typealias ComponentStatus_core_v1_k8s1_18Impl = ComponentStatus_core_v1_k8s1_17Impl
typealias ComponentStatus_core_v1_k8s1_19Impl = ComponentStatus_core_v1_k8s1_18Impl
typealias ComponentStatus_core_v1_k8s1_20Impl = ComponentStatus_core_v1_k8s1_19Impl
typealias ComponentStatus_core_v1_k8s1_21Impl = ComponentStatus_core_v1_k8s1_20Impl