package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressBackend_networking_k8s_io_v1: K8sManifest {
  /** resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is
specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service". */
  val resource: TypedLocalObjectReference_core_v1?
  /** service references a service as a backend. This is a mutually exclusive setting with "Resource". */
  val service: IngressServiceBackend_networking_k8s_io_v1?
}