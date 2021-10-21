package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface VolumeNodeAffinity_core_v1_k8s1_16: K8sManifest {
  /** Required specifies hard node constraints that must be met. */
  val required: NodeSelector_core_v1_k8s1_16?
}      
typealias VolumeNodeAffinity_core_v1_k8s1_17 = VolumeNodeAffinity_core_v1_k8s1_16       
typealias VolumeNodeAffinity_core_v1_k8s1_18 = VolumeNodeAffinity_core_v1_k8s1_17       
typealias VolumeNodeAffinity_core_v1_k8s1_19 = VolumeNodeAffinity_core_v1_k8s1_18       
typealias VolumeNodeAffinity_core_v1_k8s1_20 = VolumeNodeAffinity_core_v1_k8s1_19       
typealias VolumeNodeAffinity_core_v1_k8s1_21 = VolumeNodeAffinity_core_v1_k8s1_20 