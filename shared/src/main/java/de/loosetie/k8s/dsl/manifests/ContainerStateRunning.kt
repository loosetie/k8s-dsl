package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ContainerStateRunning_core_v1_k8s1_16: K8sManifest {
  /** Time at which the container was last (re-)started */
  val startedAt: Time_meta_v1_k8s1_16?
}      
typealias ContainerStateRunning_core_v1_k8s1_17 = ContainerStateRunning_core_v1_k8s1_16       
typealias ContainerStateRunning_core_v1_k8s1_18 = ContainerStateRunning_core_v1_k8s1_17       
typealias ContainerStateRunning_core_v1_k8s1_19 = ContainerStateRunning_core_v1_k8s1_18       
typealias ContainerStateRunning_core_v1_k8s1_20 = ContainerStateRunning_core_v1_k8s1_19       
typealias ContainerStateRunning_core_v1_k8s1_21 = ContainerStateRunning_core_v1_k8s1_20 