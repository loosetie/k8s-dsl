package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
  val backend: IngressBackend_networking_k8s_io_v1beta1_k8s1_16?
  /** Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl
syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the
conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults
to a catch all sending traffic to the backend. */
  @K8sDslMarker var path: String?
}      
typealias HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_17 = HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16       
@K8sDslMarker
interface HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_18: HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_17 {
  /** Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the
conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from
incoming requests are matched. */
  override var path: String?
  /** PathType determines the interpretation of the Path matching. PathType can be one of the following values: `*` Exact:
Matches the URL path exactly. `*` Prefix: Matches based on a URL path prefix split by '/'. Matching is done on a path
element by element basis. A path element refers is the list of labels in the path split by the '/' separator. A request
is a match for path p if every p is an element-wise prefix of p of the request path. Note that if the last element of
the path is a substring of the last element in request path, it is not a match (e.g. /foo/bar matches /foo/bar/baz, but
does not match /foo/barbaz). `*` ImplementationSpecific: Interpretation of the Path matching is up to the IngressClass.
Implementations can treat this as a separate PathType or treat it identically to Prefix or Exact path types.
Implementations are required to support all path types. Defaults to ImplementationSpecific. */
  @K8sDslMarker var pathType: String?
}      
@K8sDslMarker
interface HTTPIngressPath_networking_k8s_io_v1_k8s1_19: K8sManifest {
  /** Backend defines the referenced service endpoint to which the traffic will be forwarded to. */
  val backend: IngressBackend_networking_k8s_io_v1_k8s1_19?
  /** Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the
conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. When unspecified, all paths from
incoming requests are matched. */
  @K8sDslMarker var path: String?
  /** PathType determines the interpretation of the Path matching. PathType can be one of the following values: `*` Exact:
Matches the URL path exactly. `*` Prefix: Matches based on a URL path prefix split by '/'. Matching is done on a path
element by element basis. A path element refers is the list of labels in the path split by the '/' separator. A request
is a match for path p if every p is an element-wise prefix of p of the request path. Note that if the last element of
the path is a substring of the last element in request path, it is not a match (e.g. /foo/bar matches /foo/bar/baz, but
does not match /foo/barbaz). `*` ImplementationSpecific: Interpretation of the Path matching is up to the IngressClass.
Implementations can treat this as a separate PathType or treat it identically to Prefix or Exact path types.
Implementations are required to support all path types. */
  @K8sDslMarker var pathType: String?
}

      
typealias HTTPIngressPath_networking_k8s_io_v1_k8s1_20 = HTTPIngressPath_networking_k8s_io_v1_k8s1_19 

      
typealias HTTPIngressPath_networking_k8s_io_v1_k8s1_21 = HTTPIngressPath_networking_k8s_io_v1_k8s1_20 

