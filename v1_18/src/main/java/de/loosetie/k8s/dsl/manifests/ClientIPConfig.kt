package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ClientIPConfig_core_v1_k8s1_18: K8sManifest {
  /** timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if
ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours). */
  @K8sDslMarker var timeoutSeconds: Int?
}