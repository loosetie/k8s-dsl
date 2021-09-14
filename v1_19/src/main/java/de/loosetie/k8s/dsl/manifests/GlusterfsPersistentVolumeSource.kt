package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface GlusterfsPersistentVolumeSource_core_v1_k8s1_19: K8sManifest {
  /** EndpointsName is the endpoint name that details Glusterfs topology. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var endpoints: String?
  /** EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace
defaults to the same namespace as the bound PVC. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var endpointsNamespace: String?
  /** Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var path: String?
  /** ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info:
https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod */
  @K8sDslMarker var readOnly: Boolean?
}