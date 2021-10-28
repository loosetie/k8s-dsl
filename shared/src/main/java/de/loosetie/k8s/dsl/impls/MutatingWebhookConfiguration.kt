package de.loosetie.k8s.dsl.impls

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasParent
import de.loosetie.k8s.dsl.manifests.*

@JsonPropertyOrder("apiVersion", "kind", "metadata", "webhooks")
class MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_16Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_16, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_16
  override var webhooks: List<MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_16>? = null
}
@JsonPropertyOrder("apiVersion", "kind", "metadata", "webhooks")
class MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_17Impl(
  @JsonIgnore
  override val parent: K8sManifest? = null
)
: MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_17, HasParent {
  override lateinit var metadata: ObjectMeta_meta_v1_k8s1_17
  override var webhooks: List<MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_17>? = null
}
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_18Impl = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_17Impl
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_18Impl
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20Impl = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19Impl
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_21Impl = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20Impl