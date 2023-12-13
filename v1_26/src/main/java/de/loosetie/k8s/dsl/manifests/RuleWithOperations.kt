package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface RuleWithOperations_admissionregistration_k8s_io_v1: K8sManifest {
  /** APIGroups is the API groups the resources belong to. '\`*`' is all groups. If '\`*`' is present, the length of the slice
must be one. Required. */
  @K8sDslMarker var apiGroups: List<String>?
  /** APIVersions is the API versions the resources belong to. '\`*`' is all versions. If '\`*`' is present, the length of the
slice must be one. Required. */
  @K8sDslMarker var apiVersions: List<String>?
  /** Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or `*` for all of those
operations and any future admission operations that are added. If '\`*`' is present, the length of the slice must be
one. Required. */
  @K8sDslMarker var operations: List<String>?
  /** Resources is a list of resources this rule applies to. For example: 'pods' means pods. 'pods/log' means the log
subresource of pods. '\`*`' means all resources, but not subresources. 'pods/\`*`' means all subresources of pods.
'\`*`/scale' means all scale subresources. '\`*`/\`*`' means all resources and their subresources. If wildcard is
present, the validation rule will ensure resources do not overlap with each other. Depending on the enclosing object,
subresources might not be allowed. Required. */
  @K8sDslMarker var resources: List<String>?
  /** scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "`*`" "Cluster" means that only
cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only
namespaced resources will match this rule. "`*`" means that there are no scope restrictions. Subresources match the
scope of their parent resource. Default is "`*`". */
  @K8sDslMarker var scope: String?
}