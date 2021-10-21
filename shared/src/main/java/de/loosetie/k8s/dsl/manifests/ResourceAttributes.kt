package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ResourceAttributes_authorization_k8s_io_v1_k8s1_16: K8sManifest {
  /** Namespace is the namespace of the action being requested. Currently, there is no distinction between no namespace and
all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources ""
(empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview */
  @K8sDslMarker var namespace: String?
  /** Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all. */
  @K8sDslMarker var name: String?
  /** Group is the API Group of the Resource. "`*`" means all. */
  @K8sDslMarker var group: String?
  /** Resource is one of the existing resource types. "`*`" means all. */
  @K8sDslMarker var resource: String?
  /** Subresource is one of the existing resource types. "" means none. */
  @K8sDslMarker var subresource: String?
  /** Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy. "`*`" means all. */
  @K8sDslMarker var verb: String?
  /** Version is the API Version of the Resource. "`*`" means all. */
  @K8sDslMarker var version: String?
}      
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_17 = ResourceAttributes_authorization_k8s_io_v1_k8s1_16       
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_18 = ResourceAttributes_authorization_k8s_io_v1_k8s1_17       
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_19 = ResourceAttributes_authorization_k8s_io_v1_k8s1_18       
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_20 = ResourceAttributes_authorization_k8s_io_v1_k8s1_19       
typealias ResourceAttributes_authorization_k8s_io_v1_k8s1_21 = ResourceAttributes_authorization_k8s_io_v1_k8s1_20 