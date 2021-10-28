package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("policy", "webhook")
class Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_16, HasParent {
  override var policy: Policy_auditregistration_k8s_io_v1alpha1_k8s1_16? = null
  override var webhook: Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16? = null
}
typealias Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_17Impl = Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_16Impl
typealias Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_18Impl = Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_17Impl


