package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** ClientConfig holds the connection parameters for the webhook required */
  val clientConfig: WebhookClientConfig_auditregistration_k8s_io_v1alpha1_k8s1_16?
  /** Throttle holds the options for throttling the webhook */
  val throttle: WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16?
}      
typealias Webhook_auditregistration_k8s_io_v1alpha1_k8s1_17 = Webhook_auditregistration_k8s_io_v1alpha1_k8s1_16       
typealias Webhook_auditregistration_k8s_io_v1alpha1_k8s1_18 = Webhook_auditregistration_k8s_io_v1alpha1_k8s1_17       
      
      
