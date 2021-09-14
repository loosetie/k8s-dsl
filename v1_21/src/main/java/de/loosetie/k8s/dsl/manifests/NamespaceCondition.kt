package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NamespaceCondition_core_v1_k8s1_21: K8sManifest {
  /**  */
  val lastTransitionTime: Time_meta_v1_k8s1_21?
  /**  */
  @K8sDslMarker var message: String?
  /**  */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of namespace controller condition. */
  @K8sDslMarker var type: String?
}