package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface IngressBackend_networking_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** Specifies the name of the referenced service. */
  @K8sDslMarker var serviceName: String?
  /** Specifies the port of the referenced service. */
  var servicePort: de.loosetie.k8s.dsl.types.IntOrString?
}      
typealias IngressBackend_networking_k8s_io_v1beta1_k8s1_17 = IngressBackend_networking_k8s_io_v1beta1_k8s1_16       
@K8sDslMarker
interface IngressBackend_networking_k8s_io_v1beta1_k8s1_18: IngressBackend_networking_k8s_io_v1beta1_k8s1_17 {
  /** Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is
specified, serviceName and servicePort must not be specified. */
  val resource: TypedLocalObjectReference_core_v1_k8s1_18?
}      
@K8sDslMarker
interface IngressBackend_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is
specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service". */
  val resource: TypedLocalObjectReference_core_v1_k8s1_19?
  /** Service references a Service as a Backend. This is a mutually exclusive setting with "Resource". */
  val service: IngressServiceBackend_networking_k8s_io_v1_k8s1_19?
}      
typealias IngressBackend_networking_k8s_io_v1_k8s1_20 = IngressBackend_networking_k8s_io_v1_k8s1_19       
typealias IngressBackend_networking_k8s_io_v1_k8s1_21 = IngressBackend_networking_k8s_io_v1_k8s1_20 