package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("chapAuthDiscovery", "chapAuthSession", "fsType", "initiatorName", "iqn", "iscsiInterface", "lun", "portals", "readOnly", "secretRef", "targetPortal")
class ISCSIVolumeSource_core_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ISCSIVolumeSource_core_v1_k8s1_19, HasParent {
  override var chapAuthDiscovery: Boolean? = null
  override var chapAuthSession: Boolean? = null
  override var fsType: String? = null
  override var initiatorName: String? = null
  override var iqn: String? = null
  override var iscsiInterface: String? = null
  override var lun: Int? = null
  override var portals: List<String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_19? = null
  override var targetPortal: String? = null
}