package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("driver", "fsType", "options", "readOnly", "secretRef")
class FlexPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: FlexPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var driver: String? = null
  override var fsType: String? = null
  override var options: Any? = null
  override var readOnly: Boolean? = null
  override var secretRef: SecretReference_core_v1_k8s1_16? = null
}
typealias FlexPersistentVolumeSource_core_v1_k8s1_17Impl = FlexPersistentVolumeSource_core_v1_k8s1_16Impl
typealias FlexPersistentVolumeSource_core_v1_k8s1_18Impl = FlexPersistentVolumeSource_core_v1_k8s1_17Impl
typealias FlexPersistentVolumeSource_core_v1_k8s1_19Impl = FlexPersistentVolumeSource_core_v1_k8s1_18Impl
typealias FlexPersistentVolumeSource_core_v1_k8s1_20Impl = FlexPersistentVolumeSource_core_v1_k8s1_19Impl
typealias FlexPersistentVolumeSource_core_v1_k8s1_21Impl = FlexPersistentVolumeSource_core_v1_k8s1_20Impl