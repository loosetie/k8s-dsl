package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AzureFilePersistentVolumeSource_core_v1: K8sManifest {
  /** Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  @K8sDslMarker var readOnly: Boolean?
  /** the name of secret that contains Azure Storage Account Name and Key */
  @K8sDslMarker var secretName: String?
  /** the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod */
  @K8sDslMarker var secretNamespace: String?
  /** Share Name */
  @K8sDslMarker var shareName: String?
}