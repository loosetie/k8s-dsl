package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("path", "readOnly", "server")
class NFSVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: NFSVolumeSource_core_v1_k8s1_16, HasParent {
  override var path: String? = null
  override var readOnly: Boolean? = null
  override var server: String? = null
}
typealias NFSVolumeSource_core_v1_k8s1_17Impl = NFSVolumeSource_core_v1_k8s1_16Impl
typealias NFSVolumeSource_core_v1_k8s1_18Impl = NFSVolumeSource_core_v1_k8s1_17Impl
typealias NFSVolumeSource_core_v1_k8s1_19Impl = NFSVolumeSource_core_v1_k8s1_18Impl
typealias NFSVolumeSource_core_v1_k8s1_20Impl = NFSVolumeSource_core_v1_k8s1_19Impl
typealias NFSVolumeSource_core_v1_k8s1_21Impl = NFSVolumeSource_core_v1_k8s1_20Impl