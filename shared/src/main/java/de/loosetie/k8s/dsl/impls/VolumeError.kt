package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("message", "time")
class VolumeError_storage_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeError_storage_k8s_io_v1_k8s1_16, HasParent {
  override var message: String? = null
  override var time: Time_meta_v1_k8s1_16? = null
}
typealias VolumeError_storage_k8s_io_v1_k8s1_17Impl = VolumeError_storage_k8s_io_v1_k8s1_16Impl
typealias VolumeError_storage_k8s_io_v1_k8s1_18Impl = VolumeError_storage_k8s_io_v1_k8s1_17Impl
typealias VolumeError_storage_k8s_io_v1_k8s1_19Impl = VolumeError_storage_k8s_io_v1_k8s1_18Impl
typealias VolumeError_storage_k8s_io_v1_k8s1_20Impl = VolumeError_storage_k8s_io_v1_k8s1_19Impl
typealias VolumeError_storage_k8s_io_v1_k8s1_21Impl = VolumeError_storage_k8s_io_v1_k8s1_20Impl