package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@Deprecated(message="Old api version")
@K8sDslMarker
interface Selfsubjectrulesreviewspec_authorization_k8s_io_v1: K8sManifest {
  /** Namespace to evaluate rules for. Required. */
  @K8sDslMarker var namespace: String?
}