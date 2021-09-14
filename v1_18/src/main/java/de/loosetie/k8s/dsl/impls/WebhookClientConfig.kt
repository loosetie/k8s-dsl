package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_18, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_admissionregistration_k8s_io_v1_k8s1_18? = null
  override var url: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_18, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_apiextensions_k8s_io_v1_k8s1_18? = null
  override var url: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_18Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_18, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_18? = null
  override var url: String? = null
}