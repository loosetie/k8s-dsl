package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("host", "httpHeaders", "path", "port", "scheme")
class HTTPGetAction_core_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPGetAction_core_v1_k8s1_16, HasParent {
  override var host: String? = null
  override var httpHeaders: List<HTTPHeader_core_v1_k8s1_16>? = null
  override var path: String? = null
  override var scheme: String? = null
}
typealias HTTPGetAction_core_v1_k8s1_17Impl = HTTPGetAction_core_v1_k8s1_16Impl
typealias HTTPGetAction_core_v1_k8s1_18Impl = HTTPGetAction_core_v1_k8s1_17Impl
typealias HTTPGetAction_core_v1_k8s1_19Impl = HTTPGetAction_core_v1_k8s1_18Impl
typealias HTTPGetAction_core_v1_k8s1_20Impl = HTTPGetAction_core_v1_k8s1_19Impl
typealias HTTPGetAction_core_v1_k8s1_21Impl = HTTPGetAction_core_v1_k8s1_20Impl