package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Probe_core_v1_k8s1_18: K8sManifest {
  /** One and only one of the following should be specified. Exec specifies the action to take. */
  val exec: ExecAction_core_v1_k8s1_18?
  /** Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
is 1. */
  @K8sDslMarker var failureThreshold: Int?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_core_v1_k8s1_18?
  /** Number of seconds after the container has started before liveness probes are initiated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var initialDelaySeconds: Int?
  /** How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  @K8sDslMarker var periodSeconds: Int?
  /** Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1
for liveness and startup. Minimum value is 1. */
  @K8sDslMarker var successThreshold: Int?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_core_v1_k8s1_18?
  /** Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var timeoutSeconds: Int?
}