package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface FlockerVolumeSource_core_v1: K8sManifest {
  /** datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as
deprecated */
  @K8sDslMarker var datasetName: String?
  /** datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset */
  @K8sDslMarker var datasetUUID: String?
}