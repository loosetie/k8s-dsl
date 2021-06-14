package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HTTPIngressPath_networking_k8s_io_v1beta1: K8sManifest {
  /** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
  val backend: IngressBackend_networking_k8s_io_v1beta1?
  /** Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl
syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the
conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults
to a catch all sending traffic to the backend. */
  @K8sDslMarker var path: String?
}