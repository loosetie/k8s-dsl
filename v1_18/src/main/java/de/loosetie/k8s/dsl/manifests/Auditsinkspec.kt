package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Auditsinkspec_auditregistration_k8s_io_v1alpha1_k8s1_18: K8sManifest {
  /** Policy defines the policy for selecting which events should be sent to the webhook required */
  val policy: Policy_auditregistration_k8s_io_v1alpha1_k8s1_18?
  /** Webhook to send events required */
  val webhook: Webhook_auditregistration_k8s_io_v1alpha1_k8s1_18?
}