package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("endpoints", "path", "readOnly")
class GlusterfsVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GlusterfsVolumeSource_core_v1_k8s1_16, HasParent {
  override var endpoints: String? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
}
typealias GlusterfsVolumeSource_core_v1_k8s1_17Impl = GlusterfsVolumeSource_core_v1_k8s1_16Impl
typealias GlusterfsVolumeSource_core_v1_k8s1_18Impl = GlusterfsVolumeSource_core_v1_k8s1_17Impl
typealias GlusterfsVolumeSource_core_v1_k8s1_19Impl = GlusterfsVolumeSource_core_v1_k8s1_18Impl
typealias GlusterfsVolumeSource_core_v1_k8s1_20Impl = GlusterfsVolumeSource_core_v1_k8s1_19Impl
typealias GlusterfsVolumeSource_core_v1_k8s1_21Impl = GlusterfsVolumeSource_core_v1_k8s1_20Impl