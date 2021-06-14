package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodCondition_core_v1: K8sManifest {
  /** Last time we probed the condition. */
  val lastProbeTime: Time_meta_v1?
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status is the status of the condition. Can be True, False, Unknown. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var status: String?
  /** Type is the type of the condition. More info:
https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions */
  @K8sDslMarker var type: String?
}