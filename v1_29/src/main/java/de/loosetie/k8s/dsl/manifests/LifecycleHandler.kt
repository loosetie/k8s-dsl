package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface LifecycleHandler_core_v1: K8sManifest {
  /** Exec specifies the action to take. */
  val exec: ExecAction_core_v1?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_core_v1?
  /** Sleep represents the duration that the container should sleep before being terminated. */
  val sleep: SleepAction_core_v1?
  /** Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no
validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified. */
  val tcpSocket: TCPSocketAction_core_v1?
}