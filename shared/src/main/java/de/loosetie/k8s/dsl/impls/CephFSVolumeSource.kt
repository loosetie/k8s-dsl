package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("monitors", "path", "readOnly", "secretFile", "secretRef", "user")
class CephFSVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: CephFSVolumeSource_core_v1_k8s1_16, HasParent {
  override var monitors: List<String>? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var secretFile: String? = null
  override var secretRef: LocalObjectReference_core_v1_k8s1_16? = null
  override var user: String? = null
}
typealias CephFSVolumeSource_core_v1_k8s1_17Impl = CephFSVolumeSource_core_v1_k8s1_16Impl
typealias CephFSVolumeSource_core_v1_k8s1_18Impl = CephFSVolumeSource_core_v1_k8s1_17Impl
typealias CephFSVolumeSource_core_v1_k8s1_19Impl = CephFSVolumeSource_core_v1_k8s1_18Impl
typealias CephFSVolumeSource_core_v1_k8s1_20Impl = CephFSVolumeSource_core_v1_k8s1_19Impl
typealias CephFSVolumeSource_core_v1_k8s1_21Impl = CephFSVolumeSource_core_v1_k8s1_20Impl