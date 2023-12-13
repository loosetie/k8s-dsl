package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface Networkpolicystatus_networking_k8s_io_v1: K8sManifest {
  /** conditions holds an array of metav1.Condition that describe the state of the NetworkPolicy. Current service state */
  val conditions: List<Condition_meta_v1>?
}