package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("defaultMode", "sources")
class ProjectedVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ProjectedVolumeSource_core_v1_k8s1_16, HasParent {
  override var defaultMode: Int? = null
  override var sources: List<VolumeProjection_core_v1_k8s1_16>? = null
}
typealias ProjectedVolumeSource_core_v1_k8s1_17Impl = ProjectedVolumeSource_core_v1_k8s1_16Impl
typealias ProjectedVolumeSource_core_v1_k8s1_18Impl = ProjectedVolumeSource_core_v1_k8s1_17Impl
@JsonPropertyOrder("defaultMode", "sources")
class ProjectedVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ProjectedVolumeSource_core_v1_k8s1_19, HasParent {
  override var defaultMode: Int? = null
  override var sources: List<VolumeProjection_core_v1_k8s1_19>? = null
}
typealias ProjectedVolumeSource_core_v1_k8s1_20Impl = ProjectedVolumeSource_core_v1_k8s1_19Impl
typealias ProjectedVolumeSource_core_v1_k8s1_21Impl = ProjectedVolumeSource_core_v1_k8s1_20Impl