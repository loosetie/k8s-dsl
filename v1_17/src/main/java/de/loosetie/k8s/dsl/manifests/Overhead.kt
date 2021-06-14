package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Overhead_node_k8s_io_v1beta1: K8sManifest {
  /** PodFixed represents the fixed resource overhead associated with running a pod. */
  var podFixed: de.loosetie.k8s.dsl.types.LimitsAndRequests?
}