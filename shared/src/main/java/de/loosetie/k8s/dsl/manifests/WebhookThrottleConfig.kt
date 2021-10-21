package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS */
  @K8sDslMarker var burst: Int?
  /** ThrottleQPS maximum number of batches per second default 10 QPS */
  @K8sDslMarker var qps: Int?
}      
typealias WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_17 = WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_16       
typealias WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_18 = WebhookThrottleConfig_auditregistration_k8s_io_v1alpha1_k8s1_17       
      
      
