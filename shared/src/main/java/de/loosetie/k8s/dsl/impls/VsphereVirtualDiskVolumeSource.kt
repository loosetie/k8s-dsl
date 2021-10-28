package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "storagePolicyID", "storagePolicyName", "volumePath")
class VsphereVirtualDiskVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VsphereVirtualDiskVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var storagePolicyID: String? = null
  override var storagePolicyName: String? = null
  override var volumePath: String? = null
}
typealias VsphereVirtualDiskVolumeSource_core_v1_k8s1_17Impl = VsphereVirtualDiskVolumeSource_core_v1_k8s1_16Impl
typealias VsphereVirtualDiskVolumeSource_core_v1_k8s1_18Impl = VsphereVirtualDiskVolumeSource_core_v1_k8s1_17Impl
typealias VsphereVirtualDiskVolumeSource_core_v1_k8s1_19Impl = VsphereVirtualDiskVolumeSource_core_v1_k8s1_18Impl
typealias VsphereVirtualDiskVolumeSource_core_v1_k8s1_20Impl = VsphereVirtualDiskVolumeSource_core_v1_k8s1_19Impl
typealias VsphereVirtualDiskVolumeSource_core_v1_k8s1_21Impl = VsphereVirtualDiskVolumeSource_core_v1_k8s1_20Impl