package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface SessionAffinityConfig_core_v1_k8s1_19: K8sManifest {
  /** clientIP contains the configurations of Client IP based session affinity. */
  val clientIP: ClientIPConfig_core_v1_k8s1_19?
}