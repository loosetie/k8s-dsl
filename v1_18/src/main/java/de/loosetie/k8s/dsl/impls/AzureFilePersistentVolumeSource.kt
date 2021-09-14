package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.manifests.AzureFilePersistentVolumeSource_core_v1_k8s1_18

@JsonPropertyOrder("readOnly", "secretName", "secretNamespace", "shareName")
class AzureFilePersistentVolumeSource_core_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AzureFilePersistentVolumeSource_core_v1_k8s1_18, HasParent {
  override var readOnly: Boolean? = null
  override var secretName: String? = null
  override var secretNamespace: String? = null
  override var shareName: String? = null
}