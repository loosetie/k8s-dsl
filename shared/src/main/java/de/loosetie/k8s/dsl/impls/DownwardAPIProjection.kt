package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("items")
class DownwardAPIProjection_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: DownwardAPIProjection_core_v1_k8s1_16, HasParent {
  override var items: List<DownwardAPIVolumeFile_core_v1_k8s1_16>? = null
}
typealias DownwardAPIProjection_core_v1_k8s1_17Impl = DownwardAPIProjection_core_v1_k8s1_16Impl
typealias DownwardAPIProjection_core_v1_k8s1_18Impl = DownwardAPIProjection_core_v1_k8s1_17Impl
typealias DownwardAPIProjection_core_v1_k8s1_19Impl = DownwardAPIProjection_core_v1_k8s1_18Impl
typealias DownwardAPIProjection_core_v1_k8s1_20Impl = DownwardAPIProjection_core_v1_k8s1_19Impl
typealias DownwardAPIProjection_core_v1_k8s1_21Impl = DownwardAPIProjection_core_v1_k8s1_20Impl