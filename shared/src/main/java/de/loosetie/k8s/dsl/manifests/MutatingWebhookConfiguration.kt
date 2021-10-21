package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_16: K8sTopLevel, HasMetadata {
  /** APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas
to the latest internal value, and may reject unrecognized values. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources */
  override val apiVersion: String
    get() = "admissionregistration.k8s.io/v1"
  /** Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint
the client submits requests to. Cannot be updated. In CamelCase. More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds */
  override val kind: String
    get() = "MutatingWebhookConfiguration"
  /** Standard object metadata; More info:
https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. */
  val metadata: ObjectMeta_meta_v1_k8s1_16
  /** Webhooks is a list of webhooks and the affected resources and operations. */
  val webhooks: List<MutatingWebhook_admissionregistration_k8s_io_v1_k8s1_16>?
}      
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_17 = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_16       
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_18 = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_17       
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19 = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_18       
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20 = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_19       
typealias MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_21 = MutatingWebhookConfiguration_admissionregistration_k8s_io_v1_k8s1_20 