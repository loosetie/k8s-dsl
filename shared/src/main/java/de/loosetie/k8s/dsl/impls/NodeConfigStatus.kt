package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("active", "assigned", "error", "lastKnownGood")
class NodeConfigStatus_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeConfigStatus_core_v1_k8s1_16, HasParent {
  override var active: NodeConfigSource_core_v1_k8s1_16? = null
  override var assigned: NodeConfigSource_core_v1_k8s1_16? = null
  override var error: String? = null
  override var lastKnownGood: NodeConfigSource_core_v1_k8s1_16? = null
}
typealias NodeConfigStatus_core_v1_k8s1_17Impl = NodeConfigStatus_core_v1_k8s1_16Impl
typealias NodeConfigStatus_core_v1_k8s1_18Impl = NodeConfigStatus_core_v1_k8s1_17Impl
typealias NodeConfigStatus_core_v1_k8s1_19Impl = NodeConfigStatus_core_v1_k8s1_18Impl
typealias NodeConfigStatus_core_v1_k8s1_20Impl = NodeConfigStatus_core_v1_k8s1_19Impl
typealias NodeConfigStatus_core_v1_k8s1_21Impl = NodeConfigStatus_core_v1_k8s1_20Impl