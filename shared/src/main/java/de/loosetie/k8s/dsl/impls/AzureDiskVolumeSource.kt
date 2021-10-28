package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("kind", "cachingMode", "diskName", "diskURI", "fsType", "readOnly")
class AzureDiskVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureDiskVolumeSource_core_v1_k8s1_16, HasParent {
  override var kind: String? = null
  override var cachingMode: String? = null
  override var diskName: String? = null
  override var diskURI: String? = null
  override var fsType: String? = null
  override var readOnly: Boolean? = null
}
typealias AzureDiskVolumeSource_core_v1_k8s1_17Impl = AzureDiskVolumeSource_core_v1_k8s1_16Impl
typealias AzureDiskVolumeSource_core_v1_k8s1_18Impl = AzureDiskVolumeSource_core_v1_k8s1_17Impl
typealias AzureDiskVolumeSource_core_v1_k8s1_19Impl = AzureDiskVolumeSource_core_v1_k8s1_18Impl
typealias AzureDiskVolumeSource_core_v1_k8s1_20Impl = AzureDiskVolumeSource_core_v1_k8s1_19Impl
typealias AzureDiskVolumeSource_core_v1_k8s1_21Impl = AzureDiskVolumeSource_core_v1_k8s1_20Impl