package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("clientConfig", "throttle")
class Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var clientConfig: WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_16? = null
  override var throttle: WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16? = null
}
typealias Webhook_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias Webhook_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = Webhook_auditregistration_k8s_io_v1alpha1_k8s1_17Impl