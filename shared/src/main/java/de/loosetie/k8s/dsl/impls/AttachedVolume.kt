package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "devicePath")
class AttachedVolume_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: AttachedVolume_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var devicePath: String? = null
}
typealias AttachedVolume_core_v1_k8s1_17Impl = AttachedVolume_core_v1_k8s1_16Impl
typealias AttachedVolume_core_v1_k8s1_18Impl = AttachedVolume_core_v1_k8s1_17Impl
typealias AttachedVolume_core_v1_k8s1_19Impl = AttachedVolume_core_v1_k8s1_18Impl
typealias AttachedVolume_core_v1_k8s1_20Impl = AttachedVolume_core_v1_k8s1_19Impl
typealias AttachedVolume_core_v1_k8s1_21Impl = AttachedVolume_core_v1_k8s1_20Impl