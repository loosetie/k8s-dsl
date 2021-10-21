package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface VolumeDevice_core_v1_k8s1_16: K8sManifest {
  /** name must match the name of a persistentVolumeClaim in the pod */
  @K8sDslMarker var name: String?
  /** devicePath is the path inside of the container that the device will be mapped to. */
  @K8sDslMarker var devicePath: String?
}      
typealias VolumeDevice_core_v1_k8s1_17 = VolumeDevice_core_v1_k8s1_16       
typealias VolumeDevice_core_v1_k8s1_18 = VolumeDevice_core_v1_k8s1_17       
typealias VolumeDevice_core_v1_k8s1_19 = VolumeDevice_core_v1_k8s1_18       
typealias VolumeDevice_core_v1_k8s1_20 = VolumeDevice_core_v1_k8s1_19       
typealias VolumeDevice_core_v1_k8s1_21 = VolumeDevice_core_v1_k8s1_20 