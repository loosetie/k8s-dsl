package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Apiservicestatus_apiregistration_k8s_io_v1_k8s1_20: K8sManifest {
  /** Current service state of apiService. */
  val conditions: List<APIServiceCondition_apiregistration_k8s_io_v1_k8s1_20>?
}