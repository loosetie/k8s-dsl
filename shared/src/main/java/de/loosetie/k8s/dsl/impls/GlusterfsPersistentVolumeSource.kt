package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("endpoints", "endpointsNamespace", "path", "readOnly")
class GlusterfsPersistentVolumeSource_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: GlusterfsPersistentVolumeSource_core_v1_k8s1_16, HasParent {
  override var endpoints: String? = null
  override var endpointsNamespace: String? = null
  override var path: String? = null
  override var readOnly: Boolean? = null
}
typealias GlusterfsPersistentVolumeSource_core_v1_k8s1_17Impl = GlusterfsPersistentVolumeSource_core_v1_k8s1_16Impl
typealias GlusterfsPersistentVolumeSource_core_v1_k8s1_18Impl = GlusterfsPersistentVolumeSource_core_v1_k8s1_17Impl
typealias GlusterfsPersistentVolumeSource_core_v1_k8s1_19Impl = GlusterfsPersistentVolumeSource_core_v1_k8s1_18Impl
typealias GlusterfsPersistentVolumeSource_core_v1_k8s1_20Impl = GlusterfsPersistentVolumeSource_core_v1_k8s1_19Impl
typealias GlusterfsPersistentVolumeSource_core_v1_k8s1_21Impl = GlusterfsPersistentVolumeSource_core_v1_k8s1_20Impl