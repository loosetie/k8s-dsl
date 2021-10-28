package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("inlineVolumeSpec", "persistentVolumeName")
class VolumeAttachmentSource_storage_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachmentSource_storage_k8s_io_v1_k8s1_16, HasParent {
  override var inlineVolumeSpec: Persistentvolumespec_core_v1_k8s1_16? = null
  override var persistentVolumeName: String? = null
}
typealias VolumeAttachmentSource_storage_k8s_io_v1_k8s1_17Impl = VolumeAttachmentSource_storage_k8s_io_v1_k8s1_16Impl
typealias VolumeAttachmentSource_storage_k8s_io_v1_k8s1_18Impl = VolumeAttachmentSource_storage_k8s_io_v1_k8s1_17Impl
typealias VolumeAttachmentSource_storage_k8s_io_v1_k8s1_19Impl = VolumeAttachmentSource_storage_k8s_io_v1_k8s1_18Impl
typealias VolumeAttachmentSource_storage_k8s_io_v1_k8s1_20Impl = VolumeAttachmentSource_storage_k8s_io_v1_k8s1_19Impl
@JsonPropertyOrder("inlineVolumeSpec", "persistentVolumeName")
class VolumeAttachmentSource_storage_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachmentSource_storage_k8s_io_v1_k8s1_21, HasParent {
  override var inlineVolumeSpec: Persistentvolumespec_core_v1_k8s1_21? = null
  override var persistentVolumeName: String? = null
}