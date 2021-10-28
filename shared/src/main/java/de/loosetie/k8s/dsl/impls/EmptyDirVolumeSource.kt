package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("medium", "sizeLimit")
class EmptyDirVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: EmptyDirVolumeSource_core_v1_k8s1_16, HasParent {
  override var medium: String? = null
  override var sizeLimit: Quantity_core_resource_k8s1_16? = null
}
typealias EmptyDirVolumeSource_core_v1_k8s1_17Impl = EmptyDirVolumeSource_core_v1_k8s1_16Impl
typealias EmptyDirVolumeSource_core_v1_k8s1_18Impl = EmptyDirVolumeSource_core_v1_k8s1_17Impl
typealias EmptyDirVolumeSource_core_v1_k8s1_19Impl = EmptyDirVolumeSource_core_v1_k8s1_18Impl
typealias EmptyDirVolumeSource_core_v1_k8s1_20Impl = EmptyDirVolumeSource_core_v1_k8s1_19Impl
typealias EmptyDirVolumeSource_core_v1_k8s1_21Impl = EmptyDirVolumeSource_core_v1_k8s1_20Impl