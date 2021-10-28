package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "lun", "readOnly", "targetWWNs", "wwids")
class FCVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FCVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var lun: Int? = null
  override var readOnly: Boolean? = null
  override var targetWWNs: List<String>? = null
  override var wwids: List<String>? = null
}
typealias FCVolumeSource_core_v1_k8s1_17Impl = FCVolumeSource_core_v1_k8s1_16Impl
typealias FCVolumeSource_core_v1_k8s1_18Impl = FCVolumeSource_core_v1_k8s1_17Impl
typealias FCVolumeSource_core_v1_k8s1_19Impl = FCVolumeSource_core_v1_k8s1_18Impl
typealias FCVolumeSource_core_v1_k8s1_20Impl = FCVolumeSource_core_v1_k8s1_19Impl
typealias FCVolumeSource_core_v1_k8s1_21Impl = FCVolumeSource_core_v1_k8s1_20Impl