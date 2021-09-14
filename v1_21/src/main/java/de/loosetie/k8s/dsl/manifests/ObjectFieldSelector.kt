package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ObjectFieldSelector_core_v1_k8s1_21: K8sManifest {
  /** Version of the schema the FieldPath is written in terms of, defaults to "v1". */
  @K8sDslMarker var apiVersion: String?
  /** Path of the field to select in the specified API version. */
  @K8sDslMarker var fieldPath: String?
}