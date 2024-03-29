package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PersistentVolumeClaimCondition_core_v1: K8sManifest {
  /** Last time we probed the condition. */
  val lastProbeTime: Time_meta_v1?
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If
it reports "ResizeStarted" that means the underlying persistent volume is being resized. */
  @K8sDslMarker var reason: String?
  /**  */
  @K8sDslMarker var status: String?
  /** Possible enum values: - `"FileSystemResizePending"` - controller resize is finished and a file system resize is pending
on node - `"Resizing"` - a user trigger resize of pvc has been started */
  @K8sDslMarker var type: String?
}