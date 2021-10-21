package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface EnvFromSource_core_v1_k8s1_16: K8sManifest {
  /** The ConfigMap to select from */
  val configMapRef: ConfigMapEnvSource_core_v1_k8s1_16?
  /** An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. */
  @K8sDslMarker var prefix: String?
  /** The Secret to select from */
  val secretRef: SecretEnvSource_core_v1_k8s1_16?
}      
typealias EnvFromSource_core_v1_k8s1_17 = EnvFromSource_core_v1_k8s1_16       
typealias EnvFromSource_core_v1_k8s1_18 = EnvFromSource_core_v1_k8s1_17       
typealias EnvFromSource_core_v1_k8s1_19 = EnvFromSource_core_v1_k8s1_18       
typealias EnvFromSource_core_v1_k8s1_20 = EnvFromSource_core_v1_k8s1_19       
typealias EnvFromSource_core_v1_k8s1_21 = EnvFromSource_core_v1_k8s1_20 