package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("readOnly", "secretName", "shareName")
class AzureFileVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureFileVolumeSource_core_v1_k8s1_16, HasParent {
  override var readOnly: Boolean? = null
  override var secretName: String? = null
  override var shareName: String? = null
}
typealias AzureFileVolumeSource_core_v1_k8s1_17Impl = AzureFileVolumeSource_core_v1_k8s1_16Impl
typealias AzureFileVolumeSource_core_v1_k8s1_18Impl = AzureFileVolumeSource_core_v1_k8s1_17Impl
typealias AzureFileVolumeSource_core_v1_k8s1_19Impl = AzureFileVolumeSource_core_v1_k8s1_18Impl
typealias AzureFileVolumeSource_core_v1_k8s1_20Impl = AzureFileVolumeSource_core_v1_k8s1_19Impl
typealias AzureFileVolumeSource_core_v1_k8s1_21Impl = AzureFileVolumeSource_core_v1_k8s1_20Impl