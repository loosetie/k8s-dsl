package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("exec", "failureThreshold", "httpGet", "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "timeoutSeconds")
class Probe_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Probe_core_v1_k8s1_16, HasParent {
  override var exec: ExecAction_core_v1_k8s1_16? = null
  override var failureThreshold: Int? = null
  override var httpGet: HTTPGetAction_core_v1_k8s1_16? = null
  override var initialDelaySeconds: Int? = null
  override var periodSeconds: Int? = null
  override var successThreshold: Int? = null
  override var tcpSocket: TCPSocketAction_core_v1_k8s1_16? = null
  override var timeoutSeconds: Int? = null
}
typealias Probe_core_v1_k8s1_17Impl = Probe_core_v1_k8s1_16Impl
typealias Probe_core_v1_k8s1_18Impl = Probe_core_v1_k8s1_17Impl
typealias Probe_core_v1_k8s1_19Impl = Probe_core_v1_k8s1_18Impl
typealias Probe_core_v1_k8s1_20Impl = Probe_core_v1_k8s1_19Impl
@JsonPropertyOrder("exec", "failureThreshold", "httpGet", "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "terminationGracePeriodSeconds", "timeoutSeconds")
class Probe_core_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Probe_core_v1_k8s1_21, HasParent {
  override var exec: ExecAction_core_v1_k8s1_21? = null
  override var failureThreshold: Int? = null
  override var httpGet: HTTPGetAction_core_v1_k8s1_21? = null
  override var initialDelaySeconds: Int? = null
  override var periodSeconds: Int? = null
  override var successThreshold: Int? = null
  override var tcpSocket: TCPSocketAction_core_v1_k8s1_21? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var timeoutSeconds: Int? = null
}