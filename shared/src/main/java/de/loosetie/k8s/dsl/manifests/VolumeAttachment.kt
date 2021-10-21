package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface VolumeAttachment_storage_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VolumeAttachment"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. */
  val spec: Volumeattachmentspec_storage_k8s_io_v1_k8s1_16
  /** Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the
external-attacher. */
  val status: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16?
}      
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_17 = VolumeAttachment_storage_k8s_io_v1_k8s1_16       
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_18 = VolumeAttachment_storage_k8s_io_v1_k8s1_17       
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_19 = VolumeAttachment_storage_k8s_io_v1_k8s1_18       
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_20 = VolumeAttachment_storage_k8s_io_v1_k8s1_19       
@K8sDslMarker
interface VolumeAttachment_storage_k8s_io_v1_k8s1_21: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "storage.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "VolumeAttachment"
  /** Standard object metadata. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata */
  val metadata: ObjectMeta_meta_v1_k8s1_21
  /** Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. */
  val spec: Volumeattachmentspec_storage_k8s_io_v1_k8s1_21
  /** Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the
external-attacher. */
  val status: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_21?
}