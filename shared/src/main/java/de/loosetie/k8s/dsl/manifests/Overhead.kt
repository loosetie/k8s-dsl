package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface Overhead_node_k8s_io_v1beta1_k8s1_16: K8sManifest {
  /** PodFixed represents the fixed resource overhead associated with running a pod. */
  @K8sDslMarker var podFixed: Any?
}      
typealias Overhead_node_k8s_io_v1beta1_k8s1_17 = Overhead_node_k8s_io_v1beta1_k8s1_16       
typealias Overhead_node_k8s_io_v1beta1_k8s1_18 = Overhead_node_k8s_io_v1beta1_k8s1_17       
typealias Overhead_node_k8s_io_v1beta1_k8s1_19 = Overhead_node_k8s_io_v1beta1_k8s1_18       
@K8sDslMarker
interface Overhead_node_k8s_io_v1_k8s1_20: K8sManifest {
  /** PodFixed represents the fixed resource overhead associated with running a pod. */
  @K8sDslMarker var podFixed: Any?
}

      
typealias Overhead_node_k8s_io_v1_k8s1_21 = Overhead_node_k8s_io_v1_k8s1_20 

