package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20: K8sManifest {
  /** The ID of the reporting API server. */
  @K8sDslMarker var apiServerID: String?
  /** The API server can decode objects encoded in these versions. The encodingVersion must be included in the
decodableVersions. */
  @K8sDslMarker var decodableVersions: List<String>?
  /** The API server encodes the object to this version when persisting it in the backend (e.g., etcd). */
  @K8sDslMarker var encodingVersion: String?
}      
typealias ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_21 = ServerStorageVersion_internal_apiserver_k8s_io_v1alpha1_k8s1_20 