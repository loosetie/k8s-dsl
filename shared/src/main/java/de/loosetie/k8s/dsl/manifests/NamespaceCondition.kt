package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface NamespaceCondition_core_v1_k8s1_16: K8sManifest {
  /**  */
  val lastTransitionTime: Time_meta_v1_k8s1_16?
  /**  */
  @K8sDslMarker var message: String?
  /**  */
  @K8sDslMarker var reason: String?
  /** Status of the condition, one of True, False, Unknown. */
  @K8sDslMarker var status: String?
  /** Type of namespace controller condition. */
  @K8sDslMarker var type: String?
}      
typealias NamespaceCondition_core_v1_k8s1_17 = NamespaceCondition_core_v1_k8s1_16       
typealias NamespaceCondition_core_v1_k8s1_18 = NamespaceCondition_core_v1_k8s1_17       
typealias NamespaceCondition_core_v1_k8s1_19 = NamespaceCondition_core_v1_k8s1_18       
typealias NamespaceCondition_core_v1_k8s1_20 = NamespaceCondition_core_v1_k8s1_19       
typealias NamespaceCondition_core_v1_k8s1_21 = NamespaceCondition_core_v1_k8s1_20 