package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("attachError", "attached", "attachmentMetadata", "detachError")
class Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16, HasParent {
  override var attachError: VolumeError_storage_k8s_io_v1_k8s1_16? = null
  override var attached: Boolean? = null
  override var attachmentMetadata: Any? = null
  override var detachError: VolumeError_storage_k8s_io_v1_k8s1_16? = null
}
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_17Impl = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_16Impl
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_18Impl = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_17Impl
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19Impl = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_18Impl
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_20Impl = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_19Impl
typealias Volumeattachmentstatus_storage_k8s_io_v1_k8s1_21Impl = Volumeattachmentstatus_storage_k8s_io_v1_k8s1_20Impl