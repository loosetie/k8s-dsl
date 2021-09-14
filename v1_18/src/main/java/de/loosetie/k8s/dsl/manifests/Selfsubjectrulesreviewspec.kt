package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Selfsubjectrulesreviewspec_authorization_k8s_io_v1_k8s1_18: K8sManifest {
  /** Namespace to evaluate rules for. Required. */
  @K8sDslMarker var namespace: String?
}