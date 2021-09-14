package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface VolumeAttachmentSource_storage_k8s_io_v1_k8s1_21: K8sManifest {
  /** inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline
VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's
inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the
CSIMigration feature. */
  val inlineVolumeSpec: Persistentvolumespec_core_v1_k8s1_21?
  /** Name of the persistent volume to attach. */
  @K8sDslMarker var persistentVolumeName: String?
}