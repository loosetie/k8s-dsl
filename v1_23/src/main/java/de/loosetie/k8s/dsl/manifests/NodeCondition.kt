package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeCondition_core_v1: K8sManifest {
  /** Last time we got an update on a given condition. */
  val lastHeartbeatTime: Time_meta_v1?
  /** Last time the condition transit from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** Human readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** (brief) reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of node condition. Possible enum values: - `"DiskPressure"` means the kubelet is under pressure due to insufficient
available disk. - `"MemoryPressure"` means the kubelet is under pressure due to insufficient available memory. -
`"NetworkUnavailable"` means that network for the node is not correctly configured. - `"PIDPressure"` means the kubelet
is under pressure due to insufficient available PID. - `"Ready"` means kubelet is healthy and ready to accept pods. */
  @K8sDslMarker var type: String?
}