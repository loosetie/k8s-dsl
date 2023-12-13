package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodFailurePolicyOnPodConditionsPattern_batch_v1: K8sManifest {
  /** Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals
the pod condition status. Defaults to True. */
  @K8sDslMarker var status: String?
  /** Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod
condition type. */
  @K8sDslMarker var type: String?
}