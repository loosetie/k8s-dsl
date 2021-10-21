package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ConfigMapEnvSource_core_v1_k8s1_16: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the ConfigMap must be defined */
  @K8sDslMarker var optional: Boolean?
}      
typealias ConfigMapEnvSource_core_v1_k8s1_17 = ConfigMapEnvSource_core_v1_k8s1_16       
typealias ConfigMapEnvSource_core_v1_k8s1_18 = ConfigMapEnvSource_core_v1_k8s1_17       
typealias ConfigMapEnvSource_core_v1_k8s1_19 = ConfigMapEnvSource_core_v1_k8s1_18       
typealias ConfigMapEnvSource_core_v1_k8s1_20 = ConfigMapEnvSource_core_v1_k8s1_19       
typealias ConfigMapEnvSource_core_v1_k8s1_21 = ConfigMapEnvSource_core_v1_k8s1_20 