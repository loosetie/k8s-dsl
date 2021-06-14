package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Policy_auditregistration_k8s_io_v1alpha1: K8sManifest {
  /** The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required */
  @K8sDslMarker var level: String?
  /** Stages is a list of stages for which events are created. */
  @K8sDslMarker var stages: List<String>?
}