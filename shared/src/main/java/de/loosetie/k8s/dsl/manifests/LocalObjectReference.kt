package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface LocalObjectReference_core_v1_k8s1_16: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
}      
typealias LocalObjectReference_core_v1_k8s1_17 = LocalObjectReference_core_v1_k8s1_16       
typealias LocalObjectReference_core_v1_k8s1_18 = LocalObjectReference_core_v1_k8s1_17       
typealias LocalObjectReference_core_v1_k8s1_19 = LocalObjectReference_core_v1_k8s1_18       
typealias LocalObjectReference_core_v1_k8s1_20 = LocalObjectReference_core_v1_k8s1_19       
typealias LocalObjectReference_core_v1_k8s1_21 = LocalObjectReference_core_v1_k8s1_20 