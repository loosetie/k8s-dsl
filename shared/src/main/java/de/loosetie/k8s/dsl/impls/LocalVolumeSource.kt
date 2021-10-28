package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "path")
class LocalVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: LocalVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var path: String? = null
}
typealias LocalVolumeSource_core_v1_k8s1_17Impl = LocalVolumeSource_core_v1_k8s1_16Impl
typealias LocalVolumeSource_core_v1_k8s1_18Impl = LocalVolumeSource_core_v1_k8s1_17Impl
typealias LocalVolumeSource_core_v1_k8s1_19Impl = LocalVolumeSource_core_v1_k8s1_18Impl
typealias LocalVolumeSource_core_v1_k8s1_20Impl = LocalVolumeSource_core_v1_k8s1_19Impl
typealias LocalVolumeSource_core_v1_k8s1_21Impl = LocalVolumeSource_core_v1_k8s1_20Impl