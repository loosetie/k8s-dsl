package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface IngressRule_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from
the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply
to the IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.
Currently the port of an Ingress is implicitly :80 for http and :443 for https. Both these may change in the future.
Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress
routes all traffic based on the specified IngressRuleValue. Host can be "precise" which is a domain name without the
terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single
wildcard label (e.g. "`*`.foo.com"). The wildcard character '\`*`' must appear by itself as the first DNS label and
matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "`*`"). Requests will be matched
against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host
header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to
equal to the suffix (removing the first label) of the wildcard rule. */
  @K8sDslMarker var host: String?
  /**  */
  val http: HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19?
}