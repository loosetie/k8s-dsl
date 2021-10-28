package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "mountPath", "mountPropagation", "readOnly", "subPath", "subPathExpr")
class VolumeMount_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeMount_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var mountPath: String? = null
  override var mountPropagation: String? = null
  override var readOnly: Boolean? = null
  override var subPath: String? = null
  override var subPathExpr: String? = null
}
@JsonPropertyOrder("name", "mountPath", "mountPropagation", "readOnly", "subPath", "subPathExpr")
class VolumeMount_core_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: VolumeMount_core_v1_k8s1_17, HasParent {
  override var name: String? = null
  override var mountPath: String? = null
  override var mountPropagation: String? = null
  override var readOnly: Boolean? = null
  override var subPath: String? = null
  override var subPathExpr: String? = null
}
typealias VolumeMount_core_v1_k8s1_18Impl = VolumeMount_core_v1_k8s1_17Impl
typealias VolumeMount_core_v1_k8s1_19Impl = VolumeMount_core_v1_k8s1_18Impl
typealias VolumeMount_core_v1_k8s1_20Impl = VolumeMount_core_v1_k8s1_19Impl
typealias VolumeMount_core_v1_k8s1_21Impl = VolumeMount_core_v1_k8s1_20Impl