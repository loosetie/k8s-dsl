package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("exec", "httpGet", "tcpSocket")
open class LifecycleHandler_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: LifecycleHandler_core_v1, HasParent {
  override var exec: ExecAction_core_v1? = null
  override var httpGet: HTTPGetAction_core_v1? = null
  override var tcpSocket: TCPSocketAction_core_v1? = null
}