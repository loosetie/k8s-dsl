package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HostAlias_core_v1_k8s1_20: K8sManifest {
  /** Hostnames for the above IP address. */
  @K8sDslMarker var hostnames: List<String>?
  /** IP address of the host file entry. */
  @K8sDslMarker var ip: String?
}