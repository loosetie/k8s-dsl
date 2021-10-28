package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("claimName", "readOnly")
class PersistentVolumeClaimVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: PersistentVolumeClaimVolumeSource_core_v1_k8s1_16, HasParent {
  override var claimName: String? = null
  override var readOnly: Boolean? = null
}
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_17Impl = PersistentVolumeClaimVolumeSource_core_v1_k8s1_16Impl
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_18Impl = PersistentVolumeClaimVolumeSource_core_v1_k8s1_17Impl
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_19Impl = PersistentVolumeClaimVolumeSource_core_v1_k8s1_18Impl
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_20Impl = PersistentVolumeClaimVolumeSource_core_v1_k8s1_19Impl
typealias PersistentVolumeClaimVolumeSource_core_v1_k8s1_21Impl = PersistentVolumeClaimVolumeSource_core_v1_k8s1_20Impl