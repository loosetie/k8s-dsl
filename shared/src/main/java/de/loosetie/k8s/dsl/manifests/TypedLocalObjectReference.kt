package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface TypedLocalObjectReference_core_v1_k8s1_16: K8sManifest {
  /** Kind is the type of resource being referenced */
  @K8sDslMarker var kind: String?
  /** Name is the name of resource being referenced */
  @K8sDslMarker var name: String?
  /** APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the
core API group. For any other third-party types, APIGroup is required. */
  @K8sDslMarker var apiGroup: String?
}      
typealias TypedLocalObjectReference_core_v1_k8s1_17 = TypedLocalObjectReference_core_v1_k8s1_16       
typealias TypedLocalObjectReference_core_v1_k8s1_18 = TypedLocalObjectReference_core_v1_k8s1_17       
typealias TypedLocalObjectReference_core_v1_k8s1_19 = TypedLocalObjectReference_core_v1_k8s1_18       
typealias TypedLocalObjectReference_core_v1_k8s1_20 = TypedLocalObjectReference_core_v1_k8s1_19       
typealias TypedLocalObjectReference_core_v1_k8s1_21 = TypedLocalObjectReference_core_v1_k8s1_20 