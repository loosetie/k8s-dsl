package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeDaemonEndpoints_core_v1: K8sManifest {
  /** Endpoint on which Kubelet is listening. */
  val kubeletEndpoint: DaemonEndpoint_core_v1?
}