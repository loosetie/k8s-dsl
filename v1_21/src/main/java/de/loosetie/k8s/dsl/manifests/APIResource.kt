package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface APIResource_meta_v1_k8s1_21: K8sManifest {
  /** kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo') */
  @K8sDslMarker var kind: String?
  /** name is the plural name of the resource. */
  @K8sDslMarker var name: String?
  /** categories is a list of the grouped resources this resource belongs to (e.g. 'all') */
  @K8sDslMarker var categories: List<String>?
  /** group is the preferred group of the resource. Empty implies the group of the containing resource list. For subresources,
this may have a different value, for example: Scale". */
  @K8sDslMarker var group: String?
  /** namespaced indicates if a resource is namespaced or not. */
  @K8sDslMarker var namespaced: Boolean?
  /** shortNames is a list of suggested short names of the resource. */
  @K8sDslMarker var shortNames: List<String>?
  /** singularName is the singular name of the resource. This allows clients to handle plural and singular opaquely. The
singularName is more correct for reporting status on a single item and both singular and plural are allowed from the
kubectl CLI interface. */
  @K8sDslMarker var singularName: String?
  /** The hash value of the storage version, the version this resource is converted to when written to the data store. Value
must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may
change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate
is enabled. This field will remain optional even if it graduates. */
  @K8sDslMarker var storageVersionHash: String?
  /** verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete,
deletecollection, and proxy) */
  @K8sDslMarker var verbs: List<String>?
  /** version is the preferred version of the resource. Empty implies the version of the containing resource list For
subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's
group)". */
  @K8sDslMarker var version: String?
}