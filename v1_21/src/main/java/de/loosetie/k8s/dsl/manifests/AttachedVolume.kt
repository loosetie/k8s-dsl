package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface AttachedVolume_core_v1_k8s1_21: K8sManifest {
  /** Name of the attached volume */
  @K8sDslMarker var name: String?
  /** DevicePath represents the device path where the volume should be available */
  @K8sDslMarker var devicePath: String?
}