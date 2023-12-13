package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface JobCondition_batch_v1: K8sManifest {
  /** Last time the condition was checked. */
  val lastProbeTime: Time_meta_v1?
  /** Last time the condition transit from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** Human readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** (brief) reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of job condition, Complete or Failed. Possible enum values: - `"Complete"` means the job has completed its
execution. - `"Failed"` means the job has failed its execution. - `"Suspended"` means the job has been suspended. */
  @K8sDslMarker var type: String?
}