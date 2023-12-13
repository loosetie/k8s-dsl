package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HorizontalPodAutoscalerCondition_autoscaling_v2: K8sManifest {
  /** lastTransitionTime is the last time the condition transitioned from one status to another */
  val lastTransitionTime: Time_meta_v1?
  /** message is a human-readable explanation containing details about the transition */
  @K8sDslMarker var message: String?
  /** reason is the reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** status is the status of the condition (True, False, Unknown) */
  @K8sDslMarker var status: String?
  /** type describes the current condition */
  @K8sDslMarker var type: String?
}