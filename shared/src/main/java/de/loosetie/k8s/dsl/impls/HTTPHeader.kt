package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "value")
class HTTPHeader_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPHeader_core_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var value: String? = null
}
typealias HTTPHeader_core_v1_k8s1_17Impl = HTTPHeader_core_v1_k8s1_16Impl
typealias HTTPHeader_core_v1_k8s1_18Impl = HTTPHeader_core_v1_k8s1_17Impl
typealias HTTPHeader_core_v1_k8s1_19Impl = HTTPHeader_core_v1_k8s1_18Impl
typealias HTTPHeader_core_v1_k8s1_20Impl = HTTPHeader_core_v1_k8s1_19Impl
typealias HTTPHeader_core_v1_k8s1_21Impl = HTTPHeader_core_v1_k8s1_20Impl