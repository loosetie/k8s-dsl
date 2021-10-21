package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface ResourceFieldSelector_core_v1_k8s1_16: K8sManifest {
  /** Container name: required for volumes, optional for env vars */
  @K8sDslMarker var containerName: String?
  /** Specifies the output format of the exposed resources, defaults to "1" */
  val divisor: Quantity_core_resource_k8s1_16?
  /** Required: resource to select */
  @K8sDslMarker var resource: String?
}      
typealias ResourceFieldSelector_core_v1_k8s1_17 = ResourceFieldSelector_core_v1_k8s1_16       
typealias ResourceFieldSelector_core_v1_k8s1_18 = ResourceFieldSelector_core_v1_k8s1_17       
typealias ResourceFieldSelector_core_v1_k8s1_19 = ResourceFieldSelector_core_v1_k8s1_18       
typealias ResourceFieldSelector_core_v1_k8s1_20 = ResourceFieldSelector_core_v1_k8s1_19       
typealias ResourceFieldSelector_core_v1_k8s1_21 = ResourceFieldSelector_core_v1_k8s1_20 