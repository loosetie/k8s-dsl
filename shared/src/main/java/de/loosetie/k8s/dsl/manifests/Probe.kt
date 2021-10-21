package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Probe_core_v1_k8s1_16: K8sManifest {
  /** One and only one of the following should be specified. Exec specifies the action to take. */
  val exec: ExecAction_core_v1_k8s1_16?
  /** Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
is 1. */
  @K8sDslMarker var failureThreshold: Int?
  /** HTTPGet specifies the http request to perform. */
  val httpGet: HTTPGetAction_core_v1_k8s1_16?
  /** Number of seconds after the container has started before liveness probes are initiated. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var initialDelaySeconds: Int?
  /** How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  @K8sDslMarker var periodSeconds: Int?
  /** Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1
for liveness and startup. Minimum value is 1. */
  @K8sDslMarker var successThreshold: Int?
  /** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  val tcpSocket: TCPSocketAction_core_v1_k8s1_16?
  /** Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  @K8sDslMarker var timeoutSeconds: Int?
}      
typealias Probe_core_v1_k8s1_17 = Probe_core_v1_k8s1_16       
typealias Probe_core_v1_k8s1_18 = Probe_core_v1_k8s1_17       
typealias Probe_core_v1_k8s1_19 = Probe_core_v1_k8s1_18       
typealias Probe_core_v1_k8s1_20 = Probe_core_v1_k8s1_19       
@K8sDslMarker
interface Probe_core_v1_k8s1_21: Probe_core_v1_k8s1_20 {
  /** Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration
in seconds after the processes running in the pod are sent a termination signal and the time when the processes are
forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value
is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the
pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no
opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. */
  @K8sDslMarker var terminationGracePeriodSeconds: Int?
}