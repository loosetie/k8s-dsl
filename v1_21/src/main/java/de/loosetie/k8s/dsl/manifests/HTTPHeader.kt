package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface HTTPHeader_core_v1_k8s1_21: K8sManifest {
  /** The header field name */
  @K8sDslMarker var name: String?
  /** The header field value */
  @K8sDslMarker var value: String?
}