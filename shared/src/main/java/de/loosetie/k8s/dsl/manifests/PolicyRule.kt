package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16: K8sManifest {
  /** APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are specified, any action
requested against one of the enumerated resources in any API group will be allowed. */
  @K8sDslMarker var apiGroups: List<String>?
  /** NonResourceURLs is a set of partial urls that a user should have access to. `*`s are allowed, but only as the full,
final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles
referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or
non-resource URL paths (such as "/api"), but not both. */
  @K8sDslMarker var nonResourceURLs: List<String>?
  /** ResourceNames is an optional white list of names that the rule applies to. An empty set means that everything is
allowed. */
  @K8sDslMarker var resourceNames: List<String>?
  /** Resources is a list of resources this rule applies to. ResourceAll represents all resources. */
  @K8sDslMarker var resources: List<String>?
  /** Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule. VerbAll
represents all kinds. */
  @K8sDslMarker var verbs: List<String>?
}      
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17 = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_16       
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_18 = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_17       
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19 = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_18       
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_20 = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_19       
typealias PolicyRule_rbac_authorization_k8s_io_v1_k8s1_21 = PolicyRule_rbac_authorization_k8s_io_v1_k8s1_20 