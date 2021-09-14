package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface APIServiceCondition_apiregistration_k8s_io_v1_k8s1_21: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1_k8s1_21?
  /** Human-readable message indicating details about last transition. */
  @K8sDslMarker var message: String?
  /** Unique, one-word, CamelCase reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status is the status of the condition. Can be True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type is the type of the condition. */
  @K8sDslMarker var type: String?
}