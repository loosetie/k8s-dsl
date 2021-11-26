package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Csinodespec_storage_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
  val drivers: List<CSINodeDriver_storage_k8s_io_v1beta1_k8s1_16>?
}      
@K8sDslMarker
interface Csinodespec_storage_k8s_io_v1_k8s1_17: K8sManifest {
  /** drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this
can become empty. */
  val drivers: List<CSINodeDriver_storage_k8s_io_v1_k8s1_17>?
}      
typealias Csinodespec_storage_k8s_io_v1_k8s1_18 = Csinodespec_storage_k8s_io_v1_k8s1_17       
typealias Csinodespec_storage_k8s_io_v1_k8s1_19 = Csinodespec_storage_k8s_io_v1_k8s1_18       
typealias Csinodespec_storage_k8s_io_v1_k8s1_20 = Csinodespec_storage_k8s_io_v1_k8s1_19       
typealias Csinodespec_storage_k8s_io_v1_k8s1_21 = Csinodespec_storage_k8s_io_v1_k8s1_20 