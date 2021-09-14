package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface ContainerImage_core_v1_k8s1_21: K8sManifest {
  /** Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7",
"dockerhub.io/google_containers/hyperkube:v1.0.7"] */
  @K8sDslMarker var names: List<String>?
  /** The size of the image in bytes. */
  @K8sDslMarker var sizeBytes: Int?
}