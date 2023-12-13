package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Storageversionstatus_internal_apiserver_k8s_io_v1alpha1: K8sManifest {
  /** If all API server instances agree on the same encoding storage version, then this field is set to that version.
Otherwise this field is left empty. API servers should finish updating its storageVersionStatus entry before serving
write operations, so that this field will be in sync with the reality. */
  @K8sDslMarker var commonEncodingVersion: String?
  /** The latest available observations of the storageVersion's state. */
  val conditions: List<StorageVersionCondition_internal_apiserver_k8s_io_v1alpha1>?
  /** The reported versions per API server instance. */
  val storageVersions: List<ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1>?
}