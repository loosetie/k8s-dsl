package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AzureFileVolumeSource_core_v1: K8sManifest {
  /** readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** secretName is the name of secret that contains Azure Storage Account Name and Key */
  @K8sDslMarker var secretName: String?
  /** shareName is the azure share Name */
  @K8sDslMarker var shareName: String?
}