package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeAddress_core_v1: K8sManifest {
  /** The node address. */
  @K8sDslMarker var address: String?
  /** Node address type, one of Hostname, ExternalIP or InternalIP. */
  @K8sDslMarker var type: String?
}