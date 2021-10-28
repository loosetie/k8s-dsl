package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "secretRef", "volumeID")
class CinderVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CinderVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_16? = null
  override var volumeID: String? = null
}
typealias CinderVolumeSource_core_v1_k8s1_17Impl = CinderVolumeSource_core_v1_k8s1_16Impl
typealias CinderVolumeSource_core_v1_k8s1_18Impl = CinderVolumeSource_core_v1_k8s1_17Impl
typealias CinderVolumeSource_core_v1_k8s1_19Impl = CinderVolumeSource_core_v1_k8s1_18Impl
typealias CinderVolumeSource_core_v1_k8s1_20Impl = CinderVolumeSource_core_v1_k8s1_19Impl
typealias CinderVolumeSource_core_v1_k8s1_21Impl = CinderVolumeSource_core_v1_k8s1_20Impl