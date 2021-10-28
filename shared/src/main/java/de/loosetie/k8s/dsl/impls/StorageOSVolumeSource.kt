package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeName", "volumeNamespace")
class StorageOSVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: StorageOSVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_16? = null
  override var volumeName: String? = null
  override var volumeNamespace: String? = null
}
typealias StorageOSVolumeSource_core_v1_k8s1_17Impl = StorageOSVolumeSource_core_v1_k8s1_16Impl
typealias StorageOSVolumeSource_core_v1_k8s1_18Impl = StorageOSVolumeSource_core_v1_k8s1_17Impl
typealias StorageOSVolumeSource_core_v1_k8s1_19Impl = StorageOSVolumeSource_core_v1_k8s1_18Impl
typealias StorageOSVolumeSource_core_v1_k8s1_20Impl = StorageOSVolumeSource_core_v1_k8s1_19Impl
typealias StorageOSVolumeSource_core_v1_k8s1_21Impl = StorageOSVolumeSource_core_v1_k8s1_20Impl