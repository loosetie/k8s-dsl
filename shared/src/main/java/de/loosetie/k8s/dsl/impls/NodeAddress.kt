package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("address", "type")
class NodeAddress_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NodeAddress_core_v1_k8s1_16, HasParent {
  override var address: String? = null
  override var type: String? = null
}
typealias NodeAddress_core_v1_k8s1_17Impl = NodeAddress_core_v1_k8s1_16Impl
typealias NodeAddress_core_v1_k8s1_18Impl = NodeAddress_core_v1_k8s1_17Impl
typealias NodeAddress_core_v1_k8s1_19Impl = NodeAddress_core_v1_k8s1_18Impl
typealias NodeAddress_core_v1_k8s1_20Impl = NodeAddress_core_v1_k8s1_19Impl
typealias NodeAddress_core_v1_k8s1_21Impl = NodeAddress_core_v1_k8s1_20Impl