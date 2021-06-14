package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressRule_networking_k8s_io_v1beta1: K8sManifest {
  /** Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from
the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply
to the IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.
Currently the port of an Ingress is implicitly :80 for http and :443 for https. Both these may change in the future.
Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress
routes all traffic based on the specified IngressRuleValue. */
  @K8sDslMarker var host: String?
  /**  */
  val http: HTTPIngressRuleValue_networking_k8s_io_v1beta1?
}