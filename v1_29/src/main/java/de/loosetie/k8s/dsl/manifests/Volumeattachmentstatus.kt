package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Volumeattachmentstatus_storage_k8s_io_v1: K8sManifest {
  /** attachError represents the last error encountered during attach operation, if any. This field must only be set by the
entity completing the attach operation, i.e. the external-attacher. */
  val attachError: VolumeError_storage_k8s_io_v1?
  /** attached indicates the volume is successfully attached. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attached: Boolean?
  /** attachmentMetadata is populated with any information returned by the attach operation, upon successful attach, that must
be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach
operation, i.e. the external-attacher. */
  @K8sDslMarker var attachmentMetadata: Any?
  /** detachError represents the last error encountered during detach operation, if any. This field must only be set by the
entity completing the detach operation, i.e. the external-attacher. */
  val detachError: VolumeError_storage_k8s_io_v1?
}