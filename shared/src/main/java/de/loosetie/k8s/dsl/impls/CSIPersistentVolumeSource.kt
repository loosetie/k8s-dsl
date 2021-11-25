package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("controllerExpandSecretRef", "controllerPublishSecretRef", "driver", "fsType", "nodePublishSecretRef", "nodeStageSecretRef", "readOnly", "volumeAttributes", "volumeHandle")
class CSIPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CSIPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var controllerExpandSecretRef: SecretReference_core_v1_k8s1_16? = null
  override var controllerPublishSecretRef: SecretReference_core_v1_k8s1_16? = null
  override var driver: String? = null
  override var fsType: String? = null
  override var nodePublishSecretRef: SecretReference_core_v1_k8s1_16? = null
  override var nodeStageSecretRef: SecretReference_core_v1_k8s1_16? = null
  override var readOnly: Boolean? = null
  override var volumeAttributes: Map<String, String>? = null
  override var volumeHandle: String? = null
}
typealias CSIPersistentVolumeSource_core_v1_k8s1_17Impl = CSIPersistentVolumeSource_core_v1_k8s1_16Impl
typealias CSIPersistentVolumeSource_core_v1_k8s1_18Impl = CSIPersistentVolumeSource_core_v1_k8s1_17Impl
typealias CSIPersistentVolumeSource_core_v1_k8s1_19Impl = CSIPersistentVolumeSource_core_v1_k8s1_18Impl
typealias CSIPersistentVolumeSource_core_v1_k8s1_20Impl = CSIPersistentVolumeSource_core_v1_k8s1_19Impl
typealias CSIPersistentVolumeSource_core_v1_k8s1_21Impl = CSIPersistentVolumeSource_core_v1_k8s1_20Impl