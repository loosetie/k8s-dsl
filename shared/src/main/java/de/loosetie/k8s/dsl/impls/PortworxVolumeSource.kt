package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("fsType", "readOnly", "volumeID")
class PortworxVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PortworxVolumeSource_core_v1_k8s1_16, HasParent {
  override var fsType: String? = null
  override var readOnly: Boolean? = null
  override var volumeID: String? = null
}
typealias PortworxVolumeSource_core_v1_k8s1_17Impl = PortworxVolumeSource_core_v1_k8s1_16Impl
typealias PortworxVolumeSource_core_v1_k8s1_18Impl = PortworxVolumeSource_core_v1_k8s1_17Impl
typealias PortworxVolumeSource_core_v1_k8s1_19Impl = PortworxVolumeSource_core_v1_k8s1_18Impl
typealias PortworxVolumeSource_core_v1_k8s1_20Impl = PortworxVolumeSource_core_v1_k8s1_19Impl
typealias PortworxVolumeSource_core_v1_k8s1_21Impl = PortworxVolumeSource_core_v1_k8s1_20Impl