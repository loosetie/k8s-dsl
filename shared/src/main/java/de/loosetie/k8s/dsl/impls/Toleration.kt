package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("effect", "key", "operator", "tolerationSeconds", "value")
class Toleration_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Toleration_core_v1_k8s1_16, HasParent {
  override var effect: String? = null
  override var key: String? = null
  override var operator: String? = null
  override var tolerationSeconds: Int? = null
  override var value: String? = null
}
typealias Toleration_core_v1_k8s1_17Impl = Toleration_core_v1_k8s1_16Impl
typealias Toleration_core_v1_k8s1_18Impl = Toleration_core_v1_k8s1_17Impl
typealias Toleration_core_v1_k8s1_19Impl = Toleration_core_v1_k8s1_18Impl
typealias Toleration_core_v1_k8s1_20Impl = Toleration_core_v1_k8s1_19Impl
typealias Toleration_core_v1_k8s1_21Impl = Toleration_core_v1_k8s1_20Impl