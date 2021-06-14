package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("policy", "webhook")
class Auditsinkspec_auditregistration_k8s_io_v1alpha1Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Auditsinkspec_auditregistration_k8s_io_v1alpha1, HasParent {
  override var policy: Policy_auditregistration_k8s_io_v1alpha1? = null
  override var webhook: Webhook_auditregistration_k8s_io_v1alpha1? = null
}