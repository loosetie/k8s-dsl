package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodAffinityTerm_core_v1: K8sManifest {
  /** A label query over a set of resources, in this case pods. */
  val labelSelector: LabelSelector_meta_v1?
  /** namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this
pod's namespace" */
  @K8sDslMarker var namespaces: List<String>?
  /** This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in
the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey
matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. */
  @K8sDslMarker var topologyKey: String?
}