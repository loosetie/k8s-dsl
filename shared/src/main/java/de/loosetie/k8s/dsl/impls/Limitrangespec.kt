package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("limits")
class Limitrangespec_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Limitrangespec_core_v1_k8s1_16, HasParent {
  override var limits: List<LimitRangeItem_core_v1_k8s1_16>? = null
}
typealias Limitrangespec_core_v1_k8s1_17Impl = Limitrangespec_core_v1_k8s1_16Impl
typealias Limitrangespec_core_v1_k8s1_18Impl = Limitrangespec_core_v1_k8s1_17Impl
typealias Limitrangespec_core_v1_k8s1_19Impl = Limitrangespec_core_v1_k8s1_18Impl
typealias Limitrangespec_core_v1_k8s1_20Impl = Limitrangespec_core_v1_k8s1_19Impl
typealias Limitrangespec_core_v1_k8s1_21Impl = Limitrangespec_core_v1_k8s1_20Impl