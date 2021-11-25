package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("host", "port")
class TCPSocketAction_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: TCPSocketAction_core_v1_k8s1_16, HasParent {
  override var host: String? = null
  override var port: de.loosetie.k8s.dsl.types.IntOrString? = null
}
typealias TCPSocketAction_core_v1_k8s1_17Impl = TCPSocketAction_core_v1_k8s1_16Impl
typealias TCPSocketAction_core_v1_k8s1_18Impl = TCPSocketAction_core_v1_k8s1_17Impl
typealias TCPSocketAction_core_v1_k8s1_19Impl = TCPSocketAction_core_v1_k8s1_18Impl
typealias TCPSocketAction_core_v1_k8s1_20Impl = TCPSocketAction_core_v1_k8s1_19Impl
typealias TCPSocketAction_core_v1_k8s1_21Impl = TCPSocketAction_core_v1_k8s1_20Impl