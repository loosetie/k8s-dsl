package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "admissionReviewVersions", "clientConfig", "failurePolicy", "matchPolicy", "namespaceSelector", "objectSelector", "rules", "sideEffects", "timeoutSeconds")
class ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_16, HasParent {
  override var name: String? = null
  override var admissionReviewVersions: List<String>? = null
  override var clientConfig: WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_16? = null
  override var failurePolicy: String? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_meta_v1_k8s1_16? = null
  override var objectSelector: LabelSelector_meta_v1_k8s1_16? = null
  override var rules: List<RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_16>? = null
  override var sideEffects: String? = null
  override var timeoutSeconds: Int? = null
}
typealias ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_17Impl = ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_16Impl
typealias ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_18Impl = ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_17Impl
typealias ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl = ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_18Impl
typealias ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_20Impl = ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_19Impl
@JsonPropertyOrder("name", "admissionReviewVersions", "clientConfig", "failurePolicy", "matchPolicy", "namespaceSelector", "objectSelector", "rules", "sideEffects", "timeoutSeconds")
class ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_21Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: ValidatingWebhook_admissionregistration_k8s_io_v1_k8s1_21, HasParent {
  override var name: String? = null
  override var admissionReviewVersions: List<String>? = null
  override var clientConfig: WebhookClientConfig_admissionregistration_k8s_io_v1_k8s1_21? = null
  override var failurePolicy: String? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var objectSelector: LabelSelector_meta_v1_k8s1_21? = null
  override var rules: List<RuleWithOperations_admissionregistration_k8s_io_v1_k8s1_21>? = null
  override var sideEffects: String? = null
  override var timeoutSeconds: Int? = null
}