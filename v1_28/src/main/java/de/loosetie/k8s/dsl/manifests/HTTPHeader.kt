package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HTTPHeader_core_v1: K8sManifest {
  /** The header field name. This will be canonicalized upon output, so case-variant names will be understood as the same
header. */
  @K8sDslMarker var name: String?
  /** The header field value */
  @K8sDslMarker var value: String?
}