package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Volumeattachmentspec_storage_k8s_io_v1_k8s1_16: K8sManifest {
  /** Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by
GetPluginName(). */
  @K8sDslMarker var attacher: String?
  /** The node that the volume should be attached to. */
  @K8sDslMarker var nodeName: String?
  /** Source represents the volume that should be attached. */
  val source: VolumeAttachmentSource_storage_k8s_io_v1_k8s1_16?
}      
typealias Volumeattachmentspec_storage_k8s_io_v1_k8s1_17 = Volumeattachmentspec_storage_k8s_io_v1_k8s1_16       
typealias Volumeattachmentspec_storage_k8s_io_v1_k8s1_18 = Volumeattachmentspec_storage_k8s_io_v1_k8s1_17       
typealias Volumeattachmentspec_storage_k8s_io_v1_k8s1_19 = Volumeattachmentspec_storage_k8s_io_v1_k8s1_18       
typealias Volumeattachmentspec_storage_k8s_io_v1_k8s1_20 = Volumeattachmentspec_storage_k8s_io_v1_k8s1_19       
@K8sDslMarker
interface Volumeattachmentspec_storage_k8s_io_v1_k8s1_21: K8sManifest {
  /** Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by
GetPluginName(). */
  @K8sDslMarker var attacher: String?
  /** The node that the volume should be attached to. */
  @K8sDslMarker var nodeName: String?
  /** Source represents the volume that should be attached. */
  val source: VolumeAttachmentSource_storage_k8s_io_v1_k8s1_21?
}