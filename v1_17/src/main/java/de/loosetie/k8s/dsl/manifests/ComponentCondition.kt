package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ComponentCondition_core_v1: K8sManifest {
  /** Condition error code for a component. For example, a health check error code. */
  @K8sDslMarker var error: String?
  /** Message about the condition for a component. For example, information about a health check. */
  @K8sDslMarker var message: String?
  /** Status of the condition for a component. Valid values for "Healthy": "True", "False", or "Unknown". */
  @K8sDslMarker var status: String?
  /** Type of condition for a component. Valid value: "Healthy" */
  @K8sDslMarker var type: String?
}