package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ExternalDocumentation_apiextensions_k8s_io_v1_k8s1_21: K8sManifest {
  /**  */
  @K8sDslMarker var description: String?
  /**  */
  @K8sDslMarker var url: String?
}