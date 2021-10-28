package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("postStart", "preStop")
class Lifecycle_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Lifecycle_core_v1_k8s1_16, HasParent {
  override var postStart: Handler_core_v1_k8s1_16? = null
  override var preStop: Handler_core_v1_k8s1_16? = null
}
typealias Lifecycle_core_v1_k8s1_17Impl = Lifecycle_core_v1_k8s1_16Impl
typealias Lifecycle_core_v1_k8s1_18Impl = Lifecycle_core_v1_k8s1_17Impl
typealias Lifecycle_core_v1_k8s1_19Impl = Lifecycle_core_v1_k8s1_18Impl
typealias Lifecycle_core_v1_k8s1_20Impl = Lifecycle_core_v1_k8s1_19Impl
typealias Lifecycle_core_v1_k8s1_21Impl = Lifecycle_core_v1_k8s1_20Impl