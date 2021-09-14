package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("host", "http")
class IngressRule_networking_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: IngressRule_networking_k8s_io_v1_k8s1_21, HasParent {
  override var host: String? = null
  override var http: HTTPIngressRuleValue_networking_k8s_io_v1_k8s1_21? = null
}