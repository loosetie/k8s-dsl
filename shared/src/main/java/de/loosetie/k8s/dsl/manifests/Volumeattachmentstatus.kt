package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16: K8sManifest {
  /** The last error encountered during attach operation, if any. This field must only be set by the entity completing the
attach operation, i.e. the external-attacher. */
  val attachError: VolumeError_storage_k8s_io_v1_k8s1_16?
  /** Indicates the volume is successfully attached. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attached: Boolean?
  /** Upon successful attach, this field is populated with any information returned by the attach operation that must be
passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attachmentMetadata: Any?
  /** The last error encountered during detach operation, if any. This field must only be set by the entity completing the
detach operation, i.e. the external-attacher. */
  val detachError: VolumeError_storage_k8s_io_v1_k8s1_16?
}      
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_17 = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16       
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_18 = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_17       
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19 = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_18       
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_20 = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19       
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_21 = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_20 