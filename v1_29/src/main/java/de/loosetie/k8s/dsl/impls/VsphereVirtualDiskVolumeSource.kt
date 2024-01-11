package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "storagePolicyID", "storagePolicyName", "volumePath")
open class VsphereVirtualDiskVolumeSource_core_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: VsphereVirtualDiskVolumeSource_core_v1, HasParent {
  override var fsType: String? = null
  override var storagePolicyID: String? = null
  override var storagePolicyName: String? = null
  override var volumePath: String? = null
}