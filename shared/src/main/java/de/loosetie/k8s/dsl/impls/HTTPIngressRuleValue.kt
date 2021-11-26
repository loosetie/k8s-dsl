package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("paths")
class HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var paths: List<HTTPIngressPath_networking_k8s_io_v1beta1_k8s1_16>? = null
}
typealias HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_17Impl = HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16Impl
typealias HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_18Impl = HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_17Impl
@JsonPropertyOrder("paths")
class HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19, HasParent {
  override var paths: List<HTTPIngressPath_networking_k8s_io_v1_k8s1_19>? = null
}
typealias HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20Impl = HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19Impl
typealias HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_21Impl = HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_20Impl