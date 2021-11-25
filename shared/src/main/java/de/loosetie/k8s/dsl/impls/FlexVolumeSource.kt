package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("driver", "fsType", "options", "readOnly", "secretRef")
class FlexVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlexVolumeSource_core_v1_k8s1_16, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var options: Map<String, String>? = null
  override var readOnly: Boolean? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_16? = null
}
typealias FlexVolumeSource_core_v1_k8s1_17Impl = FlexVolumeSource_core_v1_k8s1_16Impl
typealias FlexVolumeSource_core_v1_k8s1_18Impl = FlexVolumeSource_core_v1_k8s1_17Impl
typealias FlexVolumeSource_core_v1_k8s1_19Impl = FlexVolumeSource_core_v1_k8s1_18Impl
typealias FlexVolumeSource_core_v1_k8s1_20Impl = FlexVolumeSource_core_v1_k8s1_19Impl
typealias FlexVolumeSource_core_v1_k8s1_21Impl = FlexVolumeSource_core_v1_k8s1_20Impl