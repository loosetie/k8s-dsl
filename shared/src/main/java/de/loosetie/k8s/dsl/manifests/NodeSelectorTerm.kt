package de.loosetie.k8s.dsl.manifests

import de.loosetie.k8s.dsl.K8sTopLevel
import de.loosetie.k8s.dsl.K8sDslMarker
import de.loosetie.k8s.dsl.K8sManifest
import de.loosetie.k8s.dsl.HasMetadata
      
@K8sDslMarker
interface NodeSelectorTerm_core_v1_k8s1_16: K8sManifest {
  /** A list of node selector requirements by node's labels. */
  val matchExpressions: List<NodeSelectorRequirement_core_v1_k8s1_16>?
  /** A list of node selector requirements by node's fields. */
  val matchFields: List<NodeSelectorRequirement_core_v1_k8s1_16>?
}      
typealias NodeSelectorTerm_core_v1_k8s1_17 = NodeSelectorTerm_core_v1_k8s1_16       
typealias NodeSelectorTerm_core_v1_k8s1_18 = NodeSelectorTerm_core_v1_k8s1_17       
typealias NodeSelectorTerm_core_v1_k8s1_19 = NodeSelectorTerm_core_v1_k8s1_18       
typealias NodeSelectorTerm_core_v1_k8s1_20 = NodeSelectorTerm_core_v1_k8s1_19       
typealias NodeSelectorTerm_core_v1_k8s1_21 = NodeSelectorTerm_core_v1_k8s1_20 