package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface SecretEnvSource_core_v1_k8s1_16: K8sManifest {
  /** Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  @K8sDslMarker var name: String?
  /** Specify whether the Secret must be defined */
  @K8sDslMarker var optional: Boolean?
}      
typealias SecretEnvSource_core_v1_k8s1_17 = SecretEnvSource_core_v1_k8s1_16       
typealias SecretEnvSource_core_v1_k8s1_18 = SecretEnvSource_core_v1_k8s1_17       
typealias SecretEnvSource_core_v1_k8s1_19 = SecretEnvSource_core_v1_k8s1_18       
typealias SecretEnvSource_core_v1_k8s1_20 = SecretEnvSource_core_v1_k8s1_19       
typealias SecretEnvSource_core_v1_k8s1_21 = SecretEnvSource_core_v1_k8s1_20 