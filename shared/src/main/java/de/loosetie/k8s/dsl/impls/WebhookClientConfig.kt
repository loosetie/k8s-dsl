package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_16, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_admissionregistration_k8s_io_v1_k8s1_16? = null
  override var url: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_16, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_apiextensions_k8s_io_v1_k8s1_16? = null
  override var url: String? = null
}

@JsonPropertyOrder("caBundle", "service", "url")
class WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var caBundle: String? = null
  override var service: ServiceReference_auditregistration_k8s_io_v1alpha1_k8s1_16? = null
  override var url: String? = null
}
typealias WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_17Impl = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_16Impl

typealias WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_17Impl = WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_16Impl

typealias WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_18Impl = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_17Impl

typealias WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_18Impl = WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_17Impl

typealias WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_17Impl
typealias WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_19Impl = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_18Impl

typealias WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19Impl = WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_18Impl


typealias WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_20Impl = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_19Impl

typealias WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_20Impl = WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_19Impl


typealias WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_21Impl = WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_20Impl

typealias WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_21Impl = WebhookClientConfig_apiextensions_k8s_io_v1_k8s1_20Impl

