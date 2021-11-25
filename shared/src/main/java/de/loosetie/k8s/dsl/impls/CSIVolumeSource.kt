package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("driver", "fsType", "nodePublishSecretRef", "readOnly", "volumeAttributes")
class CSIVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIVolumeSource_core_v1_k8s1_16, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var nodePublishSecretRef: LocalObjectReference_core_v1_k8s1_16? = null
  override var readOnly: Boolean? = null
  override var volumeAttributes: Map<String, String>? = null
}
typealias CSIVolumeSource_core_v1_k8s1_17Impl = CSIVolumeSource_core_v1_k8s1_16Impl
typealias CSIVolumeSource_core_v1_k8s1_18Impl = CSIVolumeSource_core_v1_k8s1_17Impl
typealias CSIVolumeSource_core_v1_k8s1_19Impl = CSIVolumeSource_core_v1_k8s1_18Impl
typealias CSIVolumeSource_core_v1_k8s1_20Impl = CSIVolumeSource_core_v1_k8s1_19Impl
typealias CSIVolumeSource_core_v1_k8s1_21Impl = CSIVolumeSource_core_v1_k8s1_20Impl