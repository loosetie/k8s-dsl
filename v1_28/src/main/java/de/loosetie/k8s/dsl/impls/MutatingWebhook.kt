package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("name", "admissionReviewVersions", "clientConfig", "failurePolicy", "matchConditions", "matchPolicy", "namespaceSelector", "objectSelector", "reinvocationPolicy", "rules", "sideEffects", "timeoutSeconds")
open class MutatingWebhook_admissionregistration_k8s_io_v1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null,
  
)
: MutatingWebhook_admissionregistration_k8s_io_v1, HasParent {
  override var name: String? = null
  override var admissionReviewVersions: List<String>? = null
  override var clientConfig: WebhookClientConfig_admissionregistration_k8s_io_v1? = null
  override var failurePolicy: String? = null
  override var matchConditions: List<MatchCondition_admissionregistration_k8s_io_v1>? = null
  override var matchPolicy: String? = null
  override var namespaceSelector: LabelSelector_meta_v1? = null
  override var objectSelector: LabelSelector_meta_v1? = null
  override var reinvocationPolicy: String? = null
  override var rules: List<RuleWithOperations_admissionregistration_k8s_io_v1>? = null
  override var sideEffects: String? = null
  override var timeoutSeconds: Int? = null
}