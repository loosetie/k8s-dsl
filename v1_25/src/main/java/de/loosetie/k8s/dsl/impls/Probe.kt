package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("exec", "failureThreshold", "grpc", "httpGet", "initialDelaySeconds", "periodSeconds", "successThreshold", "tcpSocket", "terminationGracePeriodSeconds", "timeoutSeconds")
open class Probe_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Probe_core_v1, HasParent {
  override var exec: ExecAction_core_v1? = null
  override var failureThreshold: Int? = null
  override var grpc: GRPCAction_core_v1? = null
  override var httpGet: HTTPGetAction_core_v1? = null
  override var initialDelaySeconds: Int? = null
  override var periodSeconds: Int? = null
  override var successThreshold: Int? = null
  override var tcpSocket: TCPSocketAction_core_v1? = null
  override var terminationGracePeriodSeconds: Int? = null
  override var timeoutSeconds: Int? = null
}