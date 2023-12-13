package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface PodAffinityTerm_core_v1: K8sManifest {
  /** A label query over a set of resources, in this case pods. */
  val labelSelector: LabelSelector_meta_v1?
  /** A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces
selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list
means "this pod's namespace". An empty selector ({}) matches all namespaces. This field is beta-level and is only
honored when PodAffinityNamespaceSelector feature is enabled. */
  val namespaceSelector: LabelSelector_meta_v1?
  /** namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the
namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null
namespaceSelector means "this pod's namespace" */
  @K8sDslMarker var namespaces: List<String>?
  /** This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in
the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey
matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. */
  @K8sDslMarker var topologyKey: String?
}