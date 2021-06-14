package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Ingressspec_networking_k8s_io_v1beta1: K8sManifest {
  /** A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be
specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default. */
  val backend: IngressBackend_networking_k8s_io_v1beta1?
  /** A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the
default backend. */
  val rules: List<IngressRule_networking_k8s_io_v1beta1>?
  /** TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify
different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI. */
  val tls: List<IngressTLS_networking_k8s_io_v1beta1>?
}