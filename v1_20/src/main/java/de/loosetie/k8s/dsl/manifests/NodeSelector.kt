package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata


@K8sDslMarker
interface NodeSelector_core_v1_k8s1_20: K8sManifest {
  /** Required. A list of node selector terms. The terms are ORed. */
  val nodeSelectorTerms: List<NodeSelectorTerm_core_v1_k8s1_20>?
}