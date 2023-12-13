package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface StorageClass_storage_k8s_io_v1: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "StorageClass"
  /** Standard object's metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1
  /** allowVolumeExpansion shows whether the storage class allow volume expand. */
  @K8sDslMarker var allowVolumeExpansion: Boolean?
  /** allowedTopologies restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines
its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction.
This field is only honored by servers that enable the VolumeScheduling feature. */
  val allowedTopologies: List<TopologySelectorTerm_core_v1>?
  /** mountOptions controls the mountOptions for dynamically provisioned PersistentVolumes of this storage class. e.g. ["ro",
"soft"]. Not validated - mount of the PVs will simply fail if one is invalid. */
  @K8sDslMarker var mountOptions: List<String>?
  /** parameters holds the parameters for the provisioner that should create volumes of this storage class. */
  @K8sDslMarker var parameters: Any?
  /** provisioner indicates the type of the provisioner. */
  @K8sDslMarker var provisioner: String?
  /** reclaimPolicy controls the reclaimPolicy for dynamically provisioned PersistentVolumes of this storage class. Defaults
to Delete. */
  @K8sDslMarker var reclaimPolicy: String?
  /** volumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound. When unset,
VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature. */
  @K8sDslMarker var volumeBindingMode: String?
}