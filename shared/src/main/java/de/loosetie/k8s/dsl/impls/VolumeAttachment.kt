package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VolumeAttachment_storage_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachment_storage_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override lateinit var spec: Volumeattachmentspec_storage_k8s_io_v1_k8s1_16
  override var status: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VolumeAttachment_storage_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachment_storage_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override lateinit var spec: Volumeattachmentspec_storage_k8s_io_v1_k8s1_17
  override var status: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_17? = null
}
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_18Impl = VolumeAttachment_storage_k8s_io_v1_k8s1_17Impl
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_19Impl = VolumeAttachment_storage_k8s_io_v1_k8s1_18Impl
typealias VolumeAttachment_storage_k8s_io_v1_k8s1_20Impl = VolumeAttachment_storage_k8s_io_v1_k8s1_19Impl
@JsonPropertyOrder("apiVersion", "kind", "metadata", "spec", "status")
class VolumeAttachment_storage_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeAttachment_storage_k8s_io_v1_k8s1_21, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_21
  override lateinit var spec: Volumeattachmentspec_storage_k8s_io_v1_k8s1_21
  override var status: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_21? = null
}