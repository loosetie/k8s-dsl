package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("host", "http")
class IngressRule_networking_k8s_io_v1beta1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressRule_networking_k8s_io_v1beta1_k8s1_16, HasParent {
  override var host: String? = null
  override var http: HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_16? = null
}
typealias IngressRule_networking_k8s_io_v1beta1_k8s1_17Impl = IngressRule_networking_k8s_io_v1beta1_k8s1_16Impl
@JsonPropertyOrder("host", "http")
class IngressRule_networking_k8s_io_v1beta1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressRule_networking_k8s_io_v1beta1_k8s1_18, HasParent {
  override var host: String? = null
  override var http: HTTPIngressRuleValue_networking_k8s_io_v1beta1_k8s1_18? = null
}
@JsonPropertyOrder("host", "http")
class IngressRule_networking_k8s_io_v1_k8s1_19Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressRule_networking_k8s_io_v1_k8s1_19, HasParent {
  override var host: String? = null
  override var http: HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_19? = null
}
typealias IngressRule_networking_k8s_io_v1_k8s1_20Impl = IngressRule_networking_k8s_io_v1_k8s1_19Impl
typealias IngressRule_networking_k8s_io_v1_k8s1_21Impl = IngressRule_networking_k8s_io_v1_k8s1_20Impl