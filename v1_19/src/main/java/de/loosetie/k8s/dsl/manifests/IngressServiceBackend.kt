package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressServiceBackend_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Name is the referenced service. The service must exist in the same namespace as the Ingress object. */
  @K8sDslMarker var name: String?
  /** Port of the referenced service. A port name or port number is required for a IngressServiceBackend. */
  val port: ServiceBackendPort_networking_k8s_io_v1_k8s1_19?
}