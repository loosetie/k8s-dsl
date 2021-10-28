package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("defaultMode", "items")
class DownwardAPIVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIVolumeSource_core_v1_k8s1_16, HasParent {
  override var defaultMode: Int? = null
  override var items: List<DownwardAPIVolumeFile_core_v1_k8s1_16>? = null
}
typealias DownwardAPIVolumeSource_core_v1_k8s1_17Impl = DownwardAPIVolumeSource_core_v1_k8s1_16Impl
typealias DownwardAPIVolumeSource_core_v1_k8s1_18Impl = DownwardAPIVolumeSource_core_v1_k8s1_17Impl
@JsonPropertyOrder("defaultMode", "items")
class DownwardAPIVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIVolumeSource_core_v1_k8s1_19, HasParent {
  override var defaultMode: Int? = null
  override var items: List<DownwardAPIVolumeFile_core_v1_k8s1_19>? = null
}
typealias DownwardAPIVolumeSource_core_v1_k8s1_20Impl = DownwardAPIVolumeSource_core_v1_k8s1_19Impl
typealias DownwardAPIVolumeSource_core_v1_k8s1_21Impl = DownwardAPIVolumeSource_core_v1_k8s1_20Impl