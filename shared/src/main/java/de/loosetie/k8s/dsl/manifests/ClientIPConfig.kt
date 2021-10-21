package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ClientIPConfig_core_v1_k8s1_16: K8sManifest {
  /** timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if
ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours). */
  @K8sDslMarker var timeoutSeconds: Int?
}      
typealias ClientIPConfig_core_v1_k8s1_17 = ClientIPConfig_core_v1_k8s1_16       
typealias ClientIPConfig_core_v1_k8s1_18 = ClientIPConfig_core_v1_k8s1_17       
typealias ClientIPConfig_core_v1_k8s1_19 = ClientIPConfig_core_v1_k8s1_18       
typealias ClientIPConfig_core_v1_k8s1_20 = ClientIPConfig_core_v1_k8s1_19       
typealias ClientIPConfig_core_v1_k8s1_21 = ClientIPConfig_core_v1_k8s1_20 