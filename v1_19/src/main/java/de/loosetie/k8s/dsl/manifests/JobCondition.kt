package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface JobCondition_batch_v1_k8s1_19: K8sManifest {
  /** Last time the condition was checked. */
  val lastProbeTime: Time_meta_v1_k8s1_19?
  /** Last time the condition transit from one status to another. */
  val lastTransitionTime: Time_meta_v1_k8s1_19?
  /** Human readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** (brief) reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of job condition, Complete or Failed. */
  @K8sDslMarker var type: String?
}