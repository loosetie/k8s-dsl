package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface DownwardAPIProjection_core_v1_k8s1_18: K8sManifest {
  /** Items is a list of DownwardAPIVolume file */
  val items: List<DownwardAPIVolumeFile_core_v1_k8s1_18>?
}