package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("chapAuthDiscovery", "chapAuthSession", "fsType", "initiatorName", "iqn", "iscsiInterface", "lun", "portals", "readOnly", "secretRef", "targetPortal")
class ISCSIPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ISCSIPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var chapAuthDiscovery: Boolean? = null
  override var chapAuthSession: Boolean? = null
  override var fsType: String? = null
  override var initiatorName: String? = null
  override var iqn: String? = null
  override var iscsiInterface: String? = null
  override var lun: Int? = null
  override var portals: List<String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_core_v1_k8s1_16? = null
  override var targetPortal: String? = null
}
typealias ISCSIPersistentVolumeSource_core_v1_k8s1_17Impl = ISCSIPersistentVolumeSource_core_v1_k8s1_16Impl
typealias ISCSIPersistentVolumeSource_core_v1_k8s1_18Impl = ISCSIPersistentVolumeSource_core_v1_k8s1_17Impl
typealias ISCSIPersistentVolumeSource_core_v1_k8s1_19Impl = ISCSIPersistentVolumeSource_core_v1_k8s1_18Impl
typealias ISCSIPersistentVolumeSource_core_v1_k8s1_20Impl = ISCSIPersistentVolumeSource_core_v1_k8s1_19Impl
typealias ISCSIPersistentVolumeSource_core_v1_k8s1_21Impl = ISCSIPersistentVolumeSource_core_v1_k8s1_20Impl