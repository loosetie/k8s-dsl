package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Volumeattachmentspec_storage_k8s_io_v1: K8sManifest {
  /** attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by
GetPluginName(). */
  @K8sDslMarker var attacher: String?
  /** nodeName represents the node that the volume should be attached to. */
  @K8sDslMarker var nodeName: String?
  /** source represents the volume that should be attached. */
  val source: VolumeAttachmentSource_storage_k8s_io_v1?
}