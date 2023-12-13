package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerImage_core_v1: K8sManifest {
  /** Names by which this image is known. e.g. ["kubernetes.example/hyperkube:v1.0.7",
"cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7"] */
  @K8sDslMarker var names: List<String>?
  /** The size of the image in bytes. */
  @K8sDslMarker var sizeBytes: Int?
}