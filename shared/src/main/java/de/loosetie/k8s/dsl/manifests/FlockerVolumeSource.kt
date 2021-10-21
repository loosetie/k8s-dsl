package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface FlockerVolumeSource_core_v1_k8s1_16: K8sManifest {
  /** Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated */
  @K8sDslMarker var datasetName: String?
  /** UUID of the dataset. This is unique identifier of a Flocker dataset */
  @K8sDslMarker var datasetUUID: String?
}      
typealias FlockerVolumeSource_core_v1_k8s1_17 = FlockerVolumeSource_core_v1_k8s1_16       
typealias FlockerVolumeSource_core_v1_k8s1_18 = FlockerVolumeSource_core_v1_k8s1_17       
typealias FlockerVolumeSource_core_v1_k8s1_19 = FlockerVolumeSource_core_v1_k8s1_18       
typealias FlockerVolumeSource_core_v1_k8s1_20 = FlockerVolumeSource_core_v1_k8s1_19       
typealias FlockerVolumeSource_core_v1_k8s1_21 = FlockerVolumeSource_core_v1_k8s1_20 