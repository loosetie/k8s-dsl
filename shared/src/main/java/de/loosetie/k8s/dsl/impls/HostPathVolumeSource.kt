package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("path", "type")
class HostPathVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HostPathVolumeSource_core_v1_k8s1_16, HasParent {
  override var path: String? = null
  override var type: String? = null
}
typealias HostPathVolumeSource_core_v1_k8s1_17Impl = HostPathVolumeSource_core_v1_k8s1_16Impl
typealias HostPathVolumeSource_core_v1_k8s1_18Impl = HostPathVolumeSource_core_v1_k8s1_17Impl
typealias HostPathVolumeSource_core_v1_k8s1_19Impl = HostPathVolumeSource_core_v1_k8s1_18Impl
typealias HostPathVolumeSource_core_v1_k8s1_20Impl = HostPathVolumeSource_core_v1_k8s1_19Impl
typealias HostPathVolumeSource_core_v1_k8s1_21Impl = HostPathVolumeSource_core_v1_k8s1_20Impl