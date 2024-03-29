package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("attacher", "nodeName", "source")
open class Volumeattachmentspec_storage_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: Volumeattachmentspec_storage_k8s_io_v1, HasParent {
  override var attacher: String? = null
  override var nodeName: String? = null
  override var source: VolumeAttachmentSource_storage_k8s_io_v1? = null
}