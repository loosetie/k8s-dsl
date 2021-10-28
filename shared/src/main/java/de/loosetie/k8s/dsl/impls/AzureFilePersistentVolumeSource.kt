package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("readOnly", "secretName", "secretNamespace", "shareName")
class AzureFilePersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureFilePersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var readOnly: Boolean? = null
  override var secretName: String? = null
  override var secretNamespace: String? = null
  override var shareName: String? = null
}
typealias AzureFilePersistentVolumeSource_core_v1_k8s1_17Impl = AzureFilePersistentVolumeSource_core_v1_k8s1_16Impl
typealias AzureFilePersistentVolumeSource_core_v1_k8s1_18Impl = AzureFilePersistentVolumeSource_core_v1_k8s1_17Impl
typealias AzureFilePersistentVolumeSource_core_v1_k8s1_19Impl = AzureFilePersistentVolumeSource_core_v1_k8s1_18Impl
typealias AzureFilePersistentVolumeSource_core_v1_k8s1_20Impl = AzureFilePersistentVolumeSource_core_v1_k8s1_19Impl
typealias AzureFilePersistentVolumeSource_core_v1_k8s1_21Impl = AzureFilePersistentVolumeSource_core_v1_k8s1_20Impl