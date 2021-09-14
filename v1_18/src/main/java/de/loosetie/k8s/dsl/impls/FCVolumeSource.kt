package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "lun", "readOnly", "targetWWNs", "wwids")
class FCVolumeSource_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FCVolumeSource_core_v1_k8s1_18, HasParent {
  override var fsType: String? = null
  override var lun: Int? = null
  override var readOnly: Boolean? = null
  override var targetWWNs: List<String>? = null
  override var wwids: List<String>? = null
}