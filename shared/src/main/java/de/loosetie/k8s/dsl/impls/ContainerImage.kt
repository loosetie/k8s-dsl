package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("names", "sizeBytes")
class ContainerImage_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ContainerImage_core_v1_k8s1_16, HasParent {
  override var names: List<String>? = null
  override var sizeBytes: Int? = null
}
typealias ContainerImage_core_v1_k8s1_17Impl = ContainerImage_core_v1_k8s1_16Impl
typealias ContainerImage_core_v1_k8s1_18Impl = ContainerImage_core_v1_k8s1_17Impl
typealias ContainerImage_core_v1_k8s1_19Impl = ContainerImage_core_v1_k8s1_18Impl
typealias ContainerImage_core_v1_k8s1_20Impl = ContainerImage_core_v1_k8s1_19Impl
typealias ContainerImage_core_v1_k8s1_21Impl = ContainerImage_core_v1_k8s1_20Impl