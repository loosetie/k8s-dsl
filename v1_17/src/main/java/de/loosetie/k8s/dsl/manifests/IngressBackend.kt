package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressBackend_networking_k8s_io_v1beta1: K8sManifest {
  /** Specifies the name of the referenced service. */
  @K8sDslMarker var serviceName: String?
  /** Specifies the port of the referenced service. */
  var servicePort: de.loosetie.k8s.dsl.types.IntOrString?
}