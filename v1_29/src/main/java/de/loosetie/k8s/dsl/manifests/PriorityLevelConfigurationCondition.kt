package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PriorityLevelConfigurationCondition_flowcontrol_apiserver_k8s_io_v1: K8sManifest {
  /** `lastTransitionTime` is the last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** `message` is a human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** `reason` is a unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** `status` is the status of the condition. Can be True, False, Unknown. Required. */
  @K8sDslMarker var status: String?
  /** `type` is the type of the condition. Required. */
  @K8sDslMarker var type: String?
}