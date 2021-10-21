package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface SessionAffinityConfig_core_v1_k8s1_16: K8sManifest {
  /** clientIP contains the configurations of Client IP based session affinity. */
  val clientIP: ClientIPConfig_core_v1_k8s1_16?
}      
typealias SessionAffinityConfig_core_v1_k8s1_17 = SessionAffinityConfig_core_v1_k8s1_16       
typealias SessionAffinityConfig_core_v1_k8s1_18 = SessionAffinityConfig_core_v1_k8s1_17       
typealias SessionAffinityConfig_core_v1_k8s1_19 = SessionAffinityConfig_core_v1_k8s1_18       
typealias SessionAffinityConfig_core_v1_k8s1_20 = SessionAffinityConfig_core_v1_k8s1_19       
typealias SessionAffinityConfig_core_v1_k8s1_21 = SessionAffinityConfig_core_v1_k8s1_20 