package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1: K8sManifest {
  /** Last time the condition transitioned from one status to another. */
  val lastTransitionTime: Time_meta_v1?
  /** A human readable message indicating details about the transition. */
  @K8sDslMarker var message: String?
  /** If set, this represents the .metadata.generation that the condition was set based upon. */
  @K8sDslMarker var observedGeneration: Int?
  /** The reason for the condition's last transition. */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of the condition. */
  @K8sDslMarker var type: String?
}