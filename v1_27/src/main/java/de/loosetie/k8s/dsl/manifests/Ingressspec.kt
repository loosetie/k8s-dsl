package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Ingressspec_networking_k8s_io_v1: K8sManifest {
  /** defaultBackend is the backend that should handle requests that don't match any rule. If Rules are not specified,
DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the
rules will be up to the Ingress controller. */
  val defaultBackend: IngressBackend_networking_k8s_io_v1?
  /** ingressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to
know whether they should be serving this Ingress resource, by a transitive connection (controller -> IngressClass ->
Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally
defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and
Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is
officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if
present. */
  @K8sDslMarker var ingressClassName: String?
  /** rules is a list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to
the default backend. */
  val rules: List<IngressRule_networking_k8s_io_v1>?
  /** tls represents the TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of
this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through
the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI. */
  val tls: List<IngressTLS_networking_k8s_io_v1>?
}