package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourcePolicyRule_flowcontrol_apiserver_k8s_io_v1beta3: K8sManifest {
  /** `apiGroups` is a list of matching API groups and may not be empty. "`*`" matches all API groups and, if present, must be
the only entry. Required. */
  @K8sDslMarker var apiGroups: List<String>?
  /** `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the
resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the
`namespaces` field must contain a non-empty list. */
  @K8sDslMarker var clusterScope: Boolean?
  /** `namespaces` is a list of target namespaces that restricts matches. A request that specifies a target namespace matches
only if either (a) this list contains that target namespace or (b) this list contains "`*`". Note that "`*`" matches any
specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for
that). This list may be empty, but only if `clusterScope` is true. */
  @K8sDslMarker var namespaces: List<String>?
  /** `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource. For example, [
"services", "nodes/status" ]. This list may not be empty. "`*`" matches all resources and, if present, must be the only
entry. Required. */
  @K8sDslMarker var resources: List<String>?
  /** `verbs` is a list of matching verbs and may not be empty. "`*`" matches all verbs and, if present, must be the only
entry. Required. */
  @K8sDslMarker var verbs: List<String>?
}