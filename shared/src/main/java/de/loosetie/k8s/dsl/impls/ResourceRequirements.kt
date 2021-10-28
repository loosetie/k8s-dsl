package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("limits", "requests")
class ResourceRequirements_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceRequirements_core_v1_k8s1_16, HasParent {
  override var limits: Any? = null
  override var requests: Any? = null
}
typealias ResourceRequirements_core_v1_k8s1_17Impl = ResourceRequirements_core_v1_k8s1_16Impl
typealias ResourceRequirements_core_v1_k8s1_18Impl = ResourceRequirements_core_v1_k8s1_17Impl
typealias ResourceRequirements_core_v1_k8s1_19Impl = ResourceRequirements_core_v1_k8s1_18Impl
typealias ResourceRequirements_core_v1_k8s1_20Impl = ResourceRequirements_core_v1_k8s1_19Impl
@JsonPropertyOrder("limits", "requests")
class ResourceRequirements_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ResourceRequirements_core_v1_k8s1_21, HasParent {
  override var limits: Any? = null
  override var requests: Any? = null
}