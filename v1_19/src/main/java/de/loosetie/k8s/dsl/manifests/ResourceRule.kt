package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ResourceRule_authorization_k8s_io_v1_k8s1_19: K8sManifest {
  /** APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are specified, any action
requested against one of the enumerated resources in any API group will be allowed. "`*`" means all. */
  @K8sDslMarker var apiGroups: List<String>?
  /** ResourceNames is an optional white list of names that the rule applies to. An empty set means that everything is
allowed. "`*`" means all. */
  @K8sDslMarker var resourceNames: List<String>?
  /** Resources is a list of resources this rule applies to. "`*`" means all in the specified apiGroups. "`*`/foo" represents
the subresource 'foo' for all resources in the specified apiGroups. */
  @K8sDslMarker var resources: List<String>?
  /** Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy. "`*`" means all. */
  @K8sDslMarker var verbs: List<String>?
}