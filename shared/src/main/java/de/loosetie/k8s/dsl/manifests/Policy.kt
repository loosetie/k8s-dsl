package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Policy_auditregistration_k8s_io_v1alpha1_k8s1_16: K8sManifest {
  /** The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required */
  @K8sDslMarker var level: String?
  /** Stages is a list of stages for which events are created. */
  @K8sDslMarker var stages: List<String>?
}      
typealias Policy_auditregistration_k8s_io_v1alpha1_k8s1_17 = Policy_auditregistration_k8s_io_v1alpha1_k8s1_16       
typealias Policy_auditregistration_k8s_io_v1alpha1_k8s1_18 = Policy_auditregistration_k8s_io_v1alpha1_k8s1_17 