package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "devicePath")
class VolumeDevice_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeDevice_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var devicePath: String? = null
}
typealias VolumeDevice_core_v1_k8s1_17Impl = VolumeDevice_core_v1_k8s1_16Impl
typealias VolumeDevice_core_v1_k8s1_18Impl = VolumeDevice_core_v1_k8s1_17Impl
typealias VolumeDevice_core_v1_k8s1_19Impl = VolumeDevice_core_v1_k8s1_18Impl
typealias VolumeDevice_core_v1_k8s1_20Impl = VolumeDevice_core_v1_k8s1_19Impl
typealias VolumeDevice_core_v1_k8s1_21Impl = VolumeDevice_core_v1_k8s1_20Impl